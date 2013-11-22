/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

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
public class ControllerFarowlTest {
    
    public ControllerFarowlTest() {
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
     * Test of GerarRanking method, of class ControllerFarowl.
     */
    @Test
    public void testGerarRanking() {
        System.out.println("GerarRanking");
        ControllerFarowl instance = new ControllerFarowl();
        instance.GerarRanking();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Avisar method, of class ControllerFarowl.
     */
    @Test
    public void testAvisar() {
        System.out.println("Avisar");
        ControllerFarowl instance = new ControllerFarowl();
        instance.Avisar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EncriptarSenha method, of class ControllerFarowl.
     */
    @Test
    public void testEncriptarSenha() {
        System.out.println("EncriptarSenha");
        ControllerFarowl instance = new ControllerFarowl();
        String expResult = "";
        String result = instance.EncriptarSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FiltrarPost method, of class ControllerFarowl.
     */
    @Test
    public void testFiltrarPost() {
        System.out.println("FiltrarPost");
        ControllerFarowl instance = new ControllerFarowl();
        boolean expResult = false;
        boolean result = instance.FiltrarPost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
