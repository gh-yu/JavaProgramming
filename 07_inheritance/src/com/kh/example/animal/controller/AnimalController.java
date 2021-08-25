package com.kh.example.animal.controller;

import com.kh.example.animal.model.vo.Animal;
import com.kh.example.animal.model.vo.Dog;
import com.kh.example.animal.model.vo.Snake;

public class AnimalController {
	public void method() {
		Animal a = new Animal("������", 9, 6.3);
//		System.out.println(a.inform());
//		System.out.println(a.toString());
		System.out.println(a); // a��� ���������� AnimalŬ������ ��ü�� ��Ƴ���. �׷��� a���� �ּҰ��� �� ��
							   // but, ��������� �ּҰ��� �� �߰� toString�޼ҵ带 �ҷ��� ����� ��µ�
							   // ������ 9 6.3 �� ��µ�
							   // toString�޼ҵ� ��� :  �� ��ü�� ���� ��ǥ���� ���ڿ� �������� ��ȯ
							   // toString�޼ҵ� �������̵�(�θ� Ŭ������ �޼ҵ� ���ۼ�)�ؼ� ��ǥ���� �ּҰ� ��� �ٸ� ��ȯ�� �����Ͽ� ��ȯ  
		Dog d = new Dog();
		d.setName("����");
		d.setAge(1);
		d.setWeight(5.2);
		d.setHeight(50);
		d.setHair("���");
//		System.out.println(d.inform());
//		System.out.println(d.toString());
		System.out.println(d);
		
		Dog d2 = new Dog("����", 2, 2.5, 30, "�ܸ�");
//		System.out.println(d2.inform());
//		System.out.println(d2.toString()); // ������ �ȿ� this.height = height; this.hair = hair; �ڵ常 ����
										 // name, age, weight�� �⺻�� ��µ� <- Dog ������ �ȿ� �ش� (�θ�)�ʵ� �ʱ�ȭ�ϰ� ���� �ʾƼ� 
									     // super.setName(name); ������ �ȿ� �θ�Ŭ������ �޼ҵ� ����ؼ� (�θ�)�ʵ尪 �ʱ�ȭ
									     // �Ǵ� super(name, age, weight); �θ� ������ ȣ��, ��ó�� ������ �ʿ� ���� �����ڷ� �� ���� �� ����
		System.out.println(d2);
		
		
		Snake s = new Snake();
		s.setName("�����");
		s.setAge(1);
		s.setWeight(6.3);
		s.setPattern("����");
		System.out.println(s.toString());
		
		Snake s2 = new Snake("�����", 2, 3.6, "����");
//		System.out.println(s2.inform());
//		System.out.println(s2.toString());
		System.out.println(s2);
	
	
	}	
}
