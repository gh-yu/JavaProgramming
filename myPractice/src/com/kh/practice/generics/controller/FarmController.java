package com.kh.practice.generics.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.practice.generics.model.vo.Farm;

public class FarmController {

	HashMap<Farm, Integer> hMap = new HashMap<Farm, Integer>(); // 마트 농산물 저장용 (Key 중복 저장 불가)
	ArrayList<Farm> list = new ArrayList<Farm>(); // 고객이 구매한 농산물 저장용 (중복 저장 가능)
	
	public boolean addNewKind(Farm f, int amount) {
		
		if (hMap.containsKey(f)) {
			return false;
		} else {
			hMap.put(f, amount);
			return true;
		}
	}

	
	public boolean removeKind(Farm f) {
		
		if (hMap.containsKey(f)) {
			hMap.remove(f);
			return true;
		} else {
			return false;
		}
	}


	public boolean changeAmount(Farm f, int amount) {
		
		if (hMap.containsKey(f)) {
//			hMap.replace(f, amount);
			return hMap.replace(f, hMap.get(f), amount);
		} else {
			return false;
		}
	}


	public HashMap<Farm, Integer> printFarm() {
		return hMap;
	}


	public boolean buyFarm(Farm f) {
		
		if (hMap.containsKey(f) && hMap.get(f) > 0) { // f가 hMap에 존재, f 수량 0개 이상일때
			list.add(f); // list에 f 추가
			hMap.replace(f, hMap.get(f) - 1); // hMap에 f의 수량 1 감소
		    return true;
		} else {
			return false;
		}

	}


	public boolean removeFarm(Farm f) {
		
		if (list.contains(f)) {
			hMap.replace(f, hMap.get(f) + 1);
			list.remove(f);
			return true;
		} else {
			return false;
		}
	}


	public ArrayList<Farm> printBuyFarm() {
		return list;
	}
	
	
	
	
	
}
