package com.kh.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {

	public EmployeeDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public Connection getConnect() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/kh", "root", "qwer1234");		
	}
	
	public void close(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		if(rs!=null) rs.close();
		if(ps!=null) ps.close();
		if(conn!=null) conn.close();
		
	}
	
	public <Employee> Employee search(int id) throws SQLException {
		
		Connection conn = getConnect();
		
		String query = "SELECT * FROM employee WHERE emp_id = ?";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ResultSet rs = ps.executeQuery();
		Employee employee = null;
		
		if(rs.next()) {
			employee = new Employee();
		}
		
		close(rs, ps, conn);
		
		return employee;
	}
	
}
