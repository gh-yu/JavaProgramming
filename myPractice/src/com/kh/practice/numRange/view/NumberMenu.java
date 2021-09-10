package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
//		System.out.print(num1 + "은(는) " + num2 + "의 배수인가? ");
		try {
//			System.out.println(num1 + "은(는) " + num2 + "의 배수인가? " + new NumberController().checkDouble(num1, num2));
			boolean result = new NumberController().checkDouble(num1, num2);
			System.out.println(num1 + "은(는) " + num2 + "의 배수인가? " + result);
		} catch (NumRangeException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
		
	}

}
