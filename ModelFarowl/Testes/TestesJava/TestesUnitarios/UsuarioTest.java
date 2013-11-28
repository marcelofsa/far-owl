package TestsUnitarios;

import static org.junit.Assert.*;

import java.io.File;

import model.Comentario;
import model.Conta;
import model.Notificacao;
import model.Usuario;

import org.junit.Before;
import org.junit.Test;

/**
 * Testes baseados nos modelos Relacional , Entidade Relacional e Diagrama de
 * Classes, feitos por Lucas Carneiro e Paulo Cares Esse teste tem como objetivo
 * verificar as caracteristicas basicas da classe Usuario que extende da classe
 * Conta. Construtor de Usuario : Usuario user = new Usuario (int id, String
 * nome, String login, String senha, String email String cidade, String estado,
 * String pais, File fotoPerfil) Conta conta = new Conta(int id, String nome,
 * String login, String senha, String email);
 *
 * @author Carla
 *
 */
public class UsuarioTest {

    File fotoPerfil = new File("fotoPerfilUsuario.png");
    File fotoComent2 = new File("fotoComent2.jpg");

    @Test(expected = CaracteresInvalidos.class)
    public void criarUsuarioComInformacoesNulas() throws CaracteresInvalidos {

        Conta user = new Usuario(123, null, null, null, null, null, null, null, null);
    }

    @Test(expected = CaracteresInvalidos.class)
    public void criarContaSemInformacoesOuInformacoesIncompletas() throws CaracteresInvalidos {

        Conta userInvalido1 = new Usuario(123, "", "login", "senha", "email", "cidade",
                "estado", "pais", fotoPerfil);
        Conta userInvalido2 = new Usuario(123, "nome", "", "senha", "email", "cidade",
                "estado", "pais", fotoPerfil);
        Conta userInvalido3 = new Usuario(123, "nome", "login", "", "email", "cidade",
                "estado", "pais", fotoPerfil);
        Conta userInvalido4 = new Usuario(123, "nome", "login", "senha", "", "cidade",
                "estado", "pais", fotoPerfil);
        Conta userInvalido5 = new Usuario(132, "nome", "login", "senha", "email", "",
                "estado", "pais", fotoPerfil);
        Conta userInvalido6 = new Usuario(123, "nome", "login", "senha", "email", "cidade",
                "estado", "", fotoPerfil);
        Conta userInvalido7 = new Usuario(123, "nome", "login", "senha", "email", "cidade",
                "", "pais", fotoPerfil);
        Conta userInvalido8 = new Usuario(123, "nome", "login", "senha", "email", "cidade",
                "estado", "pais", null);
    }

    @Test
    public void criacaoDeUsuarioComInformacoesValidas() throws CaracteresInvalidos {

        Conta contaValida = new Usuario(123, "nome1", "login1", "senha1", "nome1@email.com", "cidade",
                "estado", "pais", fotoPerfil);

        Usuario userValido = new Usuario(123, "nome2", "login2", "senha2", "nome2@email.com", "cidade",
                "estado", "pais", fotoPerfil);
    }

    /**
     * Maria vai comentar a notifica��o que ela estar visualizando atraves do
     * metodo comentar(String texto, File fotoOuVideo);
     */
    @Test
    public void comentar() {

        Usuario maria = new Usuario(123, "Maria", "Mary", "senhaMaria", "maria@email.com", "ssa",
                "Bahia", "Brasil", fotoPerfil);
        Notificacao not = new Notificacao("Acidente de moto na uefs", null, 321, "idNot", "Acidente", false);
        maria.visualizarNotificacao(not);

        Comentario coment1 = maria.comentar("eu vi esse acidente, o rapaz ainda estar mal", null);

        assertEquals("eu vi esse acidente, o rapaz ainda estar mal", coment1.getTexto());
        assertEquals(maria.getId(), coment1.getIdUsuario());
        assertEquals(not.getId(), coment1.getIdNotificao());
        assertNull(coment1.getFile());

        Comentario coment2 = maria.comentar(null, fotoComent2);

        assertNull(coment2.getTexto());
        assertEquals(coment1.getIdUsuario(), coment2.getIdUsuario());
        assertEquals(coment1.getIdNotificao(), coment2.getIdNotificao());
        assertNotEquals(coment1.getId(), coment2.getId());
        assertNotNull(coment2.getFile());
        assertEquals(fotoComent2, coment2.getFile());

    }

    @Test(expected = BuscaNaoEcontrada.class)
    public void buscaInvalidaDeNotificacoes() {

        Usuario maria = new Usuario(123, "Maria", "Mary", "senhaMaria", "maria@email.com", "ssa",
                "Bahia", "Brasil", fotoPerfil);
        maria.buscarNotificacao("Invalida");

    }

    /**
     * O teste de busca Valida ser� realizado nos testes de aceita��o pois
     * precisar� ter acesso ao banco de dados
     */
    @Test(expected = NovaSenhaInvalida.class)
    public void alterarSenhaComNovaSenhaInvalida() {

        Usuario maria = new Usuario(123, "Maria", "Mary", "senhaMaria", "maria@email.com", "ssa",
                "Bahia", "Brasil", fotoPerfil);
        maria.mudarSenha("senhaMaria", "senhaNova", "senhaErrada");
    }

    @Test
    public void alterarSenha() throws NovaSenhaInvalida, SenhaInvalida {

        Usuario maria = new Usuario(123, "Maria", "Mary", "senhaMaria", "maria@email.com", "ssa",
                "Bahia", "Brasil", fotoPerfil);

        assertEquals("senhaMaria", maria.getSenha());
        maria.mudarSenha("senhaMaria", "senhaNova", "senhaNova");

        assertEquals("senhaNova", maria.getSenha());
    }

}
