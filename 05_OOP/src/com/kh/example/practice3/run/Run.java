package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle c = new Circle();
		
		System.out.println("== �ʱ� �� �ѷ� �� ���� ==");
		System.out.print("�ѷ� : ");
		c.getSizeOfCircle();
		System.out.print("���� : ");
		c.getAreaOfCircle();
		
		System.out.println();
		System.out.println("== ������ 1 ���� ==");
		c.incrementRadius();
		System.out.println();
		
		System.out.println("== ������ 1 ���� �� �� �ѷ� �� ���� ==");
		System.out.print("�ѷ� : ");
		c.getSizeOfCircle();
		System.out.print("���� : ");
		c.getAreaOfCircle();
		
	}

}
