package com.leo.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbUtil {
	private static String driverClassName="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/test";
	private static String username="root";
	private static String password="1";
	
	//获得数据库连接
	public static Connection getConnection(){
		Connection conn=null;
		try {
			Class.forName(driverClassName);
			conn=DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	//关闭连接
	public static void closeAll(Connection conn,PreparedStatement ps,ResultSet rs){
		try {
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            rs = null;
            ps = null;
            conn = null;
        }
		
	}
	

}
