package com.kh.example.family.controller;

import com.kh.example.family.model.vo.Basic;
import com.kh.example.family.model.vo.Baby;
import com.kh.example.family.model.vo.Family;
import com.kh.example.family.model.vo.Mother;

public class FamilyController {
	public void method() {
//		Family f = new Family();
		// 추상클래스는 객체 생성 불가, 참조형 변수 가능
		
		Family f1 = new Mother("엄마", 50, 70, "출산"); // Family타입 f1 참조변수에 Mother객체 주소값 대입
		Family f2 = new Baby("아기", 3.5, 70);

		// 동적 바인딩
//		f1.eat();
//		f2.eat();

//		Basic b = new Basic();
		// 인터페이스는 객체 생성 불가, 참조형 변수 가능
		Basic b1 = new Mother("엄마", 50, 70, "출산");
		Basic b2 = new Baby("아기", 3.5, 70);
		// Basic은 인터페이스
		// Mother와 Baby클래스는 Basic인터페이스를 implements했으며
		// 인터페이스 Basic에 있는 추상메소드를 오버라이딩 해놓았음
		
		b1.eat();
		b1.sleep();
	}
}
