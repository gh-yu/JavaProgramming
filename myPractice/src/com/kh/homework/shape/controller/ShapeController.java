package com.kh.homework.shape.controller;

import com.kh.homework.shape.model.vo.Shape;

public class ShapeController {
	Shape s = new Shape();
	
	public double calcPerimeter(int type, double height, double width) {
		
		s.setType(type);
		s.setHeight(height);
		s.setWidth(width);		
		if (s.getType() != type) { // 삼각형 메뉴 선택 후 사각형 메뉴 선택할 것을 대비해  저장되어 있는 type과 들어온 type이 다르면 
			s.setColor("white");   // 색깔 기본값으로 설정되어 있었던 white로 초기화
		}
		
		return (height + width) * 2; // 둘레
	}
	
	public double calcArea(int type, double height, double width) {
	
		s.setType(type);
		s.setHeight(height);
		s.setWidth(width);		
		if (s.getType() != type) { // 삼각형 메뉴 선택 후 사각형 메뉴 선택할 것을 대비해  저장되어 있는 type과 들어온 type이 다르면 
			s.setColor("white");   // 색깔 기본값으로 설정되어 있었던 white로 초기화
		}
		
		double area = 0;
		if (type == 3) { // 삼각형일 때의 넓이(area)
			area = height * width * 0.5;
		} else if (type == 4) { // 사각형일 때의 넓이(area)
			area = height * width;
		}	
		return area;
	}
	
	public String paintColor(int type, String color) {
		if (s.getType() != type || s.getHeight() == 0.0 || s.getWidth() == 0.0) { // 만약 삼각형이나 사각형이 만들어지지 않은 상태거나, 다른 type 설정했다 새로운 type 선택한 거면
			if (s.getType() != type) {
				s.setColor("white");
			}
			return "색칠에 실패했습니다.";
	
		} else {
			s.setColor(color); // Shape 클래스에 대한 객체의 주소값을 s라는 변수에 담음(s는 참조변수) s. 을 통해 해당(Shape) 객체의 메소드에 접근 
			return s.getColor();
		}
		
	}
	
//	public String print(int type) {
//		// 매개변수를 통해 어떤 모양인지 파악 후 Shape의 inform() 메소드의 반환 값 리턴
//		String shapeType = null;
//		if (type == 3) {
//			shapeType = "삼각형";
//		} else if (type == 4) {
//			shapeType = "사각형";
//		}
//		
//		return s.inform();
//	}
	
//	public String print() {
//		// 어떤 모양인지와 Shape의 inform 메소드의 반환 값 합쳐 함께 반환
//		int type = s.getType();
//		String shapeType = null;
//		if (type == 3) {
//			shapeType = "삼각형";
//		} else if (type == 4) {
//			shapeType = "사각형";
//		}
//		
//		return shapeType + " / " +  s.inform();	
//	}
	
	public String print(int type) {
		// 어떤 모양인지와 Shape의 inform 메소드의 반환 값 합쳐 함께 반환
		String shapeType = null;
		if (type == 3) {
			shapeType = "삼각형";
		} else if (type == 4) {
			shapeType = "사각형";
		}
		
		return shapeType + " / " +  s.inform();	
	}
}
