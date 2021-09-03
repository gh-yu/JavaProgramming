package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
		ArrayList l = new ArrayList(); // 크기 10인 ArrayList, 제네릭 <> 안 붙여주면 메소드 매개변수 자료형 Object로 지정되어 모든 클래스형 다 받아줄 수 있음
		l.add("김영미");
		l.add(20);
		l.add((new Student()));
//		System.out.println();
		
		ArrayList<Student> list = new ArrayList<Student>(3); // 크기 3인 ArrayList, Student형으로만 받아주겠다 제네릭 붙여줌, 제네릭 이용해서 Student형으로 제한하겠다
		// add(E e):boolean     리스트 끝에 데이터 추가
		list.add(new Student("테스트", 0));
		list.add(new Student("도대담", 60));
		list.add(new Student("남나눔", 90)); // 초기 설정한 크기 3개 다 채움
		System.out.println(list); // 순서 유지
		
		list.add(new Student("하현호", 85));
		System.out.println(list); 
		System.out.println("현재 list에 담긴 element 개수 : " + list.size());
		list.add(new Student("문미미", 66));
		System.out.println(list);
		System.out.println("현재 list에 담긴 element 개수 : " + list.size());
		// 컬렉션 장점1. 크기 제약이 없다
		
		// 컬렉션 장점2. 추가/삭제/정렬 등의 기능처리 간단
		// add(int index, E e):void      index번째 인덱스에 E 추가
		list.add(0, new Student("류라라", 100)); // 맨 앞에 추가됨
		System.out.println(list);
		list.add(3, new Student("강건강", 40)); // 인덱스 2 뒤에 추가됨 (원래 3에 있었던 값은 뒤로 밀려남)
		System.out.println(list);
		
		// remove(int index):E        해당 index번째 객체 삭제
		list.remove(1); // 삭제할 index번째 객체 반환됨
		System.out.println(list);
		// remove(Object o):boolean   해당 Object객체 삭제
		list.remove(new Student("강건강", 40)); 
		// Student클래스(list 객체)의 equals메소드 오버라이딩 전 : 메소드 기능 제대로 x(삭제 x)
		// 컴퓨터는 안에 들어있는 값이 아닌 주소값으로 객체 구분함, 지금 new연산자로 새로 객체 생성- 위의 강건강, 40들어있는 객체와 주소값이 다름
		// equals메소드&hashCode메소드 오버라이딩 후 : 삭제 o
		// 조건을 설정해줬기 때문에 생성자 안의 값이 같아 true 반환되면 remove메소드에서 삭제해줌

		System.out.println(list);
		
		// Collection.sort(List<String> list):<String>   해당 컬렉션 정렬
		ArrayList<String> test = new ArrayList<String>();
//		test.add("전은정");
//		test.add("곽우찬");
//		test.add("나은혜");
//		test.add("이현애");
//		System.out.println(test);
//		Collections.sort(test); // 정렬, 정렬기준 안 세우면 오름차순으로 정렬됨(자료형이 String이라 내부에 compareTo메소드 오버라이딩해서 정렬기준 세워져 있음)
		
		
		Collections.sort(list); // The method sort(List<T>) in the type Collections is not applicable for the arguments (ArrayList<Student>)
		                        // 정렬 기준 세워지지 않아 빨간 줄 덨었음
								// Student클래스에 가서 Comparable인터페이스 상속&comparTo()메소드 오버라이딩해서 정렬 기준 세워줌
								// 빨간 줄 사라짐, 정렬됨
							    // 이름 오름차순으로 정렬
		System.out.println(list); 
		
//		StudentComparator sc = new StudentComparator();
//		Collections.sort(list, sc);
		Collections.sort(list, new StudentComparator()); // 점수 오름차순으로 정렬
		System.out.println(list);
		
		list.add(new Student("박보배", 85));
		list.sort(new StudentComparator()); // 점수 내림차순, 이름 오름차순으로 정렬
		System.out.println(list);
		
		// set(int index, E e):E    index번째에 있는 요소를 E로 수정
//		list.set(2, new Student("강건강", 85)); 
//		System.out.println(list);
		list.set(3, new Student("박보배", 85)); // 중복 허용
		System.out.println(list);
		
		// get(int index):E         index번째에 있는 요소 반환
		Student s = list.get(2);
		System.out.println(s);
		System.out.println(list);
		
		// contains(Object o):boolean      o가 리스트에 존재하는지 확인, 있으면 true/없으면 false
		// indexOf(Object o):int           o가 리스트에 위치하는 인덱스 번호 반환
		System.out.println(list.contains(new Student("남나눔", 90))); // equals 오버라이딩했기 new 연산자 사용해도 문제없이 가능
		System.out.println(list.indexOf(new Student("남나눔", 90)));
		System.out.println(list.indexOf(new Student("남나나눔", 90)));
		
	    // clear():void        저장된 모든 객체 삭제
		// isEmpty():boolean   리스트가 비어있는지 확인, 비어있으면 true/비어있지 않으면 false
		list.clear(); // ArrayList에 저장된 모든 객체 삭제
		System.out.println(list);
		System.out.println(list.isEmpty());
		
	}
}
