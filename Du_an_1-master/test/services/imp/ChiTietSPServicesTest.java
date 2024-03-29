/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package services.imp;

import java.sql.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import viewmodels.ChiTietSPViewModel;

/**
 *
 * @author admin
 */
public class ChiTietSPServicesTest {
    
    public ChiTietSPServicesTest() {
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
     * Test of getAll method, of class ChiTietSPServices.
     */
    @Test
    public void testGetAll1() {
        System.out.println("getAll");
        ChiTietSPServices instance = new ChiTietSPServices();
        List<ChiTietSPViewModel> expResult = instance.getAll();
        List<ChiTietSPViewModel> result = instance.getAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of getlistbyTen method, of class ChiTietSPServices.
     */
    @Test
    public void testGetlistbyTen() {
        System.out.println("getlistbyTen");
        String ten = "Áo";
        ChiTietSPServices instance = new ChiTietSPServices();
        List<ChiTietSPViewModel> expResult = instance.getlistbyTen(ten);
        List<ChiTietSPViewModel> result = instance.getlistbyTen(ten);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkngay method, of class ChiTietSPServices.
     */
    @Test
    public void testCheckngay() {
        System.out.println("checkngay");
        String id = "20";
        ChiTietSPServices instance = new ChiTietSPServices();
        Date expResult = instance.checkngay(id);
        Date result = instance.checkngay(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkngay2 method, of class ChiTietSPServices.
     */
    @Test
    public void testCheckngay2() {
        System.out.println("checkngay2");
        String id = "21";
        ChiTietSPServices instance = new ChiTietSPServices();
        Date expResult = instance.checkngay2(id);
        Date result = instance.checkngay2(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of Add method, of class ChiTietSPServices.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        ChiTietSPViewModel x = null;
        ChiTietSPServices instance = new ChiTietSPServices();
        boolean expResult = instance.Add(x);
        boolean result = instance.Add(x);
        assertEquals(expResult, result);
    }

    /**
     * Test of Update method, of class ChiTietSPServices.
     */
    @Test
    public void testUpdate_String_ChiTietSPViewModel() {
        System.out.println("Update");
        String ma = "SP001";
        ChiTietSPViewModel x = null;
        ChiTietSPServices instance = new ChiTietSPServices();
        boolean expResult = instance.Update(ma, x);
        boolean result = instance.Update(ma, x);
        assertEquals(expResult, result);
    }

    /**
     * Test of getSPhet method, of class ChiTietSPServices.
     */
    @Test
    public void testGetSPhet() {
        System.out.println("getSPhet");
        ChiTietSPServices instance = new ChiTietSPServices();
        List<ChiTietSPViewModel> expResult = instance.getSPhet();
        List<ChiTietSPViewModel> result = instance.getSPhet();
        assertEquals(expResult, result);
    }

    /**
     * Test of GetAll method, of class ChiTietSPServices.
     */
    @Test
    public void testGetAll2() {
        System.out.println("GetAll");
        ChiTietSPServices instance = new ChiTietSPServices();
        List<ChiTietSPViewModel> expResult = instance.GetAll();
        List<ChiTietSPViewModel> result = instance.GetAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of Update method, of class ChiTietSPServices.
     */
    @Test
    public void testUpdate_String_String() {
        System.out.println("Update");
        String ma = "SP001";
        String id = "1";
        ChiTietSPServices instance = new ChiTietSPServices();
        boolean expResult = instance.Update(ma, id);
        boolean result = instance.Update(ma, id);
        assertEquals(expResult, result);
    }
    
}
