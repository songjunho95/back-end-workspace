package com.kh.example.practice3;

import java.util.Scanner;

import com.kh.example.practice3.controller.Employee;

public class Application {
	
	Scanner sc = new Scanner(Sysytem.in);
	Employee viewEmployee = new Employee();
	EmployeeController employeeCotroller = new EmployeeController;

public static void main(String[] args) {
	
	
	
}

public int employeeMenu() {
	System.out.println("1. 사원 정보 추가 ");
	
	return 0;
	
}

public void inserEmp() {
	System.out.println("사원 번호 : ");
	int empNo =sc.nextInt();
	System.out.println("사원 이름 : ");
	String name = sc.nextLine();
	System.out.println("사원 성별 : ");
	char gender = sc.nextLine().charAt(0);
	System.out.println("전화 번호 : ");
	String phone = sc.nextLine();
	System.out.println("추가 정보를 더 입력하시겠습니까?(y/n) : ");
	char add = sc.nextLine().charAt(0);
	if(add == 'y') {
		System.out.println("사원 부서 : ");
		String dept = sc.nextLine();
		System.out.println("사원 연봉 : ");
		int salary = Integer.parseInt(sc.nextInt());
	    System.out.println("보너스 율 : ");
	    double bonus = sc.nextDouble();
	    employeeController.add(viewEmployee.getEmpNo(),
	    					   viewEmployee.getName(),
	    					   viewEmployee.getGender(),
	    					   viewEmployee,getPhone());
	    
	    
	    
	    
	    employeeController.add(empNo, name, gender, phone, dept, salary, bonus);
	} else {
		employeeController.add(empNo, name, gender, phone);
		
	}
		
	
	
	
	
	
}
// 수정할 데이터를 사용자에게 받는 메서드
public void upddateEmp() {
	
}

// 데이터를 출력하는 메서드
public void printEmp {
	System.out.println(employeeController.infro());
}



}


