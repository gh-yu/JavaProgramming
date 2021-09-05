package com.kh.practice.set.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		System.out.println("========== ��÷ ���α׷� ==========");
		while (true) {
			System.out.println("=====***** ���� �޴� *****=====");
			System.out.println("1. ��÷ ��� �߰�");
			System.out.println("2. ��÷ ��� ����");
			System.out.println("3. ��÷ ��� Ȯ��");
			System.out.println("4. ���ĵ� ��÷ ��� Ȯ��");
			System.out.println("5. ��÷ ��� �˻�");
			System.out.println("9. ����");
			System.out.print("�Ŵ� ��ȣ ���� : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1 : insertObject(); break;
			case 2 : deleteObject(); break;
			case 3 : winObject(); break;
			case 4 : sortedWinObject(); break;
			case 5 : searchWinner(); break;
			case 9 : System.out.println("���α׷� ����"); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}			
		}
	}

	private void insertObject() {
		System.out.print("�߰��� ��÷ ��� �� : ");
		int lotteryNum = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= lotteryNum; i++) {
			System.out.print("��÷�� �̸� : ");
			String name = sc.nextLine();
			String phone = null;
			do {
				System.out.print("�ڵ��� ��ȣ('-'����) : ");
				phone = sc.nextLine();			
				if (phone.contains("-")) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				}
			} while (phone.contains("-"));

//			Lottery l = new Lottery(name, phone);
//			lc.insertObject(l);
			if (!lc.insertObject(new Lottery(name, phone))) { // �ߺ� ��ü���� Set�� �������� ���� false��ȯ���� ���
				System.out.println("�ߺ��� ����Դϴ�. �ٽ� �Է��ϼ���.");
				i--; // i��°���� �ٽ� �Էµ� �� �ֵ��� i--����
			}
			System.out.println();
		}
		
		if (!(lotteryNum < 1)) {
			System.out.println(lotteryNum + "�� �߰� �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("1�� �̻� �Է����ּ���.");
		}

	}

	private void deleteObject() {
		System.out.println("������ ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
		System.out.print("������ ��� �̸� : ");
		String name = sc.nextLine();
		
		String phone = null;
		do {
			System.out.print("�ڵ��� ��ȣ('-'����) : ");
			phone = sc.nextLine();			
			if (phone.contains("-")) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		} while (phone.contains("-"));
		
		if (lc.deletObject(new Lottery(name, phone))) {
			System.out.println("���� �Ϸ� �Ǿ����ϴ�.");
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
		
	}

	private void winObject() {
		
		if (lc.winObject().size() != 0) {
			System.out.println(lc.winObject()); // Set�� ���� ���� ���� �ȵ�
		} else {
			System.out.println("��÷ ����ڰ� 4�� �̻��̾�� �մϴ�. ��÷ ����ڸ� �߰����ּ���.");
		}
	}

	private void sortedWinObject() {
		
		TreeSet<Lottery> sortedWin = lc.sortedWinObject();
		Iterator<Lottery> it = sortedWin.iterator(); // lc.sortedWinObject()���� ��ȯ ���� Set��ü�� Iterator�� it�� ���
		
		if (sortedWin.size() != 0) {
			while(it.hasNext()) {// Iterator.hasNext():boolean <- ���� ��Ұ� �����ϸ� true��ȯ/ �ƴϸ� false ��ȯ
				Lottery l = it.next(); // Iterator.next():Lottery <- ���� ��Ҹ� ��ȯ
				System.out.println(l);
			}
		} else {
			System.out.println("��÷ ����ڰ� 4�� �̻��̾�� �մϴ�. ��÷ ����ڸ� �߰����ּ���.");
		}

	}

	private void searchWinner() {
		System.out.println("�˻��� ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
		System.out.print("�˻��� ��� �̸� : ");
		String name = sc.nextLine();
		
		String phone = null;
		do {
			System.out.print("�ڵ��� ��ȣ('-'����) : ");
			phone = sc.nextLine();			
			if (phone.contains("-")) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		} while (phone.contains("-"));
		
		if (lc.searchWinner(new Lottery(name, phone))) {
			System.out.println("�����մϴ�. ��÷ ��Ͽ� �����մϴ�.");
		} else {
			System.out.println("��Ÿ������ ��÷ ��Ͽ� �������� �ʽ��ϴ�.");
		}
	}

}
