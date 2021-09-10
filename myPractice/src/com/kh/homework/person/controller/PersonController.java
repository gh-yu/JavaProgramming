package com.kh.homework.person.controller;

import com.kh.homework.person.model.vo.Employee;
import com.kh.homework.person.model.vo.Student;

public class PersonController { // s ��ü�迭�� ����� Student��ü ���� e ��ü�迭�� ����� Employee��ü ���� int[] �迭 �� �ε����� ����

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
