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
	
	@Override  // interface���� �߻�޼ҵ� �����Ѱ� �ݵ�� �������̵�(���ۼ�)
	public void eat() {
		super.setWeight(super.getWeight() + 3);
		super.setHealth(super.getHealth() + 1);
	}
	@Override  // interface���� �߻�޼ҵ� �����Ѱ� �ݵ�� �������̵�(���ۼ�)
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
