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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Lucas
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({model.NotificacaoTest.class, model.ContaTest.class, model.ControllerTest.class, model.ComumTest.class, model.AdministradorTest.class, model.ComentarioTest.class, model.OficialTest.class, model.AvisoEventTest.class, model.UsuarioTest.class})
public class ModelSuite {

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