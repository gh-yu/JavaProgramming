package com.kh.example.family.model.vo;

import com.kh.example.family.model.vo.Basic;

public class Baby extends Family implements Basic{
	public Baby() {}
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override  // interface에서 추상메소드 정의한거 반드시 오버라이딩(재작성)
	public void eat() {
		super.setWeight(super.getWeight() + 3);
		super.setHealth(super.getHealth() + 1);
	}
	@Override  // interface에서 추상메소드 정의한거 반드시 오버라이딩(재작성)
	public void sleep() {
		super.setHealth(super.getHealth() + 3);
	}
	
//	public void eat() {
//		super.setWeight(super.getWeight() + 3);
//		super.setHealth(super.getHealth() + 1);
//	}
//	
//	public void sleep() {
//		super.setHealth(super.getHealth() + 3);
//	}
}
