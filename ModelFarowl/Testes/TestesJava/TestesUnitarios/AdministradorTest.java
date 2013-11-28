package TestsUnitarios;

import static org.junit.Assert.*;

import java.io.File;

import model.Administrador;
import model.Comentario;
import model.Comum;
import model.Conta;
import model.Notificacao;
import model.Oficial;
import model.Usuario;

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

    @Test(expected = CaracteresInvalidos.class)
    public void criarContaAdmComInformacoesNulas() throws CaracteresInvalidos {

        Administrador conta = new Administrador(1, null, null, null, null);
    }

    @Test(expected = CaracteresInvalidos.class)
    public void criarContaAdministradorInformacoesIncompletas() throws CaracteresInvalidos {

        Administrador contaInvalida1 = new Administrador(32, "nome", "", "senha", "email");
        Administrador contaInvalida2 = new Administrador(32, "", "login", "senha", "email");
        Administrador contaInvalida3 = new Administrador(23, "nome", "login", "", "email");
        Administrador contaInvalida4 = new Administrador(2, "nome", "login", "senha", "");
    }

    @Test
    public void criacaoDeContaComInformacoesValidas() throws CaracteresInvalidos {

        Administrador contaValida = new Administrador(32, "nomeConta", "loginConta",
                "senhaConta", "conta@email.com");

        assertEquals("nomeConta", contaValida.getNome());
        assertEquals("loginConta", contaValida.getLogin());
        assertEquals("senhaConta", contaValida.getSenha());
        assertEquals("conta@email.com", contaValida.getEmail());
        assertEquals(32, contaValida.getId());
    }

    @Test
    public void criarContaOficial() {

        Administrador adm = new Administrador(20, "Administrador Geral", "admGeral",
                "senhaAdm", "admGeral@email.com");

        Oficial oficial = adm.criarOficial(41, "Sincol", "sincolFsa", "senhaSincol", "sincol@email.com",
                "Feira de Santana", "Bahia", "Brasil", fotoOficial, "Rua Getulio Vargas, Centro",
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
        assertEquals(41, oficial.getId());
    }

    @Test
    public void visualizarAnonimo() {

        Comum joana = new Comum(32, "Joana", "Juh", "senhaJoana", "joana@email.com", "Aracaju", "Sergipe", "Brasil",
                fotoPerfil, "03/03/1993", 0, "sobrenome");

        Notificacao notificacao = joana.notificarAnonimo("Acidente moto na uefs", null);

        assertNotNull(notificacao);
        assertEquals(notificacao.getIdUsuario(), joana.getId());

        Comum maria = new Comum(12, "Maria", "Mary", "senhaMaria", "maria@email.com", "Aracaju", "Sergipe", "Brasil",
                fotoPerfil, "03/03/1993", 0, "sobrenome");

        maria.visualizarNotificacao(notificacao);
        Comum conta = maria.visualizarPerfil(notificacao.getIdUsuario());
        assertNull(conta);

        Administrador adm = new Administrador("Administrador Geral", "admGeral", "senhaAdm", "admGeral@email.com");

        Comum user = adm.visualizarNotificacaoAnonimo(notificacao);
        assertNotNull(user);
        assertEquals(user, joana);

        Comentario coment = maria.comentarAnonimo("mas ele tamb�m mereceu", null);

        assertNotNull(coment);

        Usuario conta2 = joana.visualizarPerfil(coment.getIdUsuario());
        assertNull(conta2);

        Comum user2 = adm.visualizarComentarioAnonimo(coment);
        assertNotNull(user2);
        assertEquals(user2, maria);

    }

}
