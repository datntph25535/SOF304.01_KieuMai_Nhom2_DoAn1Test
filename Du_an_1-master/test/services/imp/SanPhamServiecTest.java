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
        List<SanPhamViewModel> expResult = instance.getListSanPham();
        List<SanPhamViewModel> result = instance.getListSanPham();
        assertEquals(expResult, result);
    }

    /**
     * Test of updateSoLuongSP method, of class SanPhamServiec.
     */
    @Test
    public void testUpdateSoLuongSP() {
        String Masp = "SP120";
        int SoLuong = 10;
        SanPhamServiec instance = new SanPhamServiec();
        boolean expResult = true;
        boolean result = instance.updateSoLuongSP(Masp, SoLuong);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetIdSanPham() {
        String MaSP = "SP001";
        SanPhamServiec instance = new SanPhamServiec();
        Integer expResult = 1;
        Integer result = instance.getIdSanPham(MaSP);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSeachSanPham() {
        String Ten = "Áo khoác nam";
        SanPhamServiec instance = new SanPhamServiec();
        List<SanPham> expResult = instance.seachSanPham(Ten);
        List<SanPham> result = instance.seachSanPham(Ten);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSeachBarCodeS() {
        String barcode = "887902568655";
        SanPhamServiec instance = new SanPhamServiec();
        List<SanPham> expResult = instance.seachBarCodeS(barcode);
        List<SanPham> result = instance.seachBarCodeS(barcode);
        assertEquals(expResult, result);
    }

    @Test
    public void testLocTheoDanhMucSP() {
        String TenDanhMuc = "Áo khoác";
        SanPhamServiec instance = new SanPhamServiec();
        List<SanPhamViewModel> expResult = instance.locTheoDanhMucSP(TenDanhMuc);
        List<SanPhamViewModel> result = instance.locTheoDanhMucSP(TenDanhMuc);
        assertEquals(expResult, result);
    }
    
}
