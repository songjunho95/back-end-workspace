package com.kh.polymorphism.model.child;

import com.kh.polymorphism.model.parent.Employee;

public class Secretary extends Employee {
	
	private String boss;

	public Secretary() {
	}

	public Secretary(String name, int salary, String boss) {
		super(name, salary);
		this.boss = boss;
		
	}

	public Secretary(String boss) {
		this.boss = boss;
	}

	public String getBoss() {
		return boss;
	}

	public void setBoss(String boss) {
		this.boss = boss;
	}

	@Override
	public String toString() {
		return "Secretary [boss=" + boss + ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

