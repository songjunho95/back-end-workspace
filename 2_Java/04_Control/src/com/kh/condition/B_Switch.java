package com.kh.condition;

import java.util.Scanner;

public class B_Switch {

		Scanner sc = new Scanner(System.in);
		
		/*
		 * switch문
		 * 
		 * switch(조건식) {
		 * 			case 값1 : 
		 * 				조건식의 결과가 값1과 같은 경우 실행 
		 * 				break;
		 * 			case 값1 :
		 * 				조건식의 결과가 값2와 같은 경우 실행
		 * 			default : 
		 * 				 조건식의 결과가 일치하는 case 문이 없을 떄 실행 
		 * 
		 * }
		 * 
		 * - case 문의 수는 제한이 없다
		 * - 조건식 결과는 정수, 문자, 문자열이어야 한다,
		 * - 조건문을 빠져나가려면 break 가 필요하다
		 * - default문은 생략 가능하다
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		public void method1() {
			/*
			 * 숫자를 입력받아
			 * 1일 경우 "빨간색입니다"
			 * 2일 경우 "파란색입니다"
			 * 3일 경우 "초록색입니다"
			 * 잘못입력했을 경우 "잘못입력했습니다"
			 * */
			
			System.out.println("숫자 입력 : ");
			int number = sc.nextInt();
			
			switch(number) {
			case 1 :
					System.out.println("빨간색입니다");
			case 2 :
					System.out.println("파란색입니다");
			case 3 : 
					System.out.println("초록색입니다");
			default : 
					System.out.println("잘못입력했습니다");
	
			}
	}
		
		/*
		 * 주민번호를 입력받아 "남자" 인지 "여자" 인지 출력 (그 외에는 "사람이 아니다")
		 * 주민번호 입력 : 100000 - 3000000 
		 * 남자
		 * */
		public void practice1() {
			System.out.println("주민번호 입력 : ");
			char no = sc.nextLine().charAt(7);
			String result = "";
			
			switch(no) {
			case '1' :
			
			}
			
		}
		
		
		
		
		
		
		
		
		
		
}
