package com.kh.test6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Application {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "qwer1234");
			
			PreparedStatement st = conn.prepareStatement("SELECT * FROM employee");
			
			ResultSet rs = st.executeQuery();
			
			
			while(rs) {
				System.out.println(rs.getString("emp_id") + " / " + rs.getString("emp_name"));
			}
			
			
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
}
