package com.kh.overriding;

public class Application {

	public static void main(String[] args) {

		
		System.out.println(cusomer1);
		System.out.println(customer2);
		
		System.out.println(customer1 == custoner2); // false
		System.out.println(customer1.equals(customer2)); //false -> true
		
		
		VIPCustomer customer3 = new VIPCustomer("김진주");
		VIPCustomer customer4 = new VIPCustomer("김진주");
		
		System.out.println();
		
		
		// 등급은 ~~ 이며, 지불해야 하는 금액은 ~ 원이며 , 적립된 포인트는 ~~ 점 입니다.
		System.out.printf();
		
		
		
	}

}
