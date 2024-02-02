/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package services.imp;

import java.util.List;
import models.MauSac;
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
public class MauSacServicesTest {
    
    public MauSacServicesTest() {
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
     * Test of getAll method, of class MauSacServices.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        MauSacServices instance = new MauSacServices();
        List<MauSac> expResult = null;
        List<MauSac> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Add method, of class MauSacServices.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        Objecttt x = null;
        MauSacServices instance = new MauSacServices();
        String expResult = "";
        String result = instance.Add(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Update method, of class MauSacServices.
     */
    @Test
    public void testUpdate() {
        System.out.println("Update");
        Objecttt x = null;
        int id = 0;
        MauSacServices instance = new MauSacServices();
        String expResult = "";
        String result = instance.Update(x, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Delete method, of class MauSacServices.
     */
    @Test
    public void testDelete() {
        System.out.println("Delete");
        int id = 0;
        MauSacServices instance = new MauSacServices();
        String expResult = "";
        String result = instance.Delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getbyid method, of class MauSacServices.
     */
    @Test
    public void testGetbyid() {
        System.out.println("getbyid");
        int id = 0;
        MauSacServices instance = new MauSacServices();
        MauSac expResult = null;
        MauSac result = instance.getbyid(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
