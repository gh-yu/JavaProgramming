package com.kh.oprator;

public class D_Comparison {
	public void method( ) {
		int a = 10;
		int b = 25;
		boolean result1;
		boolean result2;
		boolean result3;
		
		result1 = (a == b); // false
		result2 = a <= b;   // true
		result3 = (a > b);  // false
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		//¦���� 2�� �������� ������ 0 -> b % 2 == 0
		//Ȧ���� 2�� �������� ������ 1 -> b % 2 == 1
		System.out.println("b�� ¦���ΰ�? : " + (b % 2 == 0));
		System.out.println("b�� Ȧ���ΰ�? : " + (b % 2 == 1));
		System.out.println("b�� Ȧ���ΰ�? : " + (b % 2 != 0));
		System.out.println("b�� Ȧ���ΰ�? : " + !(b % 2 == 0));
	}
}
