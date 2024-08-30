package com.kh.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.mybatis.model.vo.Member;
import com.kh.mybatis.service.MemberService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("allMember", service.allMember());
		return "index";
		
		
	}
	
	@GetMapping("/register")
	public String register() {
			return "mypage/register";
			
	}
	
	@PostMapping("/register")
	public String register(Member vo) {
		service.register(vo);
		return "redirect:/";
	}
	
	@PostMapping("/login")
	public String login() {
		return "mypage/login";
	}
	
	
	
}
