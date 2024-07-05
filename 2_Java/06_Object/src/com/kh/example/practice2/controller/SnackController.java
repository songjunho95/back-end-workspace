package com.kh.example.practice2.controller;

import com.kh.example.practice2.model.Snack;

public class SnackController {
	
	private Snack s = new Snack();
	
	
	
	
public String saveData(String kind, String name, String flavor, int numOf, int price) {
	// 데이터를 setter 를 이용해 저장하고 "저장 완료되었습니다." 결과를 반환
	s.setKind(kind);
	s.setName(name);
	s.setFlavor(flavor);
	s.setNumOf(numOf);
	s.setPrice(price);
	return "저장 완료되었습니다.";
}

public String confirmData() {
	// 저장된 데이터를 반환 
	return s.getKind() + "(" + s.getName() + " - " + s.getFlavor() + ") " + s.getNumOf() + "개 " + s.getPrice() + "원";
};

// ~~님의 등급은 ~~이며, 지불해야 하는 금액은 ~원이며, 적립된 포인트는 ~~점입니다.















