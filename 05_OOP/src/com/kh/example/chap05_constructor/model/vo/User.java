package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {

	
	// ������ ��� ����
	//		��ü�� �����ϸ鼭 �ʵ� �ʱ�ȭ�ϱ� ���� ���
	
	// ������ Ư¡
	//		1. ������ ���� Ŭ���� ��� ����
	//		2. ��ȯ�� �������� ����
	
	// �⺻ ������
	// 		�ƹ� �Ű������� ���� ������
	//		������ �ʾƵ� JVM�� �⺻������ ��������
	//		�⺻ �����ڰ� ���� ���¿��� �Ű����� �ִ� �����ڸ� ������ָ� �⺻ �����ڴ� �ڵ����� �������� ����
	
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	private Date editDate;
	
//	{
//		System.out.println(this); // �ʱ�ȭ ���, ��ü ������ ������ �ּ� �� �߻�(�ּ� �� ����)
//	}
	
	public User() {} // �Ű����� �ִ� ������ ���� �⺻ ������ �����ϸ� �ȵ�
	
	// �Ű����� �ִ� ������
	//		�Ű������� �ִ� ������
	//		�Ѱ� ���� �Ű������� �̿��Ͽ� �ʵ� �ʱ�ȭ
//	public User(String id, String pwd, String name, Date enrollDate, Date editDate) {
//		userId = id;
//		userPwd = pwd;
//		userName = name;
//		this.enrollDate = enrollDate; // The assignment to variable enrollDate has no effect
//		this.editDate = editDate;     // The assignment to variable enrollDate has no effect
//	}
	
	public User(String userId, String userPwd, String userName, Date enrollDate) {
//		this.userId = userId; // this. ��� ���� : ���� ���� ���̰� ������ ���̱�
//		this.userPwd = userPwd;
//		this.userName = userName;
		this(userId, userPwd, userName); // �ٸ� ������ ȣ��(�ߺ� ����, �� ��° ������ �θ� ��), �ݵ�� ù �ٿ� ����� ��
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

//	public User(String name, String id) { // �����ε� ���� �ȵ�: �Ű������� ����, Ÿ��, ������ ����
//		userId = id;
//		userName = name;
//	}
	
	public void inform() {
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
	}
	
}
