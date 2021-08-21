package com.kh.ezample.practice1.model.vo;

public class Member {
	private String memberId;
	private String pwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public void changeName(String name) {
		memberName = name; // memberName이라는 공간에 외부로부터 받아온 name 값 저장
	}
	
	public void printName() {
		System.out.println("name : " + memberName);
	}
}
