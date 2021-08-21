package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		// 키보드로 입력 받은 하나의 정수가 양수이면 "양수다", 양수가 아니면 "양수가 아니다"를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.println(num > 0 ? "양수다" : "양수가 아니다");
	}
	
	public void practice2() {
		// 키보드로 입력 받은 하나의 정수가 양수이면 "양수다", 양수가 아닌 경우 중에서 0이면 "0이다", 0이 아니면 "음수다"를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.println(num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다"));
	}
	
	public void practice3() {
		// 키보드로 입력 받은 하나의 정수가 짝수이면 "짝수다", 짝수가 아니면 "홀수다"를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.println(num % 2 == 0 ? "짝수다" : "홀수다");
	}
	
	public void practice4() {
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + candy / people);
		System.out.println("남은 사탕 개수 : " + candy % people );
	}
	
	public void practice5() {
		// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요. 이 때 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력 처리 하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int num1 = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int num2 = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int num3 = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		String strGender = gender == 'M' ? "남학생" : "여학생";
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double grade = sc.nextDouble();
		
//		System.out.println();
		System.out.printf(
				"\n%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", num1, num2, num3, name, strGender, grade);
	}
	
	public void practice5_1() {
		// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요. 이 때 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력 처리 하세요
		// 성별 M과 F 이외의 문자 들어왔을때 예외처리
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int num1 = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int num2 = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int num3 = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		// 1. flag 논리값에 따라 실행문장 수행, 잘못 입력하자마자 잘못 입력하셨습니다 출력
//		String strGender = gender == 'M' ? "남학생" : "여학생";		
//		boolean flag = true;
//		if (!(gender == 'M' || gender == 'F')) {
//			System.out.println("잘못 입력하셨습니다.");
//			flag = false;
//		}
//		if (flag) {
//			System.out.print("성적(소수점 아래 둘째자리까지) : ");
//			double grade = sc.nextDouble();
//		
//			System.out.printf(
//					"\n%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", num1, num2, num3, name, strGender, grade);
//		}
		
		// 2. flag 안 쓰고 간단하게 삼항 연산자 중첩으로 사용, equals메소드 써서 예외처리
		String strGender = gender == 'M' ? "남학생" : (gender == 'F' ? "여학생" : "잘못 입력하셨습니다");
		if (strGender.equals("잘못 입력하셨습니다")) {
			System.out.println(strGender);
		} else {
			System.out.print("성적(소수점 아래 둘째자리까지) : ");
			double grade = sc.nextDouble();
		
			System.out.printf(
					"\n%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", num1, num2, num3, name, strGender, grade);
		}
	}
	
	public void practice6() {
		// 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		String strAge = age <= 13 ? "어린이" : (age > 19 ? "성인" : "청소년");
		System.out.println("당신은 " + strAge + "입니다.");
	}
	
	public void practice6_1() {
		// 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요.
		// 음수로 들어왔을때 예외처리
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		if (age > 0) {
		String strAge = age <= 13 ? "어린이" : (age > 19 ? "성인" : "청소년");
		System.out.println("당신은 " + strAge + "입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice7() {
		// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		// 세 과목에 대한 합계(국어+영어+수학)와 평균(3/0)을 구하세요.
		// 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		// 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
//		int avg = (kor + eng + math) / 3;
		double avg = sum / 3.0; // 답안 참고 코드, 문제 예시에는 double형으로 출력됨
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		String result = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격";
		System.out.println(result);
//		System.out.println( kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격");

//		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
	}
	
	public void practice8() { // 답안 보고 푼 문제
		// 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
//		String str = sc.nextLine();	
		char charStr = sc.nextLine().charAt(7); // 변수명 pId로
//		String gender = charStr == 2 || charStr == 4 ? "여자" : "남자"; // 잘못된 코드, 문자는 ''로 표시해야함 2라고 했으면 유니코드상 2번째 문자와 대칭

		String gender = charStr == '2' || charStr == '4' ? "여자" : (charStr == '1' || charStr == '3' ? "남자" : "잘못 입력하셨습니다.");
		System.out.println(gender);
		
	}
	
	public void practice9() {
		// 키보드로 정수 두 개를 입력 받아 각각의 변수(num1, num2)에 저장하세요.
		// 그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
		// 아니면 false를 출력하세요. (단, num1은 num2보다 작아야 함)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		boolean result = input <= num1 || input > num2 ? true : false;
		System.out.println(result);
		
//		System.out.println(input <= num1 || input > num2); // 답안, 더 간략함. 삼항연산자 사용 안해도 됨
	}
	
	public void practice10() {
		// 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
//		System.out.println(num1 == num2 && num1 == num3 && num2 == num3); // num1 == num3 없어도 됨
		System.out.println(num1 == num2 && num2 == num3);
//		boolean isTrue = ((num1 == num2) && (num2 == num3)); // 답안 코드, 삼항연산자 사용 안해도 됨
//		System.out.println(isTrue);	
	}
	
	public void practice11() {
		// A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
		// 인센티브 포함 급여가 3000만원 이상이면 "3000 이상". 미만이면 "3000 미만"을 출력하세요.
		// (A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();
		
//		double incenA = 0.4;
//		double incenB = 0.0;
//		double incenC = 0.15;
//		
//		System.out.println("A사원의 연봉/연봉+a : " + a + "/" + (a + (a*incenA)));
//		System.out.println((a + (a*incenA)) >= 3000 ? "3000 이상" : "3000 미만");
//		
//		System.out.println("B사원의 연봉/연봉+a : " + b + "/" + (b + (b*incenB)));
//		System.out.println((b + (b*incenB)) >= 3000 ? "3000 이상" : "3000  미만");
//		
//		System.out.println("C사원의 연봉/연봉+a : " + c + "/" + (c + (c*incenC)));
//		System.out.println((c + (c*incenC)) >= 3000 ? "3000 이상" : "3000  미만");
		
		// 답안 참고한 코드, 더 간편한 방식 + incenC 오차 해결
		
		System.out.println();
		
		double incenA = a * 1.4; // 답안 해설 보기
		double incenB = b;
		double incenC = c * 1.15;
//		double incenC = c + c * 0.15;
		
		System.out.println("A사원의 연봉/연봉+a : " + a + "/" + incenA);
		System.out.println(incenA >= 3000 ? "3000 이상" : "3000 미만"); // "3000 이상", "3000 미만"이라는 문자열을 String 변수에 저장하는 것이 효율적
		
		System.out.println("B사원의 연봉/연봉+a : " + b + "/" + incenB);
		System.out.println(incenB >= 3000 ? "3000 이상" : "3000  미만");
		
		System.out.println("C사원의 연봉/연봉+a : " + c + "/" + incenC);
		System.out.println(incenC >= 3000 ? "3000 이상" : "3000  미만"); 
	}
}
