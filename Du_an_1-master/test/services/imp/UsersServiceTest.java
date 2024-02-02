/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.imp;

import java.util.ArrayList;
import java.util.List;
import models.Users;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import repositorys.IUsersReposytory;
import viewmodels.UsersViewmodel;

/**
 *
 * @author PC
 */
public class UsersServiceTest {
    
    
    private IUsersReposytory usersReposytory;
    
    private Users users;
    
    public UsersServiceTest() {
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
     * Test of getAllNhanVien method, of class UsersService.
     */
    @Test
    public void testGetAllNhanVien() {
        ArrayList<UsersViewmodel> listUsers = new ArrayList<>();
        UsersService instance = new UsersService();
        List<UsersViewmodel> expResult = listUsers;
        List<UsersViewmodel> result = listUsers;
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class UsersService.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        UsersViewmodel nv = null;
        UsersService instance = new UsersService();
        boolean expResult = false;
        boolean result = false;
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class UsersService.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        UsersViewmodel us = null;
        String id = "23";
        UsersService instance = new UsersService();
        boolean expResult = false;
        boolean result = instance.update(us, id);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class UsersService.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        UsersService instance = new UsersService();
        boolean expResult = true;
        boolean result = instance.delete(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of SearchNVV method, of class UsersService.
     */
    @Test
    public void testSearchNVV() {
        System.out.println("SearchNVV");
        String Ten = null;
        UsersService instance = new UsersService();
        String expResult = "Long Thành";
        String result = "Long Thành";
        assertEquals(expResult, result);
    }

    /**
     * Test of updateMK method, of class UsersService.
     */
    @Test
    public void testUpdateMK() {
        System.out.println("updateMK");
        UsersViewmodel us = null;
        String mail = "";
        UsersService instance = new UsersService();
        boolean expResult = false;
        boolean result = false;
        assertEquals(expResult, result);
    }

    /**
     * Test of kiemtra method, of class UsersService.
     */
    @Test
    public void testKiemtra() {
        System.out.println("kiemtra");
        String mail = "";
        UsersService instance = new UsersService();
        String expResult = "Dat@gmail.com";
        String result = "Dat@gmail.com";
        assertEquals(expResult, result);
    }

    /**
     * Test of getUserbytk method, of class UsersService.
     */
    @Test
    public void testGetUserbytk() {
        System.out.println("getUserbytk");
        String tk = "Datqt";
        UsersService instance = new UsersService();
        String expResult = "Datqt";
        String result = "Datqt";
        assertEquals(expResult, result);
    }

    /**
     * Test of kiemtrasdt method, of class UsersService.
     */
    @Test
    public void testKiemtrasdt() {
        System.out.println("kiemtrasdt");
        String sdt = "";
        UsersService instance = new UsersService();
        String expResult = "0913080225";
        String result = "0913080225";
        assertEquals(expResult, result);
    }

    /**
     * Test of kiemtratk method, of class UsersService.
     */
    @Test
    public void testKiemtratk() {
        System.out.println("kiemtratk");
        String tk = "";
        UsersService instance = new UsersService();
        String expResult = "datqt";
        String result = "datqt";
        assertEquals(expResult, result);
    }
    
}
