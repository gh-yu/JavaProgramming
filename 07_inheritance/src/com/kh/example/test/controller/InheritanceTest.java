package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceTest {
	public void method() {
		System.out.println("ParentŬ������ num�ʵ忡 ����");
		Parent p = new Parent();
		p.setNum(9);
		System.out.println("ParentŬ���� �ȿ� �ִ� num : " + p.getNum());
		
		System.out.println();
		
		System.out.println("ChildŬ������ str�ʵ忡 ����");
		Child1 c1 = new Child1();
		c1.setStr("Hello");
		System.out.println("Child1 �ȿ� �ִ� str : " + c1.getStr());
		
		System.out.println();
		
		System.out.println("Child2Ŭ������ str�ʵ忡 ����");
		Child2 c2 = new Child2();
		c2.setStr("World");
		System.out.println("Child2 �ȿ� �ִ� str : " + c2.getStr());
		System.out.println("Chid2Ŭ������ ��ӹ��� ParentŬ������ �ʵ忡 ����");
//		c2.num();
		// (����) The method num() is undefined for the type Child2
		// ParentŬ������ �ʵ�� num�� �����ؼ� Child2���� ����� �������� num�� ���������ڰ� private�̱� ������ �ܺ� ���� �Ұ�
		c2.setNum(999);
		System.out.println("Child2 �ȿ� �ִ� num : " + c2.getNum());
		System.out.println("parent �ȿ� �ִ� num : " + p.getNum()); // Parent��ü�� Child2��ü �ּҰ��� �ٸ�, setNum()���� �� �����ص� ParentŬ�������� ���� x
															     // new Parent() ��  new Child2() �ؼ� ���� �ٸ� ��ü ���� �����Ǿ� ����
//		Child2 c3 = new Child2();								
//		System.out.println("Child2 �ȿ� �ִ� num : " + c3.getNum()); // ���� Ŭ������ �� ��ü �����ϸ� �ٸ� �ּҰ� ����
	}
}
