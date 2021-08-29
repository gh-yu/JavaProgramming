package com.kh.practice.chap01.poly.view;

import java.util.Scanner;

import com.kh.practice.chap01.poly.controller.LibraryController;
import com.kh.practice.chap01.poly.model.vo.AniBook;
import com.kh.practice.chap01.poly.model.vo.Book;
import com.kh.practice.chap01.poly.model.vo.CookBook;
import com.kh.practice.chap01.poly.model.vo.Member;

public class LibraryMenu {

	Scanner sc = new Scanner(System.in);
	LibraryController lc = new LibraryController();

	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		char gender = ' ';
		do {
			System.out.print("성별(F/M) : ");
			gender = sc.next().toUpperCase().charAt(0);
			
			if (gender != 'F' && gender != 'M') {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} while (!(gender == 'F' || gender == 'M'));

		Member mem = new Member(name, age, gender); // new연산자를 통해 Member클래스 타입의 객체 생성(Heap메모리 영역에)
													// name, age, gender 각각 자료형이 다른 변수의 값을 저장하기 위함 
													// 이 자료형을 매개변수로 가지는 Member클래스의  생성자 호출 -> Member클래스 필드 해당 값으로 초기화
												    // 객체 생성할때 발생한 주소 값을 Member타입의 mem 참조변수에 대입
													// 이제 Member클래스의 객체의 참조변수인 mem을 통해 Member클래스의 메소드에 접근할 수 있고, 주소값 넘겨줄 수 있음
		lc.insertMember(mem);

		System.out.println();
		while (true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			sc.nextLine();
			switch (menuNum) {
			case 1:
				System.out.println(lc.myInfo());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			System.out.println();
		}

	}


	private void selectAll() {
		Book[] bList = lc.selectAll();
		
		for (int i = 0; i < bList.length; i++) {
			System.out.println(i + "번 도서 : " + bList[i]);
		}
		
	}
	
	private void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keword = sc.nextLine();
		
		Book[] searchList = lc.searchBook(keword);
			
//		if (searchList.toString().contains(keword)) { // 오류 코드 : 주소값이랑 keword 비교하는 문장
//	    searchList.toString() ==  searchList : ture  // 부모 클래스 Object클래스의 toString() 메소드 사용, 반환값 searchList의 주소값
		
		if (searchList.length != 0) { // 키워드와 일치하는 제목이 없으면 count, 즉 배열길이가  0인 객체배열의 주소값이 반환되기 때문애 searchList.length는 0이 된다
			for (int i = 0; i < searchList.length; i++) {
				
				if (searchList[i] instanceof AniBook) {
//					System.out.println(((AniBook)searchList[i]).toString());
					System.out.println((searchList[i]).toString()); 
					// 동적바인딩 : 상속 관계로 다형성이 적용된 경우, 자식클래스에서 부모클래스의 메소드 오버라이딩 해놓았으면
					//           부모클래스의 toString() 메소드가 아닌 자식클래스인 AniBook에서 오버라이딩한 toString() 메소드 우선적으로 호툴
				} else if (searchList[i] instanceof CookBook) {
					System.out.println(((CookBook)searchList[i]).toString());
				}
				
			}
		} else {
			System.out.println("해당 제목의 도서가 존재하지 않습니다.");
		}

	}


	private void rentBook() {
		selectAll();
		System.out.println();
		while (true) {
			System.out.print("대여할 도서 번호 선택 : ");
			int index = sc.nextInt();
			
			if (index > 0 || index <= 4) {
				
				int result = lc.rentBook(index);
				if (result == 0) {
					System.out.println("성공적으로 대여되었습니다.");
				} else if (result == 1) {
					System.out.println("나이 제한으로 대여 불가능입니다.");
				} else if (result == 2) {
					System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
				}
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	
	}


}
