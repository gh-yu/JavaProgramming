package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {

	Circle c = new Circle();
	public static final double PI = 3.14159265359;
	
	public String calcCircum(int x, int y, int radius) {
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double circum = PI * c.getRadius() * 2;
		
		
		return c.toString() + " / " + circum;
		
	}
	
	public String calcArea(int x, int y, int radius) {
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double area = radius * radius * PI;
		
		
		return c.toString() + " / " + area;
		
	}



}
