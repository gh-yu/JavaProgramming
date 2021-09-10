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
		
		c = new Circle(x, y, radius); // ������ �� ���� �����൵, �Ű����� �ִ� ������ �μ��� ���޹��� �� �־��ָ� �ش� ������ �ʱ�ȭ��
		return c + " / " + Math.PI * radius * 2; // c ��ü return�ϸ� �������̵��� toString���� return�ϴ� ��(��ǥ������ ������)���� ��ȯ��
		
	}
	
	public String calcArea(int x, int y, int radius) {
		
		c = new Circle(x, y, radius);
		double area = radius * radius * Math.PI;
		return c + " / " + area;
		
	}

}
