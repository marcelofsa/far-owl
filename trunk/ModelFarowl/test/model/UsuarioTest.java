/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of Comentar method, of class Usuario.
     */
    @Test
    public void testComentar() {
        System.out.println("Comentar");
        Usuario instance = null;
        Comentario expResult = null;
        Comentario result = instance.Comentar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCidade method, of class Usuario.
     */
    @Test
    public void testGetCidade() {
        System.out.println("getCidade");
        Usuario instance = null;
        String expResult = "";
        String result = instance.getCidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCidade method, of class Usuario.
     */
    @Test
    public void testSetCidade() {
        System.out.println("setCidade");
        String cidade = "";
        Usuario instance = null;
        instance.setCidade(cidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Usuario.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Usuario instance = null;
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Usuario.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String Estado = "";
        Usuario instance = null;
        instance.setEstado(Estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPais method, of class Usuario.
     */
    @Test
    public void testGetPais() {
        System.out.println("getPais");
        Usuario instance = null;
        String expResult = "";
        String result = instance.getPais();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPais method, of class Usuario.
     */
    @Test
    public void testSetPais() {
        System.out.println("setPais");
        String pais = "";
        Usuario instance = null;
        instance.setPais(pais);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFoto method, of class Usuario.
     */
    @Test
    public void testGetFoto() {
        System.out.println("getFoto");
        Usuario instance = null;
        Image expResult = null;
        Image result = instance.getFoto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFoto method, of class Usuario.
     */
    @Test
    public void testSetFoto() {
        System.out.println("setFoto");
        Image foto = null;
        Usuario instance = null;
        instance.setFoto(foto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UsuarioImpl extends Usuario {

        public UsuarioImpl() {
            super("", "", 0, "");
        }
    }
}
