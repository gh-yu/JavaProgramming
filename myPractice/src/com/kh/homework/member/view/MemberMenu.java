package com.kh.homework.member.view;

import java.util.Scanner;

import com.kh.homework.member.controller.MemberController;
import com.kh.homework.member.model.vo.Member;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);

	MemberController mc = new MemberController();

	public MemberMenu() {
	}

	public void mainMenu() {

		while (true) {
			if (!(mc.existMemberNum() == 10)) {
				System.out.println("최대 등록 가능한 회원 수는 " + MemberController.SIZE + "명입니다.");
				System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명입니다.");

				System.out.println("1. 새 회원 등록");
			} else if (mc.existMemberNum() == 10) {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();

			sc.nextLine();
			switch (menuNum) {
			case 1: insertMember(); break;
			case 2: searchMember(); break;
			case 3: updateMember(); break;
			case 4: deleteMember(); break;
			case 5: printAll(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}

	}

	public void insertMember() {

		while (true) {

			System.out.println("새 회원을 등록합니다.");
			System.out.print("아이디 : ");
			String id = sc.nextLine();

			while (mc.checkId(id)) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요");
				System.out.print("아이디 : ");
				id = sc.nextLine();
			}

			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			System.out.print("이메일 : ");
			String email = sc.nextLine();
			System.out.print("성별(M/F) : ");
			char gender = sc.nextLine().charAt(0);

			while (!(gender == 'F' || gender == 'f' || gender == 'M' || gender == 'm')) {
				System.out.println("성병을 다시 입력하세요.");
				System.out.print("성별(M/F) : ");
				gender = sc.nextLine().charAt(0);
			}

			System.out.print("나이 : ");
			int age = sc.nextInt();
			mc.insertMember(id, name, password, email, gender, age);
			break;
		}

	}

	public void searchMember() {

		while (true) {
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();

			sc.nextLine();
			switch (menuNum) {
			case 1: searchId(); break;
			case 2: searchName(); break;
			case 3: searchEmail(); break;
			case 9: System.out.println("메인으로 돌아갑니다."); return;
			default: System.out.println("잘못 입력하셨습니다."); return;
			}
		}
	}

	public void searchId() { // id는 중복 검사해서 1개만 나올 수 밖에 없으니까 반복문 필요 없음
		System.out.print("검색할 아이디 : ");
		String id = sc.nextLine();

		if (mc.checkId(id)) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(mc.searchId(id));
		} else {
			System.out.println("검색 결과가 없습니다.");
		}
	}

//	public void searchId() {
//		System.out.print("검색할 아이디 : ");
//		String id = sc.nextLine();
//		
//		if (!(mc.searchId(id).equals(""))) {
//			System.out.println("찾으신 회원 조회 결과입니다.");
//			System.out.println(mc.searchId(id));
//		} else {
//			System.out.println("검색 결과가 없습니다.");
//		}
//	}

	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();

		Member[] arr = mc.searchName(name); // 반환된 Member클래스 타입의 객체 배열의 (참조변수에 담긴)주소값을 Member클래스 타입의 배열 arr참조변수에 대입
											// 입력받은 name과 Member타입 객체배열에 저장된 name을 비교하기 위해서 만듦
		
//		if (!(mc.searchName(name).equals(null))) { // 잘못된 코드 null값은 String형이 아님 ==으로 비교해야함
		if (mc.searchName(name) != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != null) { // NullPoinerException 방지
					if (arr[i].getName().equals(name)) { // arr[i]. 해서 Member클래스의 메소드 사용 가능 <- 여기서 Member타입 객체배열 arr 선언한 이유
						System.out.println(arr[i].inform());
					}
				} else {
					break;
				}
			}
		} else {
			System.out.println("검색 결과가 없습니다.");
		}

	}

	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String email = sc.nextLine();

		Member[] arr = mc.searchEmail(email);

		if (mc.searchEmail(email) != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");

//			for (int i = 0; i < arr.length; i++) {
//				if (arr[i] != null) {
//					if (arr[i].getEmail().equals(email)) {
//						System.out.println(arr[i].inform());
//					}
//				} else {
//					break;
//				}
//			}
		
			// 간단한 코드
			for (int i = 0; i < mc.existMemberNum(); i++) {
				if (arr[i].getEmail().equals(email)) {
					System.out.println(arr[i].inform());
				}
			}
			
		} else {
			System.out.println("검색 결과가 없습니다.");
		}

	}

	public void updateMember() {

		while (true) {
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일로 수정하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();

			sc.nextLine();
			switch (menuNum) {
			case 1: updatePassword(); break;
			case 2: updateName(); break;
			case 3: updateEmail(); break;
			case 9: System.out.println("메인으로 돌아갑니다."); return;
			default: System.out.println("잘못 입력하셨습니다."); return;
			}
		}
	}

	public void updatePassword() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 회원의 비밀번호 : ");
		String password = sc.nextLine();
		
		if (mc.updatePassword(id, password)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		
		
	}

	public void updateName() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 회원의 이름 : ");
		String name = sc.nextLine();
		
		if (mc.updateName(id, name)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		
	}
	
	public void updateEmail() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 회원의 이메일 : ");
		String email = sc.nextLine();
		
		if (mc.updateEmail(id, email)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}

	public void deleteMember() {
		
		while (true) {
			System.out.println("1. 특정 회원 삭제하기");
			System.out.println("2. 모든 회원 삭제하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			if (menuNum == 1) {
				deletOne();
				break;
			} else if (menuNum == 2) {
				deleteAll();
				break;
			} else if (menuNum == 9) {
				System.out.println("메인으로 돌아갑니다");
				return;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}	
		}
	}

	public void deletOne() {
		
		if (mc.existMemberNum() == 0) {
			System.out.println("등록된 회원이 없습니다.");
		} else {
			System.out.print("삭제할 회원의 아이디 : ");
			String id = sc.nextLine();
			
			while (true) {
				System.out.print("정말 삭제하시겠습니까?(y/n) : ");
				String str = sc.nextLine().toLowerCase();
				char input = str.charAt(0);
				
				if (input == 'y') {
					if (mc.checkId(id)) {
						mc.delete(id);
						System.out.println("성공적으로 삭제하였습니다.");
						return;
					} else {
						System.out.println("존재하지 않는 아이디입니다.");
						return;
					}
				} else if (input == 'n') {
					return;
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
		}	
	}

	public void deleteAll() {

		if (mc.existMemberNum() == 0) {
			System.out.println("등록된 회원이 없습니다.");
		} else {
			while (true) {
				System.out.print("정말 삭제하시겠습니까?(y/n) : ");
				String str = sc.nextLine().toLowerCase();
				char input = str.charAt(0);
				
				if (input == 'y') {
						mc.delete();
						System.out.println("성공적으로 삭제하였습니다.");
						return;
				}  else if (input == 'n') {
					return;
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}	
		}

	}

	public void printAll() {
		
		if (mc.existMemberNum() != 0) {
			
			Member[] arr = mc.printAll();
			
			for(int i = 0; i < mc.existMemberNum(); i++) {
				System.out.println(arr[i].inform()); 
			}
			
			
		} else {
			System.out.println("저장된 회원이 없습니다.");
		}
	
	}

}
