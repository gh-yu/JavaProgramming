package com.kh.practice.map.view;

import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {

	MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.println("========= MY 사이트 ==========");
		while (true) {
			System.out.println("***** 메인 메뉴 *****");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1 : joinMembership(); break;
			case 2 : login(); break;
			case 3 : sameName(); break;
			case 9 : System.out.println("프로그램 종료"); return;
			default : System.out.println("잚못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}
	}

	private void memberMenu() {
		while (true) {
			System.out.println("***** 회원 메뉴 *****");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1 : changePassword(); break;
			case 2 : changeName(); break;
			case 3 : System.out.println("로그아웃 되었습니다."); return;
			default : System.out.println("잚못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}


	private void joinMembership() {
		System.out.print("아이디 : ");
		String id = sc.nextLine().trim();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine().trim();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		Member m = new Member(password, name);
		if (mc.joinMembership(id, m)) {
			System.out.println("성공적으로 회원가입 완료되었습니다.");
		} else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
	}

	private void login() {
		System.out.print("아이디 : ");
		String id = sc.nextLine().trim(); 
		System.out.print("비밀번호 : ");
		String password = sc.nextLine().trim();
		
		String name = mc.login(id, password);
		if (name != null) {
			System.out.println(name + "님, 환영합니다!");
			memberMenu(); 
		} else {
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
		}
	}

	private void changePassword() {
		System.out.print("아이디 : ");
		String id = sc.nextLine().trim(); 
		System.out.print("비밀번호 : ");
		String oldPw = sc.nextLine().trim();
		System.out.print("변경할 비밀번호 : ");
		String newPw = sc.nextLine().trim();
		
		if (mc.changePassword(id, oldPw, newPw)) {
			System.out.println("비밀번호 변경에 성공했습니다.");
		} else {
			System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
		}
	}

	private void changeName() {
		System.out.print("아이디 : ");
		String id = sc.nextLine().trim(); 
		System.out.print("비밀번호 : ");
		String password = sc.nextLine().trim();
		String oldName = mc.login(id, password);
		System.out.println("현재 설정된 이름 : " + oldName);
		
		System.out.print("변경할 이름 : ");
		String newName = sc.nextLine();
		
		if (mc.changeName(id, newName)) {
			System.out.println("이름 변경에 성공했습니다.");
		} else {
			System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
		}
		
	}
	
	private void sameName() {
		System.out.print("검색할 이름 : ");
		String searchName = sc.nextLine();
		
		TreeMap<String, Member> tm = mc.sameName(searchName);
		
		if (tm != null) {
			Set<Entry<String, Member>> set = tm.entrySet();
			Iterator<Entry<String, Member>> it = set.iterator();
			while (it.hasNext()) {
				Entry<String, Member> entry = it.next();
//				System.out.println(entry.getKey() + "-" + entry.getValue()); // entry.getValue()에서 객체 주소값 반환하는데, toString메소드 오버라이딩해서 name값 반환하게 해놓았음
				System.out.println(entry.getKey() + "-" + entry.getValue().getName()); 
			}
		} else {
			System.out.println("해당하는 이름이 존재하지 않습니다.");
		}

	}

}
