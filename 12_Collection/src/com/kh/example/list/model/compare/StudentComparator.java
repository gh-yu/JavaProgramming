package com.kh.example.list.model.compare;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// 비교 주체 : o1
//		int standard = o1.getScore();
		Integer standard = o1.getScore(); // Integer클래스의 compareTo()메소드 이용해서 정렬할 것
		// 비교 대상 : o2                    // Wapper클래스로 바꿔줘야 메소드 사용 가능
//		int object = o2.getScore();
		Integer object = o2.getScore();
		
		// 오름차순
		// 비교 주체가 비교 대상보다 크면 1
		// 비교 주체가 비교 대상과 같으면 0
		// 비교 주체가 비교 대상보다 작으면 -1 반환
		
//		if (standard > object) {
//			return 1;
//		} else if (standard == object) {
//			return 0;
//		} else {
//			return -1;
//		}
		
//		return standard.compareTo(object); // 오름차순 Integer클래스의 comparTo메소드 이용(정렬기준 세워져 있는 메소드)
//		return -standard.compareTo(object); // 내림차순

		// 두 가지 자료형 한꺼번에 정렬 적용
		int result = -standard.compareTo(object); // 점수(int) 내림차순
		String standardName = o1.getName(); // 비교 주체 이름
		String objectName = o2.getName();   // 비교 대상 이름
		
		if (result == 0) { // => 점수가 같은 경우
			return standardName.compareTo(objectName); // => 이름(String) 오름차순 정렬
		} else {
			return result; // 아니면 점수 내림차순만 적용
		}
		
	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}


}
