package com.kh.example.chap04_Math.controller;

import java.util.Random;

public class MathController {
	public void method() {
//		Math.random(); // Math Ŭ���� �� �޼ҵ� �� static�޼ҵ� -> ��ü ���� ���� Ŭ������. ���� ����
		// MathŬ���� : ���� ������ �ϱ⿡ ������ �޼ҵ���� ��Ƴ��� Ŭ����
		// �̱��� ���� ����
		//		static�� �̿��� ���ø����̼��� ������ �� �� �� ���� �ν��Ͻ��� ����� �޸� �Ҵ�
		//		�� �� �� ���� �ν��Ͻ��� ����ϰԲ� ���� ����
		//		-> ������ private, ��� public static
		
		double num = 4.949;
		double num2 = 4.123;
		
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Math.abs(num)); // ���밪
	
		System.out.println(Math.ceil(num)); // �ø�
		System.out.println(Math.ceil(num2));
		
		System.out.println(Math.round(num)); // �ݿø�, int�� ��ȯ
		System.out.println(Math.round(num2));
		
		System.out.println(Math.floor(num2)); // ����
		System.out.println(Math.floor(num2));
		
		int random = (int)(Math.random() * 4) + 1;
		System.out.println(random);
		
		Random r = new Random(); // RandomŬ����
		System.out.println(r.nextInt(4) + 1); // 
		// r.nextInt() -> int ���� ���� �ִ� ��� �� �������� ������
		// r.nextInt(4) -> 0~4������ �� �������� ������
		// r.nextInt(4) + 1 -> 1~4������ �� �������� ������
		
		System.out.println(Math.rint(num)); // ����� ��
		System.out.println(Math.rint(num2));
		
		System.out.println(Math.sqrt(3)); // ������
		System.out.println(Math.pow(2, 3)); // �ŵ�����power 2�� 3��
		
		System.out.println(Math.max(10, 4)); // �� �Ű����� ũ�� ���Ͽ� max�� ��ȯ
		System.out.println(Math.min(10, 4)); // ũ�� ���Ͽ� min�� ��ȯ
	
	}
	
}
