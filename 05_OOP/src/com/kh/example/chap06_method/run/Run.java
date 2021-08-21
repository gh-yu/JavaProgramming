package com.kh.example.chap06_method.run;

import com.kh.example.chap06_method.controller.MethodPractice;
import com.kh.example.chap06_method.model.vo.Trainee;

public class Run {
	public static void main(String[] args) {
		MethodPractice mp = new MethodPractice();
		
//		String str = mp.method1(); // cannot convert from void to String
		mp.method1(); // 반환 값 void, return되는 값 없음, 안에 return문 생략 가능

//		mp.method2(); // 값을 반환받긴 하나 저장을 따로 하지 않아 데이터가 날아감
//		int result1 = mp.method2(); // method2 실행 -> 반환값 0, 이 전체가 0이라는 값을 가지게 됨
//		System.out.println(result1);
		System.out.println(mp.method2());
		
		mp.method3(10, 20);
		
		String result2 = mp.method4("유건휘", 27);
		System.out.println(result2);
		
		char[] result3 = mp.method5(); // 얕은 복사
		System.out.println("Run result3 : " + result3);
		for(int i = 0; i < result3.length; i++) {
			System.out.print(result3[i]);
		}
		
		System.out.println();
		
		Trainee result4 = mp.method6(); // 얕은 복사
		System.out.println("Run result4 : " + result4);
		System.out.println(result4.inform());
		
//		Trainee t1 = new Trainee("강건강", 'H', "오전", 98.5);
//		System.out.println(t1.inform());
//		Trainee t2 = new Trainee('G');
//		System.out.println(t2.inform());
		
		result4.setName("유건휘");
		result4.setClassRoom('G');
		System.out.println(result4.inform());
		
		System.out.println(result4.getACADEY());
		System.out.println(result4.getclassRoom());
		System.out.println(result4.getName());
		System.out.println(result4.getTime());
		System.out.println(Trainee.getScore());
	}	
}
