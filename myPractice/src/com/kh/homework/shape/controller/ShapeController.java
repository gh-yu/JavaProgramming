package com.kh.homework.shape.controller;

import com.kh.homework.shape.model.vo.Shape;

public class ShapeController {
	Shape s = new Shape();
	
	public double calcPerimeter(int type, double height, double width) {
	
		s.setType(type);
		s.setHeight(height);
		s.setWidth(width);
		
		return (height + width) * 2; // �ѷ�
	}
	
	public double calcArea(int type, double height, double width) {
	
		s.setType(type);
		s.setHeight(height);
		s.setWidth(width);		
		
		double area = 0;
		if (type == 3) { // �ﰢ���� ���� ����(area)
			area = height * width * 2;
		} else if (type == 4) { // �簢���� ���� ����(area)
			area = height * width;
		}
		
		return area;
	}
	
	public void paintColor(String color) {
		s.setColor(color); // Shape Ŭ������ ���� ��ü�� �ּҰ��� s��� ������ ����(s�� ��������) s. �� ���� �ش�(Shape) ��ü�� �޼ҵ忡 ���� 
	}
	
	public String print(int type) {
		// �Ű������� ���� � ������� �ľ� �� Shape�� inform() �޼ҵ��� ��ȯ �� ����
		String shapeType = null;
		if (type == 3) {
			shapeType = "�ﰢ��";
		} else if (type == 4) {
			shapeType = "�簢��";
		}
		
		return s.inform();
	}
	
	public String print() {
		// � ��������� Shape�� inform �޼ҵ��� ��ȯ �� ���� �Բ� ��ȯ
		int type = s.getType();
		String shapeType = null;
		if (type == 3) {
			shapeType = "�ﰢ��";
		} else if (type == 4) {
			shapeType = "�簢��";
		}
		
		return shapeType + " / " +  s.inform();	
	}
}
