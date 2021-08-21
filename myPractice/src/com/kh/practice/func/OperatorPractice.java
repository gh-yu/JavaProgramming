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
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double grade = sc.nextDouble();
		
//		System.out.println();
		System.out.printf(
				"\n%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.", num1, num2, num3, name, strGender, grade);
	}
	
	public void practice5_1() {
		// Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���. �� �� ������ 'M'�̸� ���л�, 'M'�� �ƴϸ� ���л����� ��� ó�� �ϼ���
		// ���� M�� F �̿��� ���� �������� ����ó��
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
		// 1. flag ������ ���� ���๮�� ����, �߸� �Է����ڸ��� �߸� �Է��ϼ̽��ϴ� ���
//		String strGender = gender == 'M' ? "���л�" : "���л�";		
//		boolean flag = true;
//		if (!(gender == 'M' || gender == 'F')) {
//			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//			flag = false;
//		}
//		if (flag) {
//			System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
//			double grade = sc.nextDouble();
//		
//			System.out.printf(
//					"\n%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.", num1, num2, num3, name, strGender, grade);
//		}
		
		// 2. flag �� ���� �����ϰ� ���� ������ ��ø���� ���, equals�޼ҵ� �Ἥ ����ó��
		String strGender = gender == 'M' ? "���л�" : (gender == 'F' ? "���л�" : "�߸� �Է��ϼ̽��ϴ�");
		if (strGender.equals("�߸� �Է��ϼ̽��ϴ�")) {
			System.out.println(strGender);
		} else {
			System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
			double grade = sc.nextDouble();
		
			System.out.printf(
					"\n%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.", num1, num2, num3, name, strGender, grade);
		}
	}
	
	public void practice6() {
		// ���̸� Ű����� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����, ����(19�� �ʰ�)���� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		String strAge = age <= 13 ? "���" : (age > 19 ? "����" : "û�ҳ�");
		System.out.println("����� " + strAge + "�Դϴ�.");
	}
	
	public void practice6_1() {
		// ���̸� Ű����� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����, ����(19�� �ʰ�)���� ����ϼ���.
		// ������ �������� ����ó��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		if (age > 0) {
		String strAge = age <= 13 ? "���" : (age > 19 ? "����" : "û�ҳ�");
		System.out.println("����� " + strAge + "�Դϴ�.");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice7() {
		// ����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�,
		// �� ���� ���� �հ�(����+����+����)�� ���(3/0)�� ���ϼ���.
		// �� ������ ������ ����� ������ �հ� ���θ� ó���ϴµ�
		// �� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, �ƴ϶�� ���հ��� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
//		int avg = (kor + eng + math) / 3;
		double avg = sum / 3.0; // ��� ���� �ڵ�, ���� ���ÿ��� double������ ��µ�
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		
		String result = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "�հ�" : "���հ�";
		System.out.println(result);
//		System.out.println( kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "�հ�" : "���հ�");

//		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
//			System.out.println("�հ�");
//		} else {
//			System.out.println("���հ�");
//		}
	}
	
	public void practice8() { // ��� ���� Ǭ ����
		// �ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
//		String str = sc.nextLine();	
		char charStr = sc.nextLine().charAt(7); // ������ pId��
//		String gender = charStr == 2 || charStr == 4 ? "����" : "����"; // �߸��� �ڵ�, ���ڴ� ''�� ǥ���ؾ��� 2��� ������ �����ڵ�� 2��° ���ڿ� ��Ī

		String gender = charStr == '2' || charStr == '4' ? "����" : (charStr == '1' || charStr == '3' ? "����" : "�߸� �Է��ϼ̽��ϴ�.");
		System.out.println(gender);
		
	}
	
	public void practice9() {
		// Ű����� ���� �� ���� �Է� �޾� ������ ����(num1, num2)�� �����ϼ���.
		// �׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2 �ʰ��̸� true�� ����ϰ�
		// �ƴϸ� false�� ����ϼ���. (��, num1�� num2���� �۾ƾ� ��)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է� : ");
		int input = sc.nextInt();
		
		boolean result = input <= num1 || input > num2 ? true : false;
		System.out.println(result);
		
//		System.out.println(input <= num1 || input > num2); // ���, �� ������. ���׿����� ��� ���ص� ��
	}
	
	public void practice10() {
		// 3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();
		
//		System.out.println(num1 == num2 && num1 == num3 && num2 == num3); // num1 == num3 ��� ��
		System.out.println(num1 == num2 && num2 == num3);
//		boolean isTrue = ((num1 == num2) && (num2 == num3)); // ��� �ڵ�, ���׿����� ��� ���ص� ��
//		System.out.println(isTrue);	
	}
	
	public void practice11() {
		// A, B, C ����� ������ �Է� �ް� �� ����� ������ �μ�Ƽ�긦 ������ ������ ����Ͽ� ����ϰ�
		// �μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� "3000 �̻�". �̸��̸� "3000 �̸�"�� ����ϼ���.
		// (A ����� �μ�Ƽ��� 0.4, B ����� �μ�Ƽ��� ������, C ����� �μ�Ƽ��� 0.15)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A����� ���� : ");
		int a = sc.nextInt();
		
		System.out.print("B����� ���� : ");
		int b = sc.nextInt();
		
		System.out.print("C����� ���� : ");
		int c = sc.nextInt();
		
//		double incenA = 0.4;
//		double incenB = 0.0;
//		double incenC = 0.15;
//		
//		System.out.println("A����� ����/����+a : " + a + "/" + (a + (a*incenA)));
//		System.out.println((a + (a*incenA)) >= 3000 ? "3000 �̻�" : "3000 �̸�");
//		
//		System.out.println("B����� ����/����+a : " + b + "/" + (b + (b*incenB)));
//		System.out.println((b + (b*incenB)) >= 3000 ? "3000 �̻�" : "3000  �̸�");
//		
//		System.out.println("C����� ����/����+a : " + c + "/" + (c + (c*incenC)));
//		System.out.println((c + (c*incenC)) >= 3000 ? "3000 �̻�" : "3000  �̸�");
		
		// ��� ������ �ڵ�, �� ������ ��� + incenC ���� �ذ�
		
		System.out.println();
		
		double incenA = a * 1.4; // ��� �ؼ� ����
		double incenB = b;
		double incenC = c * 1.15;
//		double incenC = c + c * 0.15;
		
		System.out.println("A����� ����/����+a : " + a + "/" + incenA);
		System.out.println(incenA >= 3000 ? "3000 �̻�" : "3000 �̸�"); // "3000 �̻�", "3000 �̸�"�̶�� ���ڿ��� String ������ �����ϴ� ���� ȿ����
		
		System.out.println("B����� ����/����+a : " + b + "/" + incenB);
		System.out.println(incenB >= 3000 ? "3000 �̻�" : "3000  �̸�");
		
		System.out.println("C����� ����/����+a : " + c + "/" + incenC);
		System.out.println(incenC >= 3000 ? "3000 �̻�" : "3000  �̸�"); 
	}
}
