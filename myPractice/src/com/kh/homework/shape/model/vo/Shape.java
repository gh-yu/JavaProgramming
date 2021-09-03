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
		return "높이 : " + height + " / 너비 : " + width + " / 색깔 : " + color;	
	}
	
	// type에 대한 setter, getter
	public void setType(int type) { // type 필드 값 변경하는 메소드
		this.type = type;
	}
	public int getType() { // type 값 반환하는 메소드
		return type;
	}
	
	// height에 대한 setter, getter
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	// width에 대한 setter, getter
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	
	// color에 대한 setter, getter
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}
