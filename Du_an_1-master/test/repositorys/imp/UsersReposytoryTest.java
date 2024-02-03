package repositorys.imp;

import java.util.ArrayList;
import java.util.List;
import models.Chucvu;
import models.Users;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsersReposytoryTest {
    Chucvurepo c = new Chucvurepo();
    List<Chucvu> listChucVu = c.getAllChucVu();
    private UsersReposytory usersReposytory;
    private List<Users> userList;

    @Before
    public void setUp() {
        usersReposytory = new UsersReposytory();
        userList = new ArrayList<>();
        // Thêm dữ liệu mẫu vào danh sách
        Users nv =new Users("10", "Vu","Minh","Nguyen","09-02-2003",0,"0369488001","vunt","12345","vuntm@gmail.com",listChucVu.get(0),0);
        usersReposytory.add(nv);
    }

    @Test
    public void testGetAllNhanVien() {
        System.out.println("getAllNhanVien");
        
        List<Users> result = usersReposytory.getAllNhanVien();
        
        assertNotNull(result);
        System.out.println("Số lượng nhân viên :"+result.size());
//        for (Users x : result) {
//            for (int i = 0; i < usersReposytory.getAllNhanVien().size(); i++) {
//                assertEquals(x.getTen(), result.get(i).getTen());
//            }
//        }
        
      
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        Users nv = new Users("10", "Vu","Minh","Nguyen","09-02-2003",0,"0369488001","vunt","12345","vuntm@gmail.com",listChucVu.get(0),0);
        
        boolean result = usersReposytory.add(nv);
        
        assertTrue(result);
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Users nv = new Users("10", "Vu","Minh","Nguyen","09-02-2003",0,"0369488001","vunt","12345","vuntmupdated@gmail.com",listChucVu.get(0),0);
        String id = "10";
        
        boolean result = usersReposytory.update(nv, id);
        
        assertTrue(result);
    }

    @Test
    public void testSearchNVV() {
        System.out.println("SearchNVV");
        String Ten = "Vu";
        
        List<Users> result = usersReposytory.SearchNVV(Ten);
        
        assertNotNull(result);
        assertEquals("Vu", result.get(10).getTen());
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "10";
        
        boolean result = usersReposytory.delete(id);
        
        assertTrue(result);
    }
}