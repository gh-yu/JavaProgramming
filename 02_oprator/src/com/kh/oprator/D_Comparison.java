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
		
		//짝수는 2로 나눴을때 나머지 0 -> b % 2 == 0
		//홀수는 2로 나눴을때 나머지 1 -> b % 2 == 1
		System.out.println("b가 짝수인가? : " + (b % 2 == 0));
		System.out.println("b가 홀수인가? : " + (b % 2 == 1));
		System.out.println("b가 홀수인가? : " + (b % 2 != 0));
		System.out.println("b가 홀수인가? : " + !(b % 2 == 0));
	}
}
