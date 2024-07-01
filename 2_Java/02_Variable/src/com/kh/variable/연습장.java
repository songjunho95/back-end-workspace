package com.kh.variable;




public class 연습장 {

	/*
	 * 변수 (Variable) : 값을 저장하는 "공간"
	 * */
	
	
	
	public static void main(String[] args) {
		
		// 실행할 메서드가 있는 클래스를 생성(new)
		A_Variable variable = new A_Variable();
		
		// 생성한 클래스로 메서드 실행(호출)
		variable.printValue();
		variable.variableTest();
		variable.constant();

	}

	public void printValue() {
		
		// 원의 둘레와 원의 넓이를 출력하시오.
		// 원의 둘레 = 반지름 x 2 x3.141592
		// 원의 넓이 = 반지름 x 반지름 x 3.141592
		
		// 변수를 사용하지 않고
		System.out.println(30 * 2 * 3.141592);
		
		
		
	}
	
	
	
	
}
