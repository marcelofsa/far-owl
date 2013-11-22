/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exceptions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Lucas
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Exceptions.EmailDeCadastroNaoExisteTest.class, Exceptions.NovaSenhaInvalidaExceptionTest.class, Exceptions.UsuarioNaoExisteExceptionTest.class, Exceptions.DigiteNomeExceptionTest.class, Exceptions.LoginSenhaInvalidosExceptionTest.class, Exceptions.CaracteresInvalidosExceptionTest.class, Exceptions.RankingVazioexceptionTest.class, Exceptions.UltrapassaLimiteExceptionTest.class, Exceptions.ArquivoNaoSuportadoExceptionTest.class, Exceptions.EmailJaCadastradoExceptionTest.class, Exceptions.UsuarioNaoEncontradoExceptionTest.class, Exceptions.BuscaInvalidaExceptionTest.class, Exceptions.SenhaincompativelExceptionTest.class, Exceptions.ContaDeletadaExceptionTest.class, Exceptions.UsuarioJaExisteExceptionTest.class, Exceptions.SemComentariosExceptionTest.class, Exceptions.BuscaNaoEncontradaExceptionTest.class})
public class ExceptionsSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
