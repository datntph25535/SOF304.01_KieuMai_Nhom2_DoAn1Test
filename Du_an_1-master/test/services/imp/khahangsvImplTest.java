/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.imp;

import java.util.List;
import models.KhachHang;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import viewmodels.KhachHang02ViewMD;
import viewmodels.KhachHangViewMD;

/**
 *
 * @author PC
 */
public class khahangsvImplTest {
    
    public khahangsvImplTest() {
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
     * Test of getall method, of class khahangsvImpl.
     */
    @Test
    public void testGetall() {
        System.out.println("getall");
        khahangsvImpl instance = new khahangsvImpl();
        List<KhachHangViewMD> expResult = null;
        List<KhachHangViewMD> result = instance.getall();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class khahangsvImpl.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        KhachHang khachHang = null;
        khahangsvImpl instance = new khahangsvImpl();
        String expResult = "";
        String result = instance.add(khachHang);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class khahangsvImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 0;
        KhachHang khachHang = null;
        khahangsvImpl instance = new khahangsvImpl();
        String expResult = "";
        String result = instance.update(id, khachHang);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class khahangsvImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        khahangsvImpl instance = new khahangsvImpl();
        String expResult = "";
        String result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetTK method, of class khahangsvImpl.
     */
    @Test
    public void testGetTK() {
        System.out.println("GetTK");
        String SDT = "";
        khahangsvImpl instance = new khahangsvImpl();
        List<KhachHangViewMD> expResult = null;
        List<KhachHangViewMD> result = instance.GetTK(SDT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getall01 method, of class khahangsvImpl.
     */
    @Test
    public void testGetall01() {
        System.out.println("getall01");
        khahangsvImpl instance = new khahangsvImpl();
        List<KhachHang02ViewMD> expResult = null;
        List<KhachHang02ViewMD> result = instance.getall01();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TenDiemKhachHang method, of class khahangsvImpl.
     */
    @Test
    public void testTenDiemKhachHang() {
        System.out.println("TenDiemKhachHang");
        String SDT = "";
        khahangsvImpl instance = new khahangsvImpl();
        List<KhachHang> expResult = null;
        List<KhachHang> result = instance.TenDiemKhachHang(SDT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDiemKhachHang method, of class khahangsvImpl.
     */
    @Test
    public void testUpdateDiemKhachHang() {
        System.out.println("updateDiemKhachHang");
        String SDT = "";
        int diem = 0;
        khahangsvImpl instance = new khahangsvImpl();
        Integer expResult = null;
        Integer result = instance.updateDiemKhachHang(SDT, diem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetTKTheoIDKH method, of class khahangsvImpl.
     */
    @Test
    public void testGetTKTheoIDKH() {
        System.out.println("GetTKTheoIDKH");
        int ID = 0;
        khahangsvImpl instance = new khahangsvImpl();
        List<KhachHang02ViewMD> expResult = null;
        List<KhachHang02ViewMD> result = instance.GetTKTheoIDKH(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kiemtra method, of class khahangsvImpl.
     */
    @Test
    public void testKiemtra() {
        System.out.println("kiemtra");
        String mail = "";
        khahangsvImpl instance = new khahangsvImpl();
        String expResult = "";
        String result = instance.kiemtra(mail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kiemtrasdt method, of class khahangsvImpl.
     */
    @Test
    public void testKiemtrasdt() {
        System.out.println("kiemtrasdt");
        String sdt = "";
        khahangsvImpl instance = new khahangsvImpl();
        String expResult = "";
        String result = instance.kiemtrasdt(sdt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
