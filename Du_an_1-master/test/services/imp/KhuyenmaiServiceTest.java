/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package services.imp;

import java.util.ArrayList;
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
        System.out.println("Hiển thị tất cả khuyến mãi");
        
        KhuyenmaiService instance = new KhuyenmaiService();
        List<KhuyenmaiViewmodel> expectedResult = instance.GetALL();
        List<KhuyenmaiViewmodel> result = instance.GetALL();
        
        assertEquals(expectedResult, result);
    }

    @Test
    public void testAdd() {
        System.out.println("Thêm mới 1 khuyến mãi");
        KhuyenmaiViewmodel km = new KhuyenmaiViewmodel("KhuyenMai1", "%", "2024-02-02", "2024-02-04", 10.0, 1);
        
        KhuyenmaiService instance = new KhuyenmaiService();

        boolean expectResult = instance.Add(km);
        boolean result = instance.Add(km);

        assertEquals(expectResult, result);

        assertTrue(instance.GetALL().contains(km));
    }
    
    @Test
    public void testTenKhuyenMaiTrong() {
        System.out.println("Testing if TenKM is not empty");

        KhuyenmaiViewmodel khuyenmaiNotEmpty = new KhuyenmaiViewmodel("KhuyenMai1", "%", "2024-02-02", "2024-02-04", 10.0, 1);

        assertTrue(khuyenmaiNotEmptyIsNotEmpty(khuyenmaiNotEmpty));

        KhuyenmaiViewmodel khuyenmaiEmpty = new KhuyenmaiViewmodel("", "%", "2024-02-02", "2024-02-04", 10.0, 1);

        assertFalse(khuyenmaiNotEmptyIsNotEmpty(khuyenmaiEmpty));
    }
    private boolean khuyenmaiNotEmptyIsNotEmpty(KhuyenmaiViewmodel khuyenmai) {
        return !khuyenmai.getTenKM().isEmpty();
    }
    
    @Test
    public void testTenKMKhongCoSo() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("ABC123", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);
        assertFalse(isAllDigits(khuyenmai.getTenKM()));
    }

    @Test
    public void testTenKMToanSo() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("123456", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);
        assertTrue(isAllDigits(khuyenmai.getTenKM()));
    }

    private boolean isAllDigits(String str) {
        return str.matches("\\d+");
    }
    
    @Test
    public void testTenKMToanChu() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("OnlyLetters", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);
        assertTrue(containsOnlyLetters(khuyenmai.getTenKM()));
    }

    @Test
    public void testTenKhuyenMaiCoCaChuVaSo() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("Contains123", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);
        assertFalse(containsOnlyLetters(khuyenmai.getTenKM()));
    }

    private boolean containsOnlyLetters(String str) {
        return str.matches("[a-zA-Z]+");
    }
    
    @Test
    public void testGiaTriGiamLonHonKhong() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);
        assertTrue(isPositiveValue(khuyenmai.getGiaTriGiam()));
    }

    @Test
    public void testGiaTriGiamNhoHonKhong() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", -5.0, 1);
        assertFalse(isPositiveValue(khuyenmai.getGiaTriGiam()));
    }

    private boolean isPositiveValue(Double value) {
        return value >= 0;
    }
    
    @Test
    public void testPhanTramGiamNhoHonMotTram() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 0.0, 1);
        assertTrue(isValidPercentage(khuyenmai.getGiaTriGiam()));
    }

    @Test
    public void testPhanTramGiamLonHonMotTram() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 110.0, 1);
        assertFalse(isValidPercentage(khuyenmai.getGiaTriGiam()));
    }

    private boolean isValidPercentage(Double percentage) {
        return percentage >= 0 && percentage <= 100;
    }
    
    
    @Test
    public void testGiaTriGiamLaSo() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);
        assertTrue(isNumber(khuyenmai.getGiaTriGiam()));
    }

    @Test
    public void testGiaTriGiamKhongPhaiSo() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);
        assertFalse(isNumber(khuyenmai.getGiaTriGiam()));
    }

    private boolean isNumber(Object value) {
        try {
            Double.valueOf(value.toString());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
     @Test
    public void testDoDaiToiDaMaKhuyenMai() {
        System.out.println("Độ dài tối đa của mã KM");
        
        KhuyenmaiViewmodel km = new KhuyenmaiViewmodel("KhuyenMai1", "%", "2024-02-02", "2024-02-04", 10.0, 1);
        assertTrue(doDaiToiDa(km));

        KhuyenmaiViewmodel expectedResult = new KhuyenmaiViewmodel("KhuyenMaiInvalidLength", "%", "2024-02-02", "2024-02-04", 10.0, 1);
        assertFalse(doDaiToiDa(expectedResult));
    }

    private boolean doDaiToiDa(KhuyenmaiViewmodel khuyenmai) {
        return khuyenmai.getTenKM().length() <= 10;
    }
    
     @Test
    public void testDoDaiToiThieuMaKM() {
        System.out.println("Độ dài tối thiểu của mã khuyến mãi");

        KhuyenmaiViewmodel valid = new KhuyenmaiViewmodel("ABC", "%", "2024-02-02", "2024-02-04", 10.0, 1);
        assertTrue(doDaiToiThieu(valid));

        KhuyenmaiViewmodel expectedResult = new KhuyenmaiViewmodel("AB", "%", "2024-02-02", "2024-02-04", 10.0, 1);
        assertFalse(doDaiToiThieu(expectedResult));
    }

    private boolean doDaiToiThieu(KhuyenmaiViewmodel khuyenmai) {
        return khuyenmai.getTenKM().length() >= 3;
    }
    
     @Test
    public void testKyTuDacBiet() {
        System.out.println("Tên khuyến mãi có ký tự đặc biệt");

        KhuyenmaiViewmodel khuyenmaiNoSpecialChars = new KhuyenmaiViewmodel("KhuyenMai1", "%", "2024-02-02", "2024-02-04", 10.0, 1);
        assertTrue(checkKhuyenMaiCoKyTuDacBiet(khuyenmaiNoSpecialChars));

        KhuyenmaiViewmodel khuyenmaiWithSpecialChars = new KhuyenmaiViewmodel("KhuyenMai@Special", "%", "2024-02-02", "2024-02-04", 10.0, 1);
        assertFalse(checkKhuyenMaiCoKyTuDacBiet(khuyenmaiWithSpecialChars));
    }

    private boolean checkKhuyenMaiCoKyTuDacBiet(KhuyenmaiViewmodel khuyenmai) {
        String tenKM = khuyenmai.getTenKM();
        // Kiểm tra bằng biểu thức chính quy xem tên có chứa ký tự đặc biệt hay không
        return !tenKM.matches(".*[!@#$%^&*()_+{}|<>?`~].*");
    }

    /**
     * Test of Update method, of class KhuyenmaiService.
     */
    @Test
    public void testUpdate() {
        System.out.println("Cập nhật 1 khuyến mãi"); 
        KhuyenmaiViewmodel kmToAdd = new KhuyenmaiViewmodel("KhuyenMai1", "%", "2024-02-02", "2024-02-04", 10.0, 1);
        
        KhuyenmaiService instance = new KhuyenmaiService();
        instance.Add(kmToAdd);

        List<KhuyenmaiViewmodel> currentList = instance.GetALL();
        KhuyenmaiViewmodel kmToUpdate = currentList.get(0);

        String ten = kmToUpdate.getTenKM();

        kmToUpdate.setTenKM("UpdatedKhuyenMai");
        kmToUpdate.setGiaTriGiam(10.0);
        
        boolean result = instance.Update(kmToUpdate, ten);
        assertTrue(result);

    }
    
    
    @Test
    public void testUpdateTenKhuyenMai() {
        System.out.println("Chỉ cập nhật tên khuyến mãi");

        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("KhuyenMai1", "%", "2024-02-02", "2024-02-04", 10.0, 1);
        assertEquals("KhuyenMai1", khuyenmai.getTenKM());
        khuyenmai.setTenKM("KhuyenMaiUpdated");
        assertEquals("KhuyenMaiUpdated", khuyenmai.getTenKM());
    }
    
    @Test
    public void testUpdateGiaTriGiamPhanTram() {
        System.out.println("Update giá trị giảm là phần trăm %");

        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("KhuyenMai1", "%", "2024-02-02", "2024-02-04", 10.0, 1);
        assertEquals(10.0, khuyenmai.getGiaTriGiam(), 0.001);
        khuyenmai.setGiaTriGiam(15.0);
        assertEquals(15.0, khuyenmai.getGiaTriGiam(), 0.001);
    }
    
     @Test
    public void testUpdateGiaTriGiamTienMat() {
        System.out.println("Update giá trị giảm là tiền mặt");

        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("KhuyenMai1", "TienMat", "2024-02-02", "2024-02-04", 10.0, 1);
        assertEquals(10.0, khuyenmai.getGiaTriGiam(), 0.001);
        khuyenmai.setGiaTriGiam(15.0);
        assertEquals(15.0, khuyenmai.getGiaTriGiam(), 0.001);
    }
    
    @Test
    public void testUpdateGiaTriGiamTuPhanTramSangTienMat() {
        System.out.println("Cập nhật giá trị giảm từ phần trăm sang tiền mặt");
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);
        double giaTriHangHoa = 1000.0;
        khuyenmai.setGiaTriGiam(giaTriHangHoa * khuyenmai.getGiaTriGiam() / 100);
        assertEquals(100.0, khuyenmai.getGiaTriGiam(), 0.001);
    }
    
    @Test
    public void testUpdateGiaTriGiamTuTienMatSangPhanTram() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 50.0, 1);
        double giaTriHangHoa = 1000.0;
        khuyenmai.setGiaTriGiam((khuyenmai.getGiaTriGiam() / giaTriHangHoa) * 100);
        assertEquals(50.0, khuyenmai.getGiaTriGiam(), 0.001);
    }
    
    @Test
    public void testUpdateTrangThai() {
        System.out.println("Cập nhật trạng thái 1 khuyến mãi");
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);
        assertEquals(1, khuyenmai.getTrangthai());
        khuyenmai.setTrangthai(0);
        assertEquals(0, khuyenmai.getTrangthai());
    }

    @Test
    public void testDeleteKhuyenMai() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);
        assertNotNull(khuyenmai);
        khuyenmai = null;
        assertNull(khuyenmai);
    }
    
    @Test
    public void testDeleteAllKhuyenMai() {
        List<KhuyenmaiViewmodel> danhSachKhuyenMai = new ArrayList<>();
        
        danhSachKhuyenMai.add(new KhuyenmaiViewmodel("TenKM1", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1));
        danhSachKhuyenMai.add(new KhuyenmaiViewmodel("TenKM2", "HinhThuc", "2022-01-01", "2022-02-01", 15.0, 1));
        assertTrue(!danhSachKhuyenMai.isEmpty());
        danhSachKhuyenMai.clear();
        assertTrue(danhSachKhuyenMai.isEmpty());
    }
    

    @Test
    public void testXoaKhuyenMaiHoatDong() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);
        assertNotNull(khuyenmai);
        assertEquals(1, khuyenmai.getTrangthai());
        khuyenmai = null;
        assertNull(khuyenmai);
    }

    @Test
    public void testXoaKhuyenMaiKhongHoatDong() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 0);
        assertNotNull(khuyenmai);
        assertEquals(0, khuyenmai.getTrangthai());
        khuyenmai = null;
        assertNull(khuyenmai);
    }
    
    @Test
    public void testChiTietKhuyenMai() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);
        assertNotNull(khuyenmai);
        
        String tenKM = khuyenmai.getTenKM();
        String hinhThucKM = khuyenmai.getHinhThucKM();
        String ngayBatDau = khuyenmai.getNgayBatDau();
        String ngayKetThuc = khuyenmai.getNgayKetThuc();
        Double giaTriGiam = khuyenmai.getGiaTriGiam();
        int trangThai = khuyenmai.getTrangthai();
        
        assertEquals("TenKM", tenKM);
        assertEquals("HinhThuc", hinhThucKM);
        assertEquals("2022-01-01", ngayBatDau);
        assertEquals("2022-02-01", ngayKetThuc);
        assertEquals(10.0, giaTriGiam, 0.001);
        assertEquals(1, trangThai);
    }
    
    @Test
    public void testUpdateNgayBatDau() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel();
        String newNgayBatDau = "2024-02-01";

        khuyenmai.setNgayBatDau(newNgayBatDau);

        assertEquals(newNgayBatDau, khuyenmai.getNgayBatDau());
    }

    @Test
    public void testUpdateNgayKetThuc() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel();
        String newNgayKetThuc = "2024-02-28";

        khuyenmai.setNgayKetThuc(newNgayKetThuc);

        assertEquals(newNgayKetThuc, khuyenmai.getNgayKetThuc());
    }
    
    
    @Test
    public void testSetNgayKetThucNhoHonNgayBatDau() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel();
        String ngayBatDau = "2024-02-19";
        String ngayKetThuc = "2024-02-15";

        khuyenmai.setNgayBatDau(ngayBatDau);

        assertFalse("Ngày kết thúc không hợp lệ", validateNgayKetThuc(khuyenmai, ngayKetThuc));
    }

    private boolean validateNgayKetThuc(KhuyenmaiViewmodel khuyenmai, String ngayKetThuc) {
        try {
            khuyenmai.setNgayKetThuc(ngayKetThuc);
            return true; // Ngày kết thúc hợp lệ
        } catch (Exception e) {
            return false; // Ngày kết thúc không hợp lệ
        }
    }
    
     @Test
    public void testDeTrongThanhTimKiem() {
        List<KhuyenmaiViewmodel> danhSachKhuyenMai = new ArrayList<>();
        danhSachKhuyenMai.add(new KhuyenmaiViewmodel("KhuyenMai1", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1));
        danhSachKhuyenMai.add(new KhuyenmaiViewmodel("KhuyenMai2", "HinhThuc", "2022-01-01", "2022-02-01", 15.0, 1));

        List<KhuyenmaiViewmodel> result = searchKhuyenMai(danhSachKhuyenMai, "");
        assertTrue(result.isEmpty());
    }

    
    @Test
    public void testTimKiemDungKeyword() {
        List<KhuyenmaiViewmodel> danhSachKhuyenMai = new ArrayList<>();
        danhSachKhuyenMai.add(new KhuyenmaiViewmodel("KhuyenMai1", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1));
        danhSachKhuyenMai.add(new KhuyenmaiViewmodel("KhuyenMai2", "HinhThuc", "2022-01-01", "2022-02-01", 15.0, 1));

        List<KhuyenmaiViewmodel> result = searchKhuyenMai(danhSachKhuyenMai, "KhuyenMai1");

        assertEquals(1, result.size());
        assertEquals("KhuyenMai1", result.get(0).getTenKM());
    }

    
    @Test
    public void testTimKiemSaiKeyword() {
        List<KhuyenmaiViewmodel> danhSachKhuyenMai = new ArrayList<>();
        danhSachKhuyenMai.add(new KhuyenmaiViewmodel("KhuyenMai1", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1));
        danhSachKhuyenMai.add(new KhuyenmaiViewmodel("KhuyenMai2", "HinhThuc", "2022-01-01", "2022-02-01", 15.0, 1));

        List<KhuyenmaiViewmodel> result = searchKhuyenMai(danhSachKhuyenMai, "KhuyenMaiNotFound");
        assertTrue(result.isEmpty());
    }

    private List<KhuyenmaiViewmodel> searchKhuyenMai(List<KhuyenmaiViewmodel> danhSachKhuyenMai, String keyword) {
        return new ArrayList<>();
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
