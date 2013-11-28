package model;

import Exceptions.CaracteresInvalidosException;
import static org.junit.Assert.*;

import java.io.File;
import org.junit.Before;

import org.junit.Test;

/**
 * Testes baseados nos modelos Relacional , Entidade Relacional e Diagrama de
 * Classes, feitos por Lucas Carneiro e Paulo Cares Esse teste tem como objetivo
 * verificar as caracteristicas basicas da classe Administrador que extende da
 * classe Conta
 *
 * Construtor de Conta : Conta conta = new Conta(int idConta, String nome,
 * String login, String senha, String email);
 *
 * Construtor de Administrador : Administrador adm = new Administrador(int id
 * ,String nome, String login, String senha, String email);
 *
 * @author Carla
 *
 */
public class AdministradorTest {

    File fotoOficial = new File("fotoPerfilOficial.png");
    File fotoPerfil = new File("fotoPerfilUsuario.png");

    @Before
    public void zerarListas() {
        Controller.notificacoes.removeAll(Controller.notificacoes);
        Controller.contas.removeAll(Controller.contas);
    }

    @Test(expected = CaracteresInvalidosException.class)
    public void criarContaAdmComInformacoesNulas() throws CaracteresInvalidosException {

        Administrador conta = new Administrador(null, null, null, null);
    }

    @Test(expected = CaracteresInvalidosException.class)
    public void criarContaAdministradorInformacoesIncompletas() throws CaracteresInvalidosException {

        Administrador contaInvalida1 = new Administrador("nome", "", "senha", "email");
        Administrador contaInvalida2 = new Administrador("", "login", "senha", "email");
        Administrador contaInvalida3 = new Administrador("nome", "login", "", "email");
        Administrador contaInvalida4 = new Administrador("nome", "login", "senha", "");
    }

    @Test
    public void criacaoDeContaComInformacoesValidas() throws CaracteresInvalidosException {

        Administrador contaValida = new Administrador("nomeConta", "loginConta",
                "senhaConta", "conta@email.com");

        assertEquals("nomeConta", contaValida.getNome());
        assertEquals("loginConta", contaValida.getLogin());
        assertEquals("senhaConta", contaValida.getSenha());
        assertEquals("conta@email.com", contaValida.getEmail());
        //assertEquals(32, contaValida.getId());
    }

    @Test
    public void criarContaOficial() throws CaracteresInvalidosException {

        Administrador adm = new Administrador("Administrador Geral", "admGeral",
                "senhaAdm", "admGeral@email.com");

        Oficial oficial = adm.criarOficial("Sincol", "sincolFsa", "senhaSincol", "senhaSincol", "sincol@email.com",
                "sincol@email.com", "Feira de Santana", "Bahia", "Brasil", fotoOficial, "Rua Getulio Vargas, Centro",
                1234, "transporte");

        assertNotNull(oficial);
        assertEquals("Sincol", oficial.getNome());
        assertEquals("sincolFsa", oficial.getLogin());
        assertEquals("senhaSincol", oficial.getSenha());
        assertEquals("sincol@email.com", oficial.getEmail());
        assertEquals("Feira de Santana", oficial.getCidade());
        assertEquals("Bahia", oficial.getEstado());
        assertEquals("Brasil", oficial.getPais());
        assertEquals(fotoOficial, oficial.getFoto());
        assertEquals("Rua Getulio Vargas, Centro", oficial.getEndereco());
        assertEquals(1234, oficial.getCNPJ());
        assertEquals("transporte", oficial.getSetorDeAtuacao());
        //assertEquals(41, oficial.getId());
    }

    @Test
    public void visualizarAnonimo() throws CaracteresInvalidosException {

        Comum joana = new Comum("Joana", "Juh", "senhaJoana", "joana@email.com", "Aracaju", "Sergipe", "Brasil",
                fotoPerfil, "03/03/1993", 0, "sobrenome");
        Controller.contas.add(joana);
        Controller.logado = joana;
        Notificacao notificacao = joana.notificarAnonimo("Acidente moto na uefs", null);
        Controller.notificacoes.add(notificacao);
        assertNotNull(notificacao);
        assertEquals(notificacao.getIdUsuario(), joana.getId());

        Comum maria = new Comum("Maria", "Mary", "senhaMaria", "maria@email.com", "Aracaju", "Sergipe", "Brasil",
                fotoPerfil, "03/03/1993", 0, "sobrenome");
        Controller.contas.add(maria);
        Controller.logado = maria;
        maria.visualizarNotificacao(notificacao);
        Comum conta = maria.visualizarPerfil(notificacao.getIdUsuario());
        assertNull(conta);

        Administrador adm = new Administrador("Administrador Geral", "admGeral", "senhaAdm", "admGeral@email.com");
        Controller.logado = adm;
        Comum user = adm.visualizarNotificacaoAnonimo(notificacao);
        assertNotNull(user);
        assertEquals(user, joana);

        Comentario coment = maria.comentarAnonimo("mas ele tamb�m mereceu", null);

        assertNotNull(coment);

        Controller.logado = joana;
        Usuario conta2 = joana.visualizarPerfil(coment.getIdUsuario());
        assertNull(conta2);
        Controller.logado = adm;
        Comum user2 = adm.visualizarComentarioAnonimo(coment.getIdUsuario());
        assertNotNull(user2);
        assertEquals(user2, maria);

    }

}
