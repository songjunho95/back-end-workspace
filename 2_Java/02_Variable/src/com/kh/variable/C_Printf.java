package com.kh.variable;

public class C_Printf {

	public static void main(String[] args) {

		// System.out.print(출력하고자하는값); -- 출력만 함 (줄바꿈 발생 X)
		// System.out.println(출력하고자하는값); 출력 후 줄바꿈 발생 O
		System.out.print("hello\n");
		System.out.println("hello");
		
		System.out.println("----------------------");
		
		// System.out.printf("출력하고자하는형식(포맷)", 출력하고자하는값, 값, ...);
		// 출력하고자하는 값들이 제시한 형식에 맞춰서 출력만 진행
		int iNUM1 = 10;
		int iNUM2 = 20;
		
		// 10% 20%
		
		System.out.print(iNUM1 + "% ");
		System.out.println(iNUM2 + "%");
		
		System.out.println(iNUM1 + "% " + iNUM2 + "%" );
		
		/*
		 * 포맷에 쓰이는 키워드
		 * %d : 정수
		 * %f : 실수
		 * %c : 문자
		 * %s : 문자열(문자도 가능)
		 * */
		
		
		System.out.printf("%d%% %d%%", iNUM1, iNUM2);
		System.out.println();
		System.out.println("----------------------");
		
		System.out.printf("%5d\n", iNUM1); //5칸 공간 확보 후 양수 오른쪽 정렬 
		System.out.printf("%-5d\n", iNUM2); // 5칸 공각 확보 후 음수 왼쪽 정렬 
		
		System.out.println("-------------------------");
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f\t%f\n", dNum1, dNum2); // 무조건 소주점 아래 6번째 자리까지 
		System.out.printf("%.3f\t%.2f\n", dNum1, dNum2);
		
		System.out.println("------------------------");
		
		char ch = 'a';
		String str = "Hello";
		
		// a      Hello a 
		System.out.printf("%c  \t%s %c",ch, str, ch); //a	Hello  a
		System.out.printf("%C %S", ch, str); // A HELLO --> 대문자로만 출력 
		
		
		
	}
}


