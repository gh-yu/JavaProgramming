package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.KindsOfVariable2;

public class Run {
	public static void main(String[] args) {
		KindsOfVariable2 k2 = new KindsOfVariable2();
		int a1 = k2.staticNum; 
		
		// static 예약어가 들어가있는 것에 대한 접근은 객체를 만들 필요 x
		// 객체 생성 없이 클래스명.필드명 / 쿨래스명.메소드명 으로 접근 가능
		int a2 = KindsOfVariable2.staticNum;
		
		k2.method(); // testNum : 11, staticTestNum : 11출력
		k2.method(); // testNum : 12, staticTestNum : 12 출력
		
		KindsOfVariable2 k22 = new KindsOfVariable2(); // 새롭게 객체 생성
		// testNum은 새로 객체 생성됨과 동시에 10으로 다시 초기화
	    // staticTestNum은 static 메모리 영역에 데이터값 그대로 남아있음
		k22.method(); // testNum : 11, staticTestNum : 13 출력
		
	}
}
