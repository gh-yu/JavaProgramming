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
		
		// 전달 받은 id가 map에 존재하고(map에 key(여기선 id)는 중복 저장 불가, 해당하는 id 오직 1개), 그 id에 해당하는 value(Member)의 password가 사용자가 입력한 password와 일치하면
//		if (map.containsKey(id) && map.get(id).getPassword().equals(password)) { 
		//  map에 id값과 일치하는 key값이 있는지, id에 해당하는 value의 password가 매개변수로 받은 password와 같은지 검사 여기서 해줘야함
//			Iterator<String> it = map.keySet().iterator();
//			while (it.hasNext()) {
//				keyId = it.next();
//				if (keyId.equals(id)) {
//					return map.get(keyId).getName(); // HashMap.get(Object key):Member <- 키 값과 매핑된 value값(객체의 주소) 반환
//											       	 // Member.getName() 반환된 Member의 필드인 name의 값 반환
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
		
		// 아이디가 존재하면서 저장된 비밀번호와 사용자가 입력한 비밀번호(oldPw)가 같을때
		if (map.containsKey(id) && map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw); // 새로운 비밀번호로 바꾸기  (oldPw를 newPw로 변경)
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
		TreeMap<String, Member> tm = new TreeMap<String, Member>(); // Key를 기준으로 오름차순 정렬해주는 클래스
		
		while (it.hasNext()) {
			String keyId = it.next();
			//  Key값에 해당하는 value값인 Member객체의 name이 전달 받은 searchName과 같으면
			if (map.get(keyId).getName().equals(searchName)) {
				
				tm.put(keyId, map.get(keyId));
			}
		}
		
		return tm;

	}

}
