/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package services.imp;

import java.util.List;
import models.ChatLieu;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import viewmodels.Objecttt;

/**
 *
 * @author admin
 */
public class ChatLieuServicesTest {
    
    public ChatLieuServicesTest() {
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

    @Test
    public void testGetAll() {
        ChatLieuServices instance = new ChatLieuServices();
        List<ChatLieu> expResult = instance.getAll();
        List<ChatLieu> result = instance.getAll();
        assertEquals(expResult, result);
    }

    @Test
    public void testAdd() {
        Objecttt x = new Objecttt(1, "Áo khoác nam");
        ChatLieuServices instance = new ChatLieuServices();
        String expResult = instance.Add(x);
        String result = instance.Add(x);
        assertEquals(expResult, result);
    }

    @Test
    public void testUpdate() {
        Objecttt x = new Objecttt(1, "Áo khoác nam");
        int id = 1;
        ChatLieuServices instance = new ChatLieuServices();
        String expResult = instance.Update(x, id);
        String result = instance.Update(x, id);
        assertEquals(expResult, result);
    }

    /**
     * Test of Delete method, of class ChatLieuServices.
     */
    @Test
    public void testDelete() {
        int id = 1;
        ChatLieuServices instance = new ChatLieuServices();
        String expResult = instance.Delete(id);
        String result = instance.Delete(id);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetbyid() {
        int id = 1;
        ChatLieuServices instance = new ChatLieuServices();
        ChatLieu expResult = instance.getbyid(id);
        ChatLieu result = instance.getbyid(id);
        assertEquals(expResult, result);
    }
    
}
