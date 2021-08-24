package com.kh.homework.shape.controller;

import com.kh.homework.shape.model.vo.Shape;

public class ShapeController {
	Shape s = new Shape();
	
	public double calcPerimeter(int type, double height, double width) {
	
		s.setType(type);
		s.setHeight(height);
		s.setWidth(width);
		
		return (height + width) * 2; // 둘레
	}
	
	public double calcArea(int type, double height, double width) {
	
		s.setType(type);
		s.setHeight(height);
		s.setWidth(width);		
		
		double area = 0;
		if (type == 3) { // 삼각형일 때의 넓이(area)
			area = height * width * 2;
		} else if (type == 4) { // 사각형일 때의 넓이(area)
			area = height * width;
		}
		
		return area;
	}
	
	public void paintColor(String color) {
		s.setColor(color); // Shape 클래스에 대한 객체의 주소값을 s라는 변수에 담음(s는 참조변수) s. 을 통해 해당(Shape) 객체의 메소드에 접근 
	}
	
	public String print(int type) {
		// 매개변수를 통해 어떤 모양인지 파악 후 Shape의 inform() 메소드의 반환 값 리턴
		String shapeType = null;
		if (type == 3) {
			shapeType = "삼각형";
		} else if (type == 4) {
			shapeType = "사각형";
		}
		
		return s.inform();
	}
	
	public String print() {
		// 어떤 모양인지와 Shape의 inform 메소드의 반환 값 합쳐 함께 반환
		int type = s.getType();
		String shapeType = null;
		if (type == 3) {
			shapeType = "삼각형";
		} else if (type == 4) {
			shapeType = "사각형";
		}
		
		return shapeType + " / " +  s.inform();	
	}
}
