package com.kh.condition;

import java.util.Scanner;

public class A_If {

	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * if문
	 * 
	 * if(조건식) {
	 * 		조건식이 참(true)일 떄 실행
	 * }
	 * 
	 * - 보통 조건식에는 비교연산자, 논리연산자를 주로 사용
	 * 
	 * 
	 * */
	public void method1() {
		
		// 입력받은 성적이 60 점 이상이면 "합격입니다"를 출력
		System.out.println("성적 입력 : ");
		int score = sc.nextInt();
		
		if(score >= 60) {
			System.out.println("합격입니다");
			
		}
		
		// 한줄만 들어갔을 때 유용!
		if(score >= 60) System.out.println("합격입니다");

		
	}
	
	/*
	 * if-else문
	 * 
	 * if(조건식) {
	 * 		조건식이 참(true)일 떄 실행 
	 * } else {
	 * 		조건식이 거짓(false)일 떄 실행 
	 * }
	 * 
	 * 
	 * */
	
	public void method2() {
		// 입력받은 성적이 60점 이상이면 "합격입니다", 
		// 아니면 "불합격입니다"를 출력 
		System.out.print("성적 입력 : ");
		int score = sc.nextInt();
		
		if(score >= 60) {
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
		}
		
		// 삼항연산자
		String result = score >= 60 ? "합격입니다" : "불합격입니다";
		System.out.println(result);	
		
	}
	
	public void method3() {
		// 본인의 이름을 입력했을 때 본인이면 "본인이다", 아니면 "본인이 아니다"를 출력
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		System.out.println("name의 주소값 : " + System.identityHashCode(name));
		System.out.println("본인이름의 주소값 : " + System.identityHashCode("송준호"));
		
		if(name.equals("송준호")) {
			System.out.println("본인이다");
		} else {
			System.out.println("본인이 아니다");
		}
	
	}
	
/*
 * if - else if - else 문
 * 
 * if(조건식 1) {
 * 		조건식1이 참(true)일 떄 실행 
 * 
 * } else if(조건식2) {
 * 		조건식 1 이 거짓(false)이면서 조건식2이 참(true)일 떄 실행 
 * } else {
 * 		조건식1, 조건식2 모두 거짓(false)일 떄 실행 
 * }
 * 
 * - else if 는 수가 제한이 없다
 * 
 * 
 * 
 * 
 * */
public void method4() {
	
	//입력받은 숫자가 0 보다 크면 "양수", 0 이면 "0이다", 작으면 "음수" 출력
	System.out.print("숫자 입력 : ");
	int number = sc.nextInt();
	
	// 삼항연산자
	String result = number > 0 ? "양수" : number == 0 ? "0이다" : "음수";
	System.out.println(result);
	
	// if문
	if(number > 0) {
		System.out.println("양수");
		
	} else {
		if(number == 0) { // if문 중첩 가능! 가급적으로는 좋은 코드는 x
			System.out.println("0이다");
		} else {
			System.out.println("음수");
			
		}
	}
	// else if 사용
	if(number > 0) {
		System.out.println("양수");
	} else if (number == 0) {
		System.out.println("0이다");
	} else {
		System.out.println("음수");
	}

}
	
/*
 * 사용자에게 점수 (0~100)를 입력받아서 점수별로 등급 출력
 * - 90점 이상은 A 등급
 * - 90점 미만 70점 이상은 C 등급
 * - 80점 미만 70점 이상은 D 등급
 * - 60점 미만 F 등급
 * */
	
public void practice1() {
	System.out.println("점수 입력(0~100점) : ");
	int score = sc.nextInt();
	
	String result = "";
	
	if(score >= 90) {
			result = "A";
	} else if(score >= 80) {
		result = "B";
	} else if(score >= 70) {
		result = "C";
	} else if(score >= 60) {
		result = "D";
	} else {
			result = "F";
	}
	
	System.out.println(result);
}	



	
	public static void main(String[] args) {
		A_If a = new A_If();
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
		a.practice1();
		
		
	}
	
}
