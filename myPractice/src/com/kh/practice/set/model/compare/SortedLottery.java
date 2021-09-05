package com.kh.practice.set.model.compare;

import java.util.Comparator;

import com.kh.practice.set.model.vo.Lottery;

public class SortedLottery implements Comparator<Lottery> {

	@Override
	public int compare(Lottery o1, Lottery o2) {
		
//		int result = o1.getName().compareTo(o2.getName());
////	if (o1.getName() == o2.getName()) { // 이름이 같은 경우
//		if (result == 0) { // 이름이 같은 경우
//			result = o1.getPhone().compareTo(o2.getPhone());
//		} 
//		
//		return result;
		
		int result = o1.getName().compareTo(o2.getName());
		if (result == 0) { // 이름이 같은 경우
			return o1.getPhone().compareTo(o2.getPhone());
		} else {
			return result;
		}	 

	}

}
