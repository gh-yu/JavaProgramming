package com.kh.practice.chap01.poly.model.vo;

public class CookBook extends Book {

	private boolean coupon;

	public CookBook() {}
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}
	
	public boolean getCoupon() {
		return coupon;
	}
	
	@Override
	public String toString() {
		return "CookBook [" + super.toString() +  ", coupon=" + coupon + "]";
	}

}
