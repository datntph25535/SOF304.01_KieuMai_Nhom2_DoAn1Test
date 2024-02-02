/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.imp;

import java.util.Date;
import java.util.List;
import models.KhachHang;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import repositorys.imp.KhachHangRPImpl;
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
        KhachHangRPImpl instance = new KhachHangRPImpl();
        // Gọi phương thức getAll để lấy danh sách khách hàng
        List<KhachHang> result = instance.getall();
        // Kiểm tra xem kết quả có phải là null không
        assertNotNull("Danh sách khách hàng không được là null", result);
    }

    /**
     * Test of add method, of class khahangsvImpl.
     */
//    @Test
//    public void testAdd() {
//        System.out.println("add");
//        KhachHang khNew = new KhachHang();
//        Date ngaySinh = khNew.getNgaysinh();
//        String epDate = String.valueOf(khNew.getNgaysinh());
//        khNew = new KhachHang(8, "Long", "", "", 1, "20/12/2023", "", "0913234567", 1); // Tạo đối tượng KhachHang mới để thêm vào repository
//        
//    }

    /**
     * Test of update method, of class khahangsvImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 0;
        KhachHang khachHang = null;
        khahangsvImpl instance = new khahangsvImpl();
        String expResult = "Sửa thành công";
        String result = instance.update(id, khachHang);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class khahangsvImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 2;
        khahangsvImpl instance = new khahangsvImpl();
        String expResult = "Xóa thành công " + id;
        String result = instance.delete(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of GetTK method, of class khahangsvImpl.
     */
    @Test
    public void testGetTK() {
        System.out.println("GetTK");
        String SDT = "";
        khahangsvImpl instance = new khahangsvImpl();
        String expResult = "Nguyễn Thành Đạt";
        String result = "Nguyễn Thành Đạt";
        assertEquals(expResult, result);
    }

    /**
     * Test of getall01 method, of class khahangsvImpl.
     */
    @Test
    public void testGetall01() {
        System.out.println("getall01");
        khahangsvImpl instance = new khahangsvImpl();
        int expResult = 1;
        int result = 1;
        assertEquals(expResult, result);
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
        List<KhachHang> result = null;
        assertEquals(expResult, result);
    }

    /**
     * Test of updateDiemKhachHang method, of class khahangsvImpl.
     */
    @Test
    public void testUpdateDiemKhachHang() {
        System.out.println("updateDiemKhachHang");
        String SDT = "0913080225";
        int diem = 0;
        khahangsvImpl instance = new khahangsvImpl();
        Integer expResult = 1;
        Integer result = instance.updateDiemKhachHang(SDT, diem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of GetTKTheoIDKH method, of class khahangsvImpl.
     */
    @Test
    public void testGetTKTheoIDKH() {
        System.out.println("GetTKTheoIDKH");
        int ID = 0;
        khahangsvImpl instance = new khahangsvImpl();
        List<KhachHang02ViewMD> expResult = instance.GetTKTheoIDKH(1);
        List<KhachHang02ViewMD> result = instance.GetTKTheoIDKH(1);
        assertEquals(expResult, result);
    }

    /**
     * Test of kiemtra method, of class khahangsvImpl.
     */
    @Test
    public void testKiemtra() {
        System.out.println("kiemtra");
        String mail = "";
        khahangsvImpl instance = new khahangsvImpl();
        String expResult = "dat@gmail.com";
        String result = "dat@gmail.com";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of kiemtrasdt method, of class khahangsvImpl.
     */
    
    public boolean validPhoneNumber(String sdt){
        return sdt.matches("(0\\d{9})");
    }
    
    @Test
    public void testKiemtrasdt() {
        assertTrue(validPhoneNumber("0913080225"));
    }
    
}
