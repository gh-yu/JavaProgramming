package com.kh.example.set.model.vo;

public class Dog implements Comparable<Dog>{
	private String name;
	private double weight;
	
	public Dog() {}
	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return name + "(" + weight + "kg)";
	}
	
	@Override
	public boolean equals(Object obj) { // Object클래스(부모조상 클래스)형 매개변수 obj가 Dog클래스형 객체 주소값 받아줌(업캐스팅)
		
		// 객체에 접근
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		
		// 데이터에 접근
		Dog other = (Dog)obj; // 매개변수로 받은 Object형 객체에 Dog필터 씌우기(다운캐스팅) 
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) { // 같지 않다면 false반환(중복 x라는 뜻)
			return false;
		}
		
		if (weight != other.weight) {
			return false;
		}
		
		
		return true;
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + (name == null ? 0 : name.hashCode());
		result = PRIME * result + (int)weight;
		
		return result;
	}
	
	@Override
	public int compareTo(Dog o) {
		double object = o.weight;
		
		
		if (weight > object) {
			return -1; // 1을 리턴하면 오름차순, -1을 리턴하면 내림차순
		} else if (weight == object) {
			return 0;
		} else {
			return 1;
		}
		
		// 원시자료형 double을 메소드 사용을 위해 Wapper클래스 이용해서 오토박싱해줌
//		Double standard = weight; 
//		Double object = o.weight;
//		return -standard.compareTo(object);

	}	
	
}
