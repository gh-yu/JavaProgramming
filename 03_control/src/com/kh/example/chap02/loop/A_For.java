package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
//	for(�ʱ��; ���ǽ�; ������) {
//	 	���๮��;
//	}
//	�ʱ�� -> ���ǽ� Ȯ�� -> (���ǽ��� true�� ��) ���๮�� ���� -> ������ -> ���ǽ� Ȯ�� -> (�ݺ�)
//	���ǽ��� ����� false�� ������ �ݺ�
	
//	for�� �ȿ� �ִ� ���ǽ�, ���ǽ�, ������ ���� ����
//	�ʱ���� ��������, ������ ��������, ������ �󸶳� �Ǵ��� �� ǥ�� �ؾ���
//	�ᱹ for���� �Ұ�ȣ() �ȿ����� ������ ��, ��� �ʿ��� ���
	public void method1() {
		// 1���� 5���� ���
//		for(int i = 1; i <= 5; i++) {
		for(int i = 1; i <= 5;) {
			System.out.println(i);
			i++;
		}
	}
	
	public void method_1() {
		// �ڱ� �Ұ� �ټ� �� �ϱ� : �� �̸��� �����־�
//		for(int i = 1; i <= 5; i++) { // 1 2 3 4 5 -> 5�� �ݺ�
//		for(int i = 2; i <= 6; i++) { // 2 3 4 5 6
//		for(int i = 0; i <= 4; i++) { // 0 1 2 3 4
		for (int i = 0; i < 5; i++) { // 0 1 2 3 4
			System.out.println("�� �̸��� �����־�");
		}
	}
	
	public void method2() {
		// 5���� 1���� ��� : 5 4 3 2 1
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
	}
	
	public void method2_1() {
		// 8���� 3���� ���
//		for (int i = 8; i >= 3; i--) {
//			System.out.println(i);
//		}
		for (int i = 0; i < 6; i++) {
			System.out.println(8 - i);
		}
	}
	
	public void method3() {
		// 1���� 10 ������ ���� �� Ȧ���� ��� : 1 3 5 7 9
		
		// for���� �̿�
//		for (int i = 1; i <= 10; i++) {
//			for (; i % 2 != 0; i++) {
//				System.out.println(i);
//			}
//		}
		for (int i = 1; i <= 10; i+=2) { // �����Ŀ� ���մ��Կ����� ���
				System.out.println(i);
		}
		// for�� + if��
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	public void method4() {
		// ���� �� ���� �Է� �޾� �� ���� ���� ��� (���� �� �� ����)
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int start = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int end = sc.nextInt();
		
//		for (; start <= end; start++) {
//			System.out.println(start);
//		}
//		for (int i = start; i <= end; i++) { // �� ���� ���� start �� ��ü�� ������ ���� i�� ����
//			System.out.println(i);
//		}
		
		int max = 0; // �� ���� �� ū ���� ����
		int min = 0; // �� ���� �� ���� ���� ����
		
		if (start > end) {
			max = start;
			min = end;
		} else { // start <= end
			max = end;
			min = start;
		}
		
//		for (int i = min; i <= max; i++) {
//			System.out.println(i);
//		}
		
		for (; min <= max; min++) {
			System.out.println(min);
		}
	}
	
	public void method4_1() {
		// ������ �ϳ� �Է¹޾� �� ���� 1~9 ������ ���϶��� �� ���� ������ ���
		// ������ ���� ������ "1~9 ������ ����� �Է��Ͽ��� �մϴ�" ���
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9 ������ ����� �Է��ϼ��� : ");
		int dan = sc.nextInt();
		
		if (dan >= 1 && dan <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %2d\n", dan, i, dan * i); // %2d ���������� 2ĭ �Űܼ� ����, �������� �ϰ� ������ %-2d
			}
		} else {
			System.out.println("1~9 ������ ����� �Է��Ͽ��� �մϴ�.");
		}
	}
	
	public void method5() {
		// 1���� 10 ������ ������ ������ ���� 1���� ���������� ���� �հ�
		// ����? ������ ����
//		double random = Math.random(); // // �Ǽ�(double) �� 0 �̻� ~ 1 �̸� double�� ��������  ����
//		System.out.println(random); 
		
		// �Ǽ��� ������ random ������ �ٲٱ�
//		(0�ܰ�) 0 <= Math.random() < 1 : 0 ~ 0.99999999999... double
//		(1�ܰ�) 0 <= random() * 10 < 10 : 0 ~ 9.99999999999...
//		(2�ܰ�) 1 <= Math.random() * 10 + 1 < 11 : 1 ~ 10.99999999999...
//		(3�ܰ�) 1 <= (int)(Math.random() * 10 + 1) < 11 : 1 ~ 10 // int�� ���� ����ȯ
//		2�ܰ�� 3�ܰ��� ������ �ٲ� ��� ����
		
		int random = (int)(Math.random() * 10 + 1);
		int sum = 0;
		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		
		System.out.println("1���� " + random + "������ ���� �հ� : " + sum);
	}
	
	public void method6() {
		// 2�ܺ��� 9�ܱ��� ���
		// 2*1=2 2*2=4 2*3=6 .... 2*9=18
		// 3*1=3 3*2=6 3*3=9 .... 3*9=18
		// ...
		// ũ�� ���� �� : �� -> ū for��
		// �۰� ���� �� : �� -> ���� for��
		for (int i = 2; i <= 9; i++) { // �ܿ� ���� ū for��
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}
	
	public void method7() {
		// 0�� 0�� ~ 23�� 59��
		for (int i = 0; i <= 23; i++) {
			for (int j = 0; j <= 59; j++) {
//				System.out.println(i + "�� " + j + "��");
				System.out.printf("%2d�� %2d��\n", i, j);
			}
		}
	}
	
	public void method8() {
		// �� �ٿ� �� ǥ(*)�� 5�� ��� �Ǵµ� �� ���� ����ڰ� �Է��� ����ŭ ���
		/*
		 * 	����� �� �� : 3	����� �� ��  : 5
		 * 	*****			*****
		 * 	*****			*****
		 * 	*****			*****
		 * 					*****
		 * 					*****
		 */
		// Ʋ�� ��� -> ��ø ����ؼ� �� �Ѱ��� ��� �ϱ�
//		for (int i = 1; i <= 3; i++) {
//			System.out.println("*****");
//		}
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �� �� : ");
		int row = sc.nextInt();
		
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method9() {
		// �� �ٿ� ��ǥ ���ڸ� �Էµ� �� �� �� ĭ �� ��ŭ ���
		// ��, �� ���� ĭ ���� ��ġ�ϴ� ��ġ���� �� ��ȣ�� ���� ���� ���
		/*
		 * 	�� �� : 6 	�� �� : 5		�� �� : 4
		 * 	ĭ �� : 6		ĭ �� : 4		ĭ �� : 5
		 * 	1*****		1***		1****
		 * 	*2****		*2**		*2***
		 * 	**3***		**3*		**3**
		 * 	***4**		***4		***4*
		 *  ****5*		****	
		 *  *****6			
		 *  			
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� : ");
		int row = sc.nextInt();
		System.out.print("ĭ �� : ");
		int col = sc.nextInt();
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
	
	}
}
