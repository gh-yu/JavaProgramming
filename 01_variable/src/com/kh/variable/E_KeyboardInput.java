package com.kh.variable;

import java.util.Scanner;

public class E_KeyboardInput {
	public void inputScanner1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : "); // 항상 뭔가를 받기 전에 안내 문구 넣어야 함
//		String name = sc.nextLine(); // nextLine() : 사용자에게 문자열을 받아주는 메소드
		String name = sc.next();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt(); // nextInt() : 사용자에게 정수를 받아오는 메소드
		
		System.out.print("키를 입력하세요(소수점 첫째자리까지 입력) : ");
		double height = sc.nextDouble(); // nextDouble() : 사용자에게 실수를 받아오는 메소드
		
		System.out.println(name + "님은 " + age + "세이며, 키는 " + height + "cm입니다.");
	}
	
	public void inputScanner2() {
		// next()와 nextLine() 비교
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
		
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.nextLine(); // nextInt에서 값 가져간 후 엔터가 buffer에 남아 있음, 이 줄 실행시 buffer의 엔터를 가져가서 문제 발생
		
		// 해결 방법1. next()로 주소 받아주기 -> 완전한 해결 방법 아님
		// 띄어쓰기를 구분자로 인식하기 때문에 띄어쓰기가 있을 경우 그 중 일부만 읽어옴
		// next()는 엔터(줄바꿈)를 유효한 데이터 값으로 인식하지 않기 때문에 버퍼에 있던 엔터 안 가져오고 유효햔 값이 아닌 엔터는 사라짐
		// next()는 줄바꿈 안 가져오고 nextLine()은 줄바꿈 가져감
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.next(); 
		
		// 해결 방법2. 줄바꿈을 없애기 위한 nextLine() 추가
//		sc.nextLine(); //줄바꿈을 nextLine()이 데이터로 인식하고 가져감. 가져가고 날려버림.
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.nextLine();
		
		// 해결 방법3. 파싱(parsing)하기 : 문자열을 다른 자료형으로 바꾸는 것 <-웬만하면 비추천, 데이터의 형식에 맞게 써주는 것이 좋음(나이는 nextInt)
		System.out.print("나이를 입력하세요 : ");
		String strAge = sc.nextLine(); // String으로 받아올 수는 있지만, 연산 작용 생각하면 int형은 nextInt()로 받아주는 것이 좋음
		// nextLine()으로 가져오면 버퍼에 엔터 안 남겨짐
		int age = Integer.parseInt(strAge); // 문자열인 strAge를 integer형 = 숫자로 바꿔주는 메소드(Integer에 있는 parseInt 메소드)
//		Boolean.parseBoolean(""); // 문자열이 true/false 일 때 파싱 가능, 인지하지 못하는 것도 false로 결과 나옴
//		Double.parseDouble("");
//		Float.parseFloat("");
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		
		// + char 받기
		System.out.print("성별을 입력하세요(M/F) : ");
		String strGender = sc.nextLine();
		char gender = strGender.charAt(0); // charAt(int index) : char → String클래스 안에 있는 메소드
		//			  --------- -> String  //                          → 문자열에서 index번째에 있는 문자를 반환하는 메소드                      
		
		System.out.println(name + "님(" + gender + ")은 " + age + "세이며, 사는 곳은 " + address + "입니다.");
	}
}