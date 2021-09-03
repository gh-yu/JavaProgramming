package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface Phone {
	
//	public static final char[] NUMBERPAD = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '*', '0', '#'};
	char[] NUMBERPAD = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '*', '0', '#'}; // interface에서 기본값인 public static final 생략 가능
	
	String makeCall(); // 추상 메소드, 예약어는 생략됨
	String takeCall(); 
	
}
