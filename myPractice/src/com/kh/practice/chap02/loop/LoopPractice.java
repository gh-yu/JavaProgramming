package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		// 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice2() {
		// 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		// "1 이상의 숫자를 입력해주세요"가 출력되면서 다시 사용자 값을 입력하도록 하세요.
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		while (!(num >= 1)) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
		
			if (num >= 1) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}			
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
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
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
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
		
		System.out.print("정수를 하나 입력하세요 : ");
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
		
		System.out.print("첫 번쨰 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번쨰 숫자 : ");
		int num2 = sc.nextInt();
		
		if (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
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
			System.out.print("첫 번쨰 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번쨰 숫자 : ");
			int num2 = sc.nextInt();
			
			if (num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
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
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("===== " + dan + " =====");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}	
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if (dan <= 9) {
			for (int i = dan; i <= 9; i++) {
				System.out.println("===== " + i + "단 =====");
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + i * j);
				}
			}	
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		} 
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자 : ");
			int dan = sc.nextInt();
			
			if (dan <= 9) {
				for (int i = dan; i <= 9; i++) {
					System.out.println("===== " + i + "단 =====");
					for (int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + " = " + i * j);
					}
				}
				break;
			} else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			} 
		}
	}
	
//	public void practice10_1() {
//		Scanner sc = new Scanner(System.in);
//		
//		int dan = 0;
//		do {
//			System.out.print("숫자 : ");
//			dan = sc.nextInt();
//			
//			if (dan <= 9) {
//				for (int i = dan; i <= 9; i++) {
//					System.out.println("===== " + i + "단 =====");
//					for (int j = 1; j <= 9; j++) {
//						System.out.println(i + " * " + j + " = " + i * j);
//					}
//				}
//			} else {
//				System.out.println("9 이하의 숫자만 입력해주세요.");
//			} 
//		} while (!(dan <= 9));
//	}
	
	public void practice11() {
		// 사용자로부터 시작 숫자와 공차를 입력 받아
		// 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
		// 단, 출력되는 숫자가 총 10개입니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		
		System.out.print("공차 : ");
		int gap = sc.nextInt();
		
		for (int i = 0; i < 10; i++) { // 일정한 값으로 숫자가 커지는 경우
			System.out.print(start + " ");
			start += gap;
		}
		
//		for (int i = 0; i < 10; i++) { // 일정한 값으로 숫자가 작아지는 경우
//			System.out.print(start + " ");
//		 	start -= gap;
//		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
//			sc.nextLine();
			System.out.print("연산자(+, -, *, /, %) : ");
			String str = sc.next(); // sc.nextLine()으로 받아오면 while문 2번쨰 실행시 엔터 가져와서 에러 뜸
			char oper = str.charAt(0);
			
			if ("exit".equals(str)) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			if (oper == '/' && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			} 
			else {
				int result = 0;
				switch (oper) {
				case '+' : result = num1 + num2; break;
				case '-' : result = num1 - num2; break;
				case '*' : result = num1 * num2; break;
				case '/' : result = num1 / num2; break;
				case '%' : result = num1 % num2; break;
				default : System.out.println("없는 연산자입니다. 다시 입력해주세요."); continue;
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
			System.out.print("연산자(+, -, *, /, %) : ");
			String str = sc.next(); // sc.nextLine()으로 받아오면 while문 2번쨰 실행시 엔터 가져와서 에러 뜸
			char oper = str.charAt(0);
			
			if ("exit".equals(str)) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			if (oper == '/' && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			} else if (!(oper == '+' || oper == '-' || oper == '*' || oper == '/' || oper == '%')) {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
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
		
		System.out.print("정수 입력 : ");
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
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 답안 방식		
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
