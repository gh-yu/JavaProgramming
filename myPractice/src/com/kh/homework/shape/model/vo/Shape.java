package com.kh.homework.shape.model.vo;

public class Shape {
	
	private int type;
	private double height;
	private double width;
	private String color = "white";
	
	public Shape() {}
	
	public Shape(int type, double height, double width) {
		this.type = type;
		this.height = height;
		this.width = width;
	}
	
	public String inform() {
		return "���� : " + height + " / �ʺ� : " + width + " / ���� : " + color;	
	}
	
	// type�� ���� setter, getter
	public void setType(int type) { // type �ʵ� �� �����ϴ� �޼ҵ�
		this.type = type;
	}
	public int getType() { // type �� ��ȯ�ϴ� �޼ҵ�
		return type;
	}
	
	// height�� ���� setter, getter
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	// width�� ���� setter, getter
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	
	// color�� ���� setter, getter
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}
