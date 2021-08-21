package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.KindsOfVariable2;

public class Run {
	public static void main(String[] args) {
		KindsOfVariable2 k2 = new KindsOfVariable2();
		int a1 = k2.staticNum; 
		
		// static ���� ���ִ� �Ϳ� ���� ������ ��ü�� ���� �ʿ� x
		// ��ü ���� ���� Ŭ������.�ʵ�� / �𷡽���.�޼ҵ�� ���� ���� ����
		int a2 = KindsOfVariable2.staticNum;
		
		k2.method(); // testNum : 11, staticTestNum : 11���
		k2.method(); // testNum : 12, staticTestNum : 12 ���
		
		KindsOfVariable2 k22 = new KindsOfVariable2(); // ���Ӱ� ��ü ����
		// testNum�� ���� ��ü �����ʰ� ���ÿ� 10���� �ٽ� �ʱ�ȭ
	    // staticTestNum�� static �޸� ������ �����Ͱ� �״�� ��������
		k22.method(); // testNum : 11, staticTestNum : 13 ���
		
	}
}
