package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
//	while(���ǽ�) {
//		���๮��;
//		[������ or �б⹮;]
//	}
//	���ǽ� Ȯ�� -> (���ǽ��� true�� ��) ���๮�� ���� -> ���ǽ� Ȯ�� -> (�ݺ�)
//	���ǽ��� ����� false�� �� ������ �ݺ�
	
//	do {
//		���๮��;
//		[������ or �б⹮;]
//	} while (���ǽ�); // �����ݷ� �� �ٿ��ֱ�
//	���๮�� -> ���ǽ� Ȯ�� -> (���ǽ��� true�� ��) do�� ���๮�� ���� -> ���ǽ� Ȯ�� -> (�ݺ�)
//	���ǽ��� ����� false�� �� ������ �ݺ�
//	do-while�� ������ �� �� �̻� ���� <- While�� do-While�� ������ 
	public void method1() {
		// 1���� 5���� ���
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++; // ������ ������ �ʱ�!
		}
	}
	
	public void method1_1() {
		// �ڱ� �Ұ� �ټ� �� �ϱ� : �� �̸��� �����־�
		int i = 0;
		while(i < 5) {
			System.out.println("�� �̸��� �����־�");
			i++;
		}
	}
	
	public void method2() {
		// 5���� 1���� ���
		// ��� 1
		int i = 5;
		while (i > 0) {
			System.out.println(i);
			i--;
		}
		// ��� 2
//		int i = 0;
//		while (i < 5) {
//			System.out.println(5 - i);
//			i++;
//		}
	}
	
	// A_ForŬ������ for���� while������ �ٲ� ����
	
	public void method3() {
		// ���ڿ��� �Է¹޾� �ε��� ���� ���� ���
		// java
		// 0 : j
		// 1 : a
		// 2 : v
		// 3 : a
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		// ���ڿ��� ���� : String Ŭ������ length() <- ��ȯ�� : int
//		int length = str.length();
		// apple
//		int i = 0;
//		while (i < 5) {
//		while (i < length)
//		while (i < str.length()) {
//			char ch = str.charAt(i); // while�� �ȿ� �ִ� ���� ���� -> while�� ���鼭 ��� ����Ǿ ���� ���� 
//			System.out.println(i + " : " + ch);
//			i++;
//		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
		}
	}
	
	public void method4() {
		// while�� ��ø
		// ������
		int i = 2;
		
//		return; // �ؿ� �ڵ� ���� �ȵǰ� �޼ҵ� ���� -> ���� ȣ������ �޼ҵ�� ���ư�
		
		while(i <= 9) {
			int j = 1;
			while (j < 10) {
				System.out.println(i + " X " + j + " = " + i*j);
				j++;
			}
			i++;
		}
		
//		return; // ���� ȣ������ �޼ҵ�� ���ư��� ���� (return �ڿ� ���� ������ ���� �� ������ ���ư�)
				// ��� �޼ҵ� ���� ����, �����Ǿ� �ִ� ��/ return ������ �޼ҵ尡 ����Ǵ� ��
	}
	
	public void method5() {
		// ���� ������� �𸦶� while���� ����
		// 9 ������ ���� ������ �� ���� (�޴� ����-������ ���) �ݺ� (while���� ���� �༭ 9�� �ƴҶ��� �ݺ��ϰ�)
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0; // �ʱ��, 0���� �ʱ�ȭ�ϰ� while�� �ȿ��� menuNum�� �Է°� ������ �����ϱ� ������ 9�� ������(�Է��ص�) ó�� 1���� while�� ���๮�� ������
		while (menuNum != 9) {
			System.out.println("1. 1~5���� ���");
			System.out.println("2. 5~1���� ���");
			System.out.println("3. ���ڿ� �ε���");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
//			int menuNum = sc.nextInt(); // while�� ���� �� menuNum ���� ���� �����ָ� while�� ���ǽĿ��� ������ ���� ������ ���� ��, while�� ���� �� ���� ��������� ��. ���� �ߺ� ���� �Ұ�
			menuNum = sc.nextInt();
			
			switch (menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("�����մϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
//		if (menuNum == 9) {
//			System.out.println("�����մϴ�.");
//		} // �ʿ���� ����
	}
	
	public void method5_1() {
		// do~while��
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0;
		do {
			System.out.println("1. 1~5���� ���");
			System.out.println("2. 5~1���� ���");
			System.out.println("3. ���ڿ� �ε���");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
//			int menuNum = sc.nextInt(); // �� ���� ������ do{} ���� �ȿ����� ��ȿ��
										// do{} �ٱ��� ��������� do{} �ٱ������� �� �� ����, do �ٱ� while�� ���ǽĿ��� ���� �����
			menuNum = sc.nextInt();
			
			switch (menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("�����մϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		} while (menuNum != 9);		
	}	
	
	public void method6() {
		// method5 �ٸ� ����
		// return ����Ͽ� 9 �������� while�� �ݺ� ������ �޼ҵ� �����Ű��
		Scanner sc = new Scanner(System.in);
			
		while (true) {// ������ �� �ִ� ������ ���� ����, while�� �� ���ѹݺ��� ��
			System.out.println("1. 1~5���� ���");
			System.out.println("2. 5~1���� ���");
			System.out.println("3. ���ڿ� �ε���");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
			int menuNum = sc.nextInt(); // while�� ���ǽ� ����� true�� ��� ������ �ʱ�� ���� while�� �ȿ� ���� �����ص� ���� ���� ���ư�
				
			switch (menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
//			case 9 : System.out.println("�����մϴ�."); break; // �� �ڵ�� �ϸ� while�� ���� ���� ���� ���ѹݺ�
			case 9 : System.out.println("�����մϴ�."); return; // break�� �ƴ� return�� �־� �޼ҵ� ����ǰ� ��
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}	
		}	
	}
	
	public void method6_1() {
		// method6�� while�� -> do~while�� �������� �ٲٱ� �ǽ�
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. 1~5���� ���");
			System.out.println("2. 5~1���� ���");
			System.out.println("3. ���ڿ� �ε���");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
			int menuNum = sc.nextInt();
			
			switch (menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("�����մϴ�."); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		} while (true);
	}
	
	public void method7() {
		// A_FOr method8�� while��
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �� �� : ");
		int row = sc.nextInt();
		
		int i = 1;
		while (i <= row) {
			int j = 1;
			while (j <= 5) {
					System.out.print("*");
					j++; // �������� while�� �ȿ�
			}
			System.out.println();
			i++;
		}	
	}
	
	public void method8() {
		// A_FOr method9�� while��
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �Է� : ");
		int row = sc.nextInt();
		System.out.print("ĭ �� �Է� : ");
		int col = sc.nextInt();
		
		int i = 1;
//		int j = 1; // ���� �ݺ��� ������ ���Ӱ� ���ƾ� �ϱ� ������ ū �ݺ��� �ȿ��� �ʱ�ȭ ���Ѿ���
		while (i <= row) {
			int j = 1;
			while (j <= col) {
//				if (row == col) { // �Ǽ�
//					System.out.print(col);
//				if (i = j) { // == �ؾ� �Ǵµ� �Ǽ�
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public void method9() {
		// Ű����� ���ڿ� ���� �Է� �޾� ��� �ݺ� ����  --> �� �� �ݺ����� �� �� ������ while���� ����
		// exit�� ���� �ݺ� ���� -> exit�� �ƴϸ� ��� ����
		
		Scanner sc = new Scanner(System.in);
		
//		String str = null; // String Ŭ������ ����� ��� Ŭ����, �� ������ �ڷ����� �⺻���� null�̴�.
//		// null ? �ƹ� �͵� ����(= ����)
		// NullPointerExcetion ���� ��, str.�� ����  �����Ѽ� String Ŭ���� �����ߴµ� �ȿ� null �ۿ� ����
		String str= "";
		while(!str.equals("exit")) { // exit�� �ƴϸ� �ݺ�, equals() : String Ŭ���� ���� �޼ҵ�
			System.out.print("���ڿ� �Է� : "); // �ȳ������� �ݺ� ���Ѿ� ��
			str = sc.nextLine();
			System.out.println("str : " + str);
		}
	}
	
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		String str = null;
		do {
			System.out.print("���ڿ� �Է� : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		} while (!str.equals("exit")); 
		// NullPointerException �� ��
		// nextLine���� ���ڿ� �޾Ƽ� str�� ���ڿ��� ����� �� while�� ���ǽ� Ȯ���ϱ� ������ 
		// -> str��  null�� ����. ����ڰ� null�� �Է��Ѱ� ���ڿ��̱� ������ ���� ����.
	}
}
