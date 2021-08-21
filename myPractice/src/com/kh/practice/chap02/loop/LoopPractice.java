package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		// ����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���
		// ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		// ���� 1 �̸��� ���ڰ� �Էµƴٸ� "1 �̻��� ���ڸ� �Է����ּ���"�� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}
	
	public void practice2() {
		// �� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		// "1 �̻��� ���ڸ� �Է����ּ���"�� ��µǸ鼭 �ٽ� ����� ���� �Է��ϵ��� �ϼ���.
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		while (!(num >= 1)) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
		
			if (num >= 1) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
			} else {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}			
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else {
			for (int i = num; i > 0; i--) { // i--
				System.out.print(i + " ");
			} 
			
//			for (int i = 0; i < num; i++) { // i++
//				System.out.print(num - i + " ");
//			}
		}		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			if (num < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			} else {
				for (int i = num; i > 0; i--) {
					System.out.print(i + " ");
				}
				break;
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int result = 0;
		for (int i = 1; i <= num; i++) {
			result = result + i;
			if (i < num) {
				System.out.print(i + " + ");
			} else {
				System.out.println(i + " = " + result);
			}		
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ���� ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ���� ���� : ");
		int num2 = sc.nextInt();
		
		if (num1 < 1 || num2 < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else {
			int min = 0;
			int max = 0;
			
			if (num1 < num2) {
				min = num1;
				max = num2;
			} else if (num1 > num2) {
				min = num2;
				max = num1;
			} else {
				min = num1;
				max = num2;
			}
			
			int i = min;
			while (i <= max) {
				System.out.print(i + " ");
				i++;
			}
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
	
		while (true) {
			System.out.print("ù ���� ���� : ");
			int num1 = sc.nextInt();
			System.out.print("�� ���� ���� : ");
			int num2 = sc.nextInt();
			
			if (num1 < 1 || num2 < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			} else {
				int min = 0;
				int max = 0;
				
				if (num1 < num2) {
					min = num1;
					max = num2;
				} else if (num1 > num2) {
					min = num2;
					max = num1;
				} else {
					min = num1;
					max = num2;
				}
				
				int i = min;
				while (i <= max) {
					System.out.print(i + " ");
					i++;
				}
				break;
			}
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		System.out.println("===== " + dan + " =====");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}	
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		if (dan <= 9) {
			for (int i = dan; i <= 9; i++) {
				System.out.println("===== " + i + "�� =====");
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + i * j);
				}
			}	
		} else {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		} 
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("���� : ");
			int dan = sc.nextInt();
			
			if (dan <= 9) {
				for (int i = dan; i <= 9; i++) {
					System.out.println("===== " + i + "�� =====");
					for (int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + " = " + i * j);
					}
				}
				break;
			} else {
				System.out.println("9 ������ ���ڸ� �Է����ּ���.");
			} 
		}
	}
	
//	public void practice10_1() {
//		Scanner sc = new Scanner(System.in);
//		
//		int dan = 0;
//		do {
//			System.out.print("���� : ");
//			dan = sc.nextInt();
//			
//			if (dan <= 9) {
//				for (int i = dan; i <= 9; i++) {
//					System.out.println("===== " + i + "�� =====");
//					for (int j = 1; j <= 9; j++) {
//						System.out.println(i + " * " + j + " = " + i * j);
//					}
//				}
//			} else {
//				System.out.println("9 ������ ���ڸ� �Է����ּ���.");
//			} 
//		} while (!(dan <= 9));
//	}
	
	public void practice11() {
		// ����ڷκ��� ���� ���ڿ� ������ �Է� �޾�
		// ������ ������ ���ڰ� Ŀ���ų� �۾����� ���α׷��� �����ϼ���.
		// ��, ��µǴ� ���ڰ� �� 10���Դϴ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int start = sc.nextInt();
		
		System.out.print("���� : ");
		int gap = sc.nextInt();
		
		for (int i = 0; i < 10; i++) { // ������ ������ ���ڰ� Ŀ���� ���
			System.out.print(start + " ");
			start += gap;
		}
		
//		for (int i = 0; i < 10; i++) { // ������ ������ ���ڰ� �۾����� ���
//			System.out.print(start + " ");
//		 	start -= gap;
//		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
//			sc.nextLine();
			System.out.print("������(+, -, *, /, %) : ");
			String str = sc.next(); // sc.nextLine()���� �޾ƿ��� while�� 2���� ����� ���� �����ͼ� ���� ��
			char oper = str.charAt(0);
			
			if ("exit".equals(str)) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			
			if (oper == '/' && num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
			} 
			else {
				int result = 0;
				switch (oper) {
				case '+' : result = num1 + num2; break;
				case '-' : result = num1 - num2; break;
				case '*' : result = num1 * num2; break;
				case '/' : result = num1 / num2; break;
				case '%' : result = num1 % num2; break;
				default : System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���."); continue;
				}
				
				System.out.println(num1 + " " + oper  + " "+ num2 + " = " + result);
				break;
			}
		}
	}

	public void practice12_1() {
		Scanner sc = new Scanner(System.in);
	
		while (true) {
	//		sc.nextLine();
			System.out.print("������(+, -, *, /, %) : ");
			String str = sc.next(); // sc.nextLine()���� �޾ƿ��� while�� 2���� ����� ���� �����ͼ� ���� ��
			char oper = str.charAt(0);
			
			if ("exit".equals(str)) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			
			if (oper == '/' && num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
				continue;
			} else if (!(oper == '+' || oper == '-' || oper == '*' || oper == '/' || oper == '%')) {
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			
			int result = 0;
			switch (oper) {
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '/' : result = num1 / num2; break;
			case '%' : result = num1 % num2; break;
			}
				
			System.out.println(num1 + " " + oper  + " "+ num2 + " = " + result);
			break;
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// ��� ���		
//		for(int i = num; i > 0; i--) {
//			for(int j = i; j > 0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for (int i = num; i > 0; i--) {
//			for (int j = num; j > num - i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
}
