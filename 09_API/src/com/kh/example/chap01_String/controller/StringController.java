package com.kh.example.chap01_String.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringController {
	
	public void method1() {
		// String test
		String str1 = "java";
		String str2 = "java"; // str1
		String str3 = new String("java"); // new 키워드를 통해 새로운 객체 공간 생성
	
		System.out.println("str1 : " + str1); // str1을 찍으면 java가 아닌 주소값 나와야 됨
		System.out.println("str2 : " + str2); // but, 데이터가 나옴 -> toString()이 오버라이딩이 되었다.
		System.out.println("str3 : " + str3);
		
		boolean bool1 = str1 == str2; // 문자열에서의 == 비교는 주소값 비교
		boolean bool2 = str1 == str3;
		System.out.println("str1과 str2의 주소는 같은가? : " + bool1);
		System.out.println("str1과 str3의 주소는 같은가? : " + bool2);
		
		System.out.println("str1의 hashCode : " + str1.hashCode()); // hashCode : 주소값을 숫자로 바꾼 것
		System.out.println("str2의 hashCode : " + str2.hashCode()); 
		System.out.println("str3의 hashCode : " + str3.hashCode()); // 문자열 값이 같으면(equals) 같은 hashCode 출력됨
		// 같은 주소값 세 번 출력됨
		
		str1 += "API";
		System.out.println("str1 : " + str1); 
		System.out.println("str2 : " + str2); 
		System.out.println("str3 : " + str3);
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1)); // 데이터값이 다름 -> 주소값 다르게 출력
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3)); // System.identityHashCode() <- 실 주소값
		// 주소값 각각 다르게 출력됨
	}
	
	public void method2() {
		// StringBuffer/StringBuilder
		// 어떤 문자열을 작업할 때 계속해서 문자열을 변경해야할 경우 String클래스의 '불변'이라는 특징 상
		// 값이 새로 생기고 참조 위치만 바꿔주기 때문에 가비지컬렉터가 계속 지워야하는 단점이 있음
		// String클래스의 경우는 변경이 적고 읽기만 많은 경우에 더 적합
		// 변경이 많은 경우 StringBuffer나 StringBuilder를 이용하는 것이 더 적합
		// 변경/저장을 위한 메모리 공간(버퍼=임시공간)을 내부에 지니는데 초기에는 16개의 공간이 생기고 자동으로 증가
		// 두 클래스의 차이는 동기화가 되느냐 안되느냐의 차이
		
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("초기 buffer1의 수용량 : " + buffer1.capacity());
		System.out.println("buffer1에 들어가있는 실제 값의 길이 : " + buffer1.length());
		
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer(100); // 공간 100개로 설정(할당)
		System.out.println("초기 buffer2의 수용량 : " + buffer2.capacity());
		System.out.println("buffer12에 들어가있는 실제 값의 길이 : " + buffer2.length());
		
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("초기 buffer3의 수용량 : " + buffer3.capacity()); // 기본 수용량 16 + abc길이 3 = 19가 초기수용량
		System.out.println("buffer3에 들어가있는 실제 값의 길이 : " + buffer3.length());
		
		System.out.println();
		
		System.out.println("buffer3의 실주소값 : " + System.identityHashCode(buffer3));
		// append(String str):StringBuffer
		//		    매개변수	        반환값
//		buffer3.append("abc"); // StringBuffer클래스의 append메소드 : 문자열 추가
//		System.out.println("abc 추가 후의 buffer3 : " + buffer3);
//		System.out.println("abc 추가 후의 buffer3 용량 : " + buffer3.capacity()); // 초기 수용량 19 그대로임
//		System.out.println("abc 추가 후의 buffer3 길이 : " + buffer3.length());
	
//		System.out.println();
//		buffer3.append("def");
//		System.out.println("def 추가 후의 buffer3 : " + buffer3);
//		System.out.println("def 추가 후의 buffer3 용량 : " + buffer3.capacity());
//		System.out.println("def 추가 후의 buffer3 길이 : " + buffer3.length());
		
		buffer3.append("abc").append("def"); // 메소드 체이닝 : 메소드 뒤에 메소드 체인으로 연결
//StringBuffer  ------------
//		StringBuffer.append(String str):StringBuffer

		System.out.println("abc, def 추가 후의 buffer3 : " + buffer3);
		System.out.println("abc, def 추가 후의 buffer3 용량 : " + buffer3.capacity());
		System.out.println("abc, def 추가 후의 buffer3 길이 : " + buffer3.length());
		System.out.println("buffer3의 실주소값 : " + System.identityHashCode(buffer3)); // 주소값 그대로, 값 수정만 됨
		
		System.out.println();
		
		// insert(int offset, String str):StringBuffer
		// 원하는 위치에 str을 추가하는 메소드
		buffer3.insert(2, "zzz");
		System.out.println("인덱스 2에 zzz추가 후의 buffer3 : " + buffer3);
		
		// delete(int start, int end):StringBuffer
		// start <= index < end
		// start번 인덱스부터 end -1번 인덱스까지
		buffer3.delete(2, 5);
		System.out.println("인덱스 2부터 인덱스5까지 삭제 후의 buffer3 : " + buffer3);
		
		// reverse()
		buffer3.reverse();
		System.out.println("reverse 후의 buffer3 : " + buffer3);
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append("zzz").insert(2, "yy").reverse().delete(1,3); 
		System.out.println(sb);
	}
	
	public void method3() {
		String str = "Hello world";
		
		// charAt(int index):char
		// String의 index번째의 char 반환
		char ch = str.charAt(4);
		System.out.println(ch);
		
		// concat(String str):String
		// 본래 값 뒤에 str을 추가해주는 메소드
		String concatStr = str.concat("!!!");
		System.out.println(concatStr); // Hello world!!! 출력
		str += "!!!";
		System.out.println(str); // Hello world!!! 출력
		
		// equals():boolean
		System.out.println("concatStr.equals(str) : " + concatStr.equals(str));
		
		// sustring(int beginIndex):String <- 인덱스의 시작 지점만 정해줌
		// subString(int beginIndex, int endIndex):String <- 인덱스의 시작과 끝 정해줌
		// String의 일부 반환 <- beginIndex 부터
		// 많이 쓰는 메소드, 기억하기
		System.out.println("str.substring(6) : " + str.substring(6));
		System.out.println("str.subString(0,4) " + str.substring(0, 4)); // 인덱스 0~3까지 출력됨
		
		// replace(char oldChar, char newChar):String
		// oldChar를 newChar로 대체한 문자열 반환
		System.out.println("str.replace('1', 'e') : " + str.replace('l', 'e')); // str내 'l'을 'e'로 바꿈
		
		// toUpperCase()/toLowerCase():String
		//
		System.out.println("str.toUpperCase() : " + str.toUpperCase());
		System.out.println("str.toLowerCase() : " + str.toLowerCase());
		Scanner sc = new Scanner(System.in);
		System.out.print("더 하시겠습니까?(y/n) : ");
		String answerStr = sc.nextLine().toLowerCase(); // 입력한 문자열을 다 소문자로 바꿔줌 Y나 y 입력하면 y가 됨
		char answer = answerStr.charAt(0);
		if (answer == 'y') {
			System.out.println("계속 한답니다.");
		} else if (answer == 'n') {
			System.out.println("그만 한답니다.");
		}
		
		// equalsIgnorCase():boolean
		// 대소문자를 가리지 않고 문자열 비교
		String str2 = "WONDERFUL";
		String str3 = "wonderful";
		System.out.println(str2.equals(str3)); // false 출력됨
		System.out.println(str2.equalsIgnoreCase(str3)); // true 출력됨
		
		System.out.print("더 하시겠습니까?(y/n) : ");
		String answerStr2 = sc.nextLine();
		if (answerStr2.substring(0,1).equalsIgnoreCase("y")) {
			System.out.println("계속 한답니다.");
		} else if (answerStr2.substring(0,1).equalsIgnoreCase("n")) {
			System.out.println("그만 한답니다.");
		}
		
		// trim():STring
		// 앞/뒤에 있는 빈 공간을 제거한 문자열 반환
		// 로그인할 때 뒤에 스페이스 들어가는 실수하더라도 trim()메소드를 통해 빈공간 제거하여 로그인 가능하게 해줌
		// 로그인 처리 등 이 기능 많이 쓰임
		String str4 = "      Java";
		String str5 = "Java      ";
		String str6 = "   Java   ";
		String str7 = "Ja      va"; // 사이에 있는 스페이스 안 지워짐
		System.out.println(str4 + " : " + str4.trim());
		System.out.println(str5 + " : " + str5.trim());
		System.out.println(str6 + " : " + str6.trim());
		System.out.println(str7 + " : " + str7.trim()); // 사이에 있는 스페이스는 지워지지 않음
		
		
		// split(String str):String[] // String[]배열을 반환
		// 문자열을 분리해주는 메소드
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framework";
		splitStr.split(", "); // ", "(쉼표띄어쓰기)를 구분인자로 해서 갈라주겠다
		String[] strArr = splitStr.split(", "); // ", "를 구분인자로 해서 각각의 배열 인덱스에 주소값 담고 그 String객체배열을 반환
		System.out.println(strArr);
		
		// 일반 for문
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		// 향상된 for문 = for-each
		for (String s : strArr) { // strArr 인덱스 끝까지 출력 -> String s라는 임시변수에 0, 1, 2.. 인덱스 for문 돌때마다 차례로 담음
			System.out.println(s);
		}
		
	}
	
	public void method4() {
		String str = "Java, Oracle, JDBC, Front, Server, Framework";
		StringTokenizer st = new StringTokenizer(str, ", ");
		System.out.println("분리된 문자열 개수 : " + st.countTokens());
		
		// hasMorTokens():boolean
		// 다음 토큰(분리된 문자열) 값이 있다면 true 반환
		while(st.hasMoreTokens()) { 
			System.out.println(st.nextToken());
			// nextToken():String
			// 해당하는 다음 값 반환
		}
		
		String str2 = "Apple,Banana-Cream*Dessert#Egg Fruits";
		String[] strArr = str2.split(",-*# ");
//		String[] strArr = str2.split(",|-|*|#| "); // 정규표현식
		for (String s : strArr) {
			System.out.println(s); // 구분 안돼서 출력됨
		}
		
		StringTokenizer st2 = new StringTokenizer(str2, ",-* #");
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken()); // 구분인자마다 구분돼서 출력됨
		}
		
	}
	
}
