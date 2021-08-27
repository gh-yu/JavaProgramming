package com.kh.example.chap04_Math.controller;

import java.util.Random;

public class MathController {
	public void method() {
//		Math.random(); // Math 클래스 내 메소드 다 static메소드 -> 객체 생성 없이 클래스명. 으로 접근
		// Math클래스 : 수학 연산을 하기에 유용한 메소드들을 모아놓은 클래스
		// 싱글톤 패턴 구성
		//		static을 이용해 애플리케이션이 시작할 때 딱 한 번만 인스턴스를 만들어 메모리 할당
		//		딱 한 번 만든 인스턴스를 사용하게끔 만든 패턴
		//		-> 생성자 private, 멤버 public static
		
		double num = 4.949;
		double num2 = 4.123;
		
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Math.abs(num)); // 절대값
	
		System.out.println(Math.ceil(num)); // 올림
		System.out.println(Math.ceil(num2));
		
		System.out.println(Math.round(num)); // 반올림, int값 반환
		System.out.println(Math.round(num2));
		
		System.out.println(Math.floor(num2)); // 내림
		System.out.println(Math.floor(num2));
		
		int random = (int)(Math.random() * 4) + 1;
		System.out.println(random);
		
		Random r = new Random(); // Random클래스
		System.out.println(r.nextInt(4) + 1); // 
		// r.nextInt() -> int 범위 내에 있는 모든 값 랜덤으로 가져옴
		// r.nextInt(4) -> 0~4까지의 값 랜덤으로 가져옴
		// r.nextInt(4) + 1 -> 1~4까지의 값 랜덤으로 가져옴
		
		System.out.println(Math.rint(num)); // 가까운 값
		System.out.println(Math.rint(num2));
		
		System.out.println(Math.sqrt(3)); // 제곱근
		System.out.println(Math.pow(2, 3)); // 거듭제곱power 2의 3승
		
		System.out.println(Math.max(10, 4)); // 두 매개변수 크기 비교하여 max값 반환
		System.out.println(Math.min(10, 4)); // 크기 비교하여 min값 반환
	
	}
	
}
