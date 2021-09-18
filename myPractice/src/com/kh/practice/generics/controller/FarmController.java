package com.kh.practice.generics.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.practice.generics.model.vo.Farm;

public class FarmController {

	HashMap<Farm, Integer> hMap = new HashMap<Farm, Integer>(); // ��Ʈ ��깰 ����� (Key �ߺ� ���� �Ұ�)
	ArrayList<Farm> list = new ArrayList<Farm>(); // ���� ������ ��깰 ����� (�ߺ� ���� ����)
	
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
		
		if (hMap.containsKey(f) && hMap.get(f) > 0) { // f�� hMap�� ����, f ���� 0�� �̻��϶�
			list.add(f); // list�� f �߰�
			hMap.replace(f, hMap.get(f) - 1); // hMap�� f�� ���� 1 ����
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
