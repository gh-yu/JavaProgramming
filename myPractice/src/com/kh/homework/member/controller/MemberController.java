package com.kh.homework.member.controller;

import com.kh.homework.member.model.vo.Member;

public class MemberController {
	Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	public int existMemberNum() {
		
//		if (m[0] == null) {
//			m[0] = new Member();
//		}
		int i = 0;
		int count = 0;
		while (i < SIZE) {
			if (m[i] != null) { // 정보 입력해 초기화한 배열인덱스 번호의 객체까지만 while문 돌게 하기 위한 조건, 직접 초기화하지 않으면 객체의 기본값은 null이다.
//				i++; // if문 안에 이 코드만 있으면 중간 인덱스의 회원 정보 삭제하면 값 이상하게 나옴
				count += 1; // count에 1 더한 값 저장하기
			}
			i++;
		} 
		return count;
	}
	
	public Boolean checkId(String inputId) {
		
//		for (int i = 0; i < SIZE; i++) {
//			if (!(m[i] == null)) {
//				if (inputId.equals(m[i].getId())) {
//					return true; // 중복이 있다, 아이디가 존재한다 -> true 반환
//				} 
//			} else {
//				break;
//			}
//		}
		
		for (int i = 0; i < SIZE; i++) {	
			if (m[i] != null) {
				if (inputId.equals(m[i].getId())) {
					return true; // 중복이 있다, 아이디가 존재한다 -> true 반환
				} 
			}
		}
		return false; // 중복(아이디 존재하는지) 발견 못했으면 false 반환
	}
	
	public void insertMember(String id, String name, String password,
								String email, char gender, int age) {
		
		m[existMemberNum()] = new Member(id, name, password, email, gender, age);

	}
	
//	public String searchId(String id) {
//		
//		for (int i = 0; i < SIZE; i++) { 
//			if (!(m[i] == null)) { // 정보 입력해 초기화한 배열인덱스 번호의 객체까지만 while문 돌게 하기 위한 조건
//				if (m[i].getId().equals(id)) {
//					return m[i].inform();
//				}
//			} else {
//				break;
//			}
//		}
////		return "검색 결과가 없습니다."
//		return "";
//	}
	
	public String searchId(String id) {
		
		for (int i = 0; i < SIZE; i++) { 
			if (m[i] != null) {
				if (m[i].getId().equals(id)) {
					return m[i].inform();
				}
			}
		}
		return "";
	}
	
	public Member[] searchName(String name) {
		
		for (int i = 0; i < SIZE; i++) { 
			if (m[i] != null) {
				if (m[i].getName().equals(name)) {
					return m;
				}
			}
		}
		return null;
	}
	
	public Member[] searchEmail(String email) {
		
		for (int i = 0; i < SIZE; i++) {
			if (m[i] != null) {
				if (m[i].getEmail().equals(email)) {
					return m;
				}
			}
		}
		return null;
	}
	
	public Boolean updatePassword(String id, String password) {

		if (checkId(id)) {
			for (int i = 0; i < SIZE; i++) {
				if (m[i] != null) {
					if (m[i].getId().equals(id)) {
						m[i].setPassword(password);
						return true; // 수정 성공 = ture
					}
				}
			}
		}
		return false;

	}

	public Boolean updateName(String id, String name) {
		
		if(checkId(id)) {
			for (int i = 0; i < SIZE; i++) {
				if (m[i] != null) {
					if (m[i].getId().equals(id)) {
						m[i].setName(name);
						return true;
					} 
				}
			}
		}
		return false;
	}
	
	public Boolean updateEmail(String id, String email) {
		
		if (checkId(id)) {
			for (int i = 0; i < SIZE; i++) {
				if (m[i] != null) {
					if (m[i].getEmail().equals(email)) {
						m[i].setEmail(email);
						return true; 
					}
				}
			}
		} 
		return false;
	}
	
	public Boolean delete(String id) {
		
		for (int i = 0; i < SIZE; i++) {
			if (m[i] != null) {
				if (m[i].getId().equals(id)) {
					m[i] = null;
					return true; // 삭제 성공 = true
				}
			}
		}
		return false;
	}
	
	public void delete() {
		
		for (int i = 0; i < SIZE; i++) {
			m[i] = null;
		}
		
	}
	
	public Member[] printAll() {
	
		return m;
	}
	
	
}
