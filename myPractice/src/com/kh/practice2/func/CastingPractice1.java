package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	// Ű����� ���� �ϳ��� �Է� �޾� �� ������ �����ڵ带 ����ϼ���
	public void method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		int unicode = ch; // ���� �ڷ����� ū �ڷ������� ��ȯ�ϴ� �Ŷ� ��� �����൵ �ڵ� ����ȯ
		
		System.out.println(ch + " unicode : " + unicode);
//		System.out.println(ch + " unicode : " + (int)ch); // ���� int ���� �� ���� print�Ҷ� ����ȯ�ؼ� ��� ����
	}
}
