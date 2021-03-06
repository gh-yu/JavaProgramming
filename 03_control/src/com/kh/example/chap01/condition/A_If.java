package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If {
	// 단독 if문
	//		if(조건식){
	//			실행할 문장;
	//		}
	//		조건식의 결과 값이 참(true)이면 { } 안에 있는 코드 실행
	//		조건식의 결과 값이 거짓(false)이면 { } 안에 있는 코드 무시하고 넘어감
	
	// if~else문
	// 		if(조건식) {
	//			실행할 문장1;
	//		} else {
	//			실행할 문장2;
	//		}
	//		둘 중 한 개를 선택하는 조건문
	//		조건식의 결과 값이 참(true)이면 if 안에 있는 실행문장1 수행
	//		조건식의 결과 값이 거짓(false)이면 else 안에 있는 실행문장2  수행
	
	// if~else if~else문
	//		if(조건식){
	//			실행할 문장1;
	//		} else if(조건식){
	//			실행할 문장2;
	//		} else{
	//			실행할 문장3;
	//		}
	//		다중 조건을 줄 수 있는 조건문
	//		if문의 조건식의 결과 값이 참(true)이면 if 안에 있는 실행문장1 수행
	//		if문의 조건식의 결과 값이 거짓(false)이면서 else if문의 조건식 결과 값이 참(true)이면 else if 안에 있는 실행문장2 수행
	//		둘 다 거짓(false)이라면 실행문장3 수행
	//		==> if문에서 true라고 수행되었으면 그 아래 문장들은 조건식이 true라 하더라도/존재하더라도 수행되지 않음
	//		==> else if문은 여러 개일 수 있고, else문은 없을 수도 있음
	public void method1() {
		// 키보드로 입력한 숫자가 양수인지 음수인지 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 한 개 입력 : ");
		int num = sc.nextInt();
		
		// 단일 if문 버전 <= 세번째 if문까지 모두 검사
		// 양수인지
//		if (num > 0) {
//			System.out.println("입력하신 숫자는 양수입니다");
//		}
//		// 0인지
//		if (num == 0) {
//			System.out.println("입력하신 숫자는 0입니다");
//		}
//		// 음수인지
//		if (num < 0) {
//			System.out.println("입력하신 숫자는 음수입니다");
//		}
		
		// if-else문 버전
//		if (num > 0) {
//			System.out.println("입력하신 숫자는 양수입니다");
//		} else { // num <= 0
//			if (num == 0) {
//				System.out.println("입력하신 숫자는 0입니다");
//			}
//			else {
//				System.out.println("입력하신 숫자는 음수입니다");
//			}
//		}
		
		// if-else if-else 버전
		if (num > 0) {
			System.out.println("입력하신 숫자는 양수입니다");
		} else if (num == 0) {
			System.out.println("입력하신 숫자는 0입니다");
		} else {
			System.out.println("입력하신 숫자는 음수입니다");
		}
		
		// switch문으로 바꿀 수 있을까?
//		switch(num) {
//		case num > 0 :		
//		}
		// if에서 switch로 바꾸기 실패
	}
	
	public void method2() {
		// 키보드로 입력한 숫자가 짝수인지 홀수인지 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 하나 입력 : ");
		int num = sc.nextInt();
		
		// 단일 if문 버전
//		if (num % 2 == 0) {
//			System.out.println("짝수입니다");
//		}
//		if (num % 2 != 0) { // (num % 2 == 1)로 하면 음수 넣었을때 출력값 안나옴
//			System.out.println("홀수입니다");		
//		}
		
		// if-else문
//		if (num % 2 == 1) { 
//			System.out.println("홀수입니다");
//		} else {
//			System.out.println("짝수입니다");
//		}
		// (num % 2 == 1)로 하면 음수 넣었을때 모두 짝수로 나옴
		
		// if-else if-else문
		if (num % 2 == 0) {
			System.out.println("짝수입니다");
		} else if (num % 2 != 0) {
			System.out.println("홀수입니다");
		}
	}
	public void method3() {
		// 사용자에게 주민번호를 받아서 여자인지 남자인지 판별
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력(-포함) : ");
		// 020114-4000000
//		String str = sc.nextLine();
//		char pId = str.charAt(7);
		char pId = sc.nextLine().charAt(7);
//		int gender = pId - '0'; // char 문자를 int 정수로 바꿔서 하는 방식도 있음
		
		if (pId == '2' || pId == '4') { //pId는 숫자 형태의 문자 ''해줘야 해당 문자로 인식. '2', '4'는 50, 52
			System.out.println("여자입니다");
		}
		else if (pId == '1' || pId == '3') {
			System.out.println("남자입니다");
		}
		else {
			System.out.println("잘못 입력하셨습니다");
		}
//		if (gender == 2 || gender == 4) { // 문자로 저장되어 있는 숫자를 정수 숫자로 바꿨을때
//			System.out.println("여자입니다");
//		}
//		else if (gender == 1 || gender == 3) {
//			System.out.println("남자입니다");
//		}
//		else {
//			System.out.println("잘못 입력하셨습니다");
//		}
	}
	
	public void method4() {
		// 이름을 입력하여 본인인지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
//		if(name == "박신우") { // 문자열의 비교는 == 으로 불가능, equals()로 가능 //charAt()로 문자 하나하나 변수에 저장해서 비교해도 될듯
//		if(name.equals(박신우)) { // name이 박신우랑 같니?
		if("박신우".equals(name)) { // 박신우는 name이랑 같니?
			System.out.println("본인입니다");
		} else {
			System.out.println("본인이 아닙니다");
		}
	}
}
