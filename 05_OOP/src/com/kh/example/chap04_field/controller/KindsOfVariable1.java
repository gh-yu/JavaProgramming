package com.kh.example.chap04_field.controller;

// 변수 선언 위치에 따른 구분
public class KindsOfVariable1 { // <-- 클래스 영역의 시작
	
	// 클래스 영역에 작성하는 변수 : 필드 = 멤버 변수 = 멤버 필드 = 전역변수
	private int global;
	
	public void method1(int num) { // <-- 메소드 영역의 시작
//						------- 외부에서 데이터를 받아오는 변수 : 매개변수
		
		// 메소드 영역에 작성하는 변수 : 지역변수
		// 매개변수도 일종의 지역변수
		// 지역변수는 선언 외에 다시 사용하기 위해서는 꼭 초기화 필요
		// 예외적으로 매개변수는 초기화가 필요 x
		int local;
//		System.out.println(local); // 지역변수인 local 초기화 안했기 때문에 에러
		
		System.out.println(num); // 매개변수 num은 외부에서 데이터를 받아오기 때문에 num 안에는 데이터가 있을 수 밖에 없음

		System.out.println(global); // global 전역변수 클래스 내 어디서든 사용 가능
		
	} // <-- 메소드 영역의 끝
	
	public void method2() {
		System.out.println(global);
//		System.out.println(local); // method1의 지역변수 method2에서 사용 불가
//		System.out.println(num); // method1의 매개변수 method2에서 사용불가
	}
} // <-- 클래스 영역의 끝
