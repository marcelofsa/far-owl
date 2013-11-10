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
 * @author CasaPc
 */
public class ControllerTest {
    
    public ControllerTest() {
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
     * Test of CadastrarUsuario method, of class Controller.
     */
    @Test
    public void testCadastrarUsuario() throws Exception {
        System.out.println("CadastrarUsuario");
        String nome = "";
        String login = "";
        String senha = "";
        String confirmaSenha = "";
        String email = "";
        String confirmaEmail = "";
        Controller instance = new Controller();
        instance.CadastrarUsuario(nome, login, senha, confirmaSenha, email, confirmaEmail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of criarPerfil method, of class Controller.
     */
    @Test
    public void testCriarPerfil() {
        System.out.println("criarPerfil");
        String sobrenome = "";
        String estado = "";
        String cidade = "";
        String pais = "";
        Controller instance = new Controller();
        instance.criarPerfil(sobrenome, estado, cidade, pais);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GerarRaking method, of class Controller.
     */
    @Test
    public void testGerarRaking() {
        System.out.println("GerarRaking");
        Controller instance = new Controller();
        instance.GerarRaking();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Avisar method, of class Controller.
     */
    @Test
    public void testAvisar() {
        System.out.println("Avisar");
        Controller instance = new Controller();
        instance.Avisar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EncriptarSenha method, of class Controller.
     */
    @Test
    public void testEncriptarSenha() {
        System.out.println("EncriptarSenha");
        Controller instance = new Controller();
        instance.EncriptarSenha();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FiltrarPost method, of class Controller.
     */
    @Test
    public void testFiltrarPost() {
        System.out.println("FiltrarPost");
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.FiltrarPost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarEmail method, of class Controller.
     */
    @Test
    public void testVerificarEmail() {
        System.out.println("verificarEmail");
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.verificarEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Controller.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Controller.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
