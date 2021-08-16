package com.kh.example.chap01.run;

import com.kh.example.chap01.condition.A_If;
import com.kh.example.chap01.condition.B_Switch;

public class Run {
	public static void main(String[] args) { // 메인 메소드에서 프로그램 시작(전원 버튼의 역할)
//		A_If ai = new A_If();
//		ai.method1(); // A_If클래스 안에 있는 메소드 호출
//		ai.method2();
//		ai.method3();
//		ai.method4();
	
		B_Switch bs = new B_Switch(); // 알맹이 만든 이유 -> 클래스가 달라서, Run클래스에서 B_Switch클래스에 (접근해서) 안에 있는 메소드들을 호출하기 위해서
//		bs.method1(); // 알멩이를 이용해서 B_Switch클래스 안에 있는 메소드1 호출
//		bs.method2();	
//		bs.method3();	
//		bs.method4();
		bs.method5(); // 메소드5 호출 -> 메소드5 안의 코드 위에서 아래로 실행됨(입력 -> 메뉴 번호 1 선택)
					  // -> 메소드5 안의 switch case 1 안의 실행문 실행 -> method1() 호출됨
				      // -> 메소드1에 가서 메소드1 안의 코드 실행됨
				      // -> 메소드1 '}' 끝 만나서 종료되면 메소드1을 불렀던 메소드5로 돌아감
				      // -> 메소드5에서 메소드1 불렀던 쪽(switch문 case 1 안)으로 돌아와서 그 아래 코드 실행
			          // -> 메소드5도 종료되면 호출했던 곳, 즉 메인 메소드에서 호출한 부분으로 돌아와서 아래 코드 실행
					  // -> 메인 메소드 끝 만나면 JVM 종료(맨 처음 JVM이 메인 메소드(실행 메소드) 실행시킴)
	}
}
