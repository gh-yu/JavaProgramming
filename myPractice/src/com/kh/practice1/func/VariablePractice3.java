package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	// Ű����� ����, ���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���.
	// ��� ���� -> ���� : ���� * ����
	//			  �ѷ� : (���� + ����) * 2
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double width = sc.nextDouble();
		
		sc.nextLine();
		System.out.print("���� : ");
		double length = sc.nextDouble();
		
		System.out.println("���� : " + (width * length));
		System.out.println("�ѷ� : " + ((width + length) * 2));
	}
}
