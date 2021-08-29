package com.kh.practice.chap01.poly.view;

import java.util.Scanner;

import com.kh.practice.chap01.poly.controller.LibraryController;
import com.kh.practice.chap01.poly.model.vo.AniBook;
import com.kh.practice.chap01.poly.model.vo.Book;
import com.kh.practice.chap01.poly.model.vo.CookBook;
import com.kh.practice.chap01.poly.model.vo.Member;

public class LibraryMenu {

	Scanner sc = new Scanner(System.in);
	LibraryController lc = new LibraryController();

	public void mainMenu() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		char gender = ' ';
		do {
			System.out.print("����(F/M) : ");
			gender = sc.next().toUpperCase().charAt(0);
			
			if (gender != 'F' && gender != 'M') {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		} while (!(gender == 'F' || gender == 'M'));

		Member mem = new Member(name, age, gender); // new�����ڸ� ���� MemberŬ���� Ÿ���� ��ü ����(Heap�޸� ������)
													// name, age, gender ���� �ڷ����� �ٸ� ������ ���� �����ϱ� ���� 
													// �� �ڷ����� �Ű������� ������ MemberŬ������  ������ ȣ�� -> MemberŬ���� �ʵ� �ش� ������ �ʱ�ȭ
												    // ��ü �����Ҷ� �߻��� �ּ� ���� MemberŸ���� mem ���������� ����
													// ���� MemberŬ������ ��ü�� ���������� mem�� ���� MemberŬ������ �޼ҵ忡 ������ �� �ְ�, �ּҰ� �Ѱ��� �� ����
		lc.insertMember(mem);

		System.out.println();
		while (true) {
			System.out.println("==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();
			
			sc.nextLine();
			switch (menuNum) {
			case 1:
				System.out.println(lc.myInfo());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			System.out.println();
		}

	}


	private void selectAll() {
		Book[] bList = lc.selectAll();
		
		for (int i = 0; i < bList.length; i++) {
			System.out.println(i + "�� ���� : " + bList[i]);
		}
		
	}
	
	private void searchBook() {
		System.out.print("�˻��� ���� Ű���� : ");
		String keword = sc.nextLine();
		
		Book[] searchList = lc.searchBook(keword);
			
//		if (searchList.toString().contains(keword)) { // ���� �ڵ� : �ּҰ��̶� keword ���ϴ� ����
//	    searchList.toString() ==  searchList : ture  // �θ� Ŭ���� ObjectŬ������ toString() �޼ҵ� ���, ��ȯ�� searchList�� �ּҰ�
		
		if (searchList.length != 0) { // Ű����� ��ġ�ϴ� ������ ������ count, �� �迭���̰�  0�� ��ü�迭�� �ּҰ��� ��ȯ�Ǳ� ������ searchList.length�� 0�� �ȴ�
			for (int i = 0; i < searchList.length; i++) {
				
				if (searchList[i] instanceof AniBook) {
//					System.out.println(((AniBook)searchList[i]).toString());
					System.out.println((searchList[i]).toString()); 
					// �������ε� : ��� ����� �������� ����� ���, �ڽ�Ŭ�������� �θ�Ŭ������ �޼ҵ� �������̵� �س�������
					//           �θ�Ŭ������ toString() �޼ҵ尡 �ƴ� �ڽ�Ŭ������ AniBook���� �������̵��� toString() �޼ҵ� �켱������ ȣ��
				} else if (searchList[i] instanceof CookBook) {
					System.out.println(((CookBook)searchList[i]).toString());
				}
				
			}
		} else {
			System.out.println("�ش� ������ ������ �������� �ʽ��ϴ�.");
		}

	}


	private void rentBook() {
		selectAll();
		System.out.println();
		while (true) {
			System.out.print("�뿩�� ���� ��ȣ ���� : ");
			int index = sc.nextInt();
			
			if (index > 0 || index <= 4) {
				
				int result = lc.rentBook(index);
				if (result == 0) {
					System.out.println("���������� �뿩�Ǿ����ϴ�.");
				} else if (result == 1) {
					System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
				} else if (result == 2) {
					System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���.");
				}
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	
	}


}
