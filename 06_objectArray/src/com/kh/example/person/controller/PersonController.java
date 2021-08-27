package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	
	public void method1() {
		// Person��ü�� �� �� �ִ� 5���� ���� pArr ����
		Person pArr[] = new Person[5];
		
		for(int i = 0; i < pArr.length; i++) { // �ʱ�ȭ ���� ���� ���¿��� ��� -> null 5�� ����
			System.out.println(pArr[i]);
		}
		
//		System.out.println(pArr[0].getName()); // pArr[0]���� Person��ü�� �� �� ����. 
		// ��ü ����ֱ� ��(�ʱ�ȭ ��) pArr[0]���� null�� �� �ֱ� ������ getName()�� ������ �� ����
		// --> NullPointerException
		
		pArr[0] = new Person(); // ��ü�迭 �ʱ�ȭ ��ü ���� �� �߻��� (�ش� ��ü=Person��ü��)�ּҰ� ����
		pArr[1] = new Person();
		pArr[2] = new Person();
		pArr[3] = new Person();
		pArr[4] = new Person();
		
		for(int i = 0; i < pArr.length; i++) { // �ʱ�ȭ �� ��� -> �ּҰ� ��µ�
			System.out.println(pArr[i]);
		}
		
		System.out.println(pArr[0].getName());
		// pArr[0]���� Person��ü�� �� �ֱ� ������ getName()�� ������ �� ����
		// null�� �ߴ� ������ Person �⺻ �����ڷ� ������� ������ �ʵ� �ʱ�ȭx
		// ��, String name�� �⺻ �� null�� �� �����Ƿ� null ��ȯ
		
		pArr[0] = new Person("���ǰ�", 25, '��', 175.4, 74.2);
		System.out.println(pArr[0].getName());
		
	}

	public void method2() {
		// �Ҵ�� ���ÿ� �ʱ�ȭ
		Person[] pArr = {new Person("������", 14, '��', 167.7, 61.5),
						 new Person("�����", 31, '��', 182.4, 67.5),
						 new Person("�����", 18, '��', 172.4, 56.1)};
		
		for (int i = 0; i < pArr.length; i++) { // �迭�� �� �ε��� ���� ����Ǿ� �ִ� �� ��ü�� �ּҰ� ���
			System.out.println(pArr[i]);
		}
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].personinfo()); // �迭�� �� �ε��� ���� ����Ǿ� �ִ� �� ��ü�� �޼ҵ� ȣ��
		}
		
	}
	
		
}

