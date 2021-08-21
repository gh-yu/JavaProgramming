package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	// 키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요
	public void method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		int unicode = ch; // 작은 자료형이 큰 자료형으로 변환하는 거라 명시 안해줘도 자동 형변환
		
		System.out.println(ch + " unicode : " + unicode);
//		System.out.println(ch + " unicode : " + (int)ch); // 따로 int 변수 안 만들어도 print할때 형변환해서 출력 가능
	}
}
