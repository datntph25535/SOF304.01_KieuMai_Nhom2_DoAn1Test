/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package services.imp;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.bridj.ann.Template;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;
import viewmodels.HoaDonCHiTietViewModel;
import viewmodels.HoaDonViewModel;

/**
 *
 * @author tuphp
 */
public class HoaDonServiecTest {

    public HoaDonServiecTest() {
    }


    @Test
    public void testSaveHD() {
        // Lấy ngày hiện tại
        LocalDate currentDate = LocalDate.now();
        // Chuyển đổi sang java.sql.Date
        Date sqlDate = Date.valueOf(currentDate);

        HoaDonViewModel hoaDon = new HoaDonViewModel();
        hoaDon.setMa("HD002");
        hoaDon.setNgayTao(sqlDate);
        int idNV = 5;

        HoaDonServiec hoaDonService = new HoaDonServiec();
        Integer expected = 1; // Giá trị kết quả mong đợi
        Integer result = hoaDonService.saveHD(hoaDon, idNV);
        assertEquals(expected, result);
    }

     @Test
    public void testSaveHDCT() {    
        HoaDonCHiTietViewModel hoaDonChiTiet = new HoaDonCHiTietViewModel();
        hoaDonChiTiet.setSoluong(10);
        hoaDonChiTiet.setDonGia(100.0);
        String maSP = "SP1";
        String maHD = "HD002";
        HoaDonServiec hoaDonService = new HoaDonServiec();
        Integer expected = 1;
        Integer result = hoaDonService.saveHDCT(hoaDonChiTiet, maSP, maHD);
        assertEquals("Kết quả không khớp với giá trị mong đợi", expected, result);
    

    @Test
    public void testThanhToanHD() {
        // Lấy ngày hiện tại
        LocalDate currentDate = LocalDate.now();
        // Chuyển đổi sang java.sql.Date
        Date sqlDate = Date.valueOf(currentDate);

        HoaDonViewModel model = new HoaDonViewModel();
        model.setMa("HD002");
        model.setGhiChu("Dep");
        model.setTongTien(10000.0);
        model.setNgayThanhToan(sqlDate);

        HoaDonServiec hoaDonService = new HoaDonServiec();
        Integer expected = 1; // Giá trị kết quả mong đợi
        Integer result = null;

        try {
            result = hoaDonService.updateTrangThaiHoaDon(model);
            assertEquals(expected, result);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
            e.printStackTrace();
            fail("Xảy ra lỗi ngoại lệ: " + e.getClass().getSimpleName());
        }
    }
    
     @Test
    public void testDeleteSanPham() {
        int idHD = 1;
        int idSP = 2;

        HoaDonServiec hoaDonService = new HoaDonServiec();
        Integer expected = 1; // Giá trị kết quả mong đợi
        Integer result = hoaDonService.deleteSanPham(idHD, idSP);
        assertEquals(expected, result);
    }

    @Test
    public void testUpdateSoLuongGioHang() {
        int soLuong = 5;
        String maSP = "SP1";
        String maHD = "HD001";

        HoaDonServiec hoaDonService = new HoaDonServiec();
        Integer expected = 1; // Giá trị kết quả mong đợi
        Integer result = hoaDonService.updateSoLuongGioHang(soLuong, maSP, maHD);
        assertEquals(expected, result);
    }
    
}
