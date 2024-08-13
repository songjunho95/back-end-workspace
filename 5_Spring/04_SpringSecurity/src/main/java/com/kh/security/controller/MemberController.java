package com.kh.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.mybatis.model.vo.Member;
import com.kh.mybatis.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	private BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
	

	public void register(Member vo) {
//		System.out.println("암호와 전 : " + vo.getPassword());
//		System.out.println("암호와 후 : " + bcpe.encode(vo.getPassword()));
	
		// 암호화 된 비밀번호로 저장
		vo.setPassword(vo.getPassword());
		vo.setRole("ROLE_ADMIN");
		
		mapper.register(vo);
		
	}
	
	
	@PostMapping("/login")
	public void login(Member vo) {
		service.login(vo);
	}
	
	
}
