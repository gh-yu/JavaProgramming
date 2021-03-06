package com.kh.oprator;

import java.util.Scanner;

public class E_Logical {
	public void method1() {
		// 입력한 정수 값이 1~100사이의 숫자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		// 입력한 숫자가 1~100사이다
		// = 입력한 숫자가 1보다 크거나 같고 100보다 작거나 같다
		//                         &&
		// = num >= 1 && num <= 100
		System.out.println("1부터 100사이의 숫자인지 확인 : " + (num >= 1 && num <= 100 ));		
	}
	
	public void method2( ) {
		// 입력한 문자 값이 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 : ");
//		String strChar = sc.nextLine();
//		char ch = strChar.charAt(0);
		char ch = sc.nextLine().charAt(0); // strChar라는 변수에 저장하지 않고 입력받은 데이터 바로 사용
		
		System.out.println("영어 대문자가 맞습니까? : " + (ch >= 'A' && ch <= 'Z'));
		
		System.out.print("계속 하시려면 Y 또는 y를 입력하세요 : ");	
		char ch2 = sc.nextLine().charAt(0);
		
		System.out.println("계속 하겠다고 하셨습니까? : " + (ch2 == 'Y' || ch2 == 'y'));		
	}
	
	public void method3() {
		int a = 2;
		int b = 3;
		
		boolean c = a > b;
		boolean d = ++a <= ++b;
		
		System.out.println("a : " + a); // 2
		System.out.println("b : " + b); // 3
		System.out.println("c : " + c); // false
		System.out.println("d : " + d); // true
		
		System.out.println();
		
		System.out.println("!c : " + !c); // !false = true
		System.out.println("c != d : " + (c != d)); // false != true ==> true
		
		System.out.println();
		
		System.out.println("(a % b) == 1 : " + ((a % b) == 1)); // 3 % 4 == 3 ==> false
		System.out.println("(a == 3) && (b == 4) : " + ((a == 3) && (b == 4))); // true
		System.out.println("!d || (a - b) > 0 : " + (!d || (a - b) > 0)); // false
		// !d = false
		// a - b = -1 < 0
		// false || false = false
		
		System.out.println(!(c == d) && ((a * b == 10) || (b % 2 == 0)));
		// !(c == d) = !(false == true) = !false = true
		// ((a * b == 10) || (b % 2 == 0))
		//      12 == 10,     4 % 2 == 0
		//        false   ||       true
		//                 true
		// true && true = true
	}
}
