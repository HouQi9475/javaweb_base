package com.leo.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class sqlConn {

	
	@Test
	public void select(){
		String sql="select * from emp where sal between ? and ?";
		Connection conn=dbUtil.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, 1000);
			ps.setInt(2, 1500);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt("empno")+"---"+rs.getString("ename")+"---"+rs.getString("job"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void add(){
		String sql="insert into stu values(?,?,?,?)";
		Connection conn=dbUtil.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, 2);
			ps.setString(2, "lisi");
			ps.setInt(3, 18);
			ps.setString(4, "1");
			ps.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
