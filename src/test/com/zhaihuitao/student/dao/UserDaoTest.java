package test.com.zhaihuitao.student.dao; 

import com.zhaihuitao.student.dao.UserDao;
import com.zhaihuitao.student.entity.User;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* UserDao Tester. 
* 
* @author <Authors name> 
* @since <pre>六月 18, 2017</pre> 
* @version 1.0 
*/ 
public class UserDaoTest { 

    @Test
    public void test(){
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUsername("11");
        user.setPassword("11");
        System.out.println(userDao.validate(user));
    }


} 
