package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	
	BookController bc = new BookController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		while (true) {
			System.out.println("===== Welcome Library =====");
			System.out.println();
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1 : insertBook(); break;
			case 2 : selectList(); break;
			case 3 : selectBook(); break;
			case 4 : deleteBook(); break;
			case 5 : ascBook(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}

	}

	private void insertBook() {
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();

		String strCategory = null;
		while (true) {
			System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
			int category = sc.nextInt();
			if (category == 1) {
				strCategory = "인문"; break;
			} else if (category == 2) {
				strCategory = "과학"; break;
			} else if (category == 3) {
				strCategory = "외국어"; break;
			} else if (category == 4) {
				strCategory = "기타"; break;
			} else { 
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		Book b = new Book(title, author, strCategory, price); // Book클래스의 객체 생성, 생성자 매개변수로 값 넘겨줘 필드 초기화
		bc.insertBook(b); // controller에 위에서 생성한 객체 주소값 보내기
		
	}

	private void selectList() { // 도서 전체 조회용 view 메소드
		System.out.println("===== 도서 전체 조회 =====");
		
//		ArrayList<Book> list = new ArrayList<Book>(); 
//		list = bc.selectBook();
//		ArrayList<Book> list = new ArrayList<Book>(bc.selectList()); // 이렇게도 가능
		ArrayList<Book> list = bc.selectList(); // bc.selectList() 호출한 반환값인 컬렉션을 list 컬렉션에 저장

		boolean check = false;
		for (int i = 0; i < list.size(); i++) { // 컬렉션의 각 요소 한 줄씩 출력하기
			if (list.get(i) != null) {
				System.out.println("        " + list.get(i)); // 오른쪽으로 정렬해서 출력
				check = true; // 도서가 하나라도 존재하면 true
			}
		} 
		if (!check) {
			System.out.println("존재하는 도서가 없습니다.");
		}

		
//		Iterator<Book> it = list.iterator(); // 2. Iterator 객체 생성해서 한 줄씩 출력
//		
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
	}

	private void selectBook() {
		System.out.println("===== 도서 검색 =====");
		System.out.print("검색 키워드 : "); // 도서명 키워드로 검색
		String keword = sc.nextLine();
	
//		if (bc.selectBook(keword) != null) {
//			for (int i = 0; i < bc.selectBook(keword).size(); i++) {
//				System.out.println("        " + bc.selectBook(keword).get(i));
//			}
//		}
		
		ArrayList<Book> listKeword = bc.selectBook(keword);
		
		boolean check = false; // 
		for (int i = 0; i < listKeword.size(); i++) {
			System.out.println("        " + listKeword.get(i));
			check = true; // for문 안에 들어왔다는 건 listKeword.size가 1 이상, 검색 결과가 있다는 의미
		}
		if (!check) {  // 검색한 결과 없으면
			System.out.println("검색 결과가 없습니다.");
		} // 이 check 과정을 controller에서 해도 됨. 검색 결과 없으면 null반환 -> view에서 null이면 검색 결과 없다고 출력
		
	}

	private void deleteBook() {
		System.out.println("===== 도서 삭제 =====");
		System.out.print("삭제할 도서 명 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자 명 : ");
		String author = sc.nextLine();
		
		if (bc.deleteBook(title, author) != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
		
	}

	private void ascBook() { 
		System.out.println("===== 도서 명 오름차순 정렬 =====");
	
		if (bc.ascBook() == 1) { // 메소드 호출시 오름차순 정렬 후 1 반환됨 
			ArrayList<Book> list = bc.selectList();
//			Collections.sort(list);
			
			boolean check = false;
			for (int i = 0; i < list.size(); i++) { // 컬렉션의 각 요소 한 줄씩 출력하기
				if (list.get(i) != null) {
					System.out.println("        " + list.get(i)); // 오른쪽으로 정렬해서 출력
					check = true; // 도서가 하나라도 존재하면 true
				}
			} 
			if (!check) {
				System.out.println("존재하는 도서가 없습니다.");
			}
		}
	}
}
