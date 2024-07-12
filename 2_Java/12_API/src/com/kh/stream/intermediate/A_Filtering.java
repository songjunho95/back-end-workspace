package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * 필터링
 * - 중간 처리 기능으로 요소를 걸러내는 역활
 * 
 * */



public class A_Filtering {

	// distinct : 중복 제거 
	
	
	
	
	
	public void method1() {
		
		List<String> names = Arrays.asList("김현호", "우현성", "김경주", "주준영", "조창현", 
													"김진주", "우현성", "김경주", "주준영");
		
		Stream<String> stream = names.stream();
		stream		
		.distinct()
		.forEach(name -> System.out.println(name + " "));
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		A_Filtering a = new A_Filtering();
		a.method1();
	}

}
