package com.kh.lang;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Create {

	// 숫자 범위로 스트림을 생성 - IntStream, LongStream, DoubleStream
	
	
	public void method1() {
		
		// 첫 번째 매개 값 ~ 두 번쨰 매개 값 이전까지의 값을 요소로 가지는 스트림 객체 생성
		IntStream stream = IntStream.range(1, 10); // 1 ~ 9
		int sum = stream.sum();
		System.out.println("range의 sum : " + sum);
		
		// 첫 번째 매개 값 ~ 두 번째 매개 값까지의 값을 요소로 가지는 스트림 객체 생성
		stream = IntStream.rangeClosed(1, 10); // 1 ~ 10
		sum = stream.sum();
		System.out.println("rangeClosed의 sum : " + sum);
		
		
	}
		
		
		
		/*
		 * 배열(컬렉션)로부터 스트림을 생성하는 방법
		 * 
		 * 
		 * */
		
		
		
		public void method2() {
			String[] names = {"김현호", "우현성", "김경주", "주준영", "조창현", "김진주"};
			List<String> nameList = Arrays.asList(names);
			
			System.out.println(nameList);
			
			// 스트림으로 변경 
			Stream<String> stream = Arrays.stream(names);
			stream.forEach(name -> System.out.println(name));
			
			stream = nameList.stream();
			
		}
		
		
		
		
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Create c= new Create();
		
//		c.method1();
		c.method2();
	}

}
