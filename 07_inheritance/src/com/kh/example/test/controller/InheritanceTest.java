package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceTest {
	public void method() {
		System.out.println("Parent클래스의 num필드에 접근");
		Parent p = new Parent();
		p.setNum(9);
		System.out.println("Parent클래스 안에 있는 num : " + p.getNum());
		
		System.out.println();
		
		System.out.println("Child클래스의 str필드에 접근");
		Child1 c1 = new Child1();
		c1.setStr("Hello");
		System.out.println("Child1 안에 있는 str : " + c1.getStr());
		
		System.out.println();
		
		System.out.println("Child2클래스의 str필드에 접근");
		Child2 c2 = new Child2();
		c2.setStr("World");
		System.out.println("Child2 안에 있는 str : " + c2.getStr());
		System.out.println("Chid2클래스가 상속받은 Parent클래스의 필드에 접근");
//		c2.num();
		// (오류) The method num() is undefined for the type Child2
		// Parent클래스에 필드로 num이 존재해서 Child2한테 상속은 해줬으나 num의 접근제한자가 private이기 때문에 외부 접근 불가
		c2.setNum(999);
		System.out.println("Child2 안에 있는 num : " + c2.getNum());
		System.out.println("parent 안에 있는 num : " + p.getNum()); // Parent객체와 Child2객체 주소값이 다름, setNum()으로 값 변경해도 Parent클래스에는 영향 x
															     // new Parent() 와  new Child2() 해서 서로 다른 객체 공간 생성되어 있음
//		Child2 c3 = new Child2();								
//		System.out.println("Child2 안에 있는 num : " + c3.getNum()); // 같은 클래스라도 또 객체 생성하면 다른 주소값 가짐
	}
}
