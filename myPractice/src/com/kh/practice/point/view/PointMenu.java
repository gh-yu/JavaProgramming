package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {

	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		
		while (true) {
			System.out.println("===== �޴� =====");
			System.out.println("1. ��");
			System.out.println("2. �簢��");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();
			
			if (menuNum == 1) {
				circleMenu();
			} else if (menuNum == 2) {
				rectangleMenu();
			} else if (menuNum == 9) {
				System.out.println("���α׷��� �����մϴ�.");
				return;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
		}
	}
	
	public void circleMenu() {
		
		while(true) {
			System.out.println("===== �� �޴� =====");
			System.out.println("1. �� �ѷ�");
			System.out.println("2. �� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();
			
			if (menuNum == 1) {
				calcCircum();
			} else if (menuNum == 2) {
				calcCircumArea();
			} else if (menuNum == 9) {
				System.out.println("�������� ���ư��ϴ�.");
				return;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}

		
	}
	

	public void rectangleMenu() {
		
		while(true) {
			System.out.println("===== �簢�� �޴� =====");
			System.out.println("1. �簢�� �ѷ�");
			System.out.println("2. �簢�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();
			
			if (menuNum == 1) {
				calcPerimete();
			} else if (menuNum == 2) {
				calcReactArea();
			} else if (menuNum == 9) {
				System.out.println("�������� ���ư��ϴ�.");
				return;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}

		
	}

	private void calcCircum() {
		
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int radius = sc.nextInt();
		System.out.println("�ѷ� : " + cc.calcCircum(x, y, radius));
		
	}
	
	private void calcCircumArea() {
		
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int radius = sc.nextInt();
		
		System.out.println("���� : " + cc.calcArea(x, y, radius));
	}
	
	private void calcPerimete() {
		
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int height = sc.nextInt();
		System.out.print("�ʺ� : ");
		int width = sc.nextInt();
		
		System.out.println("�ѷ� : " + rc.calcPerimete(x, y, height, width));
		
	}
	
	private void calcReactArea() {

		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int height = sc.nextInt();
		System.out.print("�ʺ� : ");
		int width = sc.nextInt();
		
		System.out.println("���� : " + rc.calcArea(x, y, height, width));
	}

}
