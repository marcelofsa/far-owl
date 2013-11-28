package TestsUnitarios;

import static org.junit.Assert.*;
import model.Conta;

import org.junit.Test;

/**
 * Testes baseados nos modelos Relacional , Entidade Relacional e Diagrama de
 * Classes, feitos por Lucas Carneiro e Paulo Cares Esse teste tem como objetivo
 * verificar as caracteristicas basicas da classe Conta
 *
 * Conta possui como atributos segundo o modelo relacional e discu��es
 * referentes ao terceiro problema : => identificador numerico => login => nome
 * => senha => email
 *
 * Construtor de Conta : Conta conta = new Conta(int idConta, String nome,
 * String login, String senha, String email);
 *
 * @author Carla
 *
 */
public class ContaTest {

    @Test(expected = CaracteresInvalidos.class)
    public void criarContaComInformacoesNulas() throws CaracteresInvalidos {

        Conta conta = new Conta(123, null, null, null, null);
    }

    @Test(expected = CaracteresInvalidos.class)
    public void criarContaInformacoesIncompletas() throws CaracteresInvalidos {

        Conta contaInvalida1 = new Conta(32, "nome", "", "senha", "email");
        Conta contaInvalida2 = new Conta(32, "", "login", "senha", "email");
        Conta contaInvalida3 = new Conta(32, "nome", "login", "", "email");
        Conta contaInvalida4 = new Conta(32, "nome", "login", "senha", "");
    }

    @Test
    public void criacaoDeContaComInformacoesValidas() throws CaracteresInvalidos {

        Conta contaValida = new Conta(32, "nomeConta", "loginConta", "senhaConta", "conta@email.com");

        assertEquals("nomeConta", contaValida.getNome());
        assertEquals("loginConta", contaValida.getLogin());
        assertEquals("senhaConta", contaValida.getSenha());
        assertEquals("conta@email.com", contaValida.getEmail());
        assertEquals(32, contaValida.getId());
    }
}
