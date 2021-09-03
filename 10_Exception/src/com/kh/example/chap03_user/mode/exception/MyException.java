package com.kh.example.chap03_user.mode.exception;

public class MyException extends Exception {
	public MyException() {}
	public MyException(String msg) {
		super(msg); // super() 부모(super) 생성자에 String 값 넣기
	}
}