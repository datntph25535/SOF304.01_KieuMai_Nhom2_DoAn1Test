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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
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
        System.out.println("Testing GetALL method in KhuyenmaiService");
        
        // Khởi tạo đối tượng KhuyenmaiService
        KhuyenmaiService instance = new KhuyenmaiService();
        
        // Gọi phương thức GetALL để lấy kết quả
        List<KhuyenmaiViewmodel> expectedResult = instance.GetALL();
        List<KhuyenmaiViewmodel> result = instance.GetALL();
        
        // So sánh kết quả trả về với kết quả mong đợi
        assertEquals(expectedResult, result);
    }

    /**
     * Test of Add method, of class KhuyenmaiService.
     */
    @Test
    public void testAdd() {
        System.out.println("Testing Add method in KhuyenmaiService");
        
        // Tạo một đối tượng KhuyenmaiViewmodel để thêm vào danh sách
        KhuyenmaiViewmodel km = new KhuyenmaiViewmodel("KhuyenMai1", "%", "2024-02-02", "2024-02-04", 10.0, 1);
        
        // Khởi tạo đối tượng KhuyenmaiService
        KhuyenmaiService instance = new KhuyenmaiService();

        // Gọi phương thức Add để thêm đối tượng vào danh sách
        boolean result = instance.Add(km);

        // Kiểm tra kết quả
        assertEquals(true, result);

    }
    
    @Test
    public void testTenKhuyenMaiTrong() {
        System.out.println("Testing if TenKM is not empty");

        // Tạo một đối tượng KhuyenmaiViewmodel với TenKM không trống
        KhuyenmaiViewmodel khuyenmaiNotEmpty = new KhuyenmaiViewmodel("KhuyenMai1", "%", "2024-02-02", "2024-02-04", 10.0, 1);

        // Kiểm tra xem phương thức trả về true hay false khi TenKM không trống
        assertTrue(khuyenmaiNotEmptyIsNotEmpty(khuyenmaiNotEmpty));

        // Tạo một đối tượng KhuyenmaiViewmodel với TenKM trống
        KhuyenmaiViewmodel khuyenmaiEmpty = new KhuyenmaiViewmodel("", "%", "2024-02-02", "2024-02-04", 10.0, 1);

        // Kiểm tra xem phương thức trả về true hay false khi TenKM trống
        assertFalse(khuyenmaiNotEmptyIsNotEmpty(khuyenmaiEmpty));
    }
    private boolean khuyenmaiNotEmptyIsNotEmpty(KhuyenmaiViewmodel khuyenmai) {
        return !khuyenmai.getTenKM().isEmpty();
    }
    
    @Test
    public void testTenKMKhongCoSo() {
        // Tạo một đối tượng KhuyenmaiViewmodel với tên khuyến mãi có chứa ít nhất một ký tự không phải số
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("ABC123", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);

        // Kiểm tra rằng tên khuyến mãi không phải là toàn số
        assertFalse(isAllDigits(khuyenmai.getTenKM()));
    }

    @Test
    public void testTenKMToanSo() {
        // Tạo một đối tượng KhuyenmaiViewmodel với tên khuyến mãi chỉ chứa số
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("123456", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);

        // Kiểm tra rằng tên khuyến mãi là toàn số
        assertTrue(isAllDigits(khuyenmai.getTenKM()));
    }

    private boolean isAllDigits(String str) {
        // Hàm kiểm tra xem một chuỗi có chứa toàn số không
        return str.matches("\\d+");
    }
    
    @Test
    public void testTenKMToanChu() {
        // Tạo một đối tượng KhuyenmaiViewmodel với tên khuyến mãi chỉ chứa chữ cái
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("OnlyLetters", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);

        // Kiểm tra rằng tên khuyến mãi chỉ chứa chữ cái
        assertTrue(containsOnlyLetters(khuyenmai.getTenKM()));
    }

    @Test
    public void testTenKhuyenMaiCoCaChuVaSo() {
        // Tạo một đối tượng KhuyenmaiViewmodel với tên khuyến mãi chứa ít nhất một số
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("Contains123", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);

        // Kiểm tra rằng tên khuyến mãi không chỉ chứa chữ cái
        assertFalse(containsOnlyLetters(khuyenmai.getTenKM()));
    }

    private boolean containsOnlyLetters(String str) {
        // Hàm kiểm tra xem một chuỗi có chứa toàn chữ cái không
        return str.matches("[a-zA-Z]+");
    }
    
    @Test
    public void testGiaTriGiamLonHonKhong() {
        // Tạo một đối tượng KhuyenmaiViewmodel với giá trị giảm là số dương
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);

        // Kiểm tra rằng giá trị giảm là số dương
        assertTrue(isPositiveValue(khuyenmai.getGiaTriGiam()));
    }

    @Test
    public void testGiaTriGiamNhoHonKhong() {
        // Tạo một đối tượng KhuyenmaiViewmodel với giá trị giảm là số âm
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", -5.0, 1);

        // Kiểm tra rằng giá trị giảm không là số âm
        assertFalse(isPositiveValue(khuyenmai.getGiaTriGiam()));
    }

    private boolean isPositiveValue(Double value) {
        // Hàm kiểm tra xem giá trị là số dương
        return value >= 0;
    }
    
    @Test
    public void testPhanTramGiamNhoHonMotTram() {
        // Tạo một đối tượng KhuyenmaiViewmodel với phần trăm giảm là 90%
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 0.0, 1);

        // Kiểm tra rằng phần trăm giảm là hợp lệ (không quá 100%)
        assertTrue(isValidPercentage(khuyenmai.getGiaTriGiam()));
    }

    @Test
    public void testPhanTramGiamLonHonMotTram() {
        // Tạo một đối tượng KhuyenmaiViewmodel với phần trăm giảm là 110%
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 110.0, 1);

        // Kiểm tra rằng phần trăm giảm không hợp lệ (quá 100%)
        assertFalse(isValidPercentage(khuyenmai.getGiaTriGiam()));
    }

    private boolean isValidPercentage(Double percentage) {
        // Hàm kiểm tra xem phần trăm giảm là hợp lệ (không quá 100%)
        return percentage >= 0 && percentage <= 100;
    }
    
    
    @Test
    public void testGiaTriGiamLaSo() {
        // Tạo một đối tượng KhuyenmaiViewmodel với giá trị giảm chỉ chứa số
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);

        // Kiểm tra rằng giá trị giảm là số
        assertTrue(isNumber(khuyenmai.getGiaTriGiam()));
    }

    @Test
    public void testGiaTriGiamKhongPhaiSo() {
        // Tạo một đối tượng KhuyenmaiViewmodel với giá trị giảm chứa chữ cái
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);

        // Kiểm tra rằng giá trị giảm không phải là số
        assertFalse(isNumber(khuyenmai.getGiaTriGiam()));
    }

    private boolean isNumber(Object value) {
        // Hàm kiểm tra xem giá trị là số
        try {
            Double.parseDouble(value.toString());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
     @Test
    public void testDoDaiToiDaMaKhuyenMai() {
        System.out.println("Testing if MaKM has a length less than or equal to 10 characters");

        // Tạo một đối tượng KhuyenmaiViewmodel với MaKM có độ dài hợp lệ
        KhuyenmaiViewmodel khuyenmaiValidLength = new KhuyenmaiViewmodel("KhuyenMai1", "%", "2024-02-02", "2024-02-04", 10.0, 1);

        // Kiểm tra xem phương thức trả về true hay false khi MaKM có độ dài hợp lệ
        assertTrue(isMaKhuyenMaiLengthValid(khuyenmaiValidLength));

        // Tạo một đối tượng KhuyenmaiViewmodel với MaKM có độ dài quá 10 ký tự
        KhuyenmaiViewmodel khuyenmaiInvalidLength = new KhuyenmaiViewmodel("KhuyenMaiInvalidLength", "%", "2024-02-02", "2024-02-04", 10.0, 1);

        // Kiểm tra xem phương thức trả về true hay false khi MaKM có độ dài quá 10 ký tự
        assertFalse(isMaKhuyenMaiLengthValid(khuyenmaiInvalidLength));
    }

    // Phương thức kiểm tra độ dài MaKM không quá 10 ký tự
    private boolean isMaKhuyenMaiLengthValid(KhuyenmaiViewmodel khuyenmai) {
        return khuyenmai.getTenKM().length() <= 10;
    }
    
    
    
     @Test
    public void testDoDaiToiThieuMaKM() {
        System.out.println("Testing if MaKM has a length greater than or equal to 3 characters");

        // Tạo một đối tượng KhuyenmaiViewmodel với MaKM có độ dài hợp lệ
        KhuyenmaiViewmodel khuyenmaiValidLength = new KhuyenmaiViewmodel("ABC", "%", "2024-02-02", "2024-02-04", 10.0, 1);

        // Kiểm tra xem phương thức trả về true hay false khi MaKM có độ dài hợp lệ
        assertTrue(isMaKhuyenMaiMinLengthValid(khuyenmaiValidLength));

        // Tạo một đối tượng KhuyenmaiViewmodel với MaKM có độ dài dưới 3 ký tự
        KhuyenmaiViewmodel khuyenmaiInvalidLength = new KhuyenmaiViewmodel("AB", "%", "2024-02-02", "2024-02-04", 10.0, 1);

        // Kiểm tra xem phương thức trả về true hay false khi MaKM có độ dài dưới 3 ký tự
        assertFalse(isMaKhuyenMaiMinLengthValid(khuyenmaiInvalidLength));
    }

    // Phương thức kiểm tra độ dài MaKM không dưới 3 ký tự
    private boolean isMaKhuyenMaiMinLengthValid(KhuyenmaiViewmodel khuyenmai) {
        return khuyenmai.getTenKM().length() >= 3;
    }
    
     @Test
    public void testKyTuDacBiet() {
        System.out.println("Testing if TenKM has no special characters");

        // Tạo một đối tượng KhuyenmaiViewmodel với TenKM không chứa ký tự đặc biệt
        KhuyenmaiViewmodel khuyenmaiNoSpecialChars = new KhuyenmaiViewmodel("KhuyenMai1", "%", "2024-02-02", "2024-02-04", 10.0, 1);

        // Kiểm tra xem phương thức trả về true hay false khi TenKM không chứa ký tự đặc biệt
        assertTrue(khuyenmaiNoSpecialCharsHasNoSpecialChars(khuyenmaiNoSpecialChars));

        // Tạo một đối tượng KhuyenmaiViewmodel với TenKM chứa ký tự đặc biệt
        KhuyenmaiViewmodel khuyenmaiWithSpecialChars = new KhuyenmaiViewmodel("KhuyenMai@Special", "%", "2024-02-02", "2024-02-04", 10.0, 1);

        // Kiểm tra xem phương thức trả về true hay false khi TenKM chứa ký tự đặc biệt
        assertFalse(khuyenmaiNoSpecialCharsHasNoSpecialChars(khuyenmaiWithSpecialChars));
    }

    private boolean khuyenmaiNoSpecialCharsHasNoSpecialChars(KhuyenmaiViewmodel khuyenmai) {
        String tenKM = khuyenmai.getTenKM();
        // Kiểm tra bằng biểu thức chính quy xem tên có chứa ký tự đặc biệt hay không
        return !tenKM.matches(".*[!@#$%^&*()_+{}|<>?`~].*");
    }

    /**
     * Test of Update method, of class KhuyenmaiService.
     */
    @Test
    public void testUpdate() {
        System.out.println("Testing Update method in KhuyenmaiService");
        
        // Tạo một đối tượng KhuyenmaiViewmodel mới để thêm vào danh sách
        KhuyenmaiViewmodel kmToAdd = new KhuyenmaiViewmodel("KhuyenMai1", "%", "2024-02-02", "2024-02-04", 10.0, 1);
        
        // Khởi tạo đối tượng KhuyenmaiService
        KhuyenmaiService instance = new KhuyenmaiService();

        // Gọi phương thức Add để thêm đối tượng vào danh sách
        instance.Add(kmToAdd);

        // Lấy danh sách hiện tại
        List<KhuyenmaiViewmodel> currentList = instance.GetALL();

        // Chọn một đối tượng trong danh sách để cập nhật
        KhuyenmaiViewmodel kmToUpdate = currentList.get(0);

        // Lấy id của đối tượng để cập nhật
        String ten = kmToUpdate.getTenKM();

        // Cập nhật thông tin của đối tượng
        kmToUpdate.setTenKM("UpdatedKhuyenMai");
        kmToUpdate.setGiaTriGiam(10.0);
        
        // Gọi phương thức Update để cập nhật đối tượng
        boolean result = instance.Update(kmToUpdate, ten);

        // Kiểm tra kết quả
        assertTrue(result);

    }
    
    
    @Test
    public void testUpdateTenKhuyenMai() {
        System.out.println("Testing if TenKM is updated successfully");

        // Tạo một đối tượng KhuyenmaiViewmodel ban đầu với tên khuyến mãi là "KhuyenMai1"
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("KhuyenMai1", "%", "2024-02-02", "2024-02-04", 10.0, 1);

        // Kiểm tra xem tên khuyến mãi ban đầu có đúng là "KhuyenMai1" hay không
        assertEquals("KhuyenMai1", khuyenmai.getTenKM());

        // Cập nhật tên khuyến mãi thành "KhuyenMaiUpdated"
        khuyenmai.setTenKM("KhuyenMaiUpdated");

        // Kiểm tra xem tên khuyến mãi sau khi cập nhật có đúng là "KhuyenMaiUpdated" hay không
        assertEquals("KhuyenMaiUpdated", khuyenmai.getTenKM());
    }
    
    @Test
    public void testUpdateGiaTriGiamPhanTram() {
        System.out.println("Testing if GiaTriGiam is updated successfully");

        // Tạo một đối tượng KhuyenmaiViewmodel ban đầu với phần trăm giảm là 10.0
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("KhuyenMai1", "%", "2024-02-02", "2024-02-04", 10.0, 1);

        // Kiểm tra xem phần trăm giảm ban đầu có đúng là 10.0 hay không
        assertEquals(10.0, khuyenmai.getGiaTriGiam(), 0.001);

        // Cập nhật phần trăm giảm thành 15.0
        khuyenmai.setGiaTriGiam(15.0);

        // Kiểm tra xem phần trăm giảm sau khi cập nhật có đúng là 15.0 hay không
        assertEquals(15.0, khuyenmai.getGiaTriGiam(), 0.001);
    }
    
     @Test
    public void testUpdateGiaTriGiamTienMat() {
        System.out.println("Testing if GiaTriGiam is updated successfully");

        // Tạo một đối tượng KhuyenmaiViewmodel ban đầu với giá trị giảm là 10.0
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("KhuyenMai1", "TienMat", "2024-02-02", "2024-02-04", 10.0, 1);

        // Kiểm tra xem giá trị giảm ban đầu có đúng là 10.0 hay không
        assertEquals(10.0, khuyenmai.getGiaTriGiam(), 0.001);

        // Cập nhật giá trị giảm thành 15.0
        khuyenmai.setGiaTriGiam(15.0);

        // Kiểm tra xem giá trị giảm sau khi cập nhật có đúng là 15.0 hay không
        assertEquals(15.0, khuyenmai.getGiaTriGiam(), 0.001);
    }
    
    @Test
    public void testUpdateGiaTriGiamTuPhanTramSangTienMat() {
        // Tạo một đối tượng KhuyenmaiViewmodel với giá trị giảm là phần trăm 10%
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);

        // Cập nhật giá trị giảm từ phần trăm thành tiền mặt (giả sử giá trị hàng hóa là 1000)
        double giaTriHangHoa = 1000.0;
        khuyenmai.setGiaTriGiam(giaTriHangHoa * khuyenmai.getGiaTriGiam() / 100);

        // Kiểm tra xem giá trị giảm đã được cập nhật đúng chưa (giả sử phần trăm 10% của 1000 là 100)
        assertEquals(100.0, khuyenmai.getGiaTriGiam(), 0.001);
    }
    
    @Test
    public void testUpdateGiaTriGiamTuTienMatSangPhanTram() {
        // Tạo một đối tượng KhuyenmaiViewmodel với giá trị giảm là tiền mặt 50
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 50.0, 1);

        // Cập nhật giá trị giảm từ tiền mặt thành phần trăm (giả sử giá trị hàng hóa là 1000)
        double giaTriHangHoa = 1000.0;
        khuyenmai.setGiaTriGiam((khuyenmai.getGiaTriGiam() / giaTriHangHoa) * 100);

        // Kiểm tra xem giá trị giảm đã được cập nhật đúng chưa (giả sử giá trị tiền mặt là 50, phần trăm 50% của 1000 là 500)
        assertEquals(50.0, khuyenmai.getGiaTriGiam(), 0.001);
    }
    
    @Test
    public void testUpdateTrangThai() {
        // Tạo một đối tượng KhuyenmaiViewmodel với trạng thái là đang hoạt động (1)
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);

        // Kiểm tra trạng thái trước khi thay đổi
        assertEquals(1, khuyenmai.getTrangthai());

        // Thay đổi trạng thái từ đang hoạt động sang không hoạt động
        khuyenmai.setTrangthai(0);

        // Kiểm tra xem trạng thái đã được thay đổi chưa
        assertEquals(0, khuyenmai.getTrangthai());
    }

    @Test
    public void testDeleteKhuyenMai() {
        // Tạo một đối tượng KhuyenmaiViewmodel
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);

        // Kiểm tra rằng đối tượng khuyến mãi không phải là null trước khi xóa
        assertNotNull(khuyenmai);

        // Xóa khuyến mãi
        khuyenmai = null;

        // Kiểm tra rằng đối tượng khuyến mãi đã được xóa và trở thành null
        assertNull(khuyenmai);
    }
    
    @Test
    public void testDeleteAllKhuyenMai() {
        // Tạo danh sách các đối tượng KhuyenmaiViewmodel
        List<KhuyenmaiViewmodel> danhSachKhuyenMai = new ArrayList<>();
        danhSachKhuyenMai.add(new KhuyenmaiViewmodel("TenKM1", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1));
        danhSachKhuyenMai.add(new KhuyenmaiViewmodel("TenKM2", "HinhThuc", "2022-01-01", "2022-02-01", 15.0, 1));

        // Kiểm tra rằng danh sách không rỗng trước khi xóa
        assertTrue(!danhSachKhuyenMai.isEmpty());

        // Xóa toàn bộ khuyến mãi
        danhSachKhuyenMai.clear();

        // Kiểm tra rằng danh sách khuyến mãi đã trở thành rỗng sau khi xóa
        assertTrue(danhSachKhuyenMai.isEmpty());
    }
    

    @Test
    public void testXoaKhuyenMaiHoatDong() {
        // Tạo một đối tượng KhuyenmaiViewmodel với trạng thái hoạt động là 1
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);

        // Kiểm tra rằng đối tượng khuyến mãi không phải là null trước khi xóa
        assertNotNull(khuyenmai);

        // Kiểm tra rằng trạng thái là hoạt động trước khi xóa
        assertEquals(1, khuyenmai.getTrangthai());

        // Xóa khuyến mãi
        khuyenmai = null;

        // Kiểm tra rằng đối tượng khuyến mãi đã được xóa và trạng thái trở thành null
        assertNull(khuyenmai);
    }

    @Test
    public void testXoaKhuyenMaiKhongHoatDong() {
        // Tạo một đối tượng KhuyenmaiViewmodel với trạng thái không hoạt động là 0
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 0);

        // Kiểm tra rằng đối tượng khuyến mãi không phải là null trước khi xóa
        assertNotNull(khuyenmai);

        // Kiểm tra rằng trạng thái là không hoạt động trước khi xóa
        assertEquals(0, khuyenmai.getTrangthai());

        // Xóa khuyến mãi
        khuyenmai = null;

        // Kiểm tra rằng đối tượng khuyến mãi đã được xóa và trạng thái trở thành null
        assertNull(khuyenmai);
    }
    
    @Test
    public void testChiTietKhuyenMai() {
        // Tạo một đối tượng KhuyenmaiViewmodel
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel("TenKM", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1);

        // Kiểm tra rằng đối tượng khuyến mãi không phải là null
        assertNotNull(khuyenmai);

        // Lấy thông tin chi tiết của khuyến mãi
        String tenKM = khuyenmai.getTenKM();
        String hinhThucKM = khuyenmai.getHinhThucKM();
        String ngayBatDau = khuyenmai.getNgayBatDau();
        String ngayKetThuc = khuyenmai.getNgayKetThuc();
        Double giaTriGiam = khuyenmai.getGiaTriGiam();
        int trangThai = khuyenmai.getTrangthai();

        // Kiểm tra xem thông tin chi tiết có đúng không
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
        String newNgayBatDau = "2024-02-19"; // Thay đổi giá trị ngày mới tùy ý

        khuyenmai.setNgayBatDau(newNgayBatDau);

        assertEquals(newNgayBatDau, khuyenmai.getNgayBatDau());
    }

    @Test
    public void testUpdateNgayKetThuc() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel();
        String newNgayKetThuc = "2024-02-28"; // Thay đổi giá trị ngày mới tùy ý

        khuyenmai.setNgayKetThuc(newNgayKetThuc);

        assertEquals(newNgayKetThuc, khuyenmai.getNgayKetThuc());
    }
    
    
    @Test
    public void testSetNgayKetThucNhoHonNgayBatDau() {
        KhuyenmaiViewmodel khuyenmai = new KhuyenmaiViewmodel();
        String ngayBatDau = "2024-02-19";
        String ngayKetThucInvalid = "2024-02-15"; // Ngày kết thúc nhỏ hơn ngày bắt đầu

        khuyenmai.setNgayBatDau(ngayBatDau);

        assertFalse("Ngày kết thúc không hợp lệ", validateNgayKetThuc(khuyenmai, ngayKetThucInvalid));
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
        // Tạo danh sách mẫu khuyến mãi
        List<KhuyenmaiViewmodel> danhSachKhuyenMai = new ArrayList<>();
        danhSachKhuyenMai.add(new KhuyenmaiViewmodel("KhuyenMai1", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1));
        danhSachKhuyenMai.add(new KhuyenmaiViewmodel("KhuyenMai2", "HinhThuc", "2022-01-01", "2022-02-01", 15.0, 1));

        // Tìm kiếm khuyến mãi với từ khóa trống
        List<KhuyenmaiViewmodel> result = searchKhuyenMai(danhSachKhuyenMai, "");

        // Kiểm tra xem danh sách kết quả có rỗng hay không
        assertTrue(result.isEmpty());
    }

    
    @Test
    public void testTimKiemDungKeyword() {
        // Tạo danh sách mẫu khuyến mãi
        List<KhuyenmaiViewmodel> danhSachKhuyenMai = new ArrayList<>();
        danhSachKhuyenMai.add(new KhuyenmaiViewmodel("KhuyenMai1", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1));
        danhSachKhuyenMai.add(new KhuyenmaiViewmodel("KhuyenMai2", "HinhThuc", "2022-01-01", "2022-02-01", 15.0, 1));

        // Tìm kiếm khuyến mãi với từ khóa đúng
        List<KhuyenmaiViewmodel> result = searchKhuyenMai(danhSachKhuyenMai, "KhuyenMai1");

        // Kiểm tra xem danh sách kết quả có đúng không
        assertEquals(1, result.size());
        assertEquals("KhuyenMai1", result.get(0).getTenKM());
    }

    
    @Test
    public void testTimKiemSaiKeyword() {
        // Tạo danh sách mẫu khuyến mãi
        List<KhuyenmaiViewmodel> danhSachKhuyenMai = new ArrayList<>();
        danhSachKhuyenMai.add(new KhuyenmaiViewmodel("KhuyenMai1", "HinhThuc", "2022-01-01", "2022-02-01", 10.0, 1));
        danhSachKhuyenMai.add(new KhuyenmaiViewmodel("KhuyenMai2", "HinhThuc", "2022-01-01", "2022-02-01", 15.0, 1));

        // Tìm kiếm khuyến mãi với từ khóa sai
        List<KhuyenmaiViewmodel> result = searchKhuyenMai(danhSachKhuyenMai, "KhuyenMaiNotFound");

        // Kiểm tra xem danh sách kết quả có rỗng hay không
        assertTrue(result.isEmpty());
    }

    private List<KhuyenmaiViewmodel> searchKhuyenMai(List<KhuyenmaiViewmodel> danhSachKhuyenMai, String keyword) {
        // Thực hiện tìm kiếm khuyến mãi dựa trên keyword
        // Trong trường hợp này, không tìm thấy khuyến mãi nào với keyword sai
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
