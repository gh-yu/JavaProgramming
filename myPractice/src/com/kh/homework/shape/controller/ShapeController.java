package com.kh.homework.shape.controller;

import com.kh.homework.shape.model.vo.Shape;

public class ShapeController {
	Shape s = new Shape();
	
	public double calcPerimeter(int type, double height, double width) {
		
		s.setType(type);
		s.setHeight(height);
		s.setWidth(width);		
		if (s.getType() != type) { // �ﰢ�� �޴� ���� �� �簢�� �޴� ������ ���� �����  ����Ǿ� �ִ� type�� ���� type�� �ٸ��� 
			s.setColor("white");   // ���� �⺻������ �����Ǿ� �־��� white�� �ʱ�ȭ
		}
		
		return (height + width) * 2; // �ѷ�
	}
	
	public double calcArea(int type, double height, double width) {
	
		s.setType(type);
		s.setHeight(height);
		s.setWidth(width);		
		if (s.getType() != type) { // �ﰢ�� �޴� ���� �� �簢�� �޴� ������ ���� �����  ����Ǿ� �ִ� type�� ���� type�� �ٸ��� 
			s.setColor("white");   // ���� �⺻������ �����Ǿ� �־��� white�� �ʱ�ȭ
		}
		
		double area = 0;
		if (type == 3) { // �ﰢ���� ���� ����(area)
			area = height * width * 0.5;
		} else if (type == 4) { // �簢���� ���� ����(area)
			area = height * width;
		}	
		return area;
	}
	
	public String paintColor(int type, String color) {
		if (s.getType() != type || s.getHeight() == 0.0 || s.getWidth() == 0.0) { // ���� �ﰢ���̳� �簢���� ��������� ���� ���°ų�, �ٸ� type �����ߴ� ���ο� type ������ �Ÿ�
			if (s.getType() != type) {
				s.setColor("white");
			}
			return "��ĥ�� �����߽��ϴ�.";
	
		} else {
			s.setColor(color); // Shape Ŭ������ ���� ��ü�� �ּҰ��� s��� ������ ����(s�� ��������) s. �� ���� �ش�(Shape) ��ü�� �޼ҵ忡 ���� 
			return s.getColor();
		}
		
	}
	
//	public String print(int type) {
//		// �Ű������� ���� � ������� �ľ� �� Shape�� inform() �޼ҵ��� ��ȯ �� ����
//		String shapeType = null;
//		if (type == 3) {
//			shapeType = "�ﰢ��";
//		} else if (type == 4) {
//			shapeType = "�簢��";
//		}
//		
//		return s.inform();
//	}
	
//	public String print() {
//		// � ��������� Shape�� inform �޼ҵ��� ��ȯ �� ���� �Բ� ��ȯ
//		int type = s.getType();
//		String shapeType = null;
//		if (type == 3) {
//			shapeType = "�ﰢ��";
//		} else if (type == 4) {
//			shapeType = "�簢��";
//		}
//		
//		return shapeType + " / " +  s.inform();	
//	}
	
	public String print(int type) {
		// � ��������� Shape�� inform �޼ҵ��� ��ȯ �� ���� �Բ� ��ȯ
		String shapeType = null;
		if (type == 3) {
			shapeType = "�ﰢ��";
		} else if (type == 4) {
			shapeType = "�簢��";
		}
		
		return shapeType + " / " +  s.inform();	
	}
}
