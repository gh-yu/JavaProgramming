package com.kh.example.chap05_constructor.run;

import java.util.Date;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		User u1 = new User(); // User() -> 기본 생성자(매개변수 없는), 객체 생성만 할 때 이용		
//		System.out.println("u1 : " + u1); 
		u1.inform(); // 기본값인 null, null, null, null 출력됨
		
		// 객체 생성 후 메소드를 통해 매개변수로 받아서 데이터 저장시키는게 아니라
		// 객체 생성과 동시에 데이터 저장시킬 수 있도록 매개변수 있는 생성자 만든 것을 이용하여 객채 생성
		User u2 = new User("user01", "pas01", "강건강", new Date());
//		System.out.println("u2 : " + u2);
		u2.inform();
		
		User u3 = new User("user02", "pas02", "난나눔");
//		System.out.println("u3 : " + u3);
		u3.inform();
		
		User u4 = new User("user04", "pas04");
//		System.out.println("u4 : " + u4);
		u4.inform();
	}

}
