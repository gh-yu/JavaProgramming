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
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			if (menuNum == 1) {
				circleMenu();
			} else if (menuNum == 2) {
				rectangleMenu();
			} else if (menuNum == 9) {
				System.out.println("프로그램을 종료합니다.");
				return;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
	}
	
	public void circleMenu() {
		
		while(true) {
			System.out.println("===== 원 메뉴 =====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			if (menuNum == 1) {
				calcCircum();
			} else if (menuNum == 2) {
				calcCircumArea();
			} else if (menuNum == 9) {
				System.out.println("메인으로 돌아갑니다.");
				return;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

		
	}
	

	public void rectangleMenu() {
		
		while(true) {
			System.out.println("===== 사각형 메뉴 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			if (menuNum == 1) {
				calcPerimete();
			} else if (menuNum == 2) {
				calcReactArea();
			} else if (menuNum == 9) {
				System.out.println("메인으로 돌아갑니다.");
				return;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

		
	}

	private void calcCircum() {
		
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		System.out.println("둘레 : " + cc.calcCircum(x, y, radius));
		
	}
	
	private void calcCircumArea() {
		
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		System.out.println("면적 : " + cc.calcArea(x, y, radius));
	}
	
	private void calcPerimete() {
		
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		System.out.println("둘레 : " + rc.calcPerimete(x, y, height, width));
		
	}
	
	private void calcReactArea() {

		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		System.out.println("면적 : " + rc.calcArea(x, y, height, width));
	}

}
