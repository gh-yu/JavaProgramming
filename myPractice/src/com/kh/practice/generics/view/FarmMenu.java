package com.kh.practice.generics.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
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
			System.out.print("�޴� ��ȣ ���� : ");
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
			System.out.println("4. ��깰 ���");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ ���� : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			if (menuNum == 1) {
				addNewKind();
			} else if (menuNum == 2) {
				removeKind();
			}  else if (menuNum == 3) {
				changeAmount();
			} else if (menuNum == 4) {
				printFarm();
			} else if (menuNum == 9) {
				System.out.println("�������� ���ư��ϴ�."); return;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}

	private void customerMenu() {
		
		while (true) {
			printFarm();
			System.out.println();
			System.out.println("***** �� �޴� *****");
			System.out.println("1. ��깰 ���");
			System.out.println("2. ��깰 ����");
			System.out.println("3. ������ ��깰 ����");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ ���� : ");
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
			System.out.println("1. ���� / 2. ä��/ 3. �߰�");
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
			}
			
			System.out.print("�߰� ��깰�� �̸� : ");
			String name = sc.nextLine();
			System.out.print("�߰� ��깰�� ���� : ");
			int amount = Integer.parseInt(sc.nextLine());
				
			if (kind == "����" && fc.addNewKind(new Fruit(kind, name), amount)) {
				System.out.println("�� ��깰�� �߰��Ǿ����ϴ�.");
				break;
			} else if(kind == "ä��" && fc.addNewKind(new Vegetable(kind, name), amount)) {
				System.out.println("�� ��깰�� �߰��Ǿ����ϴ�.");
				break;
			} else if (kind == "�߰�" && fc.addNewKind(new Nut(kind, name), amount)) {
				System.out.println("�� ��깰�� �߰��Ǿ����ϴ�.");
				break;
			} else {
				System.out.println("�� ��깰 �߰��� �����Ͽ����ϴ�. �ٽ� �Է����ּ���.");
			}
		}

		
	}

	private void removeKind() {
		
		while (true) {
			System.out.println("1. ���� / 2. ä��/ 3. �߰�");
			System.out.print("������ ���� ��ȣ : ");
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
			}
		
			System.out.print("������ ��깰�� �̸� : ");
			String name = sc.nextLine();
			
			if (kind == "����" && fc.removeKind(new Fruit(kind, name))) {
				System.out.println("��깰 ������ �����Ͽ����ϴ�.");
				break;
			} else if (kind == "ä��" && fc.removeKind(new Vegetable(kind, name))) {
				System.out.println("��깰 ������ �����Ͽ����ϴ�.");
				break;
			} else if (kind == "�߰�" && fc.removeKind(new Nut(kind, name))) {
				System.out.println("��깰 ������ �����Ͽ����ϴ�.");
				break;
			} else {		
				System.out.println("��깰 ������ �����Ͽ����ϴ�. �ٽ� �Է����ּ���.");
			}
		}		
	}

	private void changeAmount() {
		
		while (true) {
			System.out.println("1. ���� / 2. ä��/ 3. �߰�");
			System.out.print("������ ���� ��ȣ : ");
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
			}
		
			System.out.print("������ ��깰�� �̸� : ");
			String name = sc.nextLine();
			System.out.print("������ ���� : ");
			int amount = Integer.parseInt(sc.nextLine());
			
			if (kind == "����" && fc.changeAmount(new Fruit(kind, name), amount)) {
				System.out.println("��깰 ������ �����Ǿ����ϴ�.");
				break;
			} else if (kind == "ä��" && fc.changeAmount(new Vegetable(kind, name), amount)) {
				System.out.println("��깰 ������ �����Ǿ����ϴ�.");
				break;
			} else if (kind == "�߰�" && fc.changeAmount(new Nut(kind, name), amount)) {
				System.out.println("��깰 ������ �����Ǿ����ϴ�.");
				break;
			} else {		
				System.out.println("��깰 ���� ������ �����Ͽ����ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}

	private void printFarm() {
		
		System.out.println("���� MY��Ʈ ��깰 ����");
		
		HashMap<Farm, Integer> hMap =  fc.printFarm();
		
//		 ��� 1.
		Set<Farm> farm = hMap.keySet();
		Iterator<Farm> it = farm.iterator();
		
		while(it.hasNext()) {
			Farm f = it.next();
			System.out.println(f + "(" + hMap.get(f) + "��)"); 
		} 
		// ���� ���ε� : ��� ����, ������ ����� ��� -> �޼ҵ� �������̵��� �Ǿ� ������ �������̵��� �޼ҵ� �ڵ� �켱�� ����
		// Fruit, vegetable, Nut��ü ������ �̸� ��ȯ�ϵ��� toString �������̵� �Ǿ� ����
		
//		while(it.hasNext()) {			
//			Farm f = it.next();
//			if (f instanceof Fruit) {
//				Fruit fruit = (Fruit)f;
//				System.out.println(fruit + "(" + hMap.get(f) + "��)"); // hMap.get(fruit)�� ����
//			} else if (f instanceof Vegetable) {
//				Vegetable vege = (Vegetable)f;
//				System.out.println(vege + "(" + hMap.get(f) + "��)");
//			} else if (f instanceof Nut) {
//				Nut nut = (Nut)f;
//				System.out.println(nut + "(" + hMap.get(f) + "��)");
//			} 
//		}
		
		// ��� 2. lambda expression		
//		hMap.forEach((key, value) -> {
//			System.out.println(key + "(" + value + "��)");
//		});
		
//		hMap.forEach((key, value) -> {
//			if (key instanceof Fruit) {
//				Fruit fruit = (Fruit)key;
//				System.out.println(fruit.getKind() + ": " + 
//		                   fruit.getName() + "(" + hMap.get(key) + ")");
//			} else if (key instanceof Vegetable) {
//				Vegetable vege = (Vegetable)key;
//				System.out.println(vege.getKind() + ": " +
//				                   vege.getName() + "(" + hMap.get(key) + ")");
//			} else if (key instanceof Nut) {
//				Nut n = (Nut)key;
//				System.out.println(n.getKind() + ": " +
//				                   n.getName() + "(" + hMap.get(key) + ")");
//			} 
//		});
		
	   // ��� 3. entrySet(), ���� for�����
//	   Set<Entry<Farm, Integer>> entries = hMap.entrySet();
//	   
//	   for (Entry<Farm, Integer> entry : entries) {
//		   System.out.println(entry.getKey() + "(" + entry.getValue() + "��)");
//	   }
	   
	}
	

	private void buyFarm() {
		
		while (true) {
			System.out.println("1. ���� / 2. ä��/ 3. �߰�");
			System.out.print("������ ���� ��ȣ : ");
			int kindNum = Integer.parseInt(sc.nextLine());
			String kind = null;
			switch (kindNum) {
			case 1 : kind = "����"; break;
			case 2 : kind = "ä��"; break;
			case 3 : kind = "�߰�"; break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		
			System.out.print("������ ��깰�� �̸� : ");
			String name = sc.nextLine();
			
			Farm f = new Farm();
			switch (kind) {
			case "����" : f = new Fruit(kind, name); break;
			case "ä��" : f = new Vegetable(kind, name); break;
			case "�߰�" : f = new Nut(kind, name);
			}
			if (fc.buyFarm(f)) {
				System.out.println("���ſ� �����Ͽ����ϴ�.");
				break;
			} else {		
				System.out.println("��Ʈ�� ���� �����̰ų� ������ �����ϴ�. �ٽ� �Է����ּ���.");
			}
		}	
	}

	private void removeFarm() {
		
		while (true) {
			System.out.println("1. ���� / 2. ä��/ 3. �߰�");
			System.out.print("���� ����� ���� ��ȣ : ");
			int kindNum = Integer.parseInt(sc.nextLine());
			String kind = null;
			switch (kindNum) {
			case 1 : kind = "����"; break;
			case 2 : kind = "ä��"; break;
			case 3 : kind = "�߰�"; break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		
			System.out.print("���� ����� ��깰�� �̸� : ");
			String name = sc.nextLine();
			
			Farm f = new Farm();
			switch (kind) {
			case "����" : f = new Fruit(kind, name); break;
			case "ä��" : f = new Vegetable(kind, name); break;
			case "�߰�" : f = new Nut(kind, name);
			}
			if (fc.removeFarm(f)) {
				System.out.println("���� ��ҿ� �����Ͽ����ϴ�.");
				break;
			} else {		
				System.out.println("���� ��Ͽ� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
			}
		}	
	}

	private void printBuyFarm() {
		System.out.println("MY��Ʈ ���� ���");
		ArrayList<Farm> list = fc.printBuyFarm();
		
		// ���1. �ε��� �̿�
//		for(int i = 0; i < list.size(); i++) {
//			if (list.get(i) instanceof Fruit) {
//				Fruit fruit = (Fruit)list.get(i);
//				System.out.println(fruit.getKind() + ": " + fruit.getName());
//			} else if (list.get(i) instanceof Vegetable) {
//				Vegetable vege = (Vegetable)list.get(i);
//				System.out.println(vege.getKind() + ": " + vege.getName());
//			} else if (list.get(i) instanceof Nut) {
//				Nut nut = (Nut)list.get(i);
//				System.out.println(nut.getKind() + ": " + nut.getName());
//			} 
//		}
		
		// ���2. Iterator���
		Iterator<Farm> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		while(it.hasNext()) {
//			Farm f = it.next();
//			if (f instanceof Fruit) {
//				Fruit fruit = (Fruit)f;
//				System.out.println(fruit);
//			} else if (f instanceof Vegetable) {
//				Vegetable vege = (Vegetable)f;
//				System.out.println(vege);
//			} else if (f instanceof Nut) {
//				Nut nut = (Nut)f;
//				System.out.println(nut);
//			} 
//			
//		}
	}

}
