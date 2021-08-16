package com.kh.variable;

import java.util.Scanner;

public class E_KeyboardInput {
	public void inputScanner1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : "); // �׻� ������ �ޱ� ���� �ȳ� ���� �־�� ��
//		String name = sc.nextLine(); // nextLine() : ����ڿ��� ���ڿ��� �޾��ִ� �޼ҵ�
		String name = sc.next();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt(); // nextInt() : ����ڿ��� ������ �޾ƿ��� �޼ҵ�
		
		System.out.print("Ű�� �Է��ϼ���(�Ҽ��� ù°�ڸ����� �Է�) : ");
		double height = sc.nextDouble(); // nextDouble() : ����ڿ��� �Ǽ��� �޾ƿ��� �޼ҵ�
		
		System.out.println(name + "���� " + age + "���̸�, Ű�� " + height + "cm�Դϴ�.");
	}
	
	public void inputScanner2() {
		// next()�� nextLine() ��
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
//		System.out.print("���̸� �Է��ϼ��� : ");
//		int age = sc.nextInt();
		
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.nextLine(); // nextInt���� �� ������ �� ���Ͱ� buffer�� ���� ����, �� �� ����� buffer�� ���͸� �������� ���� �߻�
		
		// �ذ� ���1. next()�� �ּ� �޾��ֱ� -> ������ �ذ� ��� �ƴ�
		// ���⸦ �����ڷ� �ν��ϱ� ������ ���Ⱑ ���� ��� �� �� �Ϻθ� �о��
		// next()�� ����(�ٹٲ�)�� ��ȿ�� ������ ������ �ν����� �ʱ� ������ ���ۿ� �ִ� ���� �� �������� ��ȿ�h ���� �ƴ� ���ʹ� �����
		// next()�� �ٹٲ� �� �������� nextLine()�� �ٹٲ� ������
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.next(); 
		
		// �ذ� ���2. �ٹٲ��� ���ֱ� ���� nextLine() �߰�
//		sc.nextLine(); //�ٹٲ��� nextLine()�� �����ͷ� �ν��ϰ� ������. �������� ��������.
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.nextLine();
		
		// �ذ� ���3. �Ľ�(parsing)�ϱ� : ���ڿ��� �ٸ� �ڷ������� �ٲٴ� �� <-�����ϸ� ����õ, �������� ���Ŀ� �°� ���ִ� ���� ����(���̴� nextInt)
		System.out.print("���̸� �Է��ϼ��� : ");
		String strAge = sc.nextLine(); // String���� �޾ƿ� ���� ������, ���� �ۿ� �����ϸ� int���� nextInt()�� �޾��ִ� ���� ����
		// nextLine()���� �������� ���ۿ� ���� �� ������
		int age = Integer.parseInt(strAge); // ���ڿ��� strAge�� integer�� = ���ڷ� �ٲ��ִ� �޼ҵ�(Integer�� �ִ� parseInt �޼ҵ�)
//		Boolean.parseBoolean(""); // ���ڿ��� true/false �� �� �Ľ� ����, �������� ���ϴ� �͵� false�� ��� ����
//		Double.parseDouble("");
//		Float.parseFloat("");
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		String address = sc.nextLine();
		
		// + char �ޱ�
		System.out.print("������ �Է��ϼ���(M/F) : ");
		String strGender = sc.nextLine();
		char gender = strGender.charAt(0); // charAt(int index) : char �� StringŬ���� �ȿ� �ִ� �޼ҵ�
		//			  --------- -> String  //                          �� ���ڿ����� index��°�� �ִ� ���ڸ� ��ȯ�ϴ� �޼ҵ�                      
		
		System.out.println(name + "��(" + gender + ")�� " + age + "���̸�, ��� ���� " + address + "�Դϴ�.");
	}
}