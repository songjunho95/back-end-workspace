package com.kh.test5;

import java.util.List;
import java.util.Scanner;

import com.kh.test5.model.Food;

public class Application {

	static Scanner sc = new Scanner("");
	static Food food = new Food();
	

	
	public static void main(String[] args) {
		
	

		
		while(true) {
		
				System.out.println("=== 음식 메뉴 리스트===");
				System.out.println("1. 음식 추가 ");
				System.out.println("2. 음식 정보 ");
				System.out.println("3. 음식 삭제");
				System.out.println("4. 프로그램 종료 ");
				System.out.println("번호선택 : ");
				int num = Integer.parseInt(sc.nextLine());
				
				
				
				
		if( num == 1 ) {
			
			System.out.println("추가할 음식 입력");
			int Food1 = Integer.parseInt(sc.nextLine());
			System.out.println("칼로리 입력 : ");
			int Food2 = Integer.parseInt(sc.nextLine());
			System.out.println("음식 정보가 추가 되었습니다.");
		}		
		
		if( num == 2) {
			
			System.out.println(food);
			
			
			
			
		}
		
		if( num == 3) {
			System.out.println("삭제하고 싶은 음식 선택");
			Integer.parseInt(sc.nextLine());
			food = null;
			
		}
	
		
		if(num == 4) {
			
			break;
		}
		
		
		
		}	
	}
	
}


