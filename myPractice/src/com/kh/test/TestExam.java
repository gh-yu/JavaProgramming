package com.kh.test;

import java.util.Scanner;

public class TestExam {
	
	public void methodTest1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 : ");		
		int num1 = sc.nextInt();		
		System.out.print("정수 2 : ");		
		int num2 = sc.nextInt();		
		sc.nextLine();		
		System.out.print("연산기호(+. -, *, /, %)를 입력하시오 : ");		
		char ch = sc.nextLine().charAt(0);		
		
		int result = 0;		
		if (ch == '+') {			
			result = num1 + num2;		
		} else if (ch == '-') {			
			result = num1 - num2;
		} else if (ch == '*') {			
			result = num1 * num2;		
		} else if (ch == '/') {			
				result = num1 / num2;		
		} else if (ch == '%') {			
			result = num1 % num2;	
		} else {			
			System.out.println("연산기호를 잘못 입력하였습니다.");		
			return;		
		}
		
		System.out.println("연산 결과 : " + result);
	}
	
	public void methodTest2() {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
