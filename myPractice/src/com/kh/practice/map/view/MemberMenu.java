package com.kh.practice.map.view;

import java.util.Scanner;

import com.kh.practice.map.controller.MemberController;

public class MemberMenu {

	MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.println("========= MY ����Ʈ ==========");
		while (true) {
			System.out.println("***** ���� �޴� *****");
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("3. ���� �̸� ȸ�� ã��");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ ���� : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1 : joinMembership(); break;
			case 2 : login(); memberMenu(); break;
			case 3 : sameName();
			case 9 : System.out.println("���α׷� ����"); return;
			default : System.out.println("��� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			
		}
	}

	private void memberMenu() {
		while (true) {
			System.out.println("***** ȸ�� �޴� *****");
			System.out.println("1. ��й�ȣ �ٱ���");
			System.out.println("2. �̸� �ٲٱ�");
			System.out.println("3. �α׾ƿ�");
			System.out.print("�޴� ��ȣ ���� : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1 : changePassword(); break;
			case 2 : changeName(); break;
			case 3 : System.out.println("�α׾ƿ� �Ǿ����ϴ�."); return;
			default : System.out.println("��� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}


	private void joinMembership() {
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ");
		String password = sc.nextLine();
		System.out.print("�̸� : ");
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
