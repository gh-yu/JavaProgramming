package com.kh.example.chap03.branch;

import java.util.Scanner;

public class A_Break {
	public void method() {
		// ���ڿ��� �Է� �޾� ���� ������ ����ϴ� �ݺ� ���α׷�
		// ��, end�� �ԷµǸ� �ݺ� ����
		Scanner sc = new Scanner(System.in);
		
//		String str = "";
//		while (!str.equals("end")) {
//			System.out.print("���ڿ� �Է� : ");
//			str = sc.nextLine();
////			int length = str.length();
//			System.out.println("���� ���� : " + str.length());
//		}
		
		while(true) { // break�� ����ؼ� �ݺ� �����ϱ�
			System.out.print("���ڿ� �Է� : ");
			String str = sc.nextLine();
			
			if(str.equals("end")) {
				break;
			}
			
			System.out.println("���� ���� : " + str.length());
		}
	}
}
