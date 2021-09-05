package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {

	HashSet<Lottery> lottery = new HashSet<Lottery>(); // ��÷ ����� Set
	HashSet<Lottery> win  = new HashSet<Lottery>();    // ��÷ ����� Set
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}

	public boolean deletObject(Lottery l) {
		
		boolean result = lottery.remove(l); // l�� ��ġ�ϴ� ��Ұ� �־� �����Ǹ� true ��ȯ
		if (win != null && result) { // ��÷�� ����� �����ϰ� lottery�� �ִ� ��� �� �ϳ��� ������ ������
			win.remove(l);           // ��÷�� Set������ l�� ��ġ�ϴ� ��� ����
		}
		return result;
	}

	public HashSet<Lottery> winObject() { // lottery Set�� �ִ� ��ҵ� �������� �̾� win Set�� �ֱ�
		// ������ ��÷ ����ڰ� �ִٸ� ������ ��÷�� ����� �����ϰ� ������ ����� �ڸ��� ���ο� ��÷�ڷ� ä��
		
		ArrayList<Lottery> list = new ArrayList<Lottery>(lottery);

//		if (list.size() >= 4) {
//			for (int i = 0; i < 4; i++) { // ��÷�� �� 4��
//				win.add(list.get(i));
//			}
//		}
		if (list.size() >= 4) {
			while (win.size() !=  4) {
				int num = (int)(Math.random() * list.size()); // �������� �̾Ƽ� �ִ� ���
				win.add(list.get(num));
			}
		}

		return win;
	}

	public TreeSet<Lottery> sortedWinObject() {
//		ArrayList<Lottery> winList = new ArrayList<Lottery>(win); // win Set�� List�� ���
////	Collections.sort(winList, new SortedLottery()); // Collections�� sort�޼ҵ� �̿��Ͽ� ����
//		winList.sort(new SortedLottery()); // 
		
		TreeSet<Lottery> sortedWin = new TreeSet<Lottery>(new SortedLottery());  // ���ı��� �ִ� TreeSet��ü ����
		sortedWin.addAll(winObject()); // sortedWin�� winObject()�� ��ȯ���� win Set�� ��� ��� ���
		
		return sortedWin;
	}

	public boolean searchWinner(Lottery l) {
		
		return winObject().contains(l) ;
	}

}
