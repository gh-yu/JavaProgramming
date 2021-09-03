package com.kh.example.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
		HashSet<Dog> set = new HashSet<Dog>();
		// add(E e):boolean    set �ȿ� e �߰�
		set.add(new Dog("�ڵ�", 6.4));
		set.add(new Dog("����", 4));
		set.add(new Dog("ȣ��", 3.4));
		System.out.println(set); // ���� ���� �� ��
		
		set.add(new Dog("�ڵ�", 6.4)); 
		System.out.println(set); // �ߺ� ���� x (equals�޼ҵ�&hashCode�޼ҵ� �������̵� ��)
		// equals �޼ҵ� �������̵� �� -> new�� ���ο� ��ü ���� �Ŷ� �ּҰ��� �޶� �ߺ� �����
		
		
		LinkedHashSet<Dog> set2 = new LinkedHashSet<Dog>();
		set2.add(new Dog("����", 2.1));
		set2.add(new Dog("����", 8.3));
		set2.add(new Dog("�κ�", 5.0));
		set2.add(new Dog("����", 2.1));
		System.out.println(set2); // �ߺ� ���� x, ������� ����
		set2.add(new Dog("����", 6.1));
		set2.add(new Dog("����", 5.3));
		set2.add(new Dog("����", 9.5));
		set2.add(new Dog("����", 12.5));
		System.out.println(set2); // ���� ����
		
		// ��� �������� 1. Set�� List�� �ٲٱ�
		ArrayList<Dog> list = new ArrayList<Dog>(set2);
		System.out.println(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// ��� �������� 2. iterator �̿�
		Iterator<Dog> it = set2.iterator();
		while(it.hasNext()) {
			Dog d = it.next();
			System.out.println(d);
		}
		
		TreeSet<String> test = new TreeSet<String>(); // ��������(Ŭ���� �� ���ı��� o), �ߺ�����x
		test.add("������");
		test.add("���ؿ�");
		test.add("������");
		test.add("�۹ΰ�");
		System.out.println(test);
		
		TreeSet<Dog> set3 = new TreeSet<Dog>(set2);
		System.out.println(set3);
		
		TreeSet<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		set4.addAll(set3);
		set4.add(new Dog("����", 5.1));
		System.out.println(set4);
		
		
	}
}
