/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.File;
import javax.swing.ImageIcon;
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
public class NotificacaoTest {
    
    public NotificacaoTest() {
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
     * Test of getID method, of class Notificacao.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Notificacao instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Notificacao.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        Notificacao instance = null;
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTexto method, of class Notificacao.
     */
    @Test
    public void testGetTexto() {
        System.out.println("getTexto");
        Notificacao instance = null;
        String expResult = "";
        String result = instance.getTexto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTexto method, of class Notificacao.
     */
    @Test
    public void testSetTexto() {
        System.out.println("setTexto");
        String texto = "";
        Notificacao instance = null;
        instance.setTexto(texto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFoto method, of class Notificacao.
     */
    @Test
    public void testGetFoto() {
        System.out.println("getFoto");
        Notificacao instance = null;
        ImageIcon expResult = null;
        File result = instance.getFoto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFoto method, of class Notificacao.
     */
    @Test
    public void testSetFoto() {
        System.out.println("setFoto");
        File foto = null;
        Notificacao instance = null;
        instance.setFoto(foto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTag method, of class Notificacao.
     */
    @Test
    public void testGetTag() {
        System.out.println("getTag");
        Notificacao instance = null;
        String expResult = "";
        String result = instance.getTag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTag method, of class Notificacao.
     */
    @Test
    public void testSetTag() {
        System.out.println("setTag");
        String tag = "";
        Notificacao instance = null;
        instance.setTag(tag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isStatus method, of class Notificacao.
     */
    @Test
    public void testIsStatus() {
        System.out.println("isStatus");
        Notificacao instance = null;
        boolean expResult = false;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MudarStatus method, of class Notificacao.
     */
    @Test
    public void testMudarStatus() {
        System.out.println("MudarStatus");
        boolean status = false;
        Notificacao instance = null;
        instance.MudarStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comentar method, of class Notificacao.
     */
    @Test
    public void testComentar() {
        System.out.println("comentar");
        Notificacao instance = null;
        instance.comentar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
