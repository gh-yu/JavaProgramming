package com.kh.practice.chap01.poly.model.vo;

public class AniBook extends Book {
	
	private int accessAge;
	
	public AniBook() {}
	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}
	
	
	public int getAccessAge() {
		return accessAge;
	}
	
	@Override
	public String toString() {
//		return super.toString(); // 부모클래스의 toString메소드 불러서 반환 값 리턴
		return "AniBook [" + super.toString() +  ", accessAge=" + accessAge + "]"; // 부모클래스의 toString메소드 재작성(오버라이딩)
	}

}
