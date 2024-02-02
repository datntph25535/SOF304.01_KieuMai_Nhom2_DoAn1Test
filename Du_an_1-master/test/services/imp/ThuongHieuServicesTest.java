/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package services.imp;

import java.util.List;
import models.ThuongHieu;
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
public class ThuongHieuServicesTest {
    
    public ThuongHieuServicesTest() {
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
     * Test of getAll method, of class ThuongHieuServices.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        ThuongHieuServices instance = new ThuongHieuServices();
        List<ThuongHieu> expResult = instance.getAll();
        List<ThuongHieu> result = instance.getAll();
        assertEquals(expResult, result);
    }

    @Test
    public void testAdd() {
        System.out.println("Add");
        Objecttt x = new Objecttt(1, "Gucci");
        ThuongHieuServices instance = new ThuongHieuServices();
        String expResult = instance.Add(x);
        String result = instance.Add(x);
        assertEquals(expResult, result);
    }

    @Test
    public void testUpdate() {
        System.out.println("Update");
        Objecttt x = new Objecttt(1, "Gucci");
        int id = 1;
        ThuongHieuServices instance = new ThuongHieuServices();
        String expResult = instance.Update(x, id);
        String result = instance.Update(x, id);
        assertEquals(expResult, result);
    }

    @Test
    public void testDelete() {
        System.out.println("Delete");
        int id = 1;
        ThuongHieuServices instance = new ThuongHieuServices();
        String expResult = instance.Delete(id);
        String result = instance.Delete(id);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetbyid() {
        System.out.println("getbyid");
        int id = 1;
        ThuongHieuServices instance = new ThuongHieuServices();
        ThuongHieu expResult = instance.getbyid(id);
        ThuongHieu result = instance.getbyid(id);
        assertEquals(expResult, result);
    }
    
}
