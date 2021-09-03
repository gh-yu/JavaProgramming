package com.kh.example.chap02_tryCatch.controller;

import java.io.IOException;

public class TryCatchController {
	public void method1() {
		System.out.println("method1() 호출됨...");
		try {
			method2();
			System.out.println("예외 발생 시에는 출력되지 않음"); 
			// 정답 : 출력x , method2()호출하고 예외(폭탄)를 받아서
			// method2(); 쪽으로 돌아와 바로 catch절로 넘어감 -> catch절에서 예외 처리 진행
		} catch (IOException e) { // 이 catch절이 Exception catch절 밑에 있으면 에러 뜸 ↙
// Unreachable catch block for IOException. It is already handled by the catch block for Exception
// IOEXception(을 위한) catch절에 도달할 수 없다. 그것은 이미 Exception(을 위한) catch절에 의해 처리되었다.			
			e.printStackTrace();
		} catch (Exception e) { 
// Exception클래스는 Exception의 최상위(부모, 조상)클래스라 모든 예외(자식, 후손)클래스들 다 받아줄 수 있음
// IOException은 Exception의 자식클래스 객체이기 때문에 매개변수의 값으로 들어올 수 있음
			System.out.println("Excetion으로 잡음");
		} finally {
			System.out.println("finally {} 안의 내용 예외 발생 여부와 상관 없이 무조건 수행");
		}
		System.out.println("method1() 종료됨...");
	}
	
	public void method2() throws IOException {
		System.out.println("method2() 호출됨...");
//		throw new NullPointerException();
		// 예외 처리 해주지 않았는데도 에러 표시 안뜸
		// NullPointerException은 RuntimeException의 후손 클래스라서 예외처리가 필요하지 않은
		// Unchecked Exception
		throw new IOException();
		
//		System.out.println("method2() 종료됨...");
//		// Unreachable code
	}
}
