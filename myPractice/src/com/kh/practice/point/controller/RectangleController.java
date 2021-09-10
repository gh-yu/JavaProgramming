package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {

	Rectangle r = new Rectangle();
	
	public String calcPerimete(int x, int y, int height, int width) {
		
//		r.setX(x);
//		r.setY(y);
//		r.setHeight(height);
//		r.setWidth(width);
		r = new Rectangle(x, y, height, width);
		int perimete = (height + width) * 2;
		
//		return r.toString() + " / " + perimete;
		return r + " / " + perimete;
	}

	public String calcArea(int x, int y, int height, int width) {
		
		r = new Rectangle(x, y, height, width);
		int area = height * width;
		
		return r + " / " + area;
	}

}
