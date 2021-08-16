package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		// Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����", ����� �ƴϸ� "����� �ƴϴ�"�� ����ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.println(num > 0 ? "�����" : "����� �ƴϴ�");
	}
	
	public void practice2() {
		// Ű����� �Է� ���� �ϳ��� ������ ����̸� "�����", ����� �ƴ� ��� �߿��� 0�̸� "0�̴�", 0�� �ƴϸ� "������"�� ����ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.println(num > 0 ? "�����" : (num == 0 ? "0�̴�" : "������"));
	}
	
	public void practice3() {
		// Ű����� �Է� ���� �ϳ��� ������ ¦���̸� "¦����", ¦���� �ƴϸ� "Ȧ����"�� ����ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.println(num % 2 == 0 ? "¦����" : "Ȧ����");
	}
	
	public void practice4() {
		// ��� ����� ������ ���� ������������ �Ѵ�. �ο� ���� ���� ������ Ű����� �Է� �ް� 1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� : ");
		int people = sc.nextInt();
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		
		System.out.println("1�δ� ���� ���� : " + candy / people);
		System.out.println("���� ���� ���� : " + candy % people );
	}
	
	public void practice5() {
		// Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���. �� �� ������ 'M'�̸� ���л�, 'M'�� �ƴϸ� ���л����� ��� ó�� �ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г�(���ڸ�) : ");
		int num1 = sc.nextInt();
		System.out.print("��(���ڸ�) : ");
		int num2 = sc.nextInt();
		System.out.print("��ȣ(���ڸ�) : ");
		int num3 = sc.nextInt();
		sc.nextLine();
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		String strGender = gender == 'M' ? "���л�" : "���л�";
		boolean flag = true;
		if (!(gender == 'M' || gender == 'F')) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			flag = false;
		}
		if (flag) {
			System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
			double grade = sc.nextDouble();
		
			System.out.printf("\n%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.", num1, num2, num3, name, strGender, grade);
		}
	}
}
