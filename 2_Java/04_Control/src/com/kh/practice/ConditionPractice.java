package com.kh.practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ConditionPractice c = new ConditionPractice();
		
		c.method1();
	}
	
	/*
	 *  입력 받은 정수가 양수이면서 짝수일 떄만 "짝수다"를 출력하고 짝수가 아니면 "홀수다"를 출력하세요.
	 *  양수가 아니면 "양수만 입력해주세요." 를 출력하세요.
	 *  숫자를 한 개 입력하세요 : -8
	 *  양수만 입력해주세요.
	 * 
	 * 
	 * */
	

	public void method1() {
		System.out.println("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		/*
			if(num > 0 && num % 2 == 0) {
				System.out.println("짝수다");			
			} else if(num > 0 && num % 2 != 0) {
				System.out.println("홀수다");
			} else {
				System.out.println("양수만 입력해주세요.");
			}
	}
	
*/
	/*
	if(num > 0) {
		if(num % 2 == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		} 
	} else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	*/
		
	
	if(num <= 0) { // 양수가 아닌 것들부터 처리!
		System.out.println("양수만 입력해주세요.");
		} else if(num % 2 == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}
	}
	
	
	
	/*
	 * 스트림의 종류
	 * - java.util.stream 패키지에 존재하고 BaseStream 인터페이스를 부모로 갖고 자식 인터페이스들이 상속 관계를 이루고 있다.
	 * 
	 * Stream API
	 * - 스트림은 자바 8 부터 추가된 기능으로 컬렉션(배열)의 저장 요소들을 하나씩 참조해서 람다식으로 처리할 수 있도록 해주는 반복자 
	 * - 중간 처리(intermediate), 최종 처리(terminal) 작업을 수행
	 * - 중간 처리 : 반복(peek), 매핑(타입 변환), 필터링, 정렬 등 
	 * - 최종 처리 : 반복(forEach), 카운팅, 평균, 총합 등의 집계 처리 
	 * - 구분하는 방법은 리턴 타입으로 알 수 있음!
	 * 	- 리턴 타입이 Stream 중간 처리 메서드
	 *  - 리턴 타입이 기본 타입이거나, Optional 객체라면 최종 처리 메서드
	 *  - 지연된 연산 : 최종 연산이 수행되기 전까지는 중간 연산이 수행되지 않는다.
	 * 
	 * */
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}