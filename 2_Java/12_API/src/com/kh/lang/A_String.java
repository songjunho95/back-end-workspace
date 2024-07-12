package com.kh.lang;

import java.util.StringTokenizer;

public class A_String {

	
	
	
	
	
	
	
	
	public void method4() {
		
		String str = "HTML,CSS,JavaScript,MySQL,Java,JDBC,Servlet,JSP,JQery,MyBatis,Spring,React";
		
		// 1. String 클래스의 split 메서드 이용
		// 	  split(String regex) : String[]
		// 	  입력받은 구분자로 문자열을 분리해서 문자열의 배열로 담아서 리턴
		String[] strArr = str.split(",");
		System.out.println("과목 개수 : " + strArr.length);
		for(String s : strArr) {
			System.out.println(s);
		}
		
		// 2. StringTokenizer 객체이용
		StringTokenizer st = new StringTokenizer(str, ",");
		
		// hasMoreTokens : 남아 있는 토큰이 있는지 확인
//		System.out.println(st.hasMoreTokens());
		// nextToken : 토큰을 하나씩 꺼내옴
//		System.out.println(st.nextToken());
		
		
		// countTokens : 꺼내지 않고 남아있는 토큰의 수를 확인
		System.out.println("과목 개수 : " + st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("꺼내고 남은 과목 개수 : " + st.countTokens());
		
		
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {


		
	
	}

}
