package com.kh.example.practice3.controller;

import com.kh.example.practice3.Application;

public class Employee {

	private Employee employee = new Employee();
	Employee viewEmployee = new Employee();
	
	// 오버 로딩!! 
	
	
	public void add(int empNo, String name, char gender, String phone, String phone) {
		employee.setEmpNo(empNo);
		employee.setName(name);
		employee.setGender(gender);
		employee.setPhone(phone);
		employee.setDept(dept);
		employee.setSalary(salary);
		employee.setBonus(bonus);
		
	}

	public static void main(String[] args) {
		Application app = new Application();
		boolean 
		white(true) {
		int select = app.employeeMenu();
		switch(select) {
		case 1:
			System.out.println("1번 선택!");
			break;
		case 2:
			app.upddateEmp();
			break;
		case 3:
			app.printEmp();
			break;
		case 9:
			System.out.println("프로그램을 종료합니다.");
			check = false;
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요~");
		
		}
		app.employeeMenu();
		
		}
		
		
		
	}

	// 메인 메뉴를 출력하는 메서드
	public int employeeMenu() {
		System.out.println("1. 사원 정보 추가");
		System.out.println("2. 사원 정보 수정");
		System.out.println("3. 사원 정보 출력");
		System.out.println("9. 프로그램 종료");
		System.out.println("메뉴 번호를 누르세요 : ");
		return sc.nextInt();
	}
	
	
	// 저장할 데이터를 사용자에게 받는 메서드
	public void insertEmp() {
		System.out.print("사원 번호 : ");
		// int
		viewEmplyoee.setEmpNo(Integer.parseInt(sc.nextLine()));
		System.out.print("사원 이름 : ");
		viewEmployee.setName(sc.nextLine());
		
		System.out.println();
	}
	
	
	
	
	
	
	// 수정할 데터를 사용자에게 받는 메서드 
	public void updateEmp() {
		System.out.println("사원의 어떤 정보를 수정하시겠습니까? ");
		System.out.println("1. 전화 번호 ");
		System.out.println("2. 사원 연봉 ");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요 : ");
		int select = Integer.parseInt(sc.nextLine());
		
		switch(select) {
		case 1:
			System.out.println("전화 번호 입력 : ");
			String phone = sc.nextLine();
			employeeController.modify(phone);
			break;
		case 2:
			System.out.println("사원 연봉 입력 : ");
			int salary = Integer.parseInt(sc.nextLine());
			employeeController.modify(salary);
			break;
		case 3:
			System.out.println("보너스 율 입력 : ");
			double bonus = Double.parseDouble(sc.nextLine());
			employeeController.modify(bonus);
			break;
		case 9:
			
			break;
		
		
		}
	}
	
	
	
	
	
	// 데이터를 출력하는 메서드 
	public void printEmp() {
		
	}
	
	
	
	
	
	
}
