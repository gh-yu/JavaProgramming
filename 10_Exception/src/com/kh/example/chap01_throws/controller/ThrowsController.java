package com.kh.example.chap01_throws.controller;

public class ThrowsController {
	
	public void method1() throws Exception {
		System.out.println("method1() 호출됨...");
		method2();
		System.out.println("method1() 종료됨..."); // 출력 안됨
	}
	
	public void method2() throws Exception {
		System.out.println("method2() 호출됨...");
		method3();
		System.out.println("method2() 종료됨..."); // 출력 안됨
	}
	
	public void method3() throws Exception{
		System.out.println("method3() 호출됨...");
		// 강제 Excption 발생 : try~catch x
		throw new Exception();
//		 Unhandled exception type Exception : 처리가 되지 않은 예외
//		System.out.println("method3() 종료됨...");
		// Unreachable code : 도달하지 못하는 코드
		// 예외가 발생되면 밑에 코드가 뭐가 있든지 실행되지 않고 프로그램 종료됨
		// 위 문장에서 발생시킨 예외가 처리가 되지 않아서 밑의 문장 실행 불가		
		// 에러 던져줘도 실행 불가 -> 지우는 수 밖에 없음(에러 발생된 곳에서는 try~catch문으로 오류 못 잡아줌)
	}
}
