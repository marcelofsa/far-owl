package model;

import Exceptions.CaracteresInvalidosException;
import static org.junit.Assert.*;

import java.io.File;
import org.junit.Before;

import org.junit.Test;

/**
 * Testes baseados nos modelos Relacional , Entidade Relacional e Diagrama de
 * Classes, feitos por Lucas Carneiro e Paulo Cares Esse teste tem como objetivo
 * verificar as caracteristicas basicas da classe Comum que extende da classe
 * Usuario. Construtor de Comum : Comum comum = new Comum(	int id, String nome,
 * String login, String senha, String email String cidade, String estado, String
 * pais, File fotoPerfil, String dataNasc, int score, String sobrenome);
 * Construtor de Usuario : Usuario user = new Usuario (int id ,String nome,
 * String login, String senha, String email String cidade, String estado, String
 * pais, File fotoPerfil)
 *
 * @author Carla
 *
 */
public class ComumTest {

    File fotoPerfil = new File("fotoPerfilUsuario.png");
    File fotoNot1 = new File("fotoNot1.jpg");

    @Before
    public void zerarListas() {
        Controller.notificacoes.removeAll(Controller.notificacoes);
        Controller.contas.removeAll(Controller.contas);
    }

    @Test(expected = CaracteresInvalidosException.class)
    public void criarUsuarioComumComInformacoesNulas() throws CaracteresInvalidosException {

        Usuario user = new Comum(null, null, null, null, null, null, null,
                null, null, 0, null);
    }

    @Test(expected = CaracteresInvalidosException.class)
    public void criarContaComumSemInformacoesOuInformacoesIncompletas() throws CaracteresInvalidosException {

        Usuario user = new Comum("", "login", "senha", "email", "cidade", "estado", "pais",
                fotoPerfil, "03/03/1993", 0, "sobrenome");
        user = new Comum("nome", "", "senha", "email", "cidade", "estado", "pais",
                fotoPerfil, "03/03/1993", 0, "sobrenome");
        user = new Comum("nome", "login", "", "email", "cidade", "estado", "pais",
                fotoPerfil, "03/03/1993", 0, "sobrenome");
        user = new Comum("nome", "login", "senha", "email", "cidade", "estado", "pais",
                fotoPerfil, "03/03/1993", 0, "");
        user = new Comum("nome", "", "senha", "email", "cidade", "", "pais",
                fotoPerfil, "03/03/1993", 0, "sobrenome");
        user = new Comum("nome", "login", "senha", "email", "cidade", "estado", "pais",
                fotoPerfil, "", 0, "sobrenome");

    }

    @Test
    public void criacaoDeUsuarioComumComInformacoesValidas() throws CaracteresInvalidosException {

        Usuario userValido = new Comum("Joana1 ", "Juh1", "senhaJoana1", "joana1@email.com", "Aracaju", "Sergipe", "Brasil",
                fotoPerfil, "03/03/1993", 0, "sobrenome");

        Comum comumValido = new Comum("Joana2", "Juh2", "senha2Joana", "joana2@email.com", "Aracaju", "Sergipe", "Brasil",
                fotoPerfil, "03/03/1993", 0, "sobrenome");

        assertEquals("Joana2", comumValido.getNome());
        assertEquals("Juh2", comumValido.getLogin());
        assertEquals("senha2Joana", comumValido.getSenha());
        assertEquals("joana2@email.com", comumValido.getEmail());
        assertEquals("Aracaju", comumValido.getCidade());
        assertEquals("Sergipe", comumValido.getEstado());
        assertEquals("Brasil", comumValido.getPais());
        assertEquals(fotoPerfil, comumValido.getFoto());
        assertEquals("03/03/1993", comumValido.getDataNasc());
        assertEquals("sobrenome", comumValido.getSobrenome());
    }

    @Test
    public void notificar() throws CaracteresInvalidosException {

        Comum joana = new Comum("Joana", "Juh", "senhaJoana", "joana@email.com", "Aracaju", "Sergipe", "Brasil",
                fotoPerfil, "03/03/1993", 0, "sobrenome");
        Controller.contas.add(joana);
        assertNull(joana.notificar(null, null));
        assertNull(joana.notificar("", null));

        Notificacao notificacao1 = joana.notificar("Acidente moto na uefs", null);

        assertNotNull(notificacao1);
        assertEquals(notificacao1.getIdUsuario(), joana.getId());

        Notificacao notificacao2 = joana.notificar("Acidente moto na uefs", fotoNot1);

        assertNotNull(notificacao2);
        assertEquals(notificacao2.getIdUsuario(), joana.getId());
        //assertNotEquals(notificacao2.getId(), notificacao1.getId());

        Comum maria = new Comum("Maria", "Mary", "senhaMaria", "maria@email.com", "Aracaju", "Sergipe", "Brasil",
                fotoPerfil, "03/03/1993", 0, "sobrenome");
        Controller.contas.add(maria);
        maria.visualizarNotificacao(notificacao2);
        Comum conta = maria.visualizarPerfil(notificacao2.getIdUsuario());
        assertNotNull(conta);
        assertEquals(conta, joana);

    }

