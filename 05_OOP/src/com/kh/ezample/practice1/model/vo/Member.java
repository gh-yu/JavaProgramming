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
		memberName = name; // memberName�̶�� ������ �ܺηκ��� �޾ƿ� name �� ����
	}
	
	public void printName() {
		System.out.println("name : " + memberName);
	}
}
