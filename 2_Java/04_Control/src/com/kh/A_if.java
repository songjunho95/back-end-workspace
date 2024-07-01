
public class A_if {

	public static void main(String[] args) {
		
		A_If a = new A_If();
//		a.method3();
		a.method4();
		
	}

	
	public void method4() {
		
		System.out.println("숫자 입력 : ");
		int number = sc.nextInt();
		
		// 삼항 연산자
		String result = number > 0 ? "양수" : number == 0 ? "0이다" : "음수";
		System.out.println(result);
		
		//if문
		if(number > 0) {
			System.out.println("양수");
		} else {
			if(number == 0) {
				// if 문 중첩 가능! 가급적으로 좋은 코드는 x 
			}
			System.out.println("0이다");
			number == 0 ? "0이다" : "음수"
		}
		
		/*
		 * 사용자에게 점수(0~100)를 입력받아서 점수별로 등급 출력
		 * - 90점 이상은 A 등급
		 * - 90점 미만 80점 이상은 B 등급
		 * - 80점 미만 70점 이상은 C 등급
		 * - 70점 미만 60점 이상은 D 등급
		 * - 60점 미만 F 등급
		 * 
		 * */
		
		
		/*
		 * 세 정수를 입력했을 떄 짝수만 출력
		 * 
		 * num1 입력 : 3
		 * num2 입력 : 4
		 * num3 입력 : 6
		 * 4
		 * 6
		 * 
		 * */
		
		/*
		 * 정수 1개를 입력했을 떄 음(minus)/양(plus)/0(zero), 짝(even)/홀(odd) 출력
		 * 		 * */
		
		
		
		public void practice2() {
			
			
			
			
			
			
			
		}
		
		
		
		
		
	/*
	 * if - else if - else 문
	 * 
	 * if(조건식1) {
	 * 조건식 1이 참 (true)일 때 실행
	 * } else if (조건식2) {
	 * 조건식 1이 거짓 false 이면서 조건식2이 참 (true)일 때 실행
	 * } else {
	 * 	 조건식11, 조건식2 모두 거짓(false) 일때 실행
	 * }
	 * 
	 * 
	 * - else if는 수가 제한이 없다 
	 * 
	 * 
	 * */
}
}