package com.kh.example.chap03_user.controller;

import java.util.Scanner;

import com.kh.example.chap03_user.mode.exception.MyException;

public class UserExceptionController {
	public void inputAge() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		try {
			checkAge(age);
		} catch (MyException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage()); // e.getMessage() 메소드 -> String값 반환
		}
	}
	
	public void checkAge(int age) throws MyException {
		if (age < 19) {
			throw new MyException("입장 불가");
		} else {
			System.out.println("즐거운 관람되시길 바랍니다.");
		}
	}
}
