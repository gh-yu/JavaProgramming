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
		//             업캐스팅
		bList[0] = new CookBook("야무지게 집밥", "자취생", "Cooking Class", true);
		bList[1] = new AniBook("너와 나의", "아무개", "Love", 19);
		bList[2] = new AniBook("핑구", "이땡땡", "코믹북", 12);
		bList[3] = new CookBook("맛있게 베이킹", "빵집사장", "빵집문학", false);
		bList[4] = new CookBook("특별한 날을 위한 요리", "김쉐프", "Cooking Class", true);
		
	} // 초기화 블럭, 객체 생성할 때마다 해당 문장으로 초기화됨
	
	public void insertMember(Member mem) {
		this.mem = mem; // 이 클래스에서 선언하고 null로 초기화한 Member객체에다가 매개변수로 전달받은 Members객체의 주소값을 대입 (얕은 복사)
	}

	public Member myInfo() {
		return mem; // mem을 반환하면 Member객체의 대표값인 주소 값이 반환되는게 아니라, 오버라이딩한 toString()메소드를 통해 회원의 정보를 대표값으로 반환함
	}

	public Book[] selectAll() {
		
		return bList; // 도서 전체 목록이 담겨 있는 객체배열 bList 주소값을 리턴
	}

	public Book[] searchBook(String keword) {
		
		Book[] searchList = new Book[5]; // 객체배열에 저장된 도서목록이 5개(객체가 5개), 검색 결과도 최대 5개
		
		int count = 0;
		for (int i = 0; i < bList.length; i++) {
			
//			if (keword.contains(bList[i].toString())) { // String클래스의 contains 메소드 제대로 이해 못하고 짠 코드 keword와 bList[i].toString() 자리 바꿔야 함
//		 										        // 자리 바꾸면 title, author, publisher 포함된  toString메소드의 반환값인 문자열이랑 비교하게 됨
//				searchList[count] = bList[i];
//				count += 1;
//			}
			
			// 도서명과 keword 비교
			if (bList[i].getTitle().contains(keword)) { // String클래스.contains() <- 문자열 내 해당 char를 포함하고 있으면 true 반환
				searchList[count] = bList[i];
				count ++;
		    }
		}
		
		searchList = Arrays.copyOf(searchList, count); // 배열크기를 count 값으로 해서 새로운 배열 만든 것을 기존 참조변수에다 대입 (깊은 복사)
		// 이 방법 안 쓸거면 여기서 반환한 searchList 주소값을 
		// LibraryMenu클래스 메소드에서 새로 객체 배열에 저장해서 출력할때 i번째 인덱스가 null이 아니면 출력하면 됨
		
		return searchList;
	}


	public int rentBook(int index) {
		
		int result = 0;
		if (bList[index] instanceof AniBook) {
			//    다운캐스팅
			if (((AniBook)bList[index]).getAccessAge() > mem.getAge()) { // ((AniBook)bList[index]) 클래스타입으로 cast할때  이렇게 감싸줘야 함
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
