package TestsUnitarios;

import static org.junit.Assert.*;

import java.io.File;

import model.Comentario;
import model.Notificacao;

import org.junit.Before;
import org.junit.Test;

/**
 * Testes baseados nos modelos Relacional , Entidade Relacional e Diagrama de
 * Classes, feitos por Lucas Carneiro e Paulo Cares Esse teste tem como objetivo
 * verificar as caracteristicas basicas da classe Notifica��o do sistema
 *
 * Notificacao possui como atributos segundo o modelo relacional e discu��es
 * referentes ao terceiro problema : => identificador do usuario que fez a
 * notifica��o => identificador da propria classe => a tag (o assunto ao qual a
 * notifica��o se refere) => status (se estar resolvida ou n�o) => arquivo (uma
 * foto ou video) => texto => apoios
 *
 * Contrutor da classe: Notificacao not = new Notificacao (String texto, File
 * videoOuImagem, int idUser, String notId, String Tag, boolean status);
 *
 * @author Carla
 *
 */
public class NotificacaoTest {

    File fotoNot1 = new File("fotoNot1.jpg");
    File fotoNot2 = new File("fotoNot2.jpg");
    File videoNot1 = new File("videoNot1.mp4");
    File videoNot2 = new File("videoNot2.mp4");

    /**
     * Quando houver a conex�o da interface com o codigo a exce��o
     * NotificacaoNaoDeveSerEnviada provavelmente n�o ir� ocorrer porque o bot�o
     * que permite o usuario notificar ficar� invalido at� o usuario fazer uma
     * notifica��o realmente
     */
    @Test(expected = NotificacaoNaoDeveSerEnviada.class)
    public void notificarNada() {

        Notificacao not = new Notificacao(null, null, 123, "idNot", "Acidente", false);
    }

    @Test
    public void notificarSomenteTexto() throws NotificacaoNaoDeveSerEnviada {

        Notificacao not = new Notificacao("Acidente de moto na uefs", null, 123, "idNot", "Acidente", false);

        assertNull(not.getFile());
        assertNotNull(not.getTexto());
        assertEquals("Acidente de moto na uefs", not.getTexto());
        assertEquals(123, not.getIdUsuario());
        assertEquals("idNot", not.getId());
        assertEquals(0, not.qtdApoios());

    }

    @Test
    public void notificarComImagem() throws NotificacaoNaoDeveSerEnviada {

        Notificacao not1 = new Notificacao("Acidente de moto na uefs", fotoNot1, 123, "idNot1", "Acidente", false);

        assertNotNull(not1.getFile());
        assertEquals(fotoNot1, not1.getFile());
        assertNotNull(not1.getTexto());
        assertEquals("Acidente de moto na uefs", not1.getTexto());
        assertEquals(123, not1.getIdUsuario());
        assertEquals("idNot1", not1.getId());

        Notificacao not2 = new Notificacao(null, fotoNot2, 123, "idNot2", "Acidente", false);

        assertNotNull(not2.getFile());
        assertEquals(fotoNot2, not2.getFile());
        asserNull(not2.getTexto());
        assertEquals(123, not2.getIdUsuario());
        assertEquals("idNot2", not2.getId());

    }

    @Test
    public void notificarComVideo() throws NotificacaoNaoDeveSerEnviada {

        Notificacao not1 = new Notificacao("Acidente de moto na uefs", videoNot1, 123, "idNot1", "Acidente", false);

        assertNotNull(not1.getFile());
        assertEquals(videoNot1, not1.getFile());
        assertNotNull(not1.getTexto());
        assertEquals("Acidente de moto na uefs", not1.getTexto());
        assertEquals(123, not1.getIdUsuario());
        assertEquals("idNot1", not1.getId());

        Notificacao not2 = new Notificacao(null, videoNot2, 123, "idNot2", "Acidente", false);

        assertNotNull(not2.getFile());
        assertEquals(videoNot2, not2.getFile());
        asserNull(not2.getTexto());
        assertEquals(123, not2.getIdUsuario());
        assertEquals("idNot2", not2.getId());

    }

    @Test
    public void mudarStatusNotificacao() {

        Notificacao not = new Notificacao("Acidente de moto na uefs", fotoNot1, 123, "idNot1", "Acidente", false);

        assertFalse(not.getStatus());
        not.mudarStatus(true, 432); //"LoginOutraPessoa");
        assertFalse(not.getStatus());
        not.mudarStatus(true, 123);
        assertTrue(not.getStatus());
    }

}
