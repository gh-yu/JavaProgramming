package com.kh.practice.map.view;

import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

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
			case 2 : login(); break;
			case 3 : sameName(); break;
			case 9 : System.out.println("���α׷� ����"); return;
			default : System.out.println("��� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			
		}
	}

	private void memberMenu() {
		while (true) {
			System.out.println("***** ȸ�� �޴� *****");
			System.out.println("1. ��й�ȣ �ٲٱ�");
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
		String id = sc.nextLine().trim();
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine().trim();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		Member m = new Member(password, name);
		if (mc.joinMembership(id, m)) {
			System.out.println("���������� ȸ������ �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
		}
	}

	private void login() {
		System.out.print("���̵� : ");
		String id = sc.nextLine().trim(); 
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine().trim();
		
		String name = mc.login(id, password);
		if (name != null) {
			System.out.println(name + "��, ȯ���մϴ�!");
			memberMenu(); 
		} else {
			System.out.println("Ʋ�� ���̵� �Ǵ� ��й�ȣ�Դϴ�. �ٽ� �Է����ּ���.");
		}
	}

	private void changePassword() {
		System.out.print("���̵� : ");
		String id = sc.nextLine().trim(); 
		System.out.print("��й�ȣ : ");
		String oldPw = sc.nextLine().trim();
		System.out.print("������ ��й�ȣ : ");
		String newPw = sc.nextLine().trim();
		
		if (mc.changePassword(id, oldPw, newPw)) {
			System.out.println("��й�ȣ ���濡 �����߽��ϴ�.");
		} else {
			System.out.println("��й�ȣ ���濡 �����߽��ϴ�. �ٽ� �Է����ּ���.");
		}
	}

	private void changeName() {
		System.out.print("���̵� : ");
		String id = sc.nextLine().trim(); 
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine().trim();
		String oldName = mc.login(id, password);
		System.out.println("���� ������ �̸� : " + oldName);
		
		System.out.print("������ �̸� : ");
		String newName = sc.nextLine();
		
		if (mc.changeName(id, newName)) {
			System.out.println("�̸� ���濡 �����߽��ϴ�.");
		} else {
			System.out.println("�̸� ���濡 �����߽��ϴ�. �ٽ� �Է����ּ���.");
		}
		
	}
	
	private void sameName() {
		System.out.print("�˻��� �̸� : ");
		String searchName = sc.nextLine();
		
		TreeMap<String, Member> tm = mc.sameName(searchName);
		
		if (tm != null) {
			Set<Entry<String, Member>> set = tm.entrySet();
			Iterator<Entry<String, Member>> it = set.iterator();
			while (it.hasNext()) {
				Entry<String, Member> entry = it.next();
//				System.out.println(entry.getKey() + "-" + entry.getValue()); // entry.getValue()���� ��ü �ּҰ� ��ȯ�ϴµ�, toString�޼ҵ� �������̵��ؼ� name�� ��ȯ�ϰ� �س�����
				System.out.println(entry.getKey() + "-" + entry.getValue().getName()); 
			}
		} else {
			System.out.println("�ش��ϴ� �̸��� �������� �ʽ��ϴ�.");
		}

	}

}
