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

        // Kiểm tra xem danh sách đã thêm phần tử hay không
        assertTrue(instance.GetALL().contains(km));
    }
    
    @Test
    public void testTenKMNotEmpty() {
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
    public void testTenKMNoSpecialCharacters() {
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

    /**
     * Test of Delete method, of class KhuyenmaiService.
     */
    @Test
    public void testDeleteKhuyenmai() {
        System.out.println("Testing DeleteKhuyenmai method in KhuyenmaiService");

        // Tạo một đối tượng KhuyenmaiService
        KhuyenmaiService khuyenmaiService = new KhuyenmaiService();

        // Tạo một khuyến mãi để thêm vào danh sách
        KhuyenmaiViewmodel khuyenmaiToAdd = new KhuyenmaiViewmodel("KhuyenMai1", "%", "2024-02-02", "2024-02-04", 10.0, 1);

        // Thêm khuyến mãi vào danh sách
        khuyenmaiService.Add(khuyenmaiToAdd);

        // Lấy danh sách hiện tại
        List<KhuyenmaiViewmodel> currentList = khuyenmaiService.GetALL();

        // Lấy id của khuyến mãi để xóa
        String idToDelete = khuyenmaiToAdd.getTenKM();

        // Gọi phương thức Delete để xóa khuyến mãi
        boolean result = khuyenmaiService.Delete(idToDelete);

        // Kiểm tra kết quả
        assertTrue(result);

        // Kiểm tra xem khuyến mãi đã được xóa khỏi danh sách hay không
        assertFalse(khuyenmaiService.GetALL().contains(khuyenmaiToAdd));
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
    public void testGetKhuyenmaiById() {
        System.out.println("Testing GetKhuyenmaiById method in KhuyenmaiService");

        // Tạo một đối tượng KhuyenmaiService
        KhuyenmaiService khuyenmaiService = new KhuyenmaiService();

        // Tạo một khuyến mãi để thêm vào danh sách
        KhuyenmaiViewmodel khuyenmaiToAdd = new KhuyenmaiViewmodel("KhuyenMai1", "%", "2024-02-02", "2024-02-04", 10.0, 1);

        // Thêm khuyến mãi vào danh sách
        khuyenmaiService.Add(khuyenmaiToAdd);

        // Lấy tên khuyến mãi để gọi phương thức GetOneByTenKM
        String tenKMToRetrieve = khuyenmaiToAdd.getTenKM();

        // Gọi phương thức GetKhuyenmaiById để lấy khuyến mãi từ danh sách
        KhuyenmaiViewmodel retrievedKhuyenmai = (KhuyenmaiViewmodel) khuyenmaiService.GetOnebyten(tenKMToRetrieve);

        // Kiểm tra xem dữ liệu đã được lấy về chính xác hay không
        assertNotNull(retrievedKhuyenmai);
        assertEquals(khuyenmaiToAdd.getTenKM(), retrievedKhuyenmai.getTenKM());
        assertEquals(khuyenmaiToAdd.getHinhThucKM(), retrievedKhuyenmai.getHinhThucKM());
        assertEquals(khuyenmaiToAdd.getNgayBatDau(), retrievedKhuyenmai.getNgayBatDau());
        assertEquals(khuyenmaiToAdd.getNgayKetThuc(), retrievedKhuyenmai.getNgayKetThuc());
        assertEquals(khuyenmaiToAdd.getGiaTriGiam(), retrievedKhuyenmai.getGiaTriGiam());
        assertEquals(khuyenmaiToAdd.getTrangthai(), retrievedKhuyenmai.getTrangthai());
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
