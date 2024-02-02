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
        List<MauSac> expResult = instance.getAll();
        List<MauSac> result = instance.getAll();
        assertEquals(expResult, result);
    }

    @Test
    public void testAdd() {
        System.out.println("Add");
        Objecttt x = new Objecttt(1, "Xanh");
        MauSacServices instance = new MauSacServices();
        String expResult = instance.Add(x);
        String result = instance.Add(x);
        assertEquals(expResult, result);
    }

    @Test
    public void testUpdate() {
        System.out.println("Update");
        Objecttt x = new Objecttt(1, "Xanh");
        int id = 0;
        MauSacServices instance = new MauSacServices();
        String expResult = instance.Update(x, id);
        String result = instance.Update(x, id);
        assertEquals(expResult, result);
    }

    @Test
    public void testDelete() {
        System.out.println("Delete");
        int id = 1;
        MauSacServices instance = new MauSacServices();
        String expResult = instance.Delete(id);
        String result = instance.Delete(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getbyid method, of class MauSacServices.
     */
    @Test
    public void testGetbyid() {
        System.out.println("getbyid");
        int id = 1;
        MauSacServices instance = new MauSacServices();
        MauSac expResult = instance.getbyid(id);
        MauSac result = instance.getbyid(id);
        assertEquals(expResult, result);
    }
    
}
