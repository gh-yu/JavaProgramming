package com.kh.example.chap02_class.defaultClass.controller;

public class Run {
	public static void main(String[] args) {
		DefaultClassTest dct = new DefaultClassTest(); // 같은 패키지 내에 있어서 default클래스 호출 가능
		dct.test();
	}
}
