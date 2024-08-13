package com.kh.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.mybatis.model.vo.Member;

import mapper.MemberMapper;

@Service
public class MemberService {

	@Autowired
	private MemberMapper mapper;
	
	public void register(Member vo) {
		mapper.register(vo);
	}
	
	public Member login(Member vo) {
		
//		System.out.println("사용자가 입력한 정보 : " + vo); 
		Member member = mapper.login(vo.getId());
//		System.out.println("DB에 있는 사용자 정보 : " + member);
		
		
		if(member!=null && bcpe.matches(vo.getPassword(), member.getPassword()) {
//		System.out.println("비밀번호 일치한지 체크 : " + bcpe.matches(vo.getPassword(), member.getPassword()));
		
		}
		
		
		
		return null;
	}
	
	
}
