package com.kh.homework.shape.view;

import java.util.Scanner;

import com.kh.homework.shape.controller.ShapeController;

public class ShapeMenu {
	Scanner sc = new Scanner(System.in);
	
	ShapeController spr = new ShapeController();
	
	public void inputMenu() {
		
		while (true) {
			System.out.println("===== ���� ���α׷� ====="); 
			System.out.println("3. �ﰢ��"); 				 
			System.out.println("4. �ﰢ��");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
			int inputNum = sc.nextInt();
			
			switch (inputNum) {
			case 3 : triangleMenu(); break;
			case 4 : squareMenu(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���."); 
			}
		}
	}
	
	public void triangleMenu() {	
		
		boolean check = false;
		while (true) {
			System.out.println("===== �ﰢ�� =====");
			System.out.println("1. �ﰢ�� ����");
			System.out.println("2. �ﰢ�� ��ĥ");
			System.out.println("3. �ﰢ�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			int inputNum = sc.nextInt();
			
				
			switch (inputNum) {
			case 1 : 
				inputData(3, inputNum);
				check = true; // ���̿� �ʺ� �����Ǿ����� Ȯ��
				break;
			case 2 : 
				inputData(3, inputNum);
				break;
			case 3 : 
				if (check) {
					printlnform(3);
				} else {
					System.out.println("�ﰢ���� ���� �Ǵ� �ʺ� �������� �ʾҽ��ϴ�.");
				}
				break;
			case 9 : System.out.println("�������� ���ư��ϴ�."); return;
			default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
			}
		}
	}
	
	public void squareMenu() {
		
		boolean check = false;
		while (true) {
			System.out.println("===== �簢�� =====");
			System.out.println("1. �簢�� �ѷ�");
			System.out.println("2. �簢�� ����");
			System.out.println("3. �簢�� ��ĥ");
			System.out.println("4. �簢�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			int inputNum = sc.nextInt();
				
			switch (inputNum) {
			case 1 : case 2 :
				inputData(4, inputNum);
				check = true;
				break;
			case 3 : 
				inputData(4, inputNum);
				break;
			case 4 : 
				if (check) {
					printlnform(3);
				} else {
					System.out.println("�簢���� ���� �Ǵ� �ʺ� �������� �ʾҽ��ϴ�.");
				}
				break;
			case 9 : System.out.println("�������� ���ư��ϴ�."); return;
			default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
			}

		}
	}
	
	public void inputData(int type, int menuNum) {
		
		double height = 0.0;
		double width = 0.0;
		
		if (type == 3) { // �ﰢ�� �޴� ���ý�
			
			switch (menuNum) {
			case 1 :
				while (true) {
					System.out.print("���� : ");
					height = sc.nextDouble(); 
					System.out.print("�ʺ� : ");
					width = sc.nextDouble();
					if (height == 0 || width == 0) {
						System.out.println("0 �̻��� ���ڸ� �Է��� �����մϴ�. �ٽ� �Է����ּ���.");
					} else {
						System.out.print("���� : ");
						System.out.println(spr.calcArea(type, height, width));
						break;
					}
				}
				break;
			case 2 : 
				System.out.print("���� : ");
				String color = sc.next(); // nextLine() ���� �ް� �Ǹ� ���ͱ��� �����ͼ� ���� �߻�
				if (spr.paintColor(type, color).equals(color)) {
					System.out.println(color + "���� �����Ǿ����ϴ�.");
				} else {
					System.out.println("��ĥ�� �ﰢ���� ���� " + spr.paintColor(type, color) + " ���̿� �ʺ� ���� �������ּ���.");
				}
	
			}
			
		} else if (type == 4) { // �簢�� �޴� ���ý�
			
			switch (menuNum) {
			case 1 :
				while (true) {
					System.out.print("���� : ");
					height = sc.nextDouble(); 
					System.out.print("�ʺ� : ");
					width = sc.nextDouble();
					if (height == 0 || width == 0) {
						System.out.println("0 �̻��� ���ڸ� �Է��� �����մϴ�. �ٽ� �Է����ּ���.");
					} else {
						System.out.print("���� : ");
						System.out.println(spr.calcPerimeter(type, height, width));
						break;
					}
				}
				break;
			case 2 : 
				while (true) {
					System.out.print("���� : ");
					height = sc.nextDouble(); 
					System.out.print("�ʺ� : ");
					width = sc.nextDouble();
					if (height == 0 || width == 0) {
						System.out.println("0 �̻��� ���ڸ� �Է��� �����մϴ�. �ٽ� �Է����ּ���.");
					} else {
						System.out.print("���� : ");
						System.out.println(spr.calcArea(type, height, width));
						break;
					}
				}
				break;
			case 3 : 
				System.out.print("���� : ");
				String color = sc.next(); // nextLine() ���� �ް� �Ǹ� ���ͱ��� �����ͼ� ���� �߻�
				System.out.println(spr.paintColor(type, color));
				if (spr.paintColor(type, color).equals(color)) {
					System.out.println(color + "���� �����Ǿ����ϴ�.");
				} else {
					System.out.println("��ĥ�� �簢���� ���� " + spr.paintColor(type, color) + " ���̿� �ʺ� ���� �������ּ���.");
				}
	
//				System.out.print("���� : ");
//				String color = sc.next();
//				spr.paintColor(color);
//				System.out.println("���� �����Ǿ����ϴ�.");
			}
		}
			
	}
	
//	public void printlnform(int type) {
//		
//		if (type == 3) {
//				System.out.println(spr.print());
//		} else if (type == 4) {
//				System.out.println(spr.print());
//		}
//		
//	}
	
	public void printlnform(int type) {
		
		if (type == 3) {
				System.out.println(spr.print(type));
		} else if (type == 4) {
				System.out.println(spr.print(type));
		}
		
	}
	
}
