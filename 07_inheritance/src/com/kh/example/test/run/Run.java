package com.kh.example.test.run;

import com.kh.example.test.controller.InheritanceTest;

public class Run {
	public static void main(String[] args) {
//		InheritanceTest it = new InheritanceTest();
//		it.method();
		// 한 객체에서 불러올 메소드가 많을 때 사용

		
		new InheritanceTest().method(); // it로 치환해서 쓰는게 아니라 바로 
		// 한 객체에서 하나의 메소드만 불러올 때
	}
}
