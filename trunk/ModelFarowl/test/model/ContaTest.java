/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.File;
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
public class ContaTest {
    
    public ContaTest() {
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
     * Test of getID method, of class Conta.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Conta instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Conta.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        Conta instance = null;
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fazerLogin method, of class Conta.
     */
    @Test
    public void testFazerLogin() {
        System.out.println("fazerLogin");
        String login = "";
        int senha = 0;
        Conta instance = null;
        boolean expResult = false;
        boolean result = instance.fazerLogin(login, senha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Conta.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Conta instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Conta.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Conta instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class Conta.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Conta instance = null;
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class Conta.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Conta instance = null;
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class Conta.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Conta instance = null;
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSenha method, of class Conta.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "";
        Conta instance = null;
        instance.setSenha(senha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Conta.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Conta instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Conta.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Conta instance = null;
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Conta.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Conta instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Conta.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object t = null;
        Conta instance = null;
        int expResult = 0;
        int result = instance.compareTo(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Conta.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Conta instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Conta.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Conta instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareEmail method, of class Conta.
     */
    @Test
    public void testCompareEmail() {
        System.out.println("compareEmail");
        Conta t = null;
        Conta instance = null;
        boolean expResult = false;
        boolean result = instance.compareEmail(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ContaImpl extends Conta {

        public ContaImpl() {
            super("", "", "", "");
        }
    }

    /**
     * Test of mudarStatus method, of class Conta.
     */
    @Test
    public void testMudarStatus() {
        System.out.println("mudarStatus");
        boolean b = false;
        Conta instance = null;
        instance.mudarStatus(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notificar method, of class Conta.
     */
    @Test
    public void testNotificar() {
        System.out.println("notificar");
        String texto = "";
        File midia = null;
        Conta instance = null;
        instance.notificar(texto, midia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apoiar method, of class Conta.
     */
    @Test
    public void testApoiar() {
        System.out.println("apoiar");
        Conta instance = null;
        instance.apoiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notificarAnonimo method, of class Conta.
     */
    @Test
    public void testNotificarAnonimo() {
        System.out.println("notificarAnonimo");
        Conta instance = null;
        instance.notificarAnonimo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comentarAnonimo method, of class Conta.
     */
    @Test
    public void testComentarAnonimo() {
        System.out.println("comentarAnonimo");
        Conta instance = null;
        instance.comentarAnonimo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarNotificacao method, of class Conta.
     */
    @Test
    public void testBuscarNotificacao() {
        System.out.println("buscarNotificacao");
        Conta instance = null;
        instance.buscarNotificacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desapoiar method, of class Conta.
     */
    @Test
    public void testDesapoiar() {
        System.out.println("desapoiar");
        Conta instance = null;
        instance.desapoiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirNotificacao method, of class Conta.
     */
    @Test
    public void testExcluirNotificacao() {
        System.out.println("excluirNotificacao");
        Conta instance = null;
        instance.excluirNotificacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comentar method, of class Conta.
     */
    @Test
    public void testComentar_0args() {
        System.out.println("comentar");
        Conta instance = null;
        instance.comentar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comentar method, of class Conta.
     */
    @Test
    public void testComentar_String_File() {
        System.out.println("comentar");
        String texto = "";
        File midia = null;
        Conta instance = null;
        instance.comentar(texto, midia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
