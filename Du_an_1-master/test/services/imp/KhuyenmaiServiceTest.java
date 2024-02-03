/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package services.imp;

import java.util.List;
import models.KhuyenMai;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import viewmodels.KhuyenmaiViewmodel;

/**
 *
 * @author Hoang Hiep
 */
public class KhuyenmaiServiceTest {
    
    public KhuyenmaiServiceTest() {
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
     * Test of GetALL method, of class KhuyenmaiService.
     */
    @Test
    public void testGetALL() {
        System.out.println("GetALL");
        KhuyenmaiService instance = new KhuyenmaiService();
        List<KhuyenmaiViewmodel> expResult = null;
        List<KhuyenmaiViewmodel> result = instance.GetALL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Add method, of class KhuyenmaiService.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        KhuyenmaiViewmodel km = null;
        KhuyenmaiService instance = new KhuyenmaiService();
        boolean expResult = false;
        boolean result = instance.Add(km);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Update method, of class KhuyenmaiService.
     */
    @Test
    public void testUpdate() {
        System.out.println("Update");
        KhuyenmaiViewmodel km = null;
        String id = "";
        KhuyenmaiService instance = new KhuyenmaiService();
        boolean expResult = false;
        boolean result = instance.Update(km, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Delete method, of class KhuyenmaiService.
     */
    @Test
    public void testDelete() {
        System.out.println("Delete");
        String id = "";
        KhuyenmaiService instance = new KhuyenmaiService();
        boolean expResult = false;
        boolean result = instance.Delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checktrung method, of class KhuyenmaiService.
     */
    @Test
    public void testChecktrung() {
        System.out.println("checktrung");
        String ten = "";
        KhuyenmaiService instance = new KhuyenmaiService();
        String expResult = "";
        String result = instance.checktrung(ten);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetOnebyBD method, of class KhuyenmaiService.
     */
    @Test
    public void testGetOnebyBD() {
        System.out.println("GetOnebyBD");
        String date = "";
        KhuyenmaiService instance = new KhuyenmaiService();
        List<KhuyenmaiViewmodel> expResult = null;
        List<KhuyenmaiViewmodel> result = instance.GetOnebyBD(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetOnebyKT method, of class KhuyenmaiService.
     */
    @Test
    public void testGetOnebyKT() {
        System.out.println("GetOnebyKT");
        String date = "";
        KhuyenmaiService instance = new KhuyenmaiService();
        List<KhuyenmaiViewmodel> expResult = null;
        List<KhuyenmaiViewmodel> result = instance.GetOnebyKT(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetOnebyALL method, of class KhuyenmaiService.
     */
    @Test
    public void testGetOnebyALL() {
        System.out.println("GetOnebyALL");
        String datedb = "";
        String datekt = "";
        KhuyenmaiService instance = new KhuyenmaiService();
        List<KhuyenmaiViewmodel> expResult = null;
        List<KhuyenmaiViewmodel> result = instance.GetOnebyALL(datedb, datekt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetOnebyten method, of class KhuyenmaiService.
     */
    @Test
    public void testGetOnebyten() {
        System.out.println("GetOnebyten");
        String ten = "";
        KhuyenmaiService instance = new KhuyenmaiService();
        List<KhuyenmaiViewmodel> expResult = null;
        List<KhuyenmaiViewmodel> result = instance.GetOnebyten(ten);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateTT method, of class KhuyenmaiService.
     */
    @Test
    public void testUpdateTT() {
        System.out.println("UpdateTT");
        KhuyenmaiService instance = new KhuyenmaiService();
        boolean expResult = false;
        boolean result = instance.UpdateTT();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateTT2 method, of class KhuyenmaiService.
     */
    @Test
    public void testUpdateTT2() {
        System.out.println("UpdateTT2");
        KhuyenmaiService instance = new KhuyenmaiService();
        boolean expResult = false;
        boolean result = instance.UpdateTT2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getlist method, of class KhuyenmaiService.
     */
    @Test
    public void testGetlist() {
        System.out.println("getlist");
        KhuyenmaiService instance = new KhuyenmaiService();
        List<KhuyenMai> expResult = null;
        List<KhuyenMai> result = instance.getlist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
