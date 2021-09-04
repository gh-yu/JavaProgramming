package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {

	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	public void mainMenu() {
		
		while (true) {
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. ������ ��ġ�� �� �߰�");
			System.out.println("2. ù ��ġ�� �� �߰�");
			System.out.println("3. ��ü �� ��� ���");
			System.out.println("4. Ư�� �� �˻�");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. Ư�� �� ���� ����");
			System.out.println("7. ��� �������� ����");
			System.out.println("8. ������ �������� ����");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ ���� : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1 : addList(); break;
			case 2 : addAtZero(); break;
			case 3 : printAll(); break;
			case 4 : searchMusic(); break;
			case 5 : removeMusic(); break;
			case 6 : setMusic(); break;
			case 7 : ascTitle(); break;
			case 8 : descSinger(); break;
			case 9 : System.out.println("����"); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���"); 
			}
		}
	
	}

	private void addList() {
		System.out.println("***** ������ ��ġ�� �� �߰� *****");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		
		if (mc.addList(title, singer) == 1) { // ȣ���ؼ� �߰��ϸ� 1 �����ϰ� ��
			System.out.println("�߰� ����");
		} else { // �߰� �����ϸ� 0 �����ϰ� ��
			System.out.println("�߰� ����");
		}
		
	}

	private void addAtZero() {
		System.out.println("***** ù ��ġ�� �� �߰� *****");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		
		if (mc.addAtZero(title, singer) == 1) { // ȣ���ؼ� �߰��ϸ� 1 �����ϰ� ��
			System.out.println("�߰� ����");
		} else { // �߰� �����ϸ� 0 �����ϰ� ��
			System.out.println("�߰� ����");
		}
	}

	private void printAll() {
		System.out.println("***** ��ü �� ��� ��� *****");
		if (!mc.printAll().isEmpty()) {
			System.out.println(mc.printAll());
		} else {
			System.out.println("�� ����� ��� �ֽ��ϴ�.");
		}

	}

	private void searchMusic() {
		System.out.println("***** Ư�� �� �˻� *****");
		System.out.print("�˻��� �� �� : ");
		String title = sc.nextLine();
		if (mc.searchMusic(title) != null) {
			System.out.println("�˻��� ���� " + mc.searchMusic(title) + "�Դϴ�.");
		} else {
			System.out.println("�˻��� ���� �����ϴ�.");
		}
		
	}
	
	private void removeMusic() {
		System.out.println("***** Ư�� �� ���� *****");
		System.out.print("������ �� �� : ");
		String title = sc.nextLine();
		
//		if (mc.removeMusic(title) != null) { 							  // �߸��� �ڵ�
//			System.out.println(mc.removeMusic(title) + " �� ���� �߽��ϴ�."); // ������ ������Ų �� �� �޼ҵ� ȣ���ϴ� null�� ��ȯ
//		} else {
//			System.out.println("������ ���� �����ϴ�.");
//		}
		
		Music m = mc.removeMusic(title); // �޼ҵ� ȣ���� ��� m�� ���� ��, ���ǽİ� ���๮�忡 m�� ���
		if (m != null) { 						 
			System.out.println(m + " �� ���� �߽��ϴ�."); 
		} else {
			System.out.println("������ ���� �����ϴ�.");
		}
		
//		Music m[] = mc.removeMusic(title); 
//		if (m.length != 0) {
//			for (int i = 0; i < m.length; i++) {
//				if (m[i] != null) {
//					System.out.println(m[i] + "��(��) ���� �߽��ϴ�.");
//				}
//			}
//		} else {
//			System.out.println("������ ���� �����ϴ�.");
//		}
	}

	private void setMusic() {
		System.out.println("***** Ư�� �� ���� ���� *****");
		System.out.print("�˻��� �� �� : ");
		String title = sc.nextLine();
		System.out.print("������ �� �� : ");
		String setTitle = sc.nextLine();
		System.out.print("������ �� ������ : ");
		String setSinger = sc.nextLine();
		
		Music m = mc.setMusic(title, setTitle, setSinger);
		if (m != null) {
			System.out.println(m + "�� ���� ���� �Ǿ����ϴ�.");
		} else {
			System.out.println("������ ���� �����ϴ�.");
		}
	}
	
	private void ascTitle() {
		System.out.println("***** �� �� �������� ���� *****");

		if (mc.ascTitle() == 1) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
	}

	private void descSinger() {
		System.out.println("***** ���� �� �������� ���� *****");
		
		if (mc.descSinger() == 1) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
	}

}
