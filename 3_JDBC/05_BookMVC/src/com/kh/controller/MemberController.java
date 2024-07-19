package com.kh.controller;

import java.sql.SQLException;

import com.kh.model.vo.Member;

public class MemberController {

	
	private MemberDAO member = new MemberDAO();
	
	public boolean registerMember(String id, String password, String name) {
		try {
		member.registerMember();
		return false;
		
	} catch (SQLException e) {
		return false;
	}
	}
	
	
	// 5. 로그인
	public Member login(String id, String password) {
		Member m = member.login(id, password);
		
		if(m.getStatus()=='N') return m;
	} catch(SQLException e) {
		return null;
	}
		return null;
		
	}
	
	
}
