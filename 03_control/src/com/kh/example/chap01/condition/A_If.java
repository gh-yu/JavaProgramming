package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If {
	// �ܵ� if��
	//		if(���ǽ�){
	//			������ ����;
	//		}
	//		���ǽ��� ��� ���� ��(true)�̸� { } �ȿ� �ִ� �ڵ� ����
	//		���ǽ��� ��� ���� ����(false)�̸� { } �ȿ� �ִ� �ڵ� �����ϰ� �Ѿ
	
	// if~else��
	// 		if(���ǽ�) {
	//			������ ����1;
	//		} else {
	//			������ ����2;
	//		}
	//		�� �� �� ���� �����ϴ� ���ǹ�
	//		���ǽ��� ��� ���� ��(true)�̸� if �ȿ� �ִ� ���๮��1 ����
	//		���ǽ��� ��� ���� ����(false)�̸� else �ȿ� �ִ� ���๮��2  ����
	
	// if~else if~else��
	//		if(���ǽ�){
	//			������ ����1;
	//		} else if(���ǽ�){
	//			������ ����2;
	//		} else{
	//			������ ����3;
	//		}
	//		���� ������ �� �� �ִ� ���ǹ�
	//		if���� ���ǽ��� ��� ���� ��(true)�̸� if �ȿ� �ִ� ���๮��1 ����
	//		if���� ���ǽ��� ��� ���� ����(false)�̸鼭 else if���� ���ǽ� ��� ���� ��(true)�̸� else if �ȿ� �ִ� ���๮��2 ����
	//		�� �� ����(false)�̶�� ���๮��3 ����
	//		==> if������ true��� ����Ǿ����� �� �Ʒ� ������� ���ǽ��� true�� �ϴ���/�����ϴ��� ������� ����
	//		==> else if���� ���� ���� �� �ְ�, else���� ���� ���� ����
	public void method1() {
		// Ű����� �Է��� ���ڰ� ������� �������� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� �� �Է� : ");
		int num = sc.nextInt();
		
		// ���� if�� ���� <= ����° if������ ��� �˻�
		// �������
//		if (num > 0) {
//			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�");
//		}
//		// 0����
//		if (num == 0) {
//			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�");
//		}
//		// ��������
//		if (num < 0) {
//			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�");
//		}
		
		// if-else�� ����
//		if (num > 0) {
//			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�");
//		} else { // num <= 0
//			if (num == 0) {
//				System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�");
//			}
//			else {
//				System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�");
//			}
//		}
		
		// if-else if-else ����
		if (num > 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�");
		} else if (num == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�");
		}
		
		// switch������ �ٲ� �� ������?
//		switch(num) {
//		case num > 0 :		
//		}
		// if���� switch�� �ٲٱ� ����
	}
	
	public void method2() {
		// Ű����� �Է��� ���ڰ� ¦������ Ȧ������ ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		// ���� if�� ����
//		if (num % 2 == 0) {
//			System.out.println("¦���Դϴ�");
//		}
//		if (num % 2 != 0) { // (num % 2 == 1)�� �ϸ� ���� �־����� ��°� �ȳ���
//			System.out.println("Ȧ���Դϴ�");		
//		}
		
		// if-else��
//		if (num % 2 == 1) { 
//			System.out.println("Ȧ���Դϴ�");
//		} else {
//			System.out.println("¦���Դϴ�");
//		}
		// (num % 2 == 1)�� �ϸ� ���� �־����� ��� ¦���� ����
		
		// if-else if-else��
		if (num % 2 == 0) {
			System.out.println("¦���Դϴ�");
		} else if (num % 2 != 0) {
			System.out.println("Ȧ���Դϴ�");
		}
	}
	public void method3() {
		// ����ڿ��� �ֹι�ȣ�� �޾Ƽ� �������� �������� �Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ �Է�(-����) : ");
		// 020114-4000000
//		String str = sc.nextLine();
//		char pId = str.charAt(7);
		char pId = sc.nextLine().charAt(7);
//		int gender = pId - '0'; // char ���ڸ� int ������ �ٲ㼭 �ϴ� ��ĵ� ����
		
		if (pId == '2' || pId == '4') { //pId�� ���� ������ ���� ''����� �ش� ���ڷ� �ν�. '2', '4'�� 50, 52
			System.out.println("�����Դϴ�");
		}
		else if (pId == '1' || pId == '3') {
			System.out.println("�����Դϴ�");
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}
//		if (gender == 2 || gender == 4) { // ���ڷ� ����Ǿ� �ִ� ���ڸ� ���� ���ڷ� �ٲ�����
//			System.out.println("�����Դϴ�");
//		}
//		else if (gender == 1 || gender == 3) {
//			System.out.println("�����Դϴ�");
//		}
//		else {
//			System.out.println("�߸� �Է��ϼ̽��ϴ�");
//		}
	}
	
	public void method4() {
		// �̸��� �Է��Ͽ� �������� Ȯ��
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
//		if(name == "�ڽſ�") { // ���ڿ��� �񱳴� == ���� �Ұ���, equals()�� ���� //charAt()�� ���� �ϳ��ϳ� ������ �����ؼ� ���ص� �ɵ�
//		if(name.equals(�ڽſ�)) { // name�� �ڽſ�� ����?
		if("�ڽſ�".equals(name)) { // �ڽſ�� name�̶� ����?
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("������ �ƴմϴ�");
		}
	}
}
