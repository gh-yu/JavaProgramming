package com.kh.practice.chap01.poly.model.vo;

public class Book {

	
	private String title;
	private String author;
	private String publisher;


	public Book() {} // 매개변수 있는 생성자 만들 거면 기본 생성자도 선언해줘야 함
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		
		return "title=" + title + ", author=" + author + ", publisher=" + publisher;
	}


}
