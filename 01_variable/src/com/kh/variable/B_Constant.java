package com.kh.variable;

public class B_Constant {
	public void finalConstant() {
		int age;
		final int AGE; //상수는 대문자로 상수임을 구분
		
		age = 20;
		AGE = 20;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		System.out.println("----------------------");
		
		// 변수 값 변경
		age = 30;
//		AGE = 30;
		// The final local variable AGE may already have been assigned
		// : 상수 값 변경 불가
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
	}
}