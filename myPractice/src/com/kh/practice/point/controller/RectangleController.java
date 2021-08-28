package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {

	Rectangle r = new Rectangle();
	
	public String calcPerimete(int x, int y, int height, int width) {
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		int perimete = (height + width) * 2;
		
		return r.toString() + " / " + perimete;
	}

	public String calcArea(int x, int y, int height, int width) {
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		int area = height * width;
		
		return r.toString() + " / " + area;
	}

}
