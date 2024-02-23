/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package services.imp;

import java.util.ArrayList;
import java.util.List;
import models.ThuongHieu;
import org.junit.Test;
import static org.junit.Assert.*;
import viewmodels.Objecttt;

/**
 *
 * @author admin
 */
public class ThuongHieuServicesTest {
    
    ThuongHieuServices services = new ThuongHieuServices();

    @Test
    public void testGetAll() {
        // Tạo danh sách các đối tượng ChatLieu giả định
        List<ThuongHieu> expectedList = new ArrayList<>();
        expectedList.add(new ThuongHieu("TH1"));
        expectedList.add(new ThuongHieu("TH2"));

        // Lấy danh sách thực tế từ phương thức getAll()
        List<ThuongHieu> actualList = services.getAll();

        // Kiểm tra độ dài của hai danh sách
        assertEquals(expectedList.size(), actualList.size());

        // So sánh từng phần tử của hai danh sách
        for (int i = 0; i < expectedList.size(); i++) {
            ThuongHieu expected = expectedList.get(i);
            ThuongHieu actual = actualList.get(i);
            assertEquals(expected.getTen(), actual.getTen());
        }
    }

    @Test
    public void testAddKhiNhapDuDuLieu() {
        Objecttt x = new Objecttt("TH3");
        String expResult = services.Add(x);
        String result = "Thành công";
        assertEquals(expResult, result);
    }

    @Test
    public void testAddKhiNhapThieuTen() {
        Objecttt x = new Objecttt(null);
        String expResult = services.Add(x);
        String result = "Thất bại";
        assertEquals(expResult, result);
    }

    @Test
    public void testUpdateKhiNhapDuDuLieu() {
        Objecttt x = new Objecttt(3, "TH3");
        String expResult = services.Update(x, x.getId());
        String result = "Thành công";
        assertEquals(expResult, result);
    }

    @Test
    public void testUpdateKhiNhapThieuTen() {
        Objecttt x = new Objecttt(3, null);
        String expResult = services.Update(x, x.getId());
        String result = "Thất bại";
        assertEquals(expResult, result);
    }

    @Test
    public void testDeleteKhiCoTonTaiID() {
        Objecttt x = new Objecttt(3);
        String expResult = services.Delete(x.getId());
        String result = "Thành công";
        assertEquals(expResult, result);
    }

    @Test
    public void testDeleteKhiKhongTonTaiID() {
        Objecttt x = new Objecttt(20);
        String expResult = services.Delete(x.getId());
        String result = "Thất bại";
        assertEquals(expResult, result);
    }
}
