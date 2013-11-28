package TestsUnitarios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import model.Comentario;
import model.Notificacao;
import model.Usuario;

import org.junit.Before;
import org.junit.Test;

/**
 * Testes baseados nos modelos Relacional , Entidade Relacional e Diagrama de
 * Classes, feitos por Lucas Carneiro e Paulo Cares Esse teste tem como objetivo
 * verificar as caracteristicas basicas da classe comentario
 *
 *
 * Comentario possui como atributos segundo o modelo relacional e discu��es
 * referentes ao terceiro problema : => idUsuario (login normal ou idNumerico,
 * nos testes estar o numerico com probabilidade de voltar a ser o login normal)
 * => idNotificacao => id do proprio comentario => texto => arquivo de foto ou
 * video Construtor de comentario: Comentario coment = new Comentario(String
 * texto, File videoOuImagem, int idUser, String notId, String comentId);
 *
 *
 * @author Carla
 */
public class ComentarioTest {

    File fotoComent1 = new File("fotoComent1.jpg");
    File fotoComent2 = new File("fotoComent2.jpg");
    File videoComent1 = new File("videoComent1.mp4");
    File videoComent2 = new File("videoComent2.mp4");

    /**
     * Quando houver a conex�o da interface com o codigo a exce��o
     * ComentarioNaoDeveSerEnviado provavelmente n�o ir� ocorrer porque o bot�o
     * que permite o usuario comentar ficar� invalido at� o usuario fazer um
     * comentario realmente
     */
    @Test(expected = ComentarioNaoDeveSerEnviado.class)

    public void comentarNada() {

        Comentario coment = new Comentario(null, null, 890, "idNot", "comentId");
    }

    @Test
    public void comentarSomenteTexto() throws ComentarioNaoDeveSerEnviado {

        Comentario coment1 = new Comentario("eu vi o acidente, o rapaz esta no HGCH", null, 890,
                "idNot", "comentId");

        assertNull(coment1.getFile());
        assertNotNull(coment1.getTexto());
        assertEquals("eu vi o acidente, o rapaz esta no HGCH", coment1.getTexto());
        assertEquals(890, coment1.getIdUsuario());
        assertEquals("idNot", coment1.getIdNotificao());
        assertEquals("comentId", coment1.getId());

        Comentario coment2 = new Comentario("Maria, voc� sabe qual curso ele faz ?", null, 892,
                "idNot", "comentId2");
        assertNull(coment2.getFile());
        assertNotNull(coment2.getTexto());
        assertEquals("Maria, voc� sabe qual curso ele faz ?", coment2.getTexto());
        assertEquals(892, coment1.getIdUsuario());
        assertEquals("idNot", coment1.getIdNotificao());
        assertEquals("comentId2", coment2.getId());

    }

    @Test
    public void comentarComImagem() {

        Comentario coment1 = new Comentario(null, fotoComent1, 123, "idNot", "comentId");

        assertNotNull(coment1.getFile());
        assertEquals(fotoComent1, coment1.getFile());
        assertNull(coment1.getTexto());
        assertEquals(123, coment1.getIdUsuario());
        assertEquals("idNot", coment1.getIdNotificao());
        assertEquals("comentId", coment1.getId());

        Comentario coment2 = new Comentario("Realmente", fotoComent2, 321, "idNot", "comentId2");
        assertNotNull(coment2.getFile());
        assertEquals(fotoComent2, coment2.getFile());
        assertNotNull(coment2.getTexto());
        assertEquals("Realmente", coment2.getTexto());
        assertEquals(321, coment1.getIdUsuario());
        assertEquals("idNot", coment1.getIdNotificao());
        assertEquals("comentId2", coment2.getId());

    }

    @Test
    public void comentarComVideo() {

        Comentario coment1 = new Comentario(null, videoComent1, 123, "idNot", "comentId");

        assertNotNull(coment1.getFile());
        assertEquals(videoComent1, coment1.getFile());
        assertNull(coment1.getTexto());
        assertEquals(123, coment1.getIdUsuario());
        assertEquals("idNot", coment1.getIdNotificao());
        assertEquals("comentId", coment1.getId());

        Comentario coment2 = new Comentario("Realmente", videoComent2, 321, "idNot", "comentId2");
        assertNotNull(coment2.getFile());
        assertEquals(videoComent2, coment2.getFile());
        assertNotNull(coment2.getTexto());
        assertEquals("Realmente", coment2.getTexto());
        assertEquals(321, coment1.getIdUsuario());
        assertEquals("idNot", coment1.getIdNotificao());
        assertEquals("comentId2", coment2.getId());

    }
}
