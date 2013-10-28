/*
 * To change this template, choose Tools | Templates
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
 * @author CasaPc
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({model.UsuarioTest.class, model.ComentarioTest.class, model.AdministradorTest.class, model.ContaTest.class, model.OficialTest.class, model.AvisoEventTest.class, model.ControllerTest.class, model.ComumTest.class})
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
