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
		e = null; // 객체의 기본값인 null로 수정 -> 참조변수 e에 저장되어 있는 주소 값 날라감, 주소 연결 끊어지면서 JVM이 객체공간 삭제(가비지 컬렉터)
		return e;
	}

	public String inform() {
		if (e == null) {
			return "사원 데이터가 없습니다"; 
		} else {
			return e.printEmployee();
		} 
	}


}
