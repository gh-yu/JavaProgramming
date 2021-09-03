package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
		ArrayList l = new ArrayList(); // ũ�� 10�� ArrayList, ���׸� <> �� �ٿ��ָ� �޼ҵ� �Ű����� �ڷ��� Object�� �����Ǿ� ��� Ŭ������ �� �޾��� �� ����
		l.add("�迵��");
		l.add(20);
		l.add((new Student()));
//		System.out.println();
		
		ArrayList<Student> list = new ArrayList<Student>(3); // ũ�� 3�� ArrayList, Student�����θ� �޾��ְڴ� ���׸� �ٿ���, ���׸� �̿��ؼ� Student������ �����ϰڴ�
		// add(E e):boolean     ����Ʈ ���� ������ �߰�
		list.add(new Student("�׽�Ʈ", 0));
		list.add(new Student("�����", 60));
		list.add(new Student("������", 90)); // �ʱ� ������ ũ�� 3�� �� ä��
		System.out.println(list); // ���� ����
		
		list.add(new Student("����ȣ", 85));
		System.out.println(list); 
		System.out.println("���� list�� ��� element ���� : " + list.size());
		list.add(new Student("���̹�", 66));
		System.out.println(list);
		System.out.println("���� list�� ��� element ���� : " + list.size());
		// �÷��� ����1. ũ�� ������ ����
		
		// �÷��� ����2. �߰�/����/���� ���� ���ó�� ����
		// add(int index, E e):void      index��° �ε����� E �߰�
		list.add(0, new Student("�����", 100)); // �� �տ� �߰���
		System.out.println(list);
		list.add(3, new Student("���ǰ�", 40)); // �ε��� 2 �ڿ� �߰��� (���� 3�� �־��� ���� �ڷ� �з���)
		System.out.println(list);
		
		// remove(int index):E        �ش� index��° ��ü ����
		list.remove(1); // ������ index��° ��ü ��ȯ��
		System.out.println(list);
		// remove(Object o):boolean   �ش� Object��ü ����
		list.remove(new Student("���ǰ�", 40)); 
		// StudentŬ����(list ��ü)�� equals�޼ҵ� �������̵� �� : �޼ҵ� ��� ����� x(���� x)
		// ��ǻ�ʹ� �ȿ� ����ִ� ���� �ƴ� �ּҰ����� ��ü ������, ���� new�����ڷ� ���� ��ü ����- ���� ���ǰ�, 40����ִ� ��ü�� �ּҰ��� �ٸ�
		// equals�޼ҵ�&hashCode�޼ҵ� �������̵� �� : ���� o
		// ������ ��������� ������ ������ ���� ���� ���� true ��ȯ�Ǹ� remove�޼ҵ忡�� ��������

		System.out.println(list);
		
		// Collection.sort(List<String> list):<String>   �ش� �÷��� ����
		ArrayList<String> test = new ArrayList<String>();
//		test.add("������");
//		test.add("������");
//		test.add("������");
//		test.add("������");
//		System.out.println(test);
//		Collections.sort(test); // ����, ���ı��� �� ����� ������������ ���ĵ�(�ڷ����� String�̶� ���ο� compareTo�޼ҵ� �������̵��ؼ� ���ı��� ������ ����)
		
		
		Collections.sort(list); // The method sort(List<T>) in the type Collections is not applicable for the arguments (ArrayList<Student>)
		                        // ���� ���� �������� �ʾ� ���� �� �B����
								// StudentŬ������ ���� Comparable�������̽� ���&comparTo()�޼ҵ� �������̵��ؼ� ���� ���� ������
								// ���� �� �����, ���ĵ�
							    // �̸� ������������ ����
		System.out.println(list); 
		
//		StudentComparator sc = new StudentComparator();
//		Collections.sort(list, sc);
		Collections.sort(list, new StudentComparator()); // ���� ������������ ����
		System.out.println(list);
		
		list.add(new Student("�ں���", 85));
		list.sort(new StudentComparator()); // ���� ��������, �̸� ������������ ����
		System.out.println(list);
		
		// set(int index, E e):E    index��°�� �ִ� ��Ҹ� E�� ����
//		list.set(2, new Student("���ǰ�", 85)); 
//		System.out.println(list);
		list.set(3, new Student("�ں���", 85)); // �ߺ� ���
		System.out.println(list);
		
		// get(int index):E         index��°�� �ִ� ��� ��ȯ
		Student s = list.get(2);
		System.out.println(s);
		System.out.println(list);
		
		// contains(Object o):boolean      o�� ����Ʈ�� �����ϴ��� Ȯ��, ������ true/������ false
		// indexOf(Object o):int           o�� ����Ʈ�� ��ġ�ϴ� �ε��� ��ȣ ��ȯ
		System.out.println(list.contains(new Student("������", 90))); // equals �������̵��߱� new ������ ����ص� �������� ����
		System.out.println(list.indexOf(new Student("������", 90)));
		System.out.println(list.indexOf(new Student("��������", 90)));
		
	    // clear():void        ����� ��� ��ü ����
		// isEmpty():boolean   ����Ʈ�� ����ִ��� Ȯ��, ��������� true/������� ������ false
		list.clear(); // ArrayList�� ����� ��� ��ü ����
		System.out.println(list);
		System.out.println(list.isEmpty());
		
	}
}
