/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package services.imp;

import java.util.List;
import models.KichCo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import viewmodels.Objecttt;

/**
 *
 * @author admin
 */
public class KichCoServicesTest {
    
    public KichCoServicesTest() {
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
     * Test of getAll method, of class KichCoServices.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        KichCoServices instance = new KichCoServices();
        List<KichCo> expResult = instance.getAll();
        List<KichCo> result = instance.getAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of Add method, of class KichCoServices.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        Objecttt x = new Objecttt(1, "XL");
        KichCoServices instance = new KichCoServices();
        String expResult = instance.Add(x);
        String result = instance.Add(x);
        assertEquals(expResult, result);
    }

    /**
     * Test of Update method, of class KichCoServices.
     */
    @Test
    public void testUpdate() {
        System.out.println("Update");
        Objecttt x = new Objecttt(1, "XL");
        int id = 0;
        KichCoServices instance = new KichCoServices();
        String expResult = instance.Update(x, id);
        String result = instance.Update(x, id);
        assertEquals(expResult, result);
    }

    /**
     * Test of Delete method, of class KichCoServices.
     */
    @Test
    public void testDelete() {
        System.out.println("Delete");
        int id = 0;
        KichCoServices instance = new KichCoServices();
        String expResult = instance.Delete(id);
        String result = instance.Delete(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getbyid method, of class KichCoServices.
     */
    @Test
    public void testGetbyid() {
        System.out.println("getbyid");
        int id = 1;
        KichCoServices instance = new KichCoServices();
        KichCo expResult = instance.getbyid(id);
        KichCo result = instance.getbyid(id);
        assertEquals(expResult, result);
    }
    
}
