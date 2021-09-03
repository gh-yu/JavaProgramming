package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	
	BookController bc = new BookController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		while (true) {
			System.out.println("===== Welcome Library =====");
			System.out.println();
			System.out.println("=====***** ���� �޴� *****=====");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻� ��ȸ");
			System.out.println("4. ���� ����");
			System.out.println("5. ���� �� �������� ����");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ ���� : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1 : insertBook(); break;
			case 2 : selectList(); break;
			case 3 : selectBook(); break;
			case 4 : deleteBook(); break;
			case 5 : ascBook(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			
		}

	}

	private void insertBook() {
		System.out.println("===== �� ���� �߰� =====");
		System.out.println("å ������ �Է����ּ���.");
		System.out.print("���� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String author = sc.nextLine();

		String strCategory = null;
		while (true) {
			System.out.print("�帣(1. �ι� / 2. ���� / 3. �ܱ��� / 4. ��Ÿ) : ");
			int category = sc.nextInt();
			if (category == 1) {
				strCategory = "�ι�"; break;
			} else if (category == 2) {
				strCategory = "����"; break;
			} else if (category == 3) {
				strCategory = "�ܱ���"; break;
			} else if (category == 4) {
				strCategory = "��Ÿ"; break;
			} else { 
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	
		System.out.print("���� : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		Book b = new Book(title, author, strCategory, price); // BookŬ������ ��ü ����, ������ �Ű������� �� �Ѱ��� �ʵ� �ʱ�ȭ
		bc.insertBook(b); // controller�� ������ ������ ��ü �ּҰ� ������
		
	}

	private void selectList() { // ���� ��ü ��ȸ�� view �޼ҵ�
		System.out.println("===== ���� ��ü ��ȸ =====");
		
//		ArrayList<Book> list = new ArrayList<Book>(); 
//		list = bc.selectBook();
//		ArrayList<Book> list = new ArrayList<Book>(bc.selectList()); // �̷��Ե� ����
		ArrayList<Book> list = bc.selectList(); // bc.selectList() ȣ���� ��ȯ���� �÷����� list �÷��ǿ� ����

		boolean check = false;
		for (int i = 0; i < list.size(); i++) { // �÷����� �� ��� �� �پ� ����ϱ�
			if (list.get(i) != null) {
				System.out.println("        " + list.get(i)); // ���������� �����ؼ� ���
				check = true; // ������ �ϳ��� �����ϸ� true
			}
		} 
		if (!check) {
			System.out.println("�����ϴ� ������ �����ϴ�.");
		}

		
//		Iterator<Book> it = list.iterator(); // 2. Iterator ��ü �����ؼ� �� �پ� ���
//		
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
	}

	private void selectBook() {
		System.out.println("===== ���� �˻� =====");
		System.out.print("�˻� Ű���� : "); // ������ Ű����� �˻�
		String keword = sc.nextLine();
	
//		if (bc.selectBook(keword) != null) {
//			for (int i = 0; i < bc.selectBook(keword).size(); i++) {
//				System.out.println("        " + bc.selectBook(keword).get(i));
//			}
//		}
		
		ArrayList<Book> listKeword = bc.selectBook(keword);
		
		boolean check = false; // 
		for (int i = 0; i < listKeword.size(); i++) {
			System.out.println("        " + listKeword.get(i));
			check = true; // for�� �ȿ� ���Դٴ� �� listKeword.size�� 1 �̻�, �˻� ����� �ִٴ� �ǹ�
		}
		if (!check) {  // �˻��� ��� ������
			System.out.println("�˻� ����� �����ϴ�.");
		} // �� check ������ controller���� �ص� ��. �˻� ��� ������ null��ȯ -> view���� null�̸� �˻� ��� ���ٰ� ���
		
	}

	private void deleteBook() {
		System.out.println("===== ���� ���� =====");
		System.out.print("������ ���� �� : ");
		String title = sc.nextLine();
		System.out.print("������ ���� �� : ");
		String author = sc.nextLine();
		
		if (bc.deleteBook(title, author) != null) {
			System.out.println("���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ ������ ã�� ���߽��ϴ�.");
		}
		
	}

	private void ascBook() { 
		System.out.println("===== ���� �� �������� ���� =====");
	
		if (bc.ascBook() == 1) { // �޼ҵ� ȣ��� �������� ���� �� 1 ��ȯ�� 
			ArrayList<Book> list = bc.selectList();
//			Collections.sort(list);
			
			boolean check = false;
			for (int i = 0; i < list.size(); i++) { // �÷����� �� ��� �� �پ� ����ϱ�
				if (list.get(i) != null) {
					System.out.println("        " + list.get(i)); // ���������� �����ؼ� ���
					check = true; // ������ �ϳ��� �����ϸ� true
				}
			} 
			if (!check) {
				System.out.println("�����ϴ� ������ �����ϴ�.");
			}
		}
	}
}
