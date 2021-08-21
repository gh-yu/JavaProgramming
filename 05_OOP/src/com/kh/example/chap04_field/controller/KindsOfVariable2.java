package com.kh.example.chap04_field.controller;

public class KindsOfVariable2 {
	public static int staticNum;			// 클래스 변수
	
	private int testNum = 10;				// 인스턴스 변수
	private static int staticTestNum = 10;  // 클래스 변수
	
	public void method() {
		testNum++;
		System.out.println("testNum : " + testNum);
		staticTestNum++;
		System.out.println("staticTestNum : " + staticTestNum);
	}
}
