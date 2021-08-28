package com.kh.practice.point.model.vo;

public class Rectangle extends Point {
	
	private int height;
	private int width;
	
	public Rectangle() {}
	
	public Rectangle(int x, int y, int height, int width) {
		super(x, y);
		this.height = height;
		this.width = width;
	}
	
	public int getX() {
		return super.getX();
	}
	public void setX(int x) {
		super.setX(x);
	}
	
	public int getY() {
		return super.getY();
	}
	public void setY(int y) {
		super.setY(y);
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + height + ", " + width;
	}
}
