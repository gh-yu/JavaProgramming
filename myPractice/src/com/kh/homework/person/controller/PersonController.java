package com.kh.homework.person.controller;

import com.kh.homework.person.model.vo.Employee;
import com.kh.homework.person.model.vo.Student;

public class PersonController { // s 객체배열에 저장된 Student객체 수와 e 객체배열에 저장된 Employee객체 수를 int[] 배열 각 인덱스에 저장

	Student[] s = new Student[3];
	Employee[] e = new Employee[10];
	
	public int[] personCount() {
		
		int sCount = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				sCount++;
			}
		}
		
		int mCount = 0;
		for (int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				mCount++;
			}
		}
		
		int[] pNum = {sCount, mCount};
		return pNum;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
		
	}

	public Student[] printStudent() {
		return s;
	}


	public void insertEmployee(String name, int age, double height, double weight, int salary, String department) {
		
		e[personCount()[1]] = new Employee(name, age, height, weight, salary, department);
	}
	
	public Employee[] printEmployee() {
		return e;
	}

}
