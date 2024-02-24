/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.imp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class UserServiecTest {
    
    public UserServiecTest() {
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
     * Test of getUser method, of class UserServiec.
     */
    @Test
    public void testGetUser() {
        String TaiKhoan = "datqt";
        String MatKhau = "12345@";
        UserServiec instance = new UserServiec();
        boolean expResult = true;
        boolean result = instance.getUser(TaiKhoan, MatKhau);
        assertEquals(expResult, result);
    }
    
}
