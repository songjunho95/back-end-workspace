package com.semi.youtube.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semi.youtube.model.vo.Member;

import mapper.MemberMapper;

@Service
public class MemberService {
	


	
	@Autowired
	
	private MemberMapper member;
	
	public Member check(String id) {
		Member vo = member.check(id);
		if(vo!=null) return true;
		return false;
		
	}
	
	
	public Member login(Member vo) {
		return member.login(vo);
	}
	
	

}
