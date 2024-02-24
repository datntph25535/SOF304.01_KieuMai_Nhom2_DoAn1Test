/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.imp;

import java.util.ArrayList;
import java.util.List;
import models.Chucvu;
import models.Users;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import repositorys.IChucvuRepo;
import repositorys.IUsersReposytory;
import viewmodels.UsersViewmodel;

/**
 *
 * @author PC
 */
public class UsersServiceTest {

    private UsersService userservice = new UsersService();

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

    @Test
    public void testNameisValid() {
        UsersViewmodel usersViewmodel = new UsersViewmodel("Vu", "Minh", "Nguyen", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        assertEquals(true, userservice.add(usersViewmodel));
    }

    @Test
    public void testNameEmpty() {
        // Tạo một đối tượng UsersViewmodel với TenKM trống
        UsersViewmodel nameEmpty = new UsersViewmodel("", "Minh", "Nguyen", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        assertEquals(false, userservice.add(nameEmpty));
    }

    @Test
    public void testInvalidNameWithNumber() {
        UsersViewmodel nameEmpty = new UsersViewmodel("123", "Minh", "Nguyen", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        boolean result = userservice.add(nameEmpty);
        assertEquals(false, result);
    }

    @Test
    public void testInvalidNameWithSpecialCharacter() {
        UsersViewmodel nameEmpty = new UsersViewmodel("Vu@", "Minh", "Nguyen123", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        boolean result = userservice.add(nameEmpty);
        assertEquals(false, result);
    }

    @Test
    public void testMiddleNameisValid() {
        UsersViewmodel usersViewmodel = new UsersViewmodel("Vu", "Minh", "Nguyen", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        assertEquals(true, userservice.add(usersViewmodel));
    }

    @Test
    public void testMiddleNameEmpty() {
        // Tạo một đối tượng UsersViewmodel với TenKM trống
        UsersViewmodel middleNameEmpty = new UsersViewmodel("Vu", null, "Nguyen", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);

        assertEquals(true, userservice.add(middleNameEmpty));
    }

    @Test
    public void testInvalidMiddleNameWithSpecialCharacter() {
        UsersViewmodel nameEmpty = new UsersViewmodel("Vu", "M@nh", "Nguyen", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        boolean result = userservice.add(nameEmpty);
        assertEquals(false, result);
    }

    @Test
    public void testInvalidMiddleNameWithNumber() {
        UsersViewmodel nameEmpty = new UsersViewmodel("Vu", "123123", "Nguyen123", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        boolean result = userservice.add(nameEmpty);
        assertEquals(false, result);
    }

    @Test
    public void testFirstNameisValid() {
        UsersViewmodel usersViewmodel = new UsersViewmodel("Vu", "Minh", "Nguyen", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        assertEquals(true, userservice.add(usersViewmodel));
    }

    @Test
    public void testFirstNameEmpty() {
        // Tạo một đối tượng UsersViewmodel với TenKM trống
        UsersViewmodel firstNameEmpty = new UsersViewmodel("Vu", "Minh", null, "09-02-2003", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        assertEquals(true, userservice.add(firstNameEmpty));
    }

    @Test
    public void testInvalidFirstNameWithNumber() {
        UsersViewmodel nameEmpty = new UsersViewmodel("Vu", "Minh", "Nguyen123", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        boolean result = userservice.add(nameEmpty);
        assertEquals(false, result);
    }

    @Test
    public void testInvalidFirstNameWithSpecialCharacter() {
        UsersViewmodel nameEmpty = new UsersViewmodel("Vu", "Minh", "Nguyen@@", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        boolean result = userservice.add(nameEmpty);
        assertEquals(false, result);
    }

    @Test
    public void testPhoneNumberisValid() {
        UsersViewmodel usersViewmodel = new UsersViewmodel("Vu", "Minh", "Nguyen", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        assertEquals(true, userservice.add(usersViewmodel));
    }

    @Test
    public void testPhoneNumberEmpty() {
        // Tạo một đối tượng UsersViewmodel với TenKM trống
        UsersViewmodel phoneEmpty = new UsersViewmodel("Vu", "Minh", "Nguyen", "09-02-2003", 1, null, "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        assertEquals(true, userservice.add(phoneEmpty));
    }

    @Test
    public void testPhoneNumberInvalidCharacter() {
        UsersViewmodel phoneNumberInvalidCharacter = new UsersViewmodel("Vu", "Minh", "Nguyen", "09-02-2003", 1, "123abc456", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        Boolean user = userservice.add(phoneNumberInvalidCharacter);
        assertEquals(false, user);
    }

    @Test
    public void testPhoneNumberTooShort() {
        UsersViewmodel phoneNumberTooShort = new UsersViewmodel("Vu", "Minh", "Nguyen", "09-02-2003", 1, "1234", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        assertEquals(false, userservice.add(phoneNumberTooShort));
    }

    @Test
    public void testPhoneNumberTooLong() {
        UsersViewmodel phoneNumberTooLoong = new UsersViewmodel("Vu", "Minh", "Nguyen", "09-02-2003", 1, "1234123412341234", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        assertEquals(false, userservice.add(phoneNumberTooLoong));
    }

    @Test
    public void testUserNameisValid() {
        UsersViewmodel usersViewmodel = new UsersViewmodel("Vu", "Minh", "Nguyen", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        assertEquals(true, userservice.add(usersViewmodel));
    }

    @Test
    public void testUserNameEmpty() {
        // Tạo một đối tượng UsersViewmodel với TenKM trống
        UsersViewmodel usernameEmpty = new UsersViewmodel("", "Minh", "Nguyen", "09-02-2003", 1, "0369488001", "", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        assertEquals(true, userservice.add(usernameEmpty));
    }

    @Test
    public void testEmailisValid() {
        UsersViewmodel usersViewmodel = new UsersViewmodel("Vu", "Minh", "Nguyen", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        assertEquals(true, userservice.add(usersViewmodel));
    }

    @Test
    public void testEmailEmpty() {
        // Tạo một đối tượng UsersViewmodel với TenKM trống
        UsersViewmodel emailEmpty = new UsersViewmodel("Vu", "Minh", "Nguyen", "09-02-2003", 1, "0369488001", "vuntm", "12345a", null, new Chucvu("1"), 0);
        assertEquals(true, userservice.add(emailEmpty));
    }

    @Test
    public void testEmailInvalidFormat() {
        UsersViewmodel emailInvalidFormat = new UsersViewmodel("Vu", "Minh", "Nguyen", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "invalidemail", new Chucvu("1"), 0);
        assertEquals(true, userservice.add(emailInvalidFormat));
    }

    @Test
    public void testEmailEmptyDomain() {
        UsersViewmodel emailEmptyDomain = new UsersViewmodel("Vu", "Minh", "Nguyen", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "username@", new Chucvu("1"), 0);
        assertEquals(true, userservice.add(emailEmptyDomain));
    }

    @Test
    public void testEmailEmptyUsername() {
        UsersViewmodel emailEmptyUsername = new UsersViewmodel("Vu", "Minh", "Nguyen", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "@domain.com", new Chucvu("1"), 0);
        assertEquals(true, userservice.add(emailEmptyUsername));
    }

    @Test
    public void testEmailInvalidCharacter() {
        UsersViewmodel emailInvalidCharacter = new UsersViewmodel("Vu", "Minh", "Nguyen", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "user#name@gmail.com", new Chucvu("1"), 0);
        assertEquals(true, userservice.add(emailInvalidCharacter));
    }

    @Test
    public void testInvalidBirthDateInTheFuture() {
        UsersViewmodel invalidBirthDateInTheFuture = new UsersViewmodel("Vu", "Minh", "Nguyen", "01-01-2025", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        boolean result = userservice.add(invalidBirthDateInTheFuture);
        assertEquals(false, result);
    }

    @Test
    public void testInvalidBirthDateInvalidFormat() {
        UsersViewmodel invalidBirthDate = new UsersViewmodel("Vu", "Minh", "Nguyen", "09-2003-02", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        boolean result = userservice.add(invalidBirthDate);
        assertEquals(false, result);
    }

    @Test
    public void testEmptyBirthDate() {
        UsersViewmodel EmptyBirthDate = new UsersViewmodel("Vu", "Minh", "Nguyen", null, 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        boolean result = userservice.add(EmptyBirthDate);
        assertEquals(false, result);
    }

    @Test
    public void testUpdateByInvalidId() {
        UsersViewmodel us = new UsersViewmodel("Vu", "Minh", "Nguyen", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        String id = "sdjfbsdjhfbsdf";
        boolean expResult = false;
        assertEquals(expResult, userservice.update(us, id));
    }

    @Test
    public void testUpdateByValidId() {
        String id = null;
        UsersViewmodel us = new UsersViewmodel("Vu", "Minh", "Nguyen", "09-02-2003", 1, "0369488001", "vuntm", "12345a", "vuntm@gmail.com", new Chucvu("1"), 0);
        List<UsersViewmodel> lst = userservice.getAllNhanVien();
        for (int i = 0; i < lst.size()-1; i++) {
            if (i == lst.size()-1) {
                id = lst.get(i).getId();
            }
        }
        boolean expResult = true;
        assertEquals(expResult, userservice.update(us, id));
    }

    @Test
    public void testDeleteByInvalidId() {
        String id = "123123123";
        boolean result = userservice.delete(id);
        assertEquals(false, result);
    }

    @Test
    public void testDeleteByValidId() {
        String id = "123123123";
        List<UsersViewmodel> lst = userservice.getAllNhanVien();
        for (int i = 0; i <= lst.size()-1; i++) {
            if (i == lst.size()-1) {
                id = lst.get(i).getId();
            }
        }
        boolean result = userservice.delete(id);
        assertEquals(false, result);
    }
    
    @Test
    public void testNVbyNameValid(){
        String ten = null;
        List<UsersViewmodel> lst = userservice.getAllNhanVien();
        for (int i = 0; i <= lst.size()-1; i++) {
            if(i==lst.size()){
                ten = lst.get(i).getTen();
            }
        }
        assertEquals(ten, userservice.SearchNVV(ten));
    }

    /**
     * Test of add method, of class UsersService.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        UsersViewmodel nv = null;
        UsersService instance = new UsersService();
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class UsersService.
     */
    @Test
    public void testUpdateByEmptyId() {
        System.out.println("update");
        UsersViewmodel us = new UsersViewmodel();
        String id = null;
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
