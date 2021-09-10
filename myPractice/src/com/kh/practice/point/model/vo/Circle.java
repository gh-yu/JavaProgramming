package com.kh.practice.point.model.vo;

public class Circle extends Point {
	
	private int radius;
	
	public Circle() {}
	
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	
//	public int getX() {			// 부모 메소드에 존재, 중복된 코드로 필요 없는 코드
//		return super.getX();
//	}
//	public void setX(int x) {
//		super.setX(x);
//	}
//	
//	public int getY() {
//		return super.getY();
//	}
//	public void setY(int y) {
//		super.setY(y);
//	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + radius;
	}
}
