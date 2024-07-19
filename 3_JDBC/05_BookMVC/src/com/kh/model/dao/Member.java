package com.kh.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Member {

	public class BookDAO {
		
		public BookDAO() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		public Connection connect() throws SQLException {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "qwer1234");
		}
		
		public void close(PreparedStatement ps, Connection conn) throws SQLException {
			ps.close();
			conn.close();
		}
		
		public void close(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
			
			
			rs.close();
			close(ps, conn);
			
		}
		
		// 4. 회원가입
		
		public void registerMember(String id, String password, String name) throws SQLException {
			Connection conn = connect();
			String query = "INSERT INTO member(member_id, member_pwd, member_name) VALUES(?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, id);
			ps.setString(2, password);
			ps.setString(3, name);
			ps.executeUpdate();
			close(ps, conn);
		}
		}
		
		
		
		// 5. 로그인
		public Member login() {
			Connection conn = connect();
			String query = "";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, id);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			Member member = null;
			if(rs.next()) {
				member = new Member();
				member.setMemberId(id);
				member.setMemberPwd(password);
				member.setMemberName(rs.getString("member_name"));
				member.setMemberNo(rs.getInt("member_no"));
				member.setStatus(rs.getString("status").charAt(0));
			}
			
			close(rs, ps, conn);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}
