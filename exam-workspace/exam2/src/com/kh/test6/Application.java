package com.kh.test6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Application {

	private static String query;

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "qwer1234");
			
			PreparedStatement st = conn.prepareStatement(query);
			
			ResultSet rs = st.executeUpdate();
			
			while(rs != null) {
				System.out.println(rs.getString("empId") + " / " + rs.getString("empName"));
				
			}
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
	}
	
	
	
	
	
	
}
