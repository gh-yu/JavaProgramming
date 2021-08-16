package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	// switch (���ǽ�) {
	// case 1: ���๮1; break; // ���ǽ��� ��� ���� 1�� ��� ����
	// case 2: ���๮2; break; // ���ǽ��� ��� ���� 2�� ��� ����
	// default: ���๮3;       // ���ǽ��� ��� ���� case�� �ش����� ���� �� ����
	// }
	// ���ǽ��� ��� ���� case���� ã�� ����� �����ϴ� ���ǹ�
	// �ش��ϴ� ���� case�� ���� ��� default�� ��ɹ� ����
	// case�� ���๮ ���̿��� �ݷ�(;)�� ���־�� ��
	// break�� ������ ������ �ʰ� ��� ����
	public void method1( ) {
		// ���� �� ���� ���� ��ȣ ���� 1���� �Է� �޾� ���� ��ȣ ���ڿ� �ش��ϴ� ����� ���� �� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int first = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int second = sc.nextInt();
		
		System.out.print("������(+,-,*,/) : ");
//		char op = sc.nextLine().charAt(0); // ����, nextInt()���� ������ ������ �� buffer�� �����ִ� ���͸� nextLine()���� �������鼭 ���ڿ��� �ǹ��ִ� �����Ͱ� ���µ� charAt()�ϰڴٰ� �ڵ带 ¥�� StringIndexOutofBoundsException ���ڿ��� �ε����� ������ ����ٴ� ������ ��
		// ���� ���� : next(), nextInt() �޼ҵ�� ���͸� �� �������� ������ ���ۿ� ���� ��������. �� �ڿ� ���͸� �������� nextLine()�� �´ٸ� ���ۿ� �����ִ� ���͸� �������� ��Ȳ �߻�. next() ������ next()�� �´ٸ� ���� �� �������� ������ ���� �߻����� ����
		// 1. int�� �޾ƿ� �� String���� �޾� �Ľ��ϱ�
		// 2. nextLine()���� �ٹٲ� ���ֱ�
		// 3. nextLine() ��� next()�� ����
		char op = sc.next().charAt(0); //���ڿ� �ϳ��� �޾Ƶ� �ż� next()�� �ٲٴ°� ���� ����
		
		int result = 0; // ���� ���� �� �ʱ�ȭ
		switch(op) { // op�� case�� �����ڴ�
		case '+' : 
			result = first + second;
			break;
		case '-' :
			result = first - second;
			break;
		case '*' :
			result = first * second;
			break;
		case '/' :
			if (second == 0) {
				System.out.println("0���δ� ���� �� �����ϴ�. ����� ��Ȯ���� �ʽ��ϴ�.");
			} else {
			result = first / second;
			}
			break; // �������� default ���� �����ٸ� switch�� ���������� ������ �� �־��൵ ������					
		default :  // default�� �ִµ� ���� break �� ������ default �� ���๮���� ���� �����
			System.out.println("���ÿ� ���� �������Դϴ�. ����� ��Ȯ���� �ʽ��ϴ�.");
		}
		
		System.out.printf("%d %c %d = %d", first, op, second, result);
	} // �޼ҵ�1�� ���� '}'���� ���� �� �޼ҵ尡 ������ ���� ȣ���� �޼ҵ�(�޼ҵ� �ȿ��� ȣ���� �� = switch�� ��) ������ ���ư�
	
	public void method2() {
		System.out.println("***** �ſ�� ���� ���� *****");
		System.out.println("���, �ٳ���, ������, Ű�� �ֽ��ϴ�! ���� ���ϰ� �������!");
		System.out.print("� ������ ������ �ñ��ϼ���? : ");
		
		Scanner sc = new Scanner(System.in);
		String fruit = sc.nextLine();
		
		// ��� 1000 / �ٳ��� 3000 / ������ 2000 / Ű�� 5000
		// ���� ������ ���, "�� ������ �ſ�� ���� ���Կ� �����ϴ� �Ф� ���� �ſ� ��Ʈ�� ��������!" ���� ���
		// ���� ��� : (ex) ����� ������ 1000���Դϴ�.
		
		int price = 0; // ���� ���� �� �ʱ�ȭ!! ���ֱ�
//		boolean flag = false; // boolean�� �⺻�� false
		boolean flag = true;
		switch (fruit) {
		case "���" :
			price = 1000;
			break;
		case "�ٳ���" :
			price = 3000;
			break;
		case "������" :
			price = 2000;
			break;
		case "Ű��" :
			price = 5000;
			break;
		default :
			System.out.println("�� ������ �ſ�� ���� ���Կ� �����ϴ� �Ф� ���� �ſ� ��Ʈ�� ��������!");
			//flag = true;
			flag = false;
		}
//		if (flag == false) {
//		if (!flag) { // flag�� false�϶� !false => true�� �ǰ� ���ǽ��� true�� �ż� if�� �� ����
//			// flag : false -> ����ǥ�� O
//			// flag : true -> ����ǥ�� X
//			System.out.printf("%s�� ������ %d���Դϴ�.", fruit, price); // �� ��¹��� switch�� �� �� case�� �ִ� ���� ����
//		}
		if (flag) {
			System.out.println(fruit + "�� ������ " + price + "���Դϴ�");
		}
	}
	
//	int lastDate; // �޼ҵ� �ٱ��� ���� ���� -> ��������, �ʱ�ȭ ���ص� �ڵ� �ʱ�ȭ ��
	
	public void method3() {
		// 1���� 12���� �Է¹޾� �ش��ϴ� ���� ������ ��¥ ���
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12���� �� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int lastDate = 0;
		boolean flag = true;
		switch (num) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			lastDate = 31;
			break;
		case 2 :
			lastDate = 28;
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			lastDate = 30;
			break;
		default :
			System.out.println("1~12������ ���ڸ� �Է��� �����մϴ�."); // 1~12 ������ ���ڰ� �ƴմϴ�.
			flag = false;
		}
		
		if (flag) {
			System.out.println(num + "����  ������ ��¥�� " + lastDate + "���Դϴ�.");
		}
	}
	public void method4( ) { // switch���� ���� ���̴� ���
		Scanner sc = new Scanner(System.in);
		
		// ȸ���� ���� �޴�
		System.out.println("1. ȸ�����");
		System.out.println("2. ȸ������");
		System.out.println("3. ȸ������");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			System.out.println("ȸ����� �޴��Դϴ�.");
			break;
		case 2:
			System.out.println("ȸ������ �޴��Դϴ�.");
			break;
		case 3:
			System.out.println("ȸ������ �޴��Դϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void method5( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �����ϱ�");
		System.out.println("2. �ſ�� ���ϰ���");
		System.out.println("3. ������ ��¥");
		System.out.println("4. �޴����");
		System.out.print("�޴� ��ȣ : ");
		int menu = sc.nextInt();
		
		// �޴� ��ȣ ���ÿ� ���� 1~4�� �޼ҵ� �ҷ�����, 1���� ������ 1�� �޼ҵ� ȣ��
		switch(menu) {
		case 1: 
			method1(); // ���� Ŭ���� �ȿ� �־ �˸���(��ü) ���� �ʿ� ���� �ٷ� �ٸ� �޼ҵ� ȣ�� ����
			break;
		case 2: 
			method2();
			break;
		case 3: 
			method3();
			break;
		case 4: 
			method4();
			break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	} // '}' �޼ҵ�5�� �� ������ �޼ҵ�5 �����ϸ� �޼ҵ�5�� �ҷ��� ���θ޼ҵ�� ���ư�
}
