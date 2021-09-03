package com.kh.example.chap03_user.controller;

import java.util.Scanner;

import com.kh.example.chap03_user.mode.exception.MyException;

public class UserExceptionController {
	public void inputAge() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		try {
			checkAge(age);
		} catch (MyException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage()); // e.getMessage() �޼ҵ� -> String�� ��ȯ
		}
	}
	
	public void checkAge(int age) throws MyException {
		if (age < 19) {
			throw new MyException("���� �Ұ�");
		} else {
			System.out.println("��ſ� �����ǽñ� �ٶ��ϴ�.");
		}
	}
}
