package com.kh.example.chap04_field.controller;

public class KindsOfVariable2 {
	public static int staticNum;			// Ŭ���� ����
	
	private int testNum = 10;				// �ν��Ͻ� ����
	private static int staticTestNum = 10;  // Ŭ���� ����
	
	public void method() {
		testNum++;
		System.out.println("testNum : " + testNum);
		staticTestNum++;
		System.out.println("staticTestNum : " + staticTestNum);
	}
}
