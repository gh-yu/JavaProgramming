package com.kh.test;

import java.util.Scanner;

public class TestExam {
	
	public void methodTest1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 1 : ");		
		int num1 = sc.nextInt();		
		System.out.print("���� 2 : ");		
		int num2 = sc.nextInt();		
		sc.nextLine();		
		System.out.print("�����ȣ(+. -, *, /, %)�� �Է��Ͻÿ� : ");		
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
			System.out.println("�����ȣ�� �߸� �Է��Ͽ����ϴ�.");		
			return;		
		}
		
		System.out.println("���� ��� : " + result);
	}
	
	public void methodTest2() {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
