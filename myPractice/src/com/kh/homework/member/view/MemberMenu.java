package com.kh.homework.member.view;

import java.util.Scanner;

import com.kh.homework.member.controller.MemberController;
import com.kh.homework.member.model.vo.Member;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);

	MemberController mc = new MemberController();

	public MemberMenu() {
	}

	public void mainMenu() {

		while (true) {
			if (!(mc.existMemberNum() == 10)) {
				System.out.println("�ִ� ��� ������ ȸ�� ���� " + MemberController.SIZE + "���Դϴ�.");
				System.out.println("���� ��ϵ� ȸ�� ���� " + mc.existMemberNum() + "���Դϴ�.");

				System.out.println("1. �� ȸ�� ���");
			} else if (mc.existMemberNum() == 10) {
				System.out.println("ȸ�� ���� ��� �� á�� ������ �Ϻ� �޴��� ���µ˴ϴ�.");
			}
			System.out.println("2. ȸ�� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ����");
			System.out.println("5. ��� ���");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();

			sc.nextLine();
			switch (menuNum) {
			case 1: insertMember(); break;
			case 2: searchMember(); break;
			case 3: updateMember(); break;
			case 4: deleteMember(); break;
			case 5: printAll(); break;
			case 9: System.out.println("���α׷��� �����մϴ�."); return;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}

	}

	public void insertMember() {

		while (true) {

			System.out.println("�� ȸ���� ����մϴ�.");
			System.out.print("���̵� : ");
			String id = sc.nextLine();

			while (mc.checkId(id)) {
				System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���");
				System.out.print("���̵� : ");
				id = sc.nextLine();
			}

			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();
			System.out.print("�̸��� : ");
			String email = sc.nextLine();
			System.out.print("����(M/F) : ");
			char gender = sc.nextLine().charAt(0);

			while (!(gender == 'F' || gender == 'f' || gender == 'M' || gender == 'm')) {
				System.out.println("������ �ٽ� �Է��ϼ���.");
				System.out.print("����(M/F) : ");
				gender = sc.nextLine().charAt(0);
			}

			System.out.print("���� : ");
			int age = sc.nextInt();
			mc.insertMember(id, name, password, email, gender, age);
			break;
		}

	}

	public void searchMember() {

		while (true) {
			System.out.println("1. ���̵�� �˻��ϱ�");
			System.out.println("2. �̸����� �˻��ϱ�");
			System.out.println("3. �̸��Ϸ� �˻��ϱ�");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();

			sc.nextLine();
			switch (menuNum) {
			case 1: searchId(); break;
			case 2: searchName(); break;
			case 3: searchEmail(); break;
			case 9: System.out.println("�������� ���ư��ϴ�."); return;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); return;
			}
		}
	}

	public void searchId() { // id�� �ߺ� �˻��ؼ� 1���� ���� �� �ۿ� �����ϱ� �ݺ��� �ʿ� ����
		System.out.print("�˻��� ���̵� : ");
		String id = sc.nextLine();

		if (mc.checkId(id)) {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
			System.out.println(mc.searchId(id));
		} else {
			System.out.println("�˻� ����� �����ϴ�.");
		}
	}

