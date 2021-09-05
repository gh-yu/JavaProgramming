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
		System.out.println("========== 추첨 프로그램 ==========");
		while (true) {
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("매뉴 번호 선택 : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1 : insertObject(); break;
			case 2 : deleteObject(); break;
			case 3 : winObject(); break;
			case 4 : sortedWinObject(); break;
			case 5 : searchWinner(); break;
			case 9 : System.out.println("프로그램 종료"); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}			
		}
	}

	private void insertObject() {
		System.out.print("추가할 추첨 대상 수 : ");
		int lotteryNum = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= lotteryNum; i++) {
			System.out.print("추첨자 이름 : ");
			String name = sc.nextLine();
			String phone = null;
			do {
				System.out.print("핸드폰 번호('-'빼고) : ");
				phone = sc.nextLine();			
				if (phone.contains("-")) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			} while (phone.contains("-"));

//			Lottery l = new Lottery(name, phone);
//			lc.insertObject(l);
			if (!lc.insertObject(new Lottery(name, phone))) { // 중복 객체여서 Set에 저장하지 못해 false반환됐을 경우
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				i--; // i번째부터 다시 입력될 수 있도록 i--해줌
			}
			System.out.println();
		}
		
		if (!(lotteryNum < 1)) {
			System.out.println(lotteryNum + "명 추가 완료되었습니다.");
		} else {
			System.out.println("1명 이상 입력해주세요.");
		}

	}

	private void deleteObject() {
		System.out.println("석재헐 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("삭제할 대상 이름 : ");
		String name = sc.nextLine();
		
		String phone = null;
		do {
			System.out.print("핸드폰 번호('-'빼고) : ");
			phone = sc.nextLine();			
			if (phone.contains("-")) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} while (phone.contains("-"));
		
		if (lc.deletObject(new Lottery(name, phone))) {
			System.out.println("삭제 완료 되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
		
	}

	private void winObject() {
		
		if (lc.winObject().size() != 0) {
			System.out.println(lc.winObject()); // Set은 저장 순서 유지 안됨
		} else {
			System.out.println("추첨 대상자가 4명 이상이어야 합니다. 추첨 대상자를 추가해주세요.");
		}
	}

	private void sortedWinObject() {
		
		TreeSet<Lottery> sortedWin = lc.sortedWinObject();
		Iterator<Lottery> it = sortedWin.iterator(); // lc.sortedWinObject()에서 반환 받은 Set객체의 Iterator를 it에 담기
		
		if (sortedWin.size() != 0) {
			while(it.hasNext()) {// Iterator.hasNext():boolean <- 다음 요소가 존재하면 true반환/ 아니면 false 반환
				Lottery l = it.next(); // Iterator.next():Lottery <- 다음 요소를 반환
				System.out.println(l);
			}
		} else {
			System.out.println("추첨 대상자가 4명 이상이어야 합니다. 추첨 대상자를 추가해주세요.");
		}

	}

	private void searchWinner() {
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("검색할 대상 이름 : ");
		String name = sc.nextLine();
		
		String phone = null;
		do {
			System.out.print("핸드폰 번호('-'빼고) : ");
			phone = sc.nextLine();			
			if (phone.contains("-")) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} while (phone.contains("-"));
		
		if (lc.searchWinner(new Lottery(name, phone))) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}
	}

}
