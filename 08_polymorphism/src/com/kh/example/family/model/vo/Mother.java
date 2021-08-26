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
	 
	@Override  // interface���� �߻�޼ҵ� �����Ѱ� �ݵ�� �������̵�(���ۼ�)
	public void eat() {
		super.setWeight(super.getWeight() + 10);
		super.setHealth(super.getHealth() - 5);
	}
	@Override  // interface���� �߻�޼ҵ� �����Ѱ� �ݵ�� �������̵�(���ۼ�)
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
//	} // �԰� �ڴ°� ���� ������ ��ΰ� �� �� �ִ� ��
	
}
