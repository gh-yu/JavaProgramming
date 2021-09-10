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
			System.out.println("========== MY 마트 ==========");
			System.out.println("***** 메인 메뉴 *****");
			System.out.println("1. 직원 메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 :");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			if (menuNum == 1) {
				adminMenu();
			} else if (menuNum == 2) {
				customerMenu();
			} else if (menuNum == 9) {
				System.out.println("프로그램 종료"); return;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	
	}

	private void adminMenu() {
		
		while (true) {
			System.out.println("***** 직원 메뉴 *****");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 :");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			if (menuNum == 1) {
				addNewKind();
			} else if (menuNum == 2) {
				removeKind();
			}  else if (menuNum == 3) {
				printFarm();
			} else if (menuNum == 9) {
				System.out.println("메인으로 돌아갑니다."); return;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	

	private void customerMenu() {
		System.out.println("현재 MY마트 농산물 수량");
		printFarm();
		
		while (true) {
			System.out.println("***** 고객 메뉴 *****");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 :");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			if (menuNum == 1) {
				buyFarm();
			} else if (menuNum == 2) {
				removeFarm();
			}  else if (menuNum == 3) {
				printBuyFarm();
			} else if (menuNum == 9) {
				System.out.println("메인으로 돌아갑니다."); return;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	private void addNewKind() {
		
		while (true) {
			System.out.println("1. 과일 /2. 채소/ 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			int kindNum = Integer.parseInt(sc.nextLine());
			String kind = null;
			if (kindNum == 1) {
				kind = "과일";
			} else if (kindNum == 2) {
				kind = "채소";
			} else if (kindNum == 3) {
				kind = "견과";
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
			
			System.out.print("추가 농산물의 이름 : ");
			String name = sc.nextLine();
			System.out.print("추가 농산물의 수량 : ");
			int amount = Integer.parseInt(sc.nextLine());
			
			if (kind == "과일" && fc.addNewKind(new Fruit(kind, name), amount)) {
				System.out.println("새 농산물이 추가되었습니다.");
			} else if(kind == "채소" && fc.addNewKind(new Vegetable(kind, name), amount)) {
				System.out.println("새 농산물이 추가되었습니다.");
			} else if (kind == "견과" && fc.addNewKind(new Nut(kind, name), amount)) {
				System.out.println("새 농산물이 추가되었습니다.");
			} else {
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
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
