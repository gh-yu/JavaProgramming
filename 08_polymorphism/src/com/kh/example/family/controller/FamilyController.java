package com.kh.example.family.controller;

import com.kh.example.family.model.vo.Basic;
import com.kh.example.family.model.vo.Baby;
import com.kh.example.family.model.vo.Family;
import com.kh.example.family.model.vo.Mother;

public class FamilyController {
	public void method() {
//		Family f = new Family();
		// �߻�Ŭ������ ��ü ���� �Ұ�, ������ ���� ����
		
		Family f1 = new Mother("����", 50, 70, "���"); // FamilyŸ�� f1 ���������� Mother��ü �ּҰ� ����
		Family f2 = new Baby("�Ʊ�", 3.5, 70);

		// ���� ���ε�
//		f1.eat();
//		f2.eat();

//		Basic b = new Basic();
		// �������̽��� ��ü ���� �Ұ�, ������ ���� ����
		Basic b1 = new Mother("����", 50, 70, "���");
		Basic b2 = new Baby("�Ʊ�", 3.5, 70);
		// Basic�� �������̽�
		// Mother�� BabyŬ������ Basic�������̽��� implements������
		// �������̽� Basic�� �ִ� �߻�޼ҵ带 �������̵� �س�����
		
		b1.eat();
		b1.sleep();
	}
}
