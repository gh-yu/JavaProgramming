package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	
	Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	
	
	public StudentController() {
		
		sArr[0] = new Student("��浿", "�ڹ�", 100);
		sArr[1] = new Student("�ڱ浿", "���", 50);
		sArr[2] = new Student("�̱浿", "ȭ��", 85);
		sArr[3] = new Student("���浿", "����", 60);
		sArr[4] = new Student("ȫ�浿", "�ڹ�", 20);
		
	}
	
	public Student[] printStudent() {
		
		return sArr;
	}
	
	public int sumScore() {
		
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += sArr[i].getScore();
		}
		
		return sum;
	}
	
	public double[] avgScore() {
		
//		double[] dArr = new double[2];
		
//		dArr[0] = sumScore(); // �ڵ� ����ȯ int -> double
//		dArr[1] = sumScore() / sArr.length;	
		
		double[] dArr = {sumScore() , sumScore()/sArr.length};
		
		return dArr;
	}
	

}