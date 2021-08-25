package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent; // 상속관계라 하더라도 다른 패키지면 import해줘야 함

public class Child4 extends Parent{
	public Child4() {
//		super.num = 10; // private, 같은 클래스 아님
//		super.dNum = 0.0; // default, 같은 패키지 아님
		super.bool = false; // protected, 상속관계o, 다른 패키지라도 접근 가능
		super.ch = 'A'; // public이라 접근 가능
		
	}
}