//	public void searchId() {
//		System.out.print("�˻��� ���̵� : ");
//		String id = sc.nextLine();
//		
//		if (!(mc.searchId(id).equals(""))) {
//			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
//			System.out.println(mc.searchId(id));
//		} else {
//			System.out.println("�˻� ����� �����ϴ�.");
//		}
//	}

	public void searchName() {
		System.out.print("�˻��� �̸� : ");
		String name = sc.nextLine();

		Member[] arr = mc.searchName(name); // ��ȯ�� MemberŬ���� Ÿ���� ��ü �迭�� (���������� ���)�ּҰ��� MemberŬ���� Ÿ���� �迭 arr���������� ����
											// �Է¹��� name�� MemberŸ�� ��ü�迭�� ����� name�� ���ϱ� ���ؼ� ����
		
//		if (!(mc.searchName(name).equals(null))) { // �߸��� �ڵ� null���� String���� �ƴ� ==���� ���ؾ���
		if (mc.searchName(name) != null) {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != null) { // NullPoinerException ����
					if (arr[i].getName().equals(name)) { // arr[i]. �ؼ� MemberŬ������ �޼ҵ� ��� ���� <- ���⼭ MemberŸ�� ��ü�迭 arr ������ ����
						System.out.println(arr[i].inform());
					}
				} else {
					break;
				}
			}
		} else {
			System.out.println("�˻� ����� �����ϴ�.");
		}

	}

	public void searchEmail() {
		System.out.print("�˻��� �̸��� : ");
		String email = sc.nextLine();

		Member[] arr = mc.searchEmail(email);

		if (mc.searchEmail(email) != null) {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");

//			for (int i = 0; i < arr.length; i++) {
//				if (arr[i] != null) {
//					if (arr[i].getEmail().equals(email)) {
//						System.out.println(arr[i].inform());
//					}
//				} else {
//					break;
//				}
//			}
		
			// ������ �ڵ�
			for (int i = 0; i < mc.existMemberNum(); i++) {
				if (arr[i].getEmail().equals(email)) {
					System.out.println(arr[i].inform());
				}
			}
			
		} else {
			System.out.println("�˻� ����� �����ϴ�.");
		}

	}

	public void updateMember() {

		while (true) {
			System.out.println("1. ��й�ȣ �����ϱ�");
			System.out.println("2. �̸� �����ϱ�");
			System.out.println("3. �̸��Ϸ� �����ϱ�");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();

			sc.nextLine();
			switch (menuNum) {
			case 1: updatePassword(); break;
			case 2: updateName(); break;
			case 3: updateEmail(); break;
			case 9: System.out.println("�������� ���ư��ϴ�."); return;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); return;
			}
		}
	}

	public void updatePassword() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();
		System.out.print("������ ȸ���� ��й�ȣ : ");
		String password = sc.nextLine();
		
		if (mc.updatePassword(id, password)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		} else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
		}
		
		
	}

	public void updateName() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();
		System.out.print("������ ȸ���� �̸� : ");
		String name = sc.nextLine();
		
		if (mc.updateName(id, name)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		} else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
		}
		
	}
	
	public void updateEmail() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.nextLine();
		System.out.print("������ ȸ���� �̸��� : ");
		String email = sc.nextLine();
		
		if (mc.updateEmail(id, email)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		} else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
		}
	}

	public void deleteMember() {
		
		while (true) {
			System.out.println("1. Ư�� ȸ�� �����ϱ�");
			System.out.println("2. ��� ȸ�� �����ϱ�");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			if (menuNum == 1) {
				deletOne();
				break;
			} else if (menuNum == 2) {
				deleteAll();
				break;
			} else if (menuNum == 9) {
				System.out.println("�������� ���ư��ϴ�");
				return;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}	
		}
	}

	public void deletOne() {
		
		if (mc.existMemberNum() == 0) {
			System.out.println("��ϵ� ȸ���� �����ϴ�.");
		} else {
			System.out.print("������ ȸ���� ���̵� : ");
			String id = sc.nextLine();
			
			while (true) {
				System.out.print("���� �����Ͻðڽ��ϱ�?(y/n) : ");
				String str = sc.nextLine().toLowerCase();
				char input = str.charAt(0);
				
				if (input == 'y') {
					if (mc.checkId(id)) {
						mc.delete(id);
						System.out.println("���������� �����Ͽ����ϴ�.");
						return;
					} else {
						System.out.println("�������� �ʴ� ���̵��Դϴ�.");
						return;
					}
				} else if (input == 'n') {
					return;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			}
		}	
	}

	public void deleteAll() {

		if (mc.existMemberNum() == 0) {
			System.out.println("��ϵ� ȸ���� �����ϴ�.");
		} else {
			while (true) {
				System.out.print("���� �����Ͻðڽ��ϱ�?(y/n) : ");
				String str = sc.nextLine().toLowerCase();
				char input = str.charAt(0);
				
				if (input == 'y') {
						mc.delete();
						System.out.println("���������� �����Ͽ����ϴ�.");
						return;
				}  else if (input == 'n') {
					return;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			}	
		}

	}

	public void printAll() {
		
		if (mc.existMemberNum() != 0) {
			
			Member[] arr = mc.printAll();
			
			for(int i = 0; i < mc.existMemberNum(); i++) {
				System.out.println(arr[i].inform()); 
			}
			
			
		} else {
			System.out.println("����� ȸ���� �����ϴ�.");
		}
	
	}

}
