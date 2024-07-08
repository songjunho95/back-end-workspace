package com.kh.array.practice2.controller;

import com.kh.array.practice2.model.Member;

public class MemberController {

	private Member[] mArr = new Member[3];
	public int count = 0;
	
}

public void updateMember(String id, String name, String email, String pwd)


// 멤버 조회

public Member[] printAll() {
	Member[] mArr = mc.printAll;
	for(Member m : mArr) {
		if(m!=null) System.out.println(m);
	}
}