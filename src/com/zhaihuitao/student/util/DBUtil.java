package com.zhaihuitao.student.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by zhaihuitao on 17/6/8.
 */
public class DBUtil {

    private static String DRIVER;
    private static String DBURL;
    private static String USER;
    private static String PASSWORD;
    private static Connection connection = null;

    /**
     * 加载配置文件
     */
    static {
        //InputStream inputStream = DBUtil.class.getClassLoader().getResourceAsStream("DBUtil.properties");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/DBUtil.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties properties = new Properties();
        try {
             properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        DRIVER = properties.getProperty("DRIVER");
        DBURL = properties.getProperty("DBURL");
        USER = properties.getProperty("USER");
        PASSWORD = properties.getProperty("PASSWORD");

        //System.out.println(properties.getProperty("USER"));
    }

    /**
     * 获取链接
     */
    public static Connection makeConnection(){
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(DBURL,USER,PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }


}
