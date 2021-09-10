package com.kh.practice.generics.view;

import java.util.Scanner;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {
	
	FarmController fc = new FarmController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		while (true) {
			System.out.println("========== MY ��Ʈ ==========");
			System.out.println("***** ���� �޴� *****");
			System.out.println("1. ���� �޴�");
			System.out.println("2. �մ� �޴�");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ ���� :");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			if (menuNum == 1) {
				adminMenu();
			} else if (menuNum == 2) {
				customerMenu();
			} else if (menuNum == 9) {
				System.out.println("���α׷� ����"); return;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	
	}

	private void adminMenu() {
		
		while (true) {
			System.out.println("***** ���� �޴� *****");
			System.out.println("1. �� ��깰 �߰�");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ ���� :");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			if (menuNum == 1) {
				addNewKind();
			} else if (menuNum == 2) {
				removeKind();
			}  else if (menuNum == 3) {
				printFarm();
			} else if (menuNum == 9) {
				System.out.println("�������� ���ư��ϴ�."); return;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	

	private void customerMenu() {
		System.out.println("���� MY��Ʈ ��깰 ����");
		printFarm();
		
		while (true) {
			System.out.println("***** �� �޴� *****");
			System.out.println("1. ��깰 ���");
			System.out.println("2. ��깰 ����");
			System.out.println("3. ������ ��깰 ����");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ ���� :");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			if (menuNum == 1) {
				buyFarm();
			} else if (menuNum == 2) {
				removeFarm();
			}  else if (menuNum == 3) {
				printBuyFarm();
			} else if (menuNum == 9) {
				System.out.println("�������� ���ư��ϴ�."); return;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}

	private void addNewKind() {
		
		while (true) {
			System.out.println("1. ���� /2. ä��/ 3. �߰�");
			System.out.print("�߰��� ���� ��ȣ : ");
			int kindNum = Integer.parseInt(sc.nextLine());
			String kind = null;
			if (kindNum == 1) {
				kind = "����";
			} else if (kindNum == 2) {
				kind = "ä��";
			} else if (kindNum == 3) {
				kind = "�߰�";
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				break;
			}
			
			System.out.print("�߰� ��깰�� �̸� : ");
			String name = sc.nextLine();
			System.out.print("�߰� ��깰�� ���� : ");
			int amount = Integer.parseInt(sc.nextLine());
			
			if (kind == "����" && fc.addNewKind(new Fruit(kind, name), amount)) {
				System.out.println("�� ��깰�� �߰��Ǿ����ϴ�.");
			} else if(kind == "ä��" && fc.addNewKind(new Vegetable(kind, name), amount)) {
				System.out.println("�� ��깰�� �߰��Ǿ����ϴ�.");
			} else if (kind == "�߰�" && fc.addNewKind(new Nut(kind, name), amount)) {
				System.out.println("�� ��깰�� �߰��Ǿ����ϴ�.");
			} else {
				System.out.println("�� ��깰 �߰��� �����Ͽ����ϴ�. �ٽ� �Է����ּ���.");
			}
			
		}

		
		
	
	}

	private void removeKind() {
		
	}

	private void printFarm() {
		
	}
	

	private void buyFarm() {
		
	}

	private void removeFarm() {
		
	}

	private void printBuyFarm() {
		
	}

}
