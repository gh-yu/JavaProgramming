package com.kh.practice.chap01.control;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		// 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 "ㅇㅇ메뉴입니다"를, 종료 번호를 누르면 "프로그램이 종료됩니다."를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");	
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0 && num % 2 == 0) {
			System.out.println("짝수다");
		} else if (num % 2 == 1) {
			System.out.println("홀수다");
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
		// 두번째 버전
//		if (num > 0 && num % 2 == 0) {
//			System.out.println("짝수다");
//		} else if (num > 0 && num % 2 != 0) {
//			System.out.println("홀수다");
//		} else {
//			System.out.println("양수만 입력해주세요.");
//		}
		
		// 코드 답안, 더 한 눈에 들어오고 간략하며 이해하기 쉬움
//		if (num > 0) {
//			if (num % 2 == 0) {
//				System.out.println("짝수다");
//			} else {
//				System.out.println("홀수다");
//			} 
//		} else {
//			System.out.println("양수만 입력해주세요.");
//		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + math);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		String season = "";
		
		switch (month) {
		case 1 : case 2 : case 12 : 
			season = "겨울";
			break;
		case 3 : case 4 : case 5 :
			season = "봄";
			break;
		case 6 : case 7 : case 8 :
			season = "여름";
			break;
		case 9 : case 10 : case 11 :
			season = "가을";
			break;
		default :
//			System.out.println(month + "월은 잘못 입력된 달입니다.");
			season = "잘못 입력된 달";
		}
//		if (month > 0 && month < 13) {
			System.out.println(month + "월은 " + season + "입니다.");
//		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		String id = "myId";
		String pwd = "myPassword12";
				
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String userPwd = sc.nextLine();
		
		if (id.equals(userId) && pwd.equals(userPwd)) {
			System.out.println("로그인 성공");
		} else if (!userId.equals("myId")) { // = id.equals(userId)
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		
//		if (id.equals(userId)) {
//			if (pwd.equals(userPwd)) {
//				System.out.println("로그인 성공");
//			} else {
//				System.out.println("비밀번호가 틀렸습니다.");
//			}
//		} else {
//			System.out.println("아이디가 틀렸습니다.");
//		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
//		String rating = sc.nextLine();
//		
//		String Admin = "회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성";
//		String Mem = "게시글 작성, 게시글 조회, 댓글 작성";
//		String NonMem = "게시글 조회";
		
		// if~else if~else문
//		if (rating.equals("관리자")) {
//			System.out.println(Admin);
//		} else if (rating.equals("회원")) {
//			System.out.println(Mem);
//		} else if (rating.equals("비회원")) {
//			System.out.println(NonMem);
//		} else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
		
		// 코드 답안 - switch문 
		switch (sc.nextLine()) {
		case "관리자" :
			System.out.print("회원관리, 게시글 관리 ");
		case "회원" :
			System.out.print("게시글 작성, 댓글 작성 ");
		case "비회원" :
			System.out.print("게시글 조회");
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		}	
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		

		if (height <= 0 || weight <= 0) { // height = 0 -> bmi : infinty => 고도비만
										  // weight = 0 -> bmi : 0 => 저체중
			System.out.println("잘못 입력하셨습니다.");
		} else {
			double bmi = weight / (height * height);
			System.out.println("BMI 지수 : " + bmi);
		
			if (bmi < 18.5) {
				System.out.println("저체중");
			} else if (bmi < 23) {
					System.out.println("정상체중");
			} else if (bmi < 25) {
				System.out.println("과체중");
			} else if (bmi < 30) {
				System.out.println("비만");
			} else {
				System.out.println("고도 비만");
			}
		}
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char oper = sc.nextLine().charAt(0);
		
		double result = 0;
		if (num1 > 0 && num2 > 0) {
			switch (oper) {
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '/' : result = (double)num1 / num2; break;
			case '%' : result = num1 % num2; break;
			default : System.out.println("연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다."); return;
			}
			
			if (oper == '/') {
				System.out.printf("%d %c %d = %.6f", num1, oper, num2, result);
			} else {
				System.out.printf("%d %c %d = %d", num1, oper, num2, (int)result);
			}
		} else {
			System.out.println("잘못 입력하셨습니다. 양수만 입력해주세요. 프로그램을 종료합니다.");
		}
		
	}
	
	public void practice9() {
		// 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
		// 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		// 이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요
		// 70점 이상일 경우 pass, 70점 미만이거나 전체 강의의 30% 결석 시 Fail을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int midScore = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int finalScore = sc.nextInt();
		System.out.print("과제 점수 : ");
		int assignScore = sc.nextInt();
		System.out.print("출석 회수 : ");
		int attendNum = sc.nextInt();
		
		int attendScore = attendNum * 5; // 출석 점수(100점 만점), 총 강의 회수 20 * 5 = 100
		
		System.out.println("=============== 결과 ===============");
		
		if (attendScore <= 70) { // 출석 회수 부족하면 else 부분 실행x, 출석 점수 70점 이하 = 30% 이상 결석
			System.out.println("Fail [출석 회수 부족 " + attendNum + "/20)]");
		} else {
			System.out.println("중간 고사 점수(20) : " + midScore * 0.2);
			System.out.println("기말 고사 점수(30) : " + finalScore * 0.3);
			System.out.println("과제 점수       (30) : " + assignScore * 0.3);
			System.out.println("출석 점수       (20) : " + attendScore * 0.2);
			
			double totalScore = (midScore * 0.2) + (finalScore * 0.3) + (assignScore * 0.3) + (attendScore * 0.2);
		
			System.out.println("총점 : " + totalScore);
			
			if (totalScore >=  70) {
				System.out.println("PASS");
			} else if (totalScore < 70) {
				System.out.println("Fail [점수 미달]");
			}
		}	
		
	}
	
	public void practice10() {
		// 앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요.
		Scanner sc = new Scanner(System.in);
	
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택  : ");
		int input = sc.nextInt();
		
		switch (input) {
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8(); break;
		case 9 : practice9(); break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
	}
}
