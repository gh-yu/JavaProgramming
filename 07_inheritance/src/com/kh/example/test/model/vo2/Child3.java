package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;

public class Child3 {
	public Child3() {
		Parent p = new Parent(); // 상속관계x, 접근하려면 객체 생성
//		p.num = 10; // private, 같은 클래스 아님
//		p.dNum = 0.0; // default, 같은 패키지 아님
//		p.bool = false; // protected, 상속관계x, 같은 패키지 아님
		p.ch = 'A'; // public이라 접근 가능
	}
}
