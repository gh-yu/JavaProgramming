package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	// ���� ���ڿ� ���� Ű����� �Է� �޾� ���ڿ��� �տ��� �� ���� ����ϼ���.
	public void printChar() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String strCh = sc.nextLine();
		char ch1 = strCh.charAt(0);
		char ch2 = strCh.charAt(1);
		char ch3 = strCh.charAt(2);
		
		System.out.println("ù ��° ���� : " + ch1);
		System.out.println("�� ��° ���� : " + ch2);
		System.out.println("�� ��° ���� : " + ch3);
	}
}
