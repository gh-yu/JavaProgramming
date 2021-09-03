package com.kh.example.map.model.compare;

import java.util.Comparator;

import com.kh.example.map.model.vo.Snack;

public class SnackComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2); // 내림차순으로 정렬
		
	}


//	@Override
//	public int compare(String o1, String o2) {
//		
//		String standard = o1.getFlavor();
//		String object = o2.getFlavor();
//		
//		if (standard.equals(object)) {
//			if (o1.getPrice() > o2.getPrice()) {
//				return -1;
//			} else if (o1.getPrice() == o2.getPrice()) {
//				return 0;
//			} else {
//				return 1;
//			}
//		}
//		
//		return 0;
//	}
	 
	
}	
