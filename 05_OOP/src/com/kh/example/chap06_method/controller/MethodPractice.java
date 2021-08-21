package com.kh.example.chap06_method.controller;

import com.kh.example.chap06_method.model.vo.Trainee;

public class MethodPractice {
	// �Ű����� ������ ��ȯ �� ������ ���� ����
	// 1. �Ű����� ���� ��ȯ �� ���� �޼ҵ�
	public void method1() {
		// ��ȯ �� x      �Ű����� x
		String str = "�Ű������� ��ȯ �� �� �� ���� �޼ҵ��Դϴ�.";
		System.out.println(str);		
//		return;
	}
	
	// 2. �Ű����� ���� ��ȯ �� �ִ� �޼ҵ�
	public int method2() { // This method must return a result of type int
		// ��ȯ �� o     �Ű����� x
		int i = 0;
//		return i;
		return 0;
	}
	
	// 3. �Ű����� �ְ� ��ȯ �� ���� �޼ҵ�
	public void method3(int num1, int num2) {
		// ��ȯ �� x			�Ű����� o
		// �Ű����� : ȣ���ϴ� �ʿ��� �ѱ� �����͸� �޾ƿ��� ����
		System.out.println(num1);
		System.out.println(num2);
		int sum = num1 + num2;
		System.out.println(sum);
	}
	
	// 4. �Ű����� �ְ� ��ȯ �� �ִ� �޼ҵ�
	public String method4(String name, int age) {
		String str = name + "���� " + age + "���Դϴ�";
		return str;
	}
	
	// ��ȭ 1. ��ȯ ���� �迭�� ��
	public char[] method5() {
		char[] chArr = {'j', 'a', 'v', 'a'}; // ����� ���ÿ� �ʱ�ȭ
		System.out.println("MethodPractice chArr : " + chArr); // chArr�ּҰ�
		
		return chArr;
	}
	
	// ��ȭ 2. ��ȯ ���� Ŭ������ ��
	public Trainee method6() {
		Trainee t = new Trainee("���ǰ�", 'H', "����", 98.5); // �ܺ� ��Ű���� �ִ� Ŭ���� ��ü ����
		System.out.println("MethodPractice t : " + t);
		
		return t;
	}
}
