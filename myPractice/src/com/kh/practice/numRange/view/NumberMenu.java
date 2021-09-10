package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
//		System.out.print(num1 + "��(��) " + num2 + "�� ����ΰ�? ");
		try {
//			System.out.println(num1 + "��(��) " + num2 + "�� ����ΰ�? " + new NumberController().checkDouble(num1, num2));
			boolean result = new NumberController().checkDouble(num1, num2);
			System.out.println(num1 + "��(��) " + num2 + "�� ����ΰ�? " + result);
		} catch (NumRangeException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
		
	}

}
