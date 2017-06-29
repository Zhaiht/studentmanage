package com.zhaihuitao.student.dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.zhaihuitao.student.entity.User;
import com.zhaihuitao.student.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by zhaihuitao on 17/6/18.
 */
public class UserDao {

    private Connection connection = null;
    private PreparedStatement pr;
    /**
     * 验证用户权限
     * @return
     */
    public boolean validate(User user){
        String sql = "select * from user where username = ? and password = ?";
        connection = (Connection) DBUtil.makeConnection();
        try {
            pr = (PreparedStatement) connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pr.setString(1,user.getUsername());
            pr.setString(2, user.getPassword());
            ResultSet resultSet = pr.executeQuery();
            if (resultSet.next()){
                return true;
            }
                return false;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                pr.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
