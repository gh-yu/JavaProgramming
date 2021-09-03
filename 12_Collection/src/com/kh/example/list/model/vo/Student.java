package com.kh.example.list.model.vo;


public class Student implements Comparable<Student> {
	
	private String name;
	private int score;
	
	public Student() {}
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return name + "(" + score + "점)";
	}
	
	@Override      // equals 호출했다는 건 나(Student)라는 객체가 생성됐다는 것
	public boolean equals(Object obj) { // 매개변수 Object는 나와 비교할 객체
		// 객체 측면
		if (this == obj)  { // 나와 주소값이 같다면
			return true;    // -> 나와 obj는 같다
		} if (obj == null) { // 나는 객체 생성돼서 주소값 있는데 obj는 null이면? 
			return false;    // -> 나와 obj는 같지 않다
		}
		if (getClass() != obj.getClass()) { // 같은 클래스가 아니면
			return false;
		}
		
		// 필드(데이터) 측면
		Student other = (Student)obj; // 나랑 비교할 다른 애를 Student타입으로 형변환해서 Student타입 other라는 참조변수에 집어넣음
		                              // Object클래스는 부모클래스, 자식클래스로 형변환
		if (name == null) {           // 내 것은 null인데
			if (other.name != null) { // 나랑 비교할 다른 애는 null이 아니면
				return false;         // 같지 않다
			}
		} else if (!name.equals(other.name)) { // String 비교, 같지 않다면
			return false;           
		} if (score != other.score) {
			return false;
		}
		
		return true; // 위 조건문에 해당하지 않으면 같다는 것, true 반환
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + (name == null ? 0 : name.hashCode());
		result = PRIME * result + score;
		
		return result;
	}
	
//	@Override
//	public int compareTo(Object o) {
//		Student other = (Student)o;
//		String otherName = other.name;
//		return name.compareTo(otherName);
//	}
	
	@Override
	public int compareTo(Student o) {
		// 이름(String)으로 오름차순 
		
		// 비교 주체(나)와 비교 대상(o)을 비교하는데
		// 비교 주체가 비교 대상과 같으면 0,
		// 비교 주체가 비교 대상보다 크면 1,
		// 비교 주체가 비교 대상보다 작으면 -1 반환
		return name.compareTo(o.name); // String클래스 내부에는 정렬기준(오름차순) 세워져 있음
//		return -name.compareTo(o.name); // - 붙여주면 내림차순
		
	}
	
}
