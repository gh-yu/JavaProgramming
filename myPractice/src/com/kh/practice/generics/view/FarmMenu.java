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
			System.out.println("========== MY 마트 ==========");
			System.out.println("***** 메인 메뉴 *****");
			System.out.println("1. 직원 메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
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
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
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
				System.out.println("메인으로 돌아갑니다."); return;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	private void customerMenu() {
		
		while (true) {
			printFarm();
			System.out.println();
			System.out.println("***** 고객 메뉴 *****");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
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
			System.out.println("1. 과일 / 2. 채소/ 3. 견과");
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
			}
			
			System.out.print("추가 농산물의 이름 : ");
			String name = sc.nextLine();
			System.out.print("추가 농산물의 수량 : ");
			int amount = Integer.parseInt(sc.nextLine());
				
			if (kind == "과일" && fc.addNewKind(new Fruit(kind, name), amount)) {
				System.out.println("새 농산물이 추가되었습니다.");
				break;
			} else if(kind == "채소" && fc.addNewKind(new Vegetable(kind, name), amount)) {
				System.out.println("새 농산물이 추가되었습니다.");
				break;
			} else if (kind == "견과" && fc.addNewKind(new Nut(kind, name), amount)) {
				System.out.println("새 농산물이 추가되었습니다.");
				break;
			} else {
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
			}
		}

		
	}

	private void removeKind() {
		
		while (true) {
			System.out.println("1. 과일 / 2. 채소/ 3. 견과");
			System.out.print("삭제할 종류 번호 : ");
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
			}
		
			System.out.print("삭제할 농산물의 이름 : ");
			String name = sc.nextLine();
			
			if (kind == "과일" && fc.removeKind(new Fruit(kind, name))) {
				System.out.println("농산물 삭제에 성공하였습니다.");
				break;
			} else if (kind == "채소" && fc.removeKind(new Vegetable(kind, name))) {
				System.out.println("농산물 삭제에 성공하였습니다.");
				break;
			} else if (kind == "견과" && fc.removeKind(new Nut(kind, name))) {
				System.out.println("농산물 삭제에 성공하였습니다.");
				break;
			} else {		
				System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
			}
		}		
	}

	private void changeAmount() {
		
		while (true) {
			System.out.println("1. 과일 / 2. 채소/ 3. 견과");
			System.out.print("수정할 종류 번호 : ");
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
			}
		
			System.out.print("수정할 농산물의 이름 : ");
			String name = sc.nextLine();
			System.out.print("수정할 수량 : ");
			int amount = Integer.parseInt(sc.nextLine());
			
			if (kind == "과일" && fc.changeAmount(new Fruit(kind, name), amount)) {
				System.out.println("농산물 수량이 수정되었습니다.");
				break;
			} else if (kind == "채소" && fc.changeAmount(new Vegetable(kind, name), amount)) {
				System.out.println("농산물 수량이 수정되었습니다.");
				break;
			} else if (kind == "견과" && fc.changeAmount(new Nut(kind, name), amount)) {
				System.out.println("농산물 수량이 수정되었습니다.");
				break;
			} else {		
				System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
			}
		}
	}

	private void printFarm() {
		
		System.out.println("현재 MY마트 농산물 수량");
		
		HashMap<Farm, Integer> hMap =  fc.printFarm();
		
//		 방법 1.
		Set<Farm> farm = hMap.keySet();
		Iterator<Farm> it = farm.iterator();
		
		while(it.hasNext()) {
			Farm f = it.next();
			System.out.println(f + "(" + hMap.get(f) + "개)"); 
		} 
		// 동적 바인딩 : 상속 관계, 다형성 적용된 경우 -> 메소드 오버라이딩이 되어 있으면 오버라이딩된 메소드 코드 우선적 수행
		// Fruit, vegetable, Nut객체 종류와 이름 반환하도록 toString 오버라이딩 되어 있음
		
//		while(it.hasNext()) {			
//			Farm f = it.next();
//			if (f instanceof Fruit) {
//				Fruit fruit = (Fruit)f;
//				System.out.println(fruit + "(" + hMap.get(f) + "개)"); // hMap.get(fruit)도 가능
//			} else if (f instanceof Vegetable) {
//				Vegetable vege = (Vegetable)f;
//				System.out.println(vege + "(" + hMap.get(f) + "개)");
//			} else if (f instanceof Nut) {
//				Nut nut = (Nut)f;
//				System.out.println(nut + "(" + hMap.get(f) + "개)");
//			} 
//		}
		
		// 방법 2. lambda expression		
//		hMap.forEach((key, value) -> {
//			System.out.println(key + "(" + value + "개)");
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
		
	   // 방법 3. entrySet(), 향상된 for문사용
//	   Set<Entry<Farm, Integer>> entries = hMap.entrySet();
//	   
//	   for (Entry<Farm, Integer> entry : entries) {
//		   System.out.println(entry.getKey() + "(" + entry.getValue() + "개)");
//	   }
	   
	}
	

	private void buyFarm() {
		
		while (true) {
			System.out.println("1. 과일 / 2. 채소/ 3. 견과");
			System.out.print("구매할 종류 번호 : ");
			int kindNum = Integer.parseInt(sc.nextLine());
			String kind = null;
			switch (kindNum) {
			case 1 : kind = "과일"; break;
			case 2 : kind = "채소"; break;
			case 3 : kind = "견과"; break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		
			System.out.print("구매할 농산물의 이름 : ");
			String name = sc.nextLine();
			
			Farm f = new Farm();
			switch (kind) {
			case "과일" : f = new Fruit(kind, name); break;
			case "채소" : f = new Vegetable(kind, name); break;
			case "견과" : f = new Nut(kind, name);
			}
			if (fc.buyFarm(f)) {
				System.out.println("구매에 성공하였습니다.");
				break;
			} else {		
				System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
			}
		}	
	}

	private void removeFarm() {
		
		while (true) {
			System.out.println("1. 과일 / 2. 채소/ 3. 견과");
			System.out.print("구매 취소할 종류 번호 : ");
			int kindNum = Integer.parseInt(sc.nextLine());
			String kind = null;
			switch (kindNum) {
			case 1 : kind = "과일"; break;
			case 2 : kind = "채소"; break;
			case 3 : kind = "견과"; break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		
			System.out.print("구매 취소할 농산물의 이름 : ");
			String name = sc.nextLine();
			
			Farm f = new Farm();
			switch (kind) {
			case "과일" : f = new Fruit(kind, name); break;
			case "채소" : f = new Vegetable(kind, name); break;
			case "견과" : f = new Nut(kind, name);
			}
			if (fc.removeFarm(f)) {
				System.out.println("구매 취소에 성공하였습니다.");
				break;
			} else {		
				System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요.");
			}
		}	
	}

	private void printBuyFarm() {
		System.out.println("MY마트 구매 목록");
		ArrayList<Farm> list = fc.printBuyFarm();
		
		// 방법1. 인덱스 이용
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
		
		// 방법2. Iterator사용
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
