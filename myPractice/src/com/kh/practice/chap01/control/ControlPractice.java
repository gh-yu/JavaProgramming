package com.kh.practice.chap01.control;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		// �Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ "�����޴��Դϴ�"��, ���� ��ȣ�� ������ "���α׷��� ����˴ϴ�."�� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("�Է� �޴��Դϴ�.");
			break;
		case 2:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 3:
			System.out.println("��ȸ �޴��Դϴ�.");
			break;
		case 4:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 7:
			System.out.println("���α׷��� ����˴ϴ�.");
			
		}
		
	}
}
