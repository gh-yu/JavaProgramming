package com.kh.practice.token.menu;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainMenu() {
		
		while (true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("3. 프로그램 끝내기");
			
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch (menuNum) {
			case 1 : tokenMenu(); break;
			case 2 : inputMenu(); break;
			case 3 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
			
	}


	private void tokenMenu() {
		
		String str = "J a v a P r o g r a m ";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		
		String str2 = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : " + str2);
		System.out.println("토큰 처리 후 개수 : " + str2.length());
		System.out.println("모두 대문자로 변환 : " + str2.toUpperCase());
		System.out.println();
	}
	
	private void inputMenu() {
		
		System.out.print("문자열을 입력해주세요 : ");
		String inputStr = sc.nextLine();
		
		String str = tc.firstCap(inputStr);
		System.out.println("첫 글자 대문자 : " + str);
		
		System.out.print("찾을 문자를 하나 입력하세요 : ");
		char findCh = sc.nextLine().charAt(0);
		
		int countCh = tc.findChar(inputStr, findCh);
		System.out.println(findCh + " 문자가 들어간 개수 : " + countCh);
		
	}

}
