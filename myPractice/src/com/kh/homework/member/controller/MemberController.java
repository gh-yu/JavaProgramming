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
			if (m[i] != null) { // ���� �Է��� �ʱ�ȭ�� �迭�ε��� ��ȣ�� ��ü������ while�� ���� �ϱ� ���� ����, ���� �ʱ�ȭ���� ������ ��ü�� �⺻���� null�̴�.
//				i++; // if�� �ȿ� �� �ڵ常 ������ �߰� �ε����� ȸ�� ���� �����ϸ� �� �̻��ϰ� ����
				count += 1; // count�� 1 ���� �� �����ϱ�
			}
			i++;
		} 
		return count;
	}
	
	public Boolean checkId(String inputId) {
		
//		for (int i = 0; i < SIZE; i++) {
//			if (!(m[i] == null)) {
//				if (inputId.equals(m[i].getId())) {
//					return true; // �ߺ��� �ִ�, ���̵� �����Ѵ� -> true ��ȯ
//				} 
//			} else {
//				break;
//			}
//		}
		
		for (int i = 0; i < SIZE; i++) {	
			if (m[i] != null) {
				if (inputId.equals(m[i].getId())) {
					return true; // �ߺ��� �ִ�, ���̵� �����Ѵ� -> true ��ȯ
				} 
			}
		}
		return false; // �ߺ�(���̵� �����ϴ���) �߰� �������� false ��ȯ
	}
	
	public void insertMember(String id, String name, String password,
								String email, char gender, int age) {
		
		m[existMemberNum()] = new Member(id, name, password, email, gender, age);

	}
	
//	public String searchId(String id) {
//		
//		for (int i = 0; i < SIZE; i++) { 
//			if (!(m[i] == null)) { // ���� �Է��� �ʱ�ȭ�� �迭�ε��� ��ȣ�� ��ü������ while�� ���� �ϱ� ���� ����
//				if (m[i].getId().equals(id)) {
//					return m[i].inform();
//				}
//			} else {
//				break;
//			}
//		}
////		return "�˻� ����� �����ϴ�."
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
						return true; // ���� ���� = ture
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
					return true; // ���� ���� = true
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
