package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.prctice.snack.controller.SnackController;

public class SnackMenu {
	Scanner sc = new Scanner(System.in);
	
	SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("�������� �Է��ϼ���.");
		System.out.print("���� : ");
		String kind = sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�� : ");
		String flavor = sc.nextLine();
		System.out.print("���� : ");
		int numOf = sc.nextInt();
		System.out.print("���� : ");
		int price = sc.nextInt();
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		
		sc.nextLine();
		System.out.print("������ ������ Ȯ���Ͻðڽ��ϱ�?(y/n) : ");
		char ch = sc.nextLine().charAt(0);
		if (ch == 'y' || ch == 'Y') {
//		String user = sc.nextLine();
//		if (user.toUpperCase().equals("Y")) {
			System.out.println(scr.confirmData());
		}
	}
}
