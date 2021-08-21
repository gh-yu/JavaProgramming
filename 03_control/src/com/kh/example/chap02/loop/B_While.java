package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
//	while(조건식) {
//		실행문장;
//		[증감식 or 분기문;]
//	}
//	조건식 확인 -> (조건식이 true일 때) 실행문장 수행 -> 조건식 확인 -> (반복)
//	조건식의 결과가 false가 될 때까지 반복
	
//	do {
//		실행문장;
//		[증감식 or 분기문;]
//	} while (조건식); // 세미콜론 꼭 붙여주기
//	실행문장 -> 조건식 확인 -> (조건식이 true일 때) do의 실행문장 수행 -> 조건식 확인 -> (반복)
//	조건식의 결과가 false가 될 때까지 반복
//	do-while은 무조건 한 번 이상 수행 <- While과 do-While의 차이점 
	public void method1() {
		// 1부터 5까지 출력
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++; // 증감식 빼먹지 않기!
		}
	}
	
	public void method1_1() {
		// 자기 소개 다섯 번 하기 : 내 이름은 유건휘야
		int i = 0;
		while(i < 5) {
			System.out.println("내 이름은 유건휘야");
			i++;
		}
	}
	
	public void method2() {
		// 5부터 1까지 출력
		// 방법 1
		int i = 5;
		while (i > 0) {
			System.out.println(i);
			i--;
		}
		// 방법 2
//		int i = 0;
//		while (i < 5) {
//			System.out.println(5 - i);
//			i++;
//		}
	}
	
	// A_For클래스의 for문들 while문으로 바꿔 보기
	
	public void method3() {
		// 문자열을 입력받아 인덱스 별로 문자 출력
		// java
		// 0 : j
		// 1 : a
		// 2 : v
		// 3 : a
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		// 문자열의 길이 : String 클래스의 length() <- 반환형 : int
//		int length = str.length();
		// apple
//		int i = 0;
//		while (i < 5) {
//		while (i < length)
//		while (i < str.length()) {
//			char ch = str.charAt(i); // while문 안에 있는 변수 선언 -> while문 돌면서 계속 선언되어도 문제 없음 
//			System.out.println(i + " : " + ch);
//			i++;
//		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
		}
	}
	
	public void method4() {
		// while문 중첩
		// 구구단
		int i = 2;
		
//		return; // 밑에 코드 실행 안되고 메소드 종료 -> 나를 호출해준 메소드로 돌아감
		
		while(i <= 9) {
			int j = 1;
			while (j < 10) {
				System.out.println(i + " X " + j + " = " + i*j);
				j++;
			}
			i++;
		}
		
//		return; // 나를 호출해준 메소드로 돌아가는 역할 (return 뒤에 값이 없으면 값을 안 가지고 돌아감)
				// 모든 메소드 끝에 존재, 생략되어 있는 것/ return 만나서 메소드가 종료되는 것
	}
	
	public void method5() {
		// 언제 종료될지 모를때 while문이 적합
		// 9 눌러서 종료 선택할 때 까지 (메뉴 선택-선택한 결과) 반복 (while문에 조건 줘서 9가 아닐때만 반복하게)
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0; // 초기식, 0으로 초기화하고 while문 안에서 menuNum에 입력값 받은거 저장하기 때문에 9를 눌러도(입력해도) 처음 1번은 while문 실행문장 수행함
		while (menuNum != 9) {
			System.out.println("1. 1~5까지 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 문자열 인덱스");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
//			int menuNum = sc.nextInt(); // while문 시작 전 menuNum 변수 선언 안해주면 while문 조건식에서 변수를 쓰기 때문에 에러 남, while문 시작 전 변수 선언해줘야 함. 변수 중복 선언 불가
			menuNum = sc.nextInt();
			
			switch (menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}
//		if (menuNum == 9) {
//			System.out.println("종료합니다.");
//		} // 필요없는 문장
	}
	
	public void method5_1() {
		// do~while문
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0;
		do {
			System.out.println("1. 1~5까지 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 문자열 인덱스");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
//			int menuNum = sc.nextInt(); // 이 변수 선언은 do{} 영역 안에서만 유효함
										// do{} 바깥에 선언해줘야 do{} 바깥에서도 쓸 수 있음, do 바깥 while문 조건식에서 변수 사용중
			menuNum = sc.nextInt();
			
			switch (menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		} while (menuNum != 9);		
	}	
	
	public void method6() {
		// method5 다른 버전
		// return 사용하여 9 눌렀을때 while문 반복 끝내고 메소드 종료시키기
		Scanner sc = new Scanner(System.in);
			
		while (true) {// 종료할 수 있는 조건이 없는 상태, while문 안 무한반복할 것
			System.out.println("1. 1~5까지 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 문자열 인덱스");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			int menuNum = sc.nextInt(); // while문 조건식 결과값 true로 줬기 때문에 초기식 없이 while문 안에 변수 선언해도 문제 없이 돌아감
				
			switch (menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
//			case 9 : System.out.println("종료합니다."); break; // 이 코드로 하면 while문 종료 조건 없어 무한반복
			case 9 : System.out.println("종료합니다."); return; // break가 아닌 return을 넣어 메소드 종료되게 함
			default : System.out.println("잘못 입력하셨습니다.");
			}	
		}	
	}
	
	public void method6_1() {
		// method6의 while문 -> do~while문 버전으로 바꾸기 실습
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. 1~5까지 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 문자열 인덱스");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			int menuNum = sc.nextInt();
			
			switch (menuNum) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		} while (true);
	}
	
	public void method7() {
		// A_FOr method8의 while문
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 줄 수 : ");
		int row = sc.nextInt();
		
		int i = 1;
		while (i <= row) {
			int j = 1;
			while (j <= 5) {
					System.out.print("*");
					j++; // 증감식은 while문 안에
			}
			System.out.println();
			i++;
		}	
	}
	
	public void method8() {
		// A_FOr method9의 while문
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수 입력 : ");
		int row = sc.nextInt();
		System.out.print("칸 수 입력 : ");
		int col = sc.nextInt();
		
		int i = 1;
//		int j = 1; // 작은 반복문 끝나고 새롭게 돌아야 하기 때문에 큰 반복문 안에다 초기화 시켜야함
		while (i <= row) {
			int j = 1;
			while (j <= col) {
//				if (row == col) { // 실수
//					System.out.print(col);
//				if (i = j) { // == 해야 되는데 실수
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public void method9() {
		// 키보드로 문자열 값을 입력 받아 출력 반복 실행  --> 몇 번 반복할지 알 수 없을때 while문이 적합
		// exit가 들어가면 반복 종료 -> exit가 아니면 계속 진행
		
		Scanner sc = new Scanner(System.in);
		
//		String str = null; // String 클래스를 비롯한 모든 클래스, 즉 참조형 자료형의 기본값은 null이다.
//		// null ? 아무 것도 없음(= 진공)
		// NullPointerExcetion 에러 뜸, str.을 통해  가리켜서 String 클래스 접근했는데 안에 null 밖에 없음
		String str= "";
		while(!str.equals("exit")) { // exit가 아니면 반복, equals() : String 클래스 안의 메소드
			System.out.print("문자열 입력 : "); // 안내문부터 반복 시켜야 함
			str = sc.nextLine();
			System.out.println("str : " + str);
		}
	}
	
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		String str = null;
		do {
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		} while (!str.equals("exit")); 
		// NullPointerException 안 뜸
		// nextLine으로 문자열 받아서 str에 문자열이 저장된 뒤 while문 조건식 확인하기 때문에 
		// -> str에  null값 없음. 사용자가 null값 입력한건 문자열이기 때문에 관계 없음.
	}
}
