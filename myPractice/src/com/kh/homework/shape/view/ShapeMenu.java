package com.kh.homework.shape.view;

import java.util.Scanner;

import com.kh.homework.shape.controller.ShapeController;

public class ShapeMenu {
	Scanner sc = new Scanner(System.in);
	
	ShapeController spr = new ShapeController();
	
	public void inputMenu() {
		
		while (true) {
			System.out.println("===== 도형 프로그램 ====="); // (버그1) 잘못된 번호 눌렀을떼(입력할시) 출력문 계속 반복해야하기 때문에 while문 바깥이 아닌 안에
			System.out.println("3. 삼각형"); 				 //        만약 while문 바깥에 하면 잘못된 번호입니다. 출력 무한 반복
			System.out.println("4. 삼각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int inputNum = sc.nextInt();
			
			if (inputNum == 3 || inputNum == 4 || inputNum == 9) {
				
				switch (inputNum) {
				case 3 : triangleMenu(); break;
				case 4 : squareMenu(); break;
				case 9 : System.out.println("프로그램을 종료합니다."); return;
				}
				
//				break; // (버그3) break가 여기 있으면 삼각형 메뉴 가서 메인으로 돌아갑니다 누르면 
				       //        프로그램 종료 누르기 전에 현 메소드 종료 되고 런 클래스의 main메소드로 돌아감
	
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		}
	}
	
	public void triangleMenu() {	
		
		boolean check = false; // (버그2) check 선언 및 초기화 while문 안이 아닌 바깥에 해야 값 제대로 나옴, 반복하면서 false로 초기화되기 때문
		while (true) {
			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int inputNum = sc.nextInt();
			
			if (inputNum == 1 || inputNum == 2 || inputNum == 3 || inputNum == 9) {
				
				double height = 0.0;
				double width = 0.0;
				
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
				case 9 : 
					System.out.println("매인으로 돌아갑니다."); return;
				}
//			break; // (버그3) break가 여기 있으면 삼각형 메뉴 반복하지 않고 inputMenu() 메소드로 돌아감
				
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
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
						System.out.println("사각형의 높이 또는 너비가 설정되지 않았습니다.");
					}
					break;
				case 9 : System.out.println("매인으로 돌아갑니다."); return;
				}
	
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		}
	}
	
	public void inputData(int type, int menuNum) {
		
		double height = 0.0;
		double width = 0.0;
		
		if (type == 3) {
			
			switch (menuNum) {
			case 1 :
				System.out.print("높이 : ");
				height = sc.nextDouble(); 
				System.out.print("너비 : ");
				width = sc.nextDouble(); 			
				System.out.print("면적 : ");
				System.out.println(spr.calcArea(3, height, width));
				break;
			case 2 : 
				System.out.print("색깔 : ");
				String color = sc.next(); // nextLine() 으로 받게 되면 엔터까지 가져와서 문제 발생
				spr.paintColor(color);
				System.out.println("색이 설정되었습니다.");
			}
			
		} else if (type == 4) {
			
			switch (menuNum) {
			case 1 :
				System.out.print("높이 : ");
				height = sc.nextDouble(); 
				System.out.print("너비 : ");
				width = sc.nextDouble();
				System.out.print("돌레 : ");
				System.out.println(spr.calcPerimeter(4, height, width));
				break;
			case 2 : 
				System.out.print("높이 : ");
				height = sc.nextDouble(); 
				System.out.print("너비 : ");
				width = sc.nextDouble(); 			
				System.out.print("면적 : ");
				System.out.println(spr.calcArea(4, height, width));
				break;
			case 3 : 
				System.out.print("색깔 : ");
				String color = sc.next();
				spr.paintColor(color);
				System.out.println("색이 설정되었습니다.");
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
