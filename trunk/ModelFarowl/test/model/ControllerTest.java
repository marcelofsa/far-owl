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

    /**
     * Test of fazerLogin method, of class Controller.
     */
    @org.junit.Test
    public void testFazerLogin() {
        System.out.println("fazerLogin");
        String nome = "";
        String senha = "";
        Controller instance = new Controller();
        Conta expResult = null;
        Conta result = instance.fazerLogin(nome, senha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarLogin method, of class Controller.
     */
    @org.junit.Test
    public void testVerificarLogin() {
        System.out.println("verificarLogin");
        String email = "";
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.verificarLogin(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recuperarSenha method, of class Controller.
     */
    @org.junit.Test
    public void testRecuperarSenha() {
        System.out.println("recuperarSenha");
        String email = "";
        Controller instance = new Controller();
        instance.recuperarSenha(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conectarTwitter method, of class Controller.
     */
    @org.junit.Test
    public void testConectarTwitter() {
        System.out.println("conectarTwitter");
        Controller instance = new Controller();
        instance.conectarTwitter();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conectarFacebook method, of class Controller.
     */
    @org.junit.Test
    public void testConectarFacebook() {
        System.out.println("conectarFacebook");
        Controller instance = new Controller();
        instance.conectarFacebook();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conectarGooglePlus method, of class Controller.
     */
    @org.junit.Test
    public void testConectarGooglePlus() {
        System.out.println("conectarGooglePlus");
        Controller instance = new Controller();
        instance.conectarGooglePlus();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adcionarPublicidade method, of class Controller.
     */
    @org.junit.Test
    public void testAdcionarPublicidade() {
        System.out.println("adcionarPublicidade");
        Controller instance = new Controller();
        instance.adcionarPublicidade();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirNotificacao method, of class Controller.
     */
    @org.junit.Test
    public void testExcluirNotificacao() {
        System.out.println("excluirNotificacao");
        Controller instance = new Controller();
        instance.excluirNotificacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarPublicidade method, of class Controller.
     */
    @org.junit.Test
    public void testModificarPublicidade() {
        System.out.println("modificarPublicidade");
        Controller instance = new Controller();
        instance.modificarPublicidade();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visualizarAnonimo method, of class Controller.
     */
    @org.junit.Test
    public void testVisualizarAnonimo() {
        System.out.println("visualizarAnonimo");
        Controller instance = new Controller();
        instance.visualizarAnonimo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirConta method, of class Controller.
     */
    @org.junit.Test
    public void testExcluirConta() {
        System.out.println("excluirConta");
        Controller instance = new Controller();
        instance.excluirConta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visualizarDenuncias method, of class Controller.
     */
    @org.junit.Test
    public void testVisualizarDenuncias() {
        System.out.println("visualizarDenuncias");
        Controller instance = new Controller();
        instance.visualizarDenuncias();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bloqDesboqUser method, of class Controller.
     */
    @org.junit.Test
    public void testBloqDesboqUser() {
        System.out.println("bloqDesboqUser");
        Controller instance = new Controller();
        instance.bloqDesboqUser();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarPerfilComun method, of class Controller.
     */
    @org.junit.Test
    public void testEditarPerfilComun() {
        System.out.println("editarPerfilComun");
        Controller instance = new Controller();
        instance.editarPerfilComun();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notificar method, of class Controller.
     */
    @org.junit.Test
    public void testNotificar() {
        System.out.println("notificar");
        Controller instance = new Controller();
        instance.notificar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of denunciarImpropria method, of class Controller.
     */
    @org.junit.Test
    public void testDenunciarImpropria() {
        System.out.println("denunciarImpropria");
        Controller instance = new Controller();
        instance.denunciarImpropria();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modoAnonimo method, of class Controller.
     */
    @org.junit.Test
    public void testModoAnonimo() {
        System.out.println("modoAnonimo");
        Controller instance = new Controller();
        instance.modoAnonimo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apoir method, of class Controller.
     */
    @org.junit.Test
    public void testApoir() {
        System.out.println("apoir");
        Controller instance = new Controller();
        instance.apoir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desapoiar method, of class Controller.
     */
    @org.junit.Test
    public void testDesapoiar() {
        System.out.println("desapoiar");
        Controller instance = new Controller();
        instance.desapoiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ocultarPontuacao method, of class Controller.
     */
    @org.junit.Test
    public void testOcultarPontuacao() {
        System.out.println("ocultarPontuacao");
        Controller instance = new Controller();
        instance.ocultarPontuacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mudarStatus method, of class Controller.
     */
    @org.junit.Test
    public void testMudarStatus() {
        System.out.println("mudarStatus");
        Controller instance = new Controller();
        instance.mudarStatus();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comentar method, of class Controller.
     */
    @org.junit.Test
    public void testComentar() {
        System.out.println("comentar");
        Controller instance = new Controller();
        instance.comentar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ordenarNotificacoes method, of class Controller.
     */
    @org.junit.Test
    public void testOrdenarNotificacoes() {
        System.out.println("ordenarNotificacoes");
        Controller instance = new Controller();
        instance.ordenarNotificacoes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mudarIdioma method, of class Controller.
     */
    @org.junit.Test
    public void testMudarIdioma() {
        System.out.println("mudarIdioma");
        Controller instance = new Controller();
        instance.mudarIdioma();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarNotificacao method, of class Controller.
     */
    @org.junit.Test
    public void testBuscarNotificacao() {
        System.out.println("buscarNotificacao");
        Controller instance = new Controller();
        instance.buscarNotificacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visualizarComentario method, of class Controller.
     */
    @org.junit.Test
    public void testVisualizarComentario() {
        System.out.println("visualizarComentario");
        Controller instance = new Controller();
        instance.visualizarComentario();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visualizarPerfil method, of class Controller.
     */
    @org.junit.Test
    public void testVisualizarPerfil() {
        System.out.println("visualizarPerfil");
        Controller instance = new Controller();
        instance.visualizarPerfil();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarSenha method, of class Controller.
     */
    @org.junit.Test
    public void testAlterarSenha() {
        System.out.println("alterarSenha");
        Controller instance = new Controller();
        instance.alterarSenha();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visualizarRaking method, of class Controller.
     */
    @org.junit.Test
    public void testVisualizarRaking() {
        System.out.println("visualizarRaking");
        Controller instance = new Controller();
        instance.visualizarRaking();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sobre method, of class Controller.
     */
    @org.junit.Test
    public void testSobre() {
        System.out.println("sobre");
        Controller instance = new Controller();
        instance.sobre();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visualizarMapa method, of class Controller.
     */
    @org.junit.Test
    public void testVisualizarMapa() {
        System.out.println("visualizarMapa");
        Controller instance = new Controller();
        instance.visualizarMapa();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visualizarAvisos method, of class Controller.
     */
    @org.junit.Test
    public void testVisualizarAvisos() {
        System.out.println("visualizarAvisos");
        Controller instance = new Controller();
        instance.visualizarAvisos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sair method, of class Controller.
     */
    @org.junit.Test
    public void testSair() {
        System.out.println("sair");
        Controller instance = new Controller();
        instance.sair();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of criarAdmin method, of class Controller.
     */
    @org.junit.Test
    public void testCriarAdmin() {
        System.out.println("criarAdmin");
        String nome = "";
        String login = "";
        String senha = "";
        String confirmaSenha = "";
        String email = "";
        String confirmaEmail = "";
        Controller instance = new Controller();
        Administrador expResult = null;
        Administrador result = instance.criarAdmin(nome, login, senha, confirmaSenha, email, confirmaEmail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of criarOficial method, of class Controller.
     */
    @org.junit.Test
    public void testCriarOficial() {
        System.out.println("criarOficial");
        String nome = "";
        String login = "";
        String senha = "";
        String confirmaSenha = "";
        String email = "";
        String confirmaEmail = "";
        Controller instance = new Controller();
        Oficial expResult = null;
        Oficial result = instance.criarOficial(nome, login, senha, confirmaSenha, email, confirmaEmail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
