package test.com.zhaihuitao.student.util; 

import com.zhaihuitao.student.util.DBUtil;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.sql.SQLException;

/** 
* DBUtil Tester. 
* 
* @author <Authors name> 
* @since <pre>六月 8, 2017</pre> 
* @version 1.0 
*/ 
public class DBUtilTest { 

@Test

    public void test(){

    try {
        System.out.println(DBUtil.makeConnection().getAutoCommit());
    } catch (SQLException e) {
        e.printStackTrace();
    }


}


} 
