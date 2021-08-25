package com.kh.homework.employee.controller;

import com.kh.homework.employee.model.vo.Employee;

public class EmployeeController {
	Employee e = new Employee();
	
	public void add(int empNo, String name, char gender, String phone) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
		
	}
	
	public void add(int empNo, String name, char gender, String phone, 
								String dept, int salary, double bonus) {
		
		add(empNo, name, gender, phone);
		e.setDept(dept);
		e.setSalary(salary);
		e.setBonus(bonus);
		
	}
	
	public void modify(String phone) {
		e.setPhone(phone);
	}
	
	public void modify(int salary) {
		e.setSalary(salary);
	}

	public void modify(double bonus) {
		e.setBonus(bonus);
	}
	
	public Employee remove() {
		e = null; // ��ü�� �⺻���� null�� ���� -> �������� e�� ����Ǿ� �ִ� �ּ� �� ����, �ּ� ���� �������鼭 JVM�� ��ü���� ����(������ �÷���)
		return e;
	}

	public String inform() {
		if (e == null) {
			return "��� �����Ͱ� �����ϴ�"; 
		} else {
			return e.printEmployee();
		} 
	}


}
