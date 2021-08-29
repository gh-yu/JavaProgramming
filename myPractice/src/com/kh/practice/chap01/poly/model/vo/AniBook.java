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
//		return super.toString(); // �θ�Ŭ������ toString�޼ҵ� �ҷ��� ��ȯ �� ����
		return "AniBook [" + super.toString() +  ", accessAge=" + accessAge + "]"; // �θ�Ŭ������ toString�޼ҵ� ���ۼ�(�������̵�)
	}

}
