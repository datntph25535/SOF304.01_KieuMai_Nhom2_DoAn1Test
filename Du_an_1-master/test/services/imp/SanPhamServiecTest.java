/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package services.imp;

import java.util.List;
import models.SanPham;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import viewmodels.SanPhamViewModel;

/**
 *
 * @author admin
 */
public class SanPhamServiecTest {
    
    public SanPhamServiecTest() {
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
     * Test of getListSanPham method, of class SanPhamServiec.
     */
    @Test
    public void testGetListSanPham() {
        System.out.println("getListSanPham");
        SanPhamServiec instance = new SanPhamServiec();
        List<SanPhamViewModel> expResult = null;
        List<SanPhamViewModel> result = instance.getListSanPham();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSoLuongSP method, of class SanPhamServiec.
     */
    @Test
    public void testUpdateSoLuongSP() {
        System.out.println("updateSoLuongSP");
        String Masp = "";
        int SoLuong = 0;
        SanPhamServiec instance = new SanPhamServiec();
        boolean expResult = false;
        boolean result = instance.updateSoLuongSP(Masp, SoLuong);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdSanPham method, of class SanPhamServiec.
     */
    @Test
    public void testGetIdSanPham() {
        System.out.println("getIdSanPham");
        String MaSP = "";
        SanPhamServiec instance = new SanPhamServiec();
        Integer expResult = null;
        Integer result = instance.getIdSanPham(MaSP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seachSanPham method, of class SanPhamServiec.
     */
    @Test
    public void testSeachSanPham() {
        System.out.println("seachSanPham");
        String Ten = "";
        SanPhamServiec instance = new SanPhamServiec();
        List<SanPham> expResult = null;
        List<SanPham> result = instance.seachSanPham(Ten);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seachBarCodeS method, of class SanPhamServiec.
     */
    @Test
    public void testSeachBarCodeS() {
        System.out.println("seachBarCodeS");
        String barcode = "";
        SanPhamServiec instance = new SanPhamServiec();
        List<SanPham> expResult = null;
        List<SanPham> result = instance.seachBarCodeS(barcode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of locTheoDanhMucSP method, of class SanPhamServiec.
     */
    @Test
    public void testLocTheoDanhMucSP() {
        System.out.println("locTheoDanhMucSP");
        String TenDanhMuc = "";
        SanPhamServiec instance = new SanPhamServiec();
        List<SanPhamViewModel> expResult = null;
        List<SanPhamViewModel> result = instance.locTheoDanhMucSP(TenDanhMuc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
