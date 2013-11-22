/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class AdministradorTest {
    
    public AdministradorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CriarAdmin method, of class Administrador.
     */
    @Test
    public void testCriarAdmin() {
        System.out.println("CriarAdmin");
        String nome = "";
        String login = "";
        String senha = "";
        String confirmacaoSenha = "";
        String email = "";
        String confirmacaoEmail = "";
        Administrador instance = null;
        Administrador expResult = null;
        Administrador result = instance.CriarAdmin(nome, login, senha, confirmacaoSenha, email, confirmacaoEmail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CriarOficial method, of class Administrador.
     */
    @Test
    public void testCriarOficial() {
        System.out.println("CriarOficial");
        String nome = "";
        String login = "";
        String senha = "";
        String confirmacaoSenha = "";
        String email = "";
        String confirmacaoEmail = "";
        String setorAtuacao = "";
        int CNPJ = 0;
        String endereco = "";
        Administrador instance = null;
        Oficial expResult = null;
        Oficial result = instance.CriarOficial(nome, login, senha, confirmacaoSenha, email, confirmacaoEmail, setorAtuacao, CNPJ, endereco);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ExcluirNotificacao method, of class Administrador.
     */
    @Test
    public void testExcluirNotificacao() {
        System.out.println("ExcluirNotificacao");
        Administrador instance = null;
        instance.ExcluirNotificacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AdcionarPublicidade method, of class Administrador.
     */
    @Test
    public void testAdcionarPublicidade() {
        System.out.println("AdcionarPublicidade");
        Administrador instance = null;
        instance.AdcionarPublicidade();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarPublicidade method, of class Administrador.
     */
    @Test
    public void testModificarPublicidade() {
        System.out.println("ModificarPublicidade");
        Administrador instance = null;
        instance.ModificarPublicidade();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VisualizarAnonimo method, of class Administrador.
     */
    @Test
    public void testVisualizarAnonimo() {
        System.out.println("VisualizarAnonimo");
        Administrador instance = null;
        instance.VisualizarAnonimo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VisualizarDenuncias method, of class Administrador.
     */
    @Test
    public void testVisualizarDenuncias() {
        System.out.println("VisualizarDenuncias");
        Administrador instance = null;
        instance.VisualizarDenuncias();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ExcluirConta method, of class Administrador.
     */
    @Test
    public void testExcluirConta() {
        System.out.println("ExcluirConta");
        Administrador instance = null;
        instance.ExcluirConta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BloqDesBloqUser method, of class Administrador.
     */
    @Test
    public void testBloqDesBloqUser() {
        System.out.println("BloqDesBloqUser");
        Administrador instance = null;
        instance.BloqDesBloqUser();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
