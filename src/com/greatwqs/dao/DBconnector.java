package com.greatwqs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnector {
	 // 驱动程序名
    static String driver = "com.mysql.jdbc.Driver";

    // URL指向要访问的数据库名scutcs
    static String url = "jdbc:mysql://127.0.0.1:3306/laomu";

    // MySQL配置时的用户名
    static String user = "root"; 

    // MySQL配置时的密码
    static String password = "";

    private static Connection conn;
    
    public static Connection getconnector(){
    	if(conn != null){
    		return conn;
    	}
        // 加载驱动程序
        try {
			Class.forName(driver);
	        // 连续数据库
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Succeeded connecting to the Database!");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return conn;
    }
    
    public static void main(String[] args) {
    	getconnector();
	}
}
