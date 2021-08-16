package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	// switch (조건식) {
	// case 1: 실행문1; break; // 조건식의 결과 값이 1일 경우 실행
	// case 2: 실행문2; break; // 조건식의 결과 값이 2일 경우 실행
	// default: 실행문3;       // 조건식의 결과 값이 case에 해당하지 않을 때 실행
	// }
	// 조건식의 결과 값을 case에서 찾아 명령을 수행하는 조건문
	// 해당하는 값이 case에 없을 경우 default의 명령문 수행
	// case와 수행문 사이에는 콜론(;)을 써주어야 함
	// break가 없으면 멈추지 않고 계속 실행
	public void method1( ) {
		// 정수 두 개와 연산 기호 문자 1개를 입력 받아 연산 기호 문자에 해당하는 계산을 수행 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int second = sc.nextInt();
		
		System.out.print("연산자(+,-,*,/) : ");
//		char op = sc.nextLine().charAt(0); // 에러, nextInt()에서 데이터 가져간 후 buffer에 남아있는 엔터를 nextLine()에서 가져가면서 문자열에 의미있는 데이터가 없는데 charAt()하겠다고 코드를 짜서 StringIndexOutofBoundsException 문자열이 인덱스의 범위를 벗어났다는 에러가 뜸
		// 에러 이유 : next(), nextInt() 메소드는 엔터를 안 가져가기 때문에 버퍼에 엔터 남아있음. 그 뒤에 엔터를 가져가는 nextLine()이 온다면 버퍼에 남아있는 엔터를 가져가는 상황 발생. next() 다음에 next()가 온다면 엔터 안 가져가기 때문에 문제 발생하지 않음
		// 1. int를 받아올 때 String으로 받아 파싱하기
		// 2. nextLine()으로 줄바꿈 없애기
		// 3. nextLine() 대신 next()로 변경
		char op = sc.next().charAt(0); //문자열 하나만 받아도 돼서 next()로 바꾸는거 문제 없음
		
		int result = 0; // 변수 선언 및 초기화
		switch(op) { // op로 case를 나누겠다
		case '+' : 
			result = first + second;
			break;
		case '-' :
			result = first - second;
			break;
		case '*' :
			result = first * second;
			break;
		case '/' :
			if (second == 0) {
				System.out.println("0으로는 나눌 수 없습니다. 결과가 정확하지 않습니다.");
			} else {
			result = first / second;
			}
			break; // 마지막에 default 없이 끝난다면 switch문 빠져나가기 때문에 안 넣어줘도 되지만					
		default :  // default가 있는데 위에 break 안 넣으면 default 안 실행문까지 같이 실행됨
			System.out.println("예시에 없는 연산자입니다. 결과가 정확하지 않습니다.");
		}
		
		System.out.printf("%d %c %d = %d", first, op, second, result);
	} // 메소드1의 끝인 '}'까지 실행 후 메소드가 끝나면 나를 호출한 메소드(메소드 안에서 호출한 쪽 = switch문 안) 쪽으로 돌아감
	
	public void method2() {
		System.out.println("***** 신우네 과일 가게 *****");
		System.out.println("사과, 바나나, 복숭아, 키위 있습니다! 가격 편하게 물어보세요!");
		System.out.print("어떤 과일의 가격이 궁금하세요? : ");
		
		Scanner sc = new Scanner(System.in);
		String fruit = sc.nextLine();
		
		// 사과 1000 / 바나나 3000 / 복숭아 2000 / 키위 5000
		// 없는 과일일 경우, "그 과일은 신우네 과일 가게에 없습니다 ㅠㅠ 옆에 신우 마트로 가보세요!" 문구 출력
		// 최종 출력 : (ex) 사과의 가격은 1000원입니다.
		
		int price = 0; // 변수 선언 및 초기화!! 해주기
//		boolean flag = false; // boolean의 기본값 false
		boolean flag = true;
		switch (fruit) {
		case "사과" :
			price = 1000;
			break;
		case "바나나" :
			price = 3000;
			break;
		case "복숭아" :
			price = 2000;
			break;
		case "키위" :
			price = 5000;
			break;
		default :
			System.out.println("그 과일은 신우네 과일 가게에 없습니다 ㅠㅠ 옆에 신우 마트로 가보세요!");
			//flag = true;
			flag = false;
		}
//		if (flag == false) {
//		if (!flag) { // flag가 false일때 !false => true가 되고 조건식이 true가 돼서 if문 안 실행
//			// flag : false -> 가격표시 O
//			// flag : true -> 가격표시 X
//			System.out.printf("%s의 가격은 %d원입니다.", fruit, price); // 이 출력문을 switch문 안 각 case에 넣는 법도 있음
//		}
		if (flag) {
			System.out.println(fruit + "의 가격은 " + price + "원입니다");
		}
	}
	
//	int lastDate; // 메소드 바깥에 변수 선언 -> 전역변수, 초기화 안해도 자동 초기화 됨
	
	public void method3() {
		// 1부터 12까지 입력받아 해당하는 달의 마지막 날짜 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12까지 중 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int lastDate = 0;
		boolean flag = true;
		switch (num) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			lastDate = 31;
			break;
		case 2 :
			lastDate = 28;
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			lastDate = 30;
			break;
		default :
			System.out.println("1~12까지의 숫자만 입력이 가능합니다."); // 1~12 사이의 숫자가 아닙니다.
			flag = false;
		}
		
		if (flag) {
			System.out.println(num + "월의  마지막 날짜는 " + lastDate + "일입니다.");
		}
	}
	public void method4( ) { // switch문이 많이 쓰이는 경우
		Scanner sc = new Scanner(System.in);
		
		// 회원에 대한 메뉴
		System.out.println("1. 회원등록");
		System.out.println("2. 회원수정");
		System.out.println("3. 회원삭제");
		System.out.print("메뉴 번호를 입력하세요 : ");
		
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			System.out.println("회원등록 메뉴입니다.");
			break;
		case 2:
			System.out.println("회원수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("회원삭제 메뉴입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void method5( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 연산하기");
		System.out.println("2. 신우네 과일가게");
		System.out.println("3. 마지막 날짜");
		System.out.println("4. 메뉴출력");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();
		
		// 메뉴 번호 선택에 따라 1~4번 메소드 불러오기, 1번을 누르면 1번 메소드 호출
		switch(menu) {
		case 1: 
			method1(); // 같은 클래스 안에 있어서 알맹이(객체) 생성 필요 없이 바로 다른 메소드 호출 가능
			break;
		case 2: 
			method2();
			break;
		case 3: 
			method3();
			break;
		case 4: 
			method4();
			break;
		default: System.out.println("잘못 입력하셨습니다.");
		}
	} // '}' 메소드5의 끝 만나서 메소드5 종료하면 메소드5를 불렀던 메인메소드로 돌아감
}