    @Test
    public void notificarAnonimo() throws CaracteresInvalidosException {

        Comum joana = new Comum("Joana", "Juh", "senhaJoana", "joana@email.com", "Aracaju", "Sergipe", "Brasil",
                fotoPerfil, "03/03/1993", 0, "sobrenome");
        Controller.contas.add(joana);
        Notificacao notificacao = joana.notificarAnonimo("Acidente moto na uefs", null);

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

    }

    @Test
    public void comentarAnonimo() throws CaracteresInvalidosException {

        Comum joana = new Comum("Joana", "Juh", "senhaJoana", "joana@email.com", "Aracaju", "Sergipe", "Brasil",
                fotoPerfil, "03/03/1993", 0, "sobrenome");
        Controller.contas.add(joana);
        Notificacao notificacao = joana.notificar("Acidente moto na uefs", null);

        Comum maria = new Comum("Maria", "Mary", "senhaMaria", "maria@email.com", "Aracaju", "Sergipe", "Brasil",
                fotoPerfil, "03/03/1993", 0, "sobrenome");
        Controller.contas.add(maria);
        maria.visualizarNotificacao(notificacao);

        Comentario coment1 = maria.comentar("conhe�o o rapaz", null);
        Comentario coment2 = maria.comentarAnonimo("mas ele tamb�m mereceu", null);

        assertNotNull(coment1);
        assertNotNull(coment2);
        Controller.logado = joana;
        Usuario conta1 = joana.visualizarPerfil(coment1.getIdUsuario());
        assertNotNull(conta1);
        assertEquals(conta1, maria);

        Usuario conta2 = joana.visualizarPerfil(coment2.getIdUsuario());
        assertNull(conta2);

        Administrador adm = new Administrador("Administrador Geral", "admGeral", "senhaAdm", "admGeral@email.com");
        Controller.logado = adm;
        Comum user = adm.visualizarComentarioAnonimo(coment2.getIdUsuario());
        assertNotNull(user);
        assertEquals(user, maria);

    }

    /**
     * Faltar testar com o banco de dados
     */
    @Test
    public void excluirNotificacao() throws CaracteresInvalidosException {

        Comum joana = new Comum("Joana", "Juh", "senhaJoana", "joana@email.com", "Aracaju", "Sergipe", "Brasil",
                fotoPerfil, "03/03/1993", 0, "sobrenome");
        Controller.contas.add(joana);
        Controller.logado = joana;
        Notificacao notificacao = joana.notificar("Acidente moto na uefs", null);
        Controller.notificacoes.add(notificacao);
        assertEquals(1, joana.getQtdNotificacoes());
        int id = notificacao.getId();
        joana.excluirNotificacao(id);
        assertEquals(0, joana.getQtdNotificacoes());
    }

    @Test
    public void editarPerfil() throws CaracteresInvalidosException {

        Comum joana = new Comum("Joana", "Juh", "senhaJoana", "joana@email.com", "Aracaju", "Sergipe", "Brasil",
                fotoPerfil, "03/03/1993", 0, "Souza");

        assertEquals("Joana", joana.getNome());
        assertEquals("Juh", joana.getLogin());
        assertEquals("senhaJoana", joana.getSenha());
        assertEquals("joana@email.com", joana.getEmail());
        assertEquals("Aracaju", joana.getCidade());
        assertEquals("Sergipe", joana.getEstado());
        assertEquals("Brasil", joana.getPais());
        assertEquals(fotoPerfil, joana.getFoto());
        assertEquals("03/03/1993", joana.getDataNasc());
        assertEquals("Souza", joana.getSobrenome());

        joana.editarPerfil("Feira de Santana", "Bahia", "Brasil", "Joana", "Silva", fotoPerfil);

        assertEquals("Joana", joana.getNome());
        assertEquals("Juh", joana.getLogin());
        assertEquals("senhaJoana", joana.getSenha());
        assertEquals("joana@email.com", joana.getEmail());
        assertEquals("Feira de Santana", joana.getCidade());
        assertEquals("Bahia", joana.getEstado());
        assertEquals("Brasil", joana.getPais());
        assertEquals(fotoPerfil, joana.getFoto());
        assertEquals("03/03/1993", joana.getDataNasc());
        assertEquals("Silva", joana.getSobrenome());
    }

}
