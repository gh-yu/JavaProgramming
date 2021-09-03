package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
		HashSet<Dog> set = new HashSet<Dog>();
		// add(E e):boolean    set 안에 e 추가
		set.add(new Dog("자두", 6.4));
		set.add(new Dog("두이", 4));
		set.add(new Dog("호두", 3.4));
		System.out.println(set); // 순서 유지 안 됨
		
		set.add(new Dog("자두", 6.4)); 
		System.out.println(set); // 중복 저장 x (equals메소드&hashCode메소드 오버라이딩 후)
		// equals 메소드 오버라이딩 전 -> new로 새로운 객체 만든 거라서 주소값이 달라서 중복 저장됨
		
		
		LinkedHashSet<Dog> set2 = new LinkedHashSet<Dog>();
		set2.add(new Dog("초코", 2.1));
		set2.add(new Dog("콩이", 8.3));
		set2.add(new Dog("두부", 5.0));
		set2.add(new Dog("초코", 2.1));
		System.out.println(set2); // 중복 저장 x, 순서대로 나옴
		set2.add(new Dog("로이", 6.1));
		set2.add(new Dog("공주", 5.3));
		set2.add(new Dog("왕자", 9.5));
		set2.add(new Dog("조이", 12.5));
		System.out.println(set2); // 순서 유지
		
		// 요소 가져오기 1. Set을 List로 바꾸기
		ArrayList<Dog> list = new ArrayList<Dog>(set2);
		System.out.println(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 요소 가져오기 2. iterator 이용
		Iterator<Dog> it = set2.iterator();
		while(it.hasNext()) {
			Dog d = it.next();
			System.out.println(d);
		}
		
		TreeSet<String> test = new TreeSet<String>(); // 정렬해즘(클래스 내 정렬기준 o), 중복저장x
		test.add("박윤수");
		test.add("나준영");
		test.add("조원빈");
		test.add("송민경");
		System.out.println(test);
		
		TreeSet<Dog> set3 = new TreeSet<Dog>(set2);
		System.out.println(set3);
		
		TreeSet<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		set4.addAll(set3);
		set4.add(new Dog("로이", 5.1));
		System.out.println(set4);
		
		
	}
}
