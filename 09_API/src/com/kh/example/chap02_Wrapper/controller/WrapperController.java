package com.kh.example.chap02_Wrapper.controller;

public class WrapperController {
	public void method() {
		int num1 = 10; // ���� Ÿ��
		
		Integer integer1 = new Integer(num1); // ����Ÿ�� -> Ŭ����Ÿ�� : boxing
		int num2 = integer1.intValue(); // Ŭ����Ÿ�� -> ����Ÿ�� : unboxing		
		
		// JDK1.5���� ����ڽ�/�����ڽ�
		Integer integer2 = num1; // auto-boxing
		int num3 = integer2; // auto-unboxing
		
	}
}
