package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	
	HashMap<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMembership(String id, Member m) {
		
		if (!map.containsKey(id)) {
			map.put(id, m);
			return true;
		} else {
			return false;
		}
	}

	public String login(String id, String password) {
		
//		String keyId = null;
		
		// ���� ���� id�� map�� �����ϰ�(map�� key(���⼱ id)�� �ߺ� ���� �Ұ�, �ش��ϴ� id ���� 1��), �� id�� �ش��ϴ� value(Member)�� password�� ����ڰ� �Է��� password�� ��ġ�ϸ�
//		if (map.containsKey(id) && map.get(id).getPassword().equals(password)) { 
		//  map�� id���� ��ġ�ϴ� key���� �ִ���, id�� �ش��ϴ� value�� password�� �Ű������� ���� password�� ������ �˻� ���⼭ �������
//			Iterator<String> it = map.keySet().iterator();
//			while (it.hasNext()) {
//				keyId = it.next();
//				if (keyId.equals(id)) {
//					return map.get(keyId).getName(); // HashMap.get(Object key):Member <- Ű ���� ���ε� value��(��ü�� �ּ�) ��ȯ
//											       	 // Member.getName() ��ȯ�� Member�� �ʵ��� name�� �� ��ȯ
//				}
//			}
//		}	
//		return keyId;
		
		Member m = map.get(id);
		if (map.containsKey(id) && m.getPassword().equals(password)) { 
			return m.getName();
		}
		return null;

	}

	public boolean changePassword(String id, String oldPw, String newPw) {
		
		// ���̵� �����ϸ鼭 ����� ��й�ȣ�� ����ڰ� �Է��� ��й�ȣ(oldPw)�� ������
		if (map.containsKey(id) && map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw); // ���ο� ��й�ȣ�� �ٲٱ�  (oldPw�� newPw�� ����)
			return true;
		} else {
			return false;
		}

	}

	public boolean changeName(String id, String newName) {
		
		if (map.containsKey(id)) {
			map.get(id).setName(newName);
			return true;
		} else {
			return false;
		}

	}

	public TreeMap<String, Member> sameName(String searchName) {
		
		Iterator<String> it = map.keySet().iterator();
		TreeMap<String, Member> tm = new TreeMap<String, Member>(); // Key�� �������� �������� �������ִ� Ŭ����
		
		while (it.hasNext()) {
			String keyId = it.next();
			//  Key���� �ش��ϴ� value���� Member��ü�� name�� ���� ���� searchName�� ������
			if (map.get(keyId).getName().equals(searchName)) {
				
				tm.put(keyId, map.get(keyId));
			}
		}
		
		return tm;

	}

}
