package com.kh.practice.charCheck.exception;

public class CharCheckException extends Exception { // Exception 상속
	
	public CharCheckException() {} // 기본 생성자 1개
	public CharCheckException(String msg) { // 매개변수 있는 생성자 1개
		super("체크할 문자열 안에 공백이 포함되어 있습니다"); // 에러 발생시 출력하고 싶은 문자열
	}
}
