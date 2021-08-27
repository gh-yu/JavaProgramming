package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	
	public void method1() {
		// Person객체가 들어갈 수 있는 5개의 공간 pArr 생성
		Person pArr[] = new Person[5];
		
		for(int i = 0; i < pArr.length; i++) { // 초기화 하지 않은 상태에서 출력 -> null 5개 찍힘
			System.out.println(pArr[i]);
		}
		
//		System.out.println(pArr[0].getName()); // pArr[0]에는 Person객체가 들어갈 수 있음. 
		// 객체 집어넣기 전(초기화 전) pArr[0]에는 null이 들어가 있기 때문에 getName()을 가져올 수 없음
		// --> NullPointerException
		
		pArr[0] = new Person(); // 객체배열 초기화 객체 생성 후 발생한 (해당 객체=Person객체의)주소값 대입
		pArr[1] = new Person();
		pArr[2] = new Person();
		pArr[3] = new Person();
		pArr[4] = new Person();
		
		for(int i = 0; i < pArr.length; i++) { // 초기화 후 출력 -> 주소값 출력됨
			System.out.println(pArr[i]);
		}
		
		System.out.println(pArr[0].getName());
		// pArr[0]에는 Person객체가 들어가 있기 때문에 getName()을 가져올 수 있음
		// null이 뜨는 이유는 Person 기본 생성자로 만들었기 때문에 필드 초기화x
		// 즉, String name의 기본 값 null이 들어가 있으므로 null 반환
		
		pArr[0] = new Person("강건강", 25, '남', 175.4, 74.2);
		System.out.println(pArr[0].getName());
		
	}

	public void method2() {
		// 할당과 동시에 초기화
		Person[] pArr = {new Person("남나눔", 14, '남', 167.7, 61.5),
						 new Person("도대담", 31, '남', 182.4, 67.5),
						 new Person("류라라", 18, '여', 172.4, 56.1)};
		
		for (int i = 0; i < pArr.length; i++) { // 배열의 각 인덱스 별로 저장되어 있는 각 객체의 주소값 출력
			System.out.println(pArr[i]);
		}
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].personinfo()); // 배열의 각 인덱스 별로 저장되어 있는 각 객체의 메소드 호출
		}
		
	}
	
		
}

