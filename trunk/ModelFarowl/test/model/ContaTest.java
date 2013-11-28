package model;

import Exceptions.CaracteresInvalidosException;
import static org.junit.Assert.*;

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

    @Test(expected = CaracteresInvalidosException.class)
    public void criarContaComInformacoesNulas() throws CaracteresInvalidosException {

        Conta conta = new Conta(null, null, null, null);
    }

    @Test(expected = CaracteresInvalidosException.class)
    public void criarContaInformacoesIncompletas() throws CaracteresInvalidosException {

        Conta contaInvalida1 = new Conta("nome", "", "senha", "email");
        Conta contaInvalida2 = new Conta("", "login", "senha", "email");
        Conta contaInvalida3 = new Conta("nome", "login", "", "email");
        Conta contaInvalida4 = new Conta("nome", "login", "senha", "");
    }

    @Test
    public void criacaoDeContaComInformacoesValidas() throws CaracteresInvalidosException {

        Conta contaValida = new Conta("nomeConta", "loginConta", "senhaConta", "conta@email.com");

        assertEquals("nomeConta", contaValida.getNome());
        assertEquals("loginConta", contaValida.getLogin());
        assertEquals("senhaConta", contaValida.getSenha());
        assertEquals("conta@email.com", contaValida.getEmail());
        //assertEquals(32 ,  contaValida.getId());
    }
}
