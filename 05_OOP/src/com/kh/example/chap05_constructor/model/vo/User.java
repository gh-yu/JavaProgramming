package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {

	
	// 생성자 사용 목적
	//		객체를 생성하면서 필드 초기화하기 위해 사용
	
	// 생성자 특징
	//		1. 생성자 명은 클래스 명과 동일
	//		2. 반환형 존재하지 않음
	
	// 기본 생성자
	// 		아무 매개변수가 없는 생성자
	//		써주지 않아도 JVM이 기본적으로 생성해줌
	//		기본 생성자가 없는 상태에서 매개변수 있는 생성자만 만들어주면 기본 생성자는 자동으로 생성되지 않음
	
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	private Date editDate;
	
//	{
//		System.out.println(this); // 초기화 블록, 객체 생성할 때마다 주소 값 발생(주소 값 가짐)
//	}
	
	public User() {} // 매개변수 있는 생성자 쓸때 기본 생성자 생략하면 안됨
	
	// 매개변수 있는 생성자
	//		매개변수가 있는 생성자
	//		넘겨 받은 매개변수를 이용하여 필드 초기화
//	public User(String id, String pwd, String name, Date enrollDate, Date editDate) {
//		userId = id;
//		userPwd = pwd;
//		userName = name;
//		this.enrollDate = enrollDate; // The assignment to variable enrollDate has no effect
//		this.editDate = editDate;     // The assignment to variable enrollDate has no effect
//	}
	
	public User(String userId, String userPwd, String userName, Date enrollDate) {
//		this.userId = userId; // this. 사용 목적 : 변수 개수 줄이고 가독성 높이기
//		this.userPwd = userPwd;
//		this.userName = userName;
		this(userId, userPwd, userName); // 다른 생성자 호출(중복 피함, 두 번째 생성자 부른 것), 반드시 첫 줄에 써줘야 함
		this.enrollDate = enrollDate;
	}
	
	public User(String userId, String userPwd, String userName) {
//		this.userId = userId;
//		this.userPwd = userPwd;
		this(userId, userPwd);
		this.userName = userName;
	}
	
	public User(String userId, String userPwd) {
		this.userId = userId;
		this.userPwd = userPwd;
	}

//	public User(String name, String id) { // 오버로딩 적용 안됨: 매개변수의 개수, 타입, 순서가 같음
//		userId = id;
//		userName = name;
//	}
	
	public void inform() {
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
	}
	
}
