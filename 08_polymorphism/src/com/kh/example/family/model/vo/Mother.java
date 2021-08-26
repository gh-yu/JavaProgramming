package com.kh.example.family.model.vo;

import com.kh.example.family.mode.vo.Basic;

public class Mother extends Family implements Basic{
	private String babyBirth;
	
	public Mother() {}
	public Mother(String name, double weight, 
					int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + babyBirth;
	}
	 
	@Override  // interface에서 추상메소드 정의한거 반드시 오버라이딩(재작성)
	public void eat() {
		super.setWeight(super.getWeight() + 10);
		super.setHealth(super.getHealth() - 5);
	}
	@Override  // interface에서 추상메소드 정의한거 반드시 오버라이딩(재작성)
	public void sleep() {
		super.setHealth(super.getHealth() + 10);
	}
	
//	public void eat() {
//		super.setWeight(super.getWeight() + 10);
//		super.setHealth(super.getHealth() - 5);
//	}
//	
//	public void sleep() {
//		super.setHealth(super.getHealth() + 10);
//	} // 먹고 자는건 가족 구성원 모두가 할 수 있는 것
	
}
