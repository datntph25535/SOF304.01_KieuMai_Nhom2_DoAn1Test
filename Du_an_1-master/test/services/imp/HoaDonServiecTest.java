/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package services.imp;

import java.util.List;
import models.HoaDon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import viewmodels.HoaDonCHiTietViewModel;
import viewmodels.HoaDonViewModel;

/**
 *
 * @author tuphp
 */
public class HoaDonServiecTest {
    
    
    @Test
    public void testGetAllHD() {
        System.out.println("getAllHD");
        HoaDonServiec instance = new HoaDonServiec();
        List<HoaDonViewModel> expResult = null;
        List<HoaDonViewModel> result = instance.getAllHD();
        assertEquals(expResult, result);     
    }

    
    @Test
    public void testGetTimHDTen() {
        System.out.println("getTimHDTen");
        String Ten = "";
        HoaDonServiec instance = new HoaDonServiec();
        List<HoaDonViewModel> expResult = null;
        List<HoaDonViewModel> result = instance.getTimHDTen(Ten);
        assertEquals(expResult, result);  
    }

    
    @Test
    public void testGetAllHDCT() {
        System.out.println("getAllHDCT");
        HoaDonServiec instance = new HoaDonServiec();
        List<HoaDonCHiTietViewModel> expResult = null;
        List<HoaDonCHiTietViewModel> result = instance.getAllHDCT();
        assertEquals(expResult, result);       
    }

    
    @Test
    public void testGettimma() {
        System.out.println("gettimma");
        String ma = "";
        HoaDonServiec instance = new HoaDonServiec();
        List<HoaDonCHiTietViewModel> expResult = null;
        List<HoaDonCHiTietViewModel> result = instance.gettimma(ma);
        assertEquals(expResult, result);
    }

    
    @Test
    public void testGetTimHDTrangThai() {
        System.out.println("getTimHDTrangThai");
        int TrangThai = 0;
        HoaDonServiec instance = new HoaDonServiec();
        List<HoaDonViewModel> expResult = null;
        List<HoaDonViewModel> result = instance.getTimHDTrangThai(TrangThai);
        assertEquals(expResult, result);
    }

    
    @Test
    public void testGetTimNTT() {
        System.out.println("GetTimNTT");
        String NgayTT = "";
        HoaDonServiec instance = new HoaDonServiec();
        List<HoaDonViewModel> expResult = null;
        List<HoaDonViewModel> result = instance.GetTimNTT(NgayTT);
        assertEquals(expResult, result);
    }

    
    @Test
    public void testSaveHD() {
        System.out.println("saveHD");
        HoaDonViewModel hoaDon = null;
        int idNV = 0;
        HoaDonServiec instance = new HoaDonServiec();
        Integer expResult = null;
        Integer result = instance.saveHD(hoaDon, idNV);
        assertEquals(expResult, result);
    }

   
    @Test
    public void testSaveHDCT() {
        System.out.println("saveHDCT");
        HoaDonCHiTietViewModel hoaDonChiTiet = null;
        String MaSP = "";
        String MaHD = "";
        HoaDonServiec instance = new HoaDonServiec();
        Integer expResult = null;
        Integer result = instance.saveHDCT(hoaDonChiTiet, MaSP, MaHD);
        assertEquals(expResult, result);
    }

    
    @Test
    public void testGetListHD() {
        System.out.println("getListHD");
        int TrangThai = 0;
        HoaDonServiec instance = new HoaDonServiec();
        List<HoaDonViewModel> expResult = null;
        List<HoaDonViewModel> result = instance.getListHD(TrangThai);
        assertEquals(expResult, result);
    }

    
    @Test
    public void testGetIdHD() {
        System.out.println("getIdHD");
        String MaHD = "";
        HoaDonServiec instance = new HoaDonServiec();
        Integer expResult = null;
        Integer result = instance.getIdHD(MaHD);
        assertEquals(expResult, result);  
    }

   
    @Test
    public void testGetListHoaDonChiTiet() {
        System.out.println("getListHoaDonChiTiet");
        String MaHD = "";
        HoaDonServiec instance = new HoaDonServiec();
        List<HoaDonCHiTietViewModel> expResult = null;
        List<HoaDonCHiTietViewModel> result = instance.getListHoaDonChiTiet(MaHD);
        assertEquals(expResult, result);
    }

    
    @Test
    public void testDeleteSanPham() {
        System.out.println("deleteSanPham");
        int idHD = 0;
        int idSP = 0;
        HoaDonServiec instance = new HoaDonServiec();
        Integer expResult = null;
        Integer result = instance.deleteSanPham(idHD, idSP);
        assertEquals(expResult, result);
    }

   
    @Test
    public void testUpdateSanPhamTrenGioHang() {
        System.out.println("updateSanPhamTrenGioHang");
        int idHD = 0;
        int idSP = 0;
        int SoLuong = 0;
        HoaDonServiec instance = new HoaDonServiec();
        Integer expResult = null;
        Integer result = instance.updateSanPhamTrenGioHang(idHD, idSP, SoLuong);
        assertEquals(expResult, result);
    }

    @Test
    public void testClearSanPhamTrenGioHang() {
        System.out.println("clearSanPhamTrenGioHang");
        int idHD = 0;
        HoaDonServiec instance = new HoaDonServiec();
        Integer expResult = null;
        Integer result = instance.clearSanPhamTrenGioHang(idHD);
        assertEquals(expResult, result);
    }

    
    @Test
    public void testGetIDCTSP() {
        System.out.println("getIDCTSP");
        int MaHD = 0;
        HoaDonServiec instance = new HoaDonServiec();
        Integer expResult = null;
        Integer result = instance.getIDCTSP(MaHD);
        assertEquals(expResult, result);
    }

    
    @Test
    public void testUpdateSoLuongGioHang() {
        System.out.println("updateSoLuongGioHang");
        int SoLuong = 0;
        String MaSP = "";
        String MaHD = "";
        HoaDonServiec instance = new HoaDonServiec();
        Integer expResult = null;
        Integer result = instance.updateSoLuongGioHang(SoLuong, MaSP, MaHD);
        assertEquals(expResult, result);
    }

    @Test
    public void testUpdateTrangThaiHoaDon() {
        System.out.println("updateTrangThaiHoaDon");
        HoaDonViewModel hd = null;
        HoaDonServiec instance = new HoaDonServiec();
        Integer expResult = null;
        Integer result = instance.updateTrangThaiHoaDon(hd);
        assertEquals(expResult, result);
    }

    
    @Test
    public void testUpdateHoaDonKhachHang() {
        System.out.println("updateHoaDonKhachHang");
        int Ma = 0;
        String MaHD = "";
        HoaDonServiec instance = new HoaDonServiec();
        Integer expResult = null;
        Integer result = instance.updateHoaDonKhachHang(Ma, MaHD);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetKhachHang() {
        System.out.println("getKhachHang");
        String MaHD = "";
        HoaDonServiec instance = new HoaDonServiec();
        List<HoaDon> expResult = null;
        List<HoaDon> result = instance.getKhachHang(MaHD);
        assertEquals(expResult, result);
    }
    
}
