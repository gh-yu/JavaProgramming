package com.kh.practice.chap01.poly.model.vo;

public class Member {
	
	private String name;
	private int age;
	private char gender;
	private int couponCount;

	public Member() {}
	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	public int getAge() {
		return age;
	}
	
	public void setCouponCount(int couponCount) {
		this.couponCount += couponCount;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", couponCount=" + couponCount + "]";
	}



}
