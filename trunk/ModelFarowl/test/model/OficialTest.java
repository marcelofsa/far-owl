package model;

import Exceptions.CaracteresInvalidosException;
import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

/**
 * Testes baseados nos modelos Relacional , Entidade Relacional e Diagrama de
 * Classes, feitos por Lucas Carneiro e Paulo Cares Esse teste tem como objetivo
 * verificar as caracteristicas basicas da classe Oficial que extende da classe
 * Usuario.
 *
 * Construtor de Comum : Oficial oficial = new Oficial(	int id, String nome,
 * String login, String senha, String email String cidade, String estado, String
 * pais, File fotoOficial, String endere�o, int CNPJ, String setorDeAtuacao);
 * Construtor de Usuario : Usuario user = new Usuario (int id, String nome,
 * String login, String senha, String email String cidade, String estado, String
 * pais, File fotoPerfil)
 *
 * @author Carla
 *
 */
public class OficialTest {

    File fotoOficial = new File("fotoPerfilOficial.png");

    @Test(expected = CaracteresInvalidosException.class)
    public void criarUsuarioOficialComInformacoesNulas() throws CaracteresInvalidosException {

        Oficial oficial = new Oficial(null, null, null, null, null, null,
                null, null, null, 0, null);
    }

    @Test(expected = CaracteresInvalidosException.class)
    public void criarContaOficialSemInformacoesOuInformacoesIncompletas() throws CaracteresInvalidosException {

        Usuario userInvalido1 = new Oficial("nome", "login", "senha", "email", "cidade", "",
                "pais", fotoOficial, "endere�o", 0, "setorDeAtuacao");
        Usuario userInvalido2 = new Oficial("nome", "login", "senha", "email", "", "estado",
                "pais", fotoOficial, "endere�o", 0, "setorDeAtuacao");
        Usuario userInvalido3 = new Oficial("nome", "login", "senha", "", "cidade", "estado",
                "pais", fotoOficial, "endere�o", 0, "setorDeAtuacao");
        Usuario userInvalido4 = new Oficial("nome", "login", "", "email", "cidade", "estado",
                "pais", fotoOficial, "endere�o", 0, "setorDeAtuacao");
        Usuario userInvalido5 = new Oficial("nome", "", "senha", "email", "cidade", "estado",
                "pais", fotoOficial, "endere�o", 0, "setorDeAtuacao");
        Usuario userInvalido6 = new Oficial("", "login", "senha", "email", "cidade", "estado",
                "pais", fotoOficial, "endere�o", 0, "setorDeAtuacao");
        Usuario userInvalido7 = new Oficial("nome", "login", "senha", "email", "cidade", "estado",
                "pais", fotoOficial, "", 0, "setorDeAtuacao");
        Usuario userInvalido8 = new Oficial("nome", "login", "senha", "email", "cidade", "estado",
                "pais", fotoOficial, "endere�o", 0, "");

    }

    @Test
    public void criacaoDeUsuarioOficialComInformacoesValidas() throws CaracteresInvalidosException {

        Usuario userValido = new Oficial("nome", "login", "senha", "email", "cidade", "estado",
                "pais", fotoOficial, "endere�o", 1230, "setorAtuacao");

        Oficial oficial = new Oficial("Sincol", "sincolFsa", "senhaSincol", "sincol@email.com",
                "Feira de Santana", "Bahia", "Brasil", fotoOficial, "Rua Getulio Vargas, Centro",
                1234, "transporte");

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
        //assertEquals(123, oficial.getId());
    }

    @Test
    public void editarPerfil() throws CaracteresInvalidosException {

        Oficial oficial = new Oficial("Sincol", "sincolFsa", "senhaSincol", "sincol@email.com",
                "Feira de Santana", "Bahia", "Brasil", fotoOficial, "Rua Getulio Vargas, Centro",
                1234, "transporte");

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

        oficial.editarPerfil("Rua Getulio Vargas, Centro", 5345, "Transporte Publico");

        assertEquals("Sincol", oficial.getNome());
        assertEquals("sincolFsa", oficial.getLogin());
        assertEquals("senhaSincol", oficial.getSenha());
        assertEquals("sincol@email.com", oficial.getEmail());
        assertEquals("Feira de Santana", oficial.getCidade());
        assertEquals("Bahia", oficial.getEstado());
        assertEquals("Brasil", oficial.getPais());
        assertEquals(fotoOficial, oficial.getFoto());
        assertEquals("Rua Getulio Vargas, Centro", oficial.getEndereco());
        assertEquals(5345, oficial.getCNPJ());
        assertEquals("Transporte Publico", oficial.getSetorDeAtuacao());
    }

}
