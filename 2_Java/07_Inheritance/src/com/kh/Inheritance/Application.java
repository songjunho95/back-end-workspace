package com.kh.Inheritance;

import com.kh.Inheritance.child.Notebook;
import com.kh.Inheritance.child.SmartPhone;

public class Application {
	
	public static void main(String[] args) {
		
		Notebook notebook = new Notebook("애플", "app-01", "맥북 프로 16", 3400000, "M3");
		System.out.println(notebook);
		
		// SmartPhone smartPhone = new SmartPhone("삼성", "sam-02", "갤럭시 S24울트라", 150000, "SKT");
		
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.setBrand("삼성");
		smartPhone.setName("갤럭시 S24 울트라");
		smartPhone.setPrice(150000);
		smartPhone.setAgency("SKT");
		
		System.out.println(smartPhone);
	}
	
}