package com.kh.practice.map.view;

import java.util.Scanner;

import com.kh.practice.map.controller.MemberController;

public class MemberMenu {

	MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.println("========= MY 사이트 ==========");
		while (true) {
			System.out.println("***** 메인 메뉴 *****");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1 : joinMembership(); break;
			case 2 : login(); memberMenu(); break;
			case 3 : sameName();
			case 9 : System.out.println("프로그램 종료"); return;
			default : System.out.println("잚못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}
	}

	private void memberMenu() {
		while (true) {
			System.out.println("***** 회원 메뉴 *****");
			System.out.println("1. 비밀번호 바구기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1 : changePassword(); break;
			case 2 : changeName(); break;
			case 3 : System.out.println("로그아웃 되었습니다."); return;
			default : System.out.println("잚못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}


	private void joinMembership() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호");
		String password = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
	}

	private void login() {
		
	}

	private void changePassword() {
		// TODO Auto-generated method stub
		
	}

	private void changeName() {
		// TODO Auto-generated method stub
		
	}
	
	private void sameName() {
		// TODO Auto-generated method stub
		
	}

}
