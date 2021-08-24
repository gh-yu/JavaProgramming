package com.kh.homework.shape.view;

import java.util.Scanner;

import com.kh.homework.shape.controller.ShapeController;

public class ShapeMenu {
	Scanner sc = new Scanner(System.in);
	
	ShapeController spr = new ShapeController();
	
	public void inputMenu() {
		
		while (true) {
			System.out.println("===== ���� ���α׷� ====="); // (����1) �߸��� ��ȣ ��������(�Է��ҽ�) ��¹� ��� �ݺ��ؾ��ϱ� ������ while�� �ٱ��� �ƴ� �ȿ�
			System.out.println("3. �ﰢ��"); 				 //        ���� while�� �ٱ��� �ϸ� �߸��� ��ȣ�Դϴ�. ��� ���� �ݺ�
			System.out.println("4. �ﰢ��");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
			int inputNum = sc.nextInt();
			
			if (inputNum == 3 || inputNum == 4 || inputNum == 9) {
				
				switch (inputNum) {
				case 3 : triangleMenu(); break;
				case 4 : squareMenu(); break;
				case 9 : System.out.println("���α׷��� �����մϴ�."); return;
				}
				
//				break; // (����3) break�� ���� ������ �ﰢ�� �޴� ���� �������� ���ư��ϴ� ������ 
				       //        ���α׷� ���� ������ ���� �� �޼ҵ� ���� �ǰ� �� Ŭ������ main�޼ҵ�� ���ư�
	
			} else {
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
			}
		}
	}
	
	public void triangleMenu() {	
		
		boolean check = false; // (����2) check ���� �� �ʱ�ȭ while�� ���� �ƴ� �ٱ��� �ؾ� �� ����� ����, �ݺ��ϸ鼭 false�� �ʱ�ȭ�Ǳ� ����
		while (true) {
			System.out.println("===== �ﰢ�� =====");
			System.out.println("1. �ﰢ�� ����");
			System.out.println("2. �ﰢ�� ��ĥ");
			System.out.println("3. �ﰢ�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			int inputNum = sc.nextInt();
			
			if (inputNum == 1 || inputNum == 2 || inputNum == 3 || inputNum == 9) {
				
				double height = 0.0;
				double width = 0.0;
				
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
				case 9 : 
					System.out.println("�������� ���ư��ϴ�."); return;
				}
//			break; // (����3) break�� ���� ������ �ﰢ�� �޴� �ݺ����� �ʰ� inputMenu() �޼ҵ�� ���ư�
				
			} else {
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
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
			
			if (inputNum == 1 || inputNum == 2 || inputNum == 3 || inputNum == 4 || inputNum == 9) {
				
				double height = 0.0;
				double width = 0.0;
				
				switch (inputNum) {
				case 1 :
					inputData(4, inputNum);
					check = true;
					break;
				case 2 : 
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
				}
	
			} else {
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
			}
		}
	}
	
	public void inputData(int type, int menuNum) {
		
		double height = 0.0;
		double width = 0.0;
		
		if (type == 3) {
			
			switch (menuNum) {
			case 1 :
				System.out.print("���� : ");
				height = sc.nextDouble(); 
				System.out.print("�ʺ� : ");
				width = sc.nextDouble(); 			
				System.out.print("���� : ");
				System.out.println(spr.calcArea(3, height, width));
				break;
			case 2 : 
				System.out.print("���� : ");
				String color = sc.next(); // nextLine() ���� �ް� �Ǹ� ���ͱ��� �����ͼ� ���� �߻�
				spr.paintColor(color);
				System.out.println("���� �����Ǿ����ϴ�.");
			}
			
		} else if (type == 4) {
			
			switch (menuNum) {
			case 1 :
				System.out.print("���� : ");
				height = sc.nextDouble(); 
				System.out.print("�ʺ� : ");
				width = sc.nextDouble();
				System.out.print("���� : ");
				System.out.println(spr.calcPerimeter(4, height, width));
				break;
			case 2 : 
				System.out.print("���� : ");
				height = sc.nextDouble(); 
				System.out.print("�ʺ� : ");
				width = sc.nextDouble(); 			
				System.out.print("���� : ");
				System.out.println(spr.calcArea(4, height, width));
				break;
			case 3 : 
				System.out.print("���� : ");
				String color = sc.next();
				spr.paintColor(color);
				System.out.println("���� �����Ǿ����ϴ�.");
			}
		}
			
	}
	
	public void printlnform(int type) {
		
		if (type == 3) {
				System.out.println(spr.print());
		} else if (type == 4) {
				System.out.println(spr.print());
		}
		
	}
	
}
