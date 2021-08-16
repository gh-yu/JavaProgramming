package com.kh.run;

// import com.kh.variable.A_Variable; // import -> 내가 지금 갖다 쓰는 클래스의 위치를 명시해주는 역할
import com.kh.variable.B_Constant;
import com.kh.variable.C_Cast;
import com.kh.variable.D_PrintMethod;
import com.kh.variable.E_KeyboardInput;

public class Run { // 실행 클래스
	public static void main(String[] args) { //실행 메소드
		// A_Variable 클래스 접근
		// 1. 클래스 앞에 패키지까지 다 적어 클래스의 풀네임으로 접근(com.kh.run 안에 있는 A_Variable이다 알려주는 것)
//		com.kh.variable.A_Variable av = new com.kh.variable.A_Variable(); -> 클래스 이름만 적으면 현 패키지와 다르기 때문에 어디에 있는 클래스를 가리키는지 인식 못 함 
//		-------------------------- -> 클래스의 풀네임
		
		//2. import를 사용하여 접근
//		A_Variable av = new A_Variable(); // import할 때 빨간 밑줄or전구 모양에 마우스 올려서 선택  or ctrl+shift+o -> import 단축키
		//				---------------- -> 해당 클래스의 알맹이 만들기, 그 알맹이를 av라는 변수에 담아두고 있음 : 클래스에 접근한 것
//		test.A_Variable av2 = test.new A_Variable(); -> test패키지에 있는거 사용하고 싶어도 import된 com.kh.variable패키지 자동 설정됨
//      ---- -> 같은 클래스명 다른 패키지에 있는거 사용하고 싶으면 앞에 test. 이렇게 패키지 명시해줘야함
		
		// 클래스 안에 있는 메소드 접근
//		av.declareVariable(); // av 변수 안에(.) 있는 declareVariable 메소드 접근
//		av.initVariable();
		
//		B_Constant bc = new B_Constant();
//		bc.finalConstant(); // B_Constant 클래스 알맹이 bc 변수 안 finalConstant 메소드에 접근
		
//		C_Cast cc = new C_Cast();
//		cc.rule1();
//		cc.rule2();
		
//		D_PrintMethod dp = new D_PrintMethod();
//		dp.printlnExample();
//		dp.printExample();
//		dp.printfExample();
	
		E_KeyboardInput eki = new E_KeyboardInput();
		eki.inputScanner2();
	}
}