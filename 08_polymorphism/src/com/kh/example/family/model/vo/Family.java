package com.kh.example.family.model.vo;

public abstract class Family { // 추상클래스는 추상메소드가 없어도 성립 가능
	private String name;
	private double weight;
	private int health;
	
	public Family() {}
	public Family(String name, double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	@Override
	public String toString() {
		return name + ", " + weight + "kg, " + health;
	}
	
//	public abstract void eat(); // 몸체가 없는 추상 메소드
//	public abstract void sleep();
	
}
