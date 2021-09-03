package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	public BookController() { // 초기 값 4개
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("사랑의 기술", "에리히 프롬", "인문", 12000));
		bookList.add(new Book("당신은 뇌를 고칠 수 있다", "톰 오브라이언", "건강", 19800));
	}
	
	public void insertBook(Book b) {
		
		bookList.add(b); // 컬렉션에 매개변수로 받은 객체 b 추가, 생성된 객체 list에 하나씩 담음
		
	}

	public ArrayList<Book> selectList() {
		
		return bookList;
		
	}

	public ArrayList<Book> selectBook(String keword) {
	
		ArrayList<Book> searchList = new ArrayList<Book>();
		for (int i = 0; i < bookList.size(); i++) {

			bookList.get(i);
			if (bookList.get(i).getTitle().contains(keword)) {
				searchList.add(bookList.get(i));
			}
		}
		
		return searchList; // 키워드가 포함된 Title을 가진 객체들을 모아놓은 컬렉션 반환
	}

	public Book deleteBook(String title, String author) {
		
		Book removeBook = null;
		
		for (int i = 0; i < bookList.size();) {
			
			if (bookList.get(i).getTitle().equals(title) && bookList.get(i).getAuthor().equals(author)) { // 도서 명도 같고 저자 명도 같으면
				removeBook = bookList.get(i); // 삭제 전 요소 b객체에 저장
				bookList.remove(bookList.get(i)); // 해당 컬렉션의 요소(객체) 삭제
				i = 0; // 삭제되고 나면 컬렉션 길이 새로 설정되기 때문에 index 0부터 다시 검색
			} else { // i++가 for문 선언 쪽에 있으면 위에서 i=0해도 i++한 1부터 검사하게 됨, 그래서 else{i++}로 증감식 따로 빼줌
				 i++;
			}
		}
		
//		if (list.size() > 0) { // title, author 일치하는 요소들 위에서 삭제시켜도, 일치하는 요소라도 요소 1개는 계속 남는 상황, 요소 1개 검색 따로 해줌
//			if (list.get(0).getTitle().equals(title) && list.get(0).getAuthor().equals(author)) { //  <- 위 for문에서 else{i++;} 로 해결
//				list.remove(list.get(0));
//		    }
//		}
		
		return removeBook; // 삭제한 적 없으면 null 반환될 것
		
	}

	public int ascBook() { // 도서 명 기준 오름차순 정렬

		// sort메소드 부르기 전, Book클래스에서 comparable인터페이스 상속받아 compareTo메소드 오버라이딩해서 정렬 기준 세워줘야 함
		// 내가 만든 클래스라 String클래스와 달리 만들어진 정렬기준이 없음. 정렬기준 세워주기 전에는 에러 뜸. 정렬기준이 있어야  sort메소드 제대로 작동함.
		Collections.sort(bookList);
		return 1;
	}

}
