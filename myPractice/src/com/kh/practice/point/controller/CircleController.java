package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {

	Circle c = new Circle();
//	public static final double PI = 3.14159265359;
	
	public String calcCircum(int x, int y, int radius) {
		
//		c.setX(x);
//		c.setY(y);
//		c.setRadius(radius);
//		double circum = PI * c.getRadius() * 2;
//		return c.toString() + " / " + circum;
		
		c = new Circle(x, y, radius); // 일일이 값 변경 안해줘도, 매개변수 있는 생성자 인수에 전달받은 값 넣어주면 해당 값으로 초기화됨
		return c + " / " + Math.PI * radius * 2; // c 객체 return하면 오버라이딩한 toString에서 return하는 값(대표값으로 설정한)으로 반환됨
		
	}
	
	public String calcArea(int x, int y, int radius) {
		
		c = new Circle(x, y, radius);
		double area = radius * radius * Math.PI;
		return c + " / " + area;
		
	}

}
