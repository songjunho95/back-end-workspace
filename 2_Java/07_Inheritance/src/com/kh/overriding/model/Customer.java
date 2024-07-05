package com.kh.overriding.model;

import com.kh.Inheritance.parent.Product;

/*
 * 클래스 간의 관계 : 상속 vs 포함
 * - 상속 관계 : ~은 ~이다. (is - a)
 * - 포함 관계 : ~은 ~을 가지고 있다. (has - a)
 * - 자바는 단일상속만 허용 
 * - 클래스 간의 관계를 많이 맺을수록 재사용을 높이고 관리하기 쉽게 한다.
 * 
 * 
 * */


public class Customer {
	
	protected String name; // 고객 이름
	protected String grade; // 고객 등급
	protected int bonusPoint; // 보너스 포인트
	protected double bonusRatio; // 보너스 적립 비율
	
	Product product; // 포함 관계
	
	public Customer() {
		
		
		
		
	}

	public static void main(String[] args) {

	}

}
