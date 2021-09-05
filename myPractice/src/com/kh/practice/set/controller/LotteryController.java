package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {

	HashSet<Lottery> lottery = new HashSet<Lottery>(); // 추첨 대상자 Set
	HashSet<Lottery> win  = new HashSet<Lottery>();    // 당첨 대상자 Set
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}

	public boolean deletObject(Lottery l) {
		
		boolean result = lottery.remove(l); // l과 일치하는 요소가 있어 삭제되면 true 반환
		if (win != null && result) { // 당첨자 목록이 존재하고 lottery에 있는 요소 중 하나가 삭제가 됐으면
			win.remove(l);           // 당첨자 Set에서도 l과 일치하는 요소 삭제
		}
		return result;
	}

	public HashSet<Lottery> winObject() { // lottery Set에 있는 요소들 랜덤으로 뽑아 win Set에 넣기
		// 삭제된 추첨 대상자가 있다면 기존에 당첨된 사람은 제외하고 삭제된 사람의 자리만 새로운 추첨자로 채움
		
		ArrayList<Lottery> list = new ArrayList<Lottery>(lottery);

//		if (list.size() >= 4) {
//			for (int i = 0; i < 4; i++) { // 당첨자 수 4명
//				win.add(list.get(i));
//			}
//		}
		if (list.size() >= 4) {
			while (win.size() !=  4) {
				int num = (int)(Math.random() * list.size()); // 랜덤으로 뽑아서 넣는 방법
				win.add(list.get(num));
			}
		}

		return win;
	}

	public TreeSet<Lottery> sortedWinObject() {
//		ArrayList<Lottery> winList = new ArrayList<Lottery>(win); // win Set을 List에 담아
////	Collections.sort(winList, new SortedLottery()); // Collections의 sort메소드 이용하여 정렬
//		winList.sort(new SortedLottery()); // 
		
		TreeSet<Lottery> sortedWin = new TreeSet<Lottery>(new SortedLottery());  // 정렬기준 있는 TreeSet객체 생성
		sortedWin.addAll(winObject()); // sortedWin에 winObject()의 반환값인 win Set의 모든 요소 담기
		
		return sortedWin;
	}

	public boolean searchWinner(Lottery l) {
		
		return winObject().contains(l) ;
	}

}
