package com.kh.practice.token.menu;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainMenu() {
		
		while (true) {
			System.out.println("1. ���� ���ڿ�");
			System.out.println("2. �Է� ���ڿ�");
			System.out.println("3. ���α׷� ������");
			
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch (menuNum) {
			case 1 : tokenMenu(); break;
			case 2 : inputMenu(); break;
			case 3 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
			
	}


	private void tokenMenu() {
		
		String str = "J a v a P r o g r a m ";
		System.out.println("��ū ó�� �� ���� : " + str);
		System.out.println("��ū ó�� �� ���� : " + str.length());
		
		String str2 = tc.afterToken(str);
		System.out.println("��ū ó�� �� ���� : " + str2);
		System.out.println("��ū ó�� �� ���� : " + str2.length());
		System.out.println("��� �빮�ڷ� ��ȯ : " + str2.toUpperCase());
		System.out.println();
	}
	
	private void inputMenu() {
		
		System.out.print("���ڿ��� �Է����ּ��� : ");
		String inputStr = sc.nextLine();
		
		String str = tc.firstCap(inputStr);
		System.out.println("ù ���� �빮�� : " + str);
		
		System.out.print("ã�� ���ڸ� �ϳ� �Է��ϼ��� : ");
		char findCh = sc.nextLine().charAt(0);
		
		int countCh = tc.findChar(inputStr, findCh);
		System.out.println(findCh + " ���ڰ� �� ���� : " + countCh);
		
	}

}
