package com.kh.practice.chap01.poly.controller;

import java.util.Arrays;

import com.kh.practice.chap01.poly.model.vo.AniBook;
import com.kh.practice.chap01.poly.model.vo.Book;
import com.kh.practice.chap01.poly.model.vo.CookBook;
import com.kh.practice.chap01.poly.model.vo.Member;

public class LibraryController {

	Member mem = null;
	Book[] bList = new Book[5];
	
	{
		//             ��ĳ����
		bList[0] = new CookBook("�߹����� ����", "�����", "Cooking Class", true);
		bList[1] = new AniBook("�ʿ� ����", "�ƹ���", "Love", 19);
		bList[2] = new AniBook("�α�", "�̶���", "�ڹͺ�", 12);
		bList[3] = new CookBook("���ְ� ����ŷ", "��������", "��������", false);
		bList[4] = new CookBook("Ư���� ���� ���� �丮", "�车��", "Cooking Class", true);
		
	} // �ʱ�ȭ ��, ��ü ������ ������ �ش� �������� �ʱ�ȭ��
	
	public void insertMember(Member mem) {
		this.mem = mem; // �� Ŭ�������� �����ϰ� null�� �ʱ�ȭ�� Member��ü���ٰ� �Ű������� ���޹��� Members��ü�� �ּҰ��� ���� (���� ����)
	}

	public Member myInfo() {
		return mem; // mem�� ��ȯ�ϸ� Member��ü�� ��ǥ���� �ּ� ���� ��ȯ�Ǵ°� �ƴ϶�, �������̵��� toString()�޼ҵ带 ���� ȸ���� ������ ��ǥ������ ��ȯ��
	}

	public Book[] selectAll() {
		
		return bList; // ���� ��ü ����� ��� �ִ� ��ü�迭 bList �ּҰ��� ����
	}

	public Book[] searchBook(String keword) {
		
		Book[] searchList = new Book[5]; // ��ü�迭�� ����� ��������� 5��(��ü�� 5��), �˻� ����� �ִ� 5��
		
		int count = 0;
		for (int i = 0; i < bList.length; i++) {
			
//			if (keword.contains(bList[i].toString())) { // StringŬ������ contains �޼ҵ� ����� ���� ���ϰ� § �ڵ� keword�� bList[i].toString() �ڸ� �ٲ�� ��
//		 										        // �ڸ� �ٲٸ� title, author, publisher ���Ե�  toString�޼ҵ��� ��ȯ���� ���ڿ��̶� ���ϰ� ��
//				searchList[count] = bList[i];
//				count += 1;
//			}
			
			// ������� keword ��
			if (bList[i].getTitle().contains(keword)) { // StringŬ����.contains() <- ���ڿ� �� �ش� char�� �����ϰ� ������ true ��ȯ
				searchList[count] = bList[i];
				count ++;
		    }
		}
		
		searchList = Arrays.copyOf(searchList, count); // �迭ũ�⸦ count ������ �ؼ� ���ο� �迭 ���� ���� ���� ������������ ���� (���� ����)
		// �� ��� �� ���Ÿ� ���⼭ ��ȯ�� searchList �ּҰ��� 
		// LibraryMenuŬ���� �޼ҵ忡�� ���� ��ü �迭�� �����ؼ� ����Ҷ� i��° �ε����� null�� �ƴϸ� ����ϸ� ��
		
		return searchList;
	}


	public int rentBook(int index) {
		
		int result = 0;
		if (bList[index] instanceof AniBook) {
			//    �ٿ�ĳ����
			if (((AniBook)bList[index]).getAccessAge() > mem.getAge()) { // ((AniBook)bList[index]) Ŭ����Ÿ������ cast�Ҷ�  �̷��� ������� ��
				result = 1;
			}
		} else if (bList[index] instanceof CookBook) {
			if (((CookBook)bList[index]).getCoupon()) {
				mem.setCouponCount(1);
				result = 2;
			}
		}
		return result;
	}

}
