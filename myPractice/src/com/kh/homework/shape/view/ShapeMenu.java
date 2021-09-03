package com.kh.homework.shape.view;

import java.util.Scanner;

import com.kh.homework.shape.controller.ShapeController;

public class ShapeMenu {
	Scanner sc = new Scanner(System.in);
	
	ShapeController spr = new ShapeController();
	
	public void inputMenu() {
		
		while (true) {
			System.out.println("===== 도형 프로그램 ====="); 
			System.out.println("3. 삼각형"); 				 
			System.out.println("4. 삼각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int inputNum = sc.nextInt();
			
			switch (inputNum) {
			case 3 : triangleMenu(); break;
			case 4 : squareMenu(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못된 번호입니다. 다시 입력하세요."); 
			}
		}
	}
	
	public void triangleMenu() {	
		
		boolean check = false;
		while (true) {
			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int inputNum = sc.nextInt();
			
				
			switch (inputNum) {
			case 1 : 
				inputData(3, inputNum);
				check = true; // 높이와 너비가 설정되었는지 확인
				break;
			case 2 : 
				inputData(3, inputNum);
				break;
			case 3 : 
				if (check) {
					printlnform(3);
				} else {
					System.out.println("삼각형의 높이 또는 너비가 설정되지 않았습니다.");
				}
				break;
			case 9 : System.out.println("매인으로 돌아갑니다."); return;
			default : System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		}
	}
	
	public void squareMenu() {
		
		boolean check = false;
		while (true) {
			System.out.println("===== 사각형 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
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
					System.out.println("사각형의 높이 또는 너비가 설정되지 않았습니다.");
				}
				break;
			case 9 : System.out.println("매인으로 돌아갑니다."); return;
			default : System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}

		}
	}
	
	public void inputData(int type, int menuNum) {
		
		double height = 0.0;
		double width = 0.0;
		
		if (type == 3) { // 삼각형 메뉴 선택시
			
			switch (menuNum) {
			case 1 :
				while (true) {
					System.out.print("높이 : ");
					height = sc.nextDouble(); 
					System.out.print("너비 : ");
					width = sc.nextDouble();
					if (height == 0 || width == 0) {
						System.out.println("0 이상의 숫자만 입력이 가능합니다. 다시 입력해주세요.");
					} else {
						System.out.print("면적 : ");
						System.out.println(spr.calcArea(type, height, width));
						break;
					}
				}
				break;
			case 2 : 
				System.out.print("색깔 : ");
				String color = sc.next(); // nextLine() 으로 받게 되면 엔터까지 가져와서 문제 발생
				if (spr.paintColor(type, color).equals(color)) {
					System.out.println(color + "으로 설정되었습니다.");
				} else {
					System.out.println("색칠할 삼각형이 없어 " + spr.paintColor(type, color) + " 높이와 너비를 먼저 설정해주세요.");
				}
	
			}
			
		} else if (type == 4) { // 사각형 메뉴 선택시
			
			switch (menuNum) {
			case 1 :
				while (true) {
					System.out.print("높이 : ");
					height = sc.nextDouble(); 
					System.out.print("너비 : ");
					width = sc.nextDouble();
					if (height == 0 || width == 0) {
						System.out.println("0 이상의 숫자만 입력이 가능합니다. 다시 입력해주세요.");
					} else {
						System.out.print("돌레 : ");
						System.out.println(spr.calcPerimeter(type, height, width));
						break;
					}
				}
				break;
			case 2 : 
				while (true) {
					System.out.print("높이 : ");
					height = sc.nextDouble(); 
					System.out.print("너비 : ");
					width = sc.nextDouble();
					if (height == 0 || width == 0) {
						System.out.println("0 이상의 숫자만 입력이 가능합니다. 다시 입력해주세요.");
					} else {
						System.out.print("면적 : ");
						System.out.println(spr.calcArea(type, height, width));
						break;
					}
				}
				break;
			case 3 : 
				System.out.print("색깔 : ");
				String color = sc.next(); // nextLine() 으로 받게 되면 엔터까지 가져와서 문제 발생
				System.out.println(spr.paintColor(type, color));
				if (spr.paintColor(type, color).equals(color)) {
					System.out.println(color + "으로 설정되었습니다.");
				} else {
					System.out.println("색칠할 사각형이 없어 " + spr.paintColor(type, color) + " 높이와 너비를 먼저 설정해주세요.");
				}
	
//				System.out.print("색깔 : ");
//				String color = sc.next();
//				spr.paintColor(color);
//				System.out.println("색이 설정되었습니다.");
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
