package com.kh.homework.person.model.vo;

public class Employee extends Person {
	
	private int salary;
	private String department;
	
	public Employee() {}
	public Employee(String name, int age, double height, double weight, int salary, String department) {
		super(name, age, height, weight);
		this.salary = salary;
		this.department = department;
		
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return super.toString() + salary + ", " + department;
	}
	
}
