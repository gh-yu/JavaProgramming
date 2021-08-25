package com.kh.example.animal.model.vo;

public class Animal { // Dog와 Snake에서 중복되는 부분 없애고 Animal클래스에 한꺼번에 작성
	private String name;
	private int age;
	private double weight;
	
	public Animal() {}
	
	public Animal(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
//	public String inform() {
//		return name + " " + age + " " + weight;
//	}
	
	@Override
	public String toString() { // Object 클래스에 있는 toString메소드 오버라이딩
		return name + " " + age + " " + weight;
	}
}
