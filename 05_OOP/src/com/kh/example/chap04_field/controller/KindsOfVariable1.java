package com.kh.example.chap04_field.controller;

// ���� ���� ��ġ�� ���� ����
public class KindsOfVariable1 { // <-- Ŭ���� ������ ����
	
	// Ŭ���� ������ �ۼ��ϴ� ���� : �ʵ� = ��� ���� = ��� �ʵ� = ��������
	private int global;
	
	public void method1(int num) { // <-- �޼ҵ� ������ ����
//						------- �ܺο��� �����͸� �޾ƿ��� ���� : �Ű�����
		
		// �޼ҵ� ������ �ۼ��ϴ� ���� : ��������
		// �Ű������� ������ ��������
		// ���������� ���� �ܿ� �ٽ� ����ϱ� ���ؼ��� �� �ʱ�ȭ �ʿ�
		// ���������� �Ű������� �ʱ�ȭ�� �ʿ� x
		int local;
//		System.out.println(local); // ���������� local �ʱ�ȭ ���߱� ������ ����
		
		System.out.println(num); // �Ű����� num�� �ܺο��� �����͸� �޾ƿ��� ������ num �ȿ��� �����Ͱ� ���� �� �ۿ� ����

		System.out.println(global); // global �������� Ŭ���� �� ��𼭵� ��� ����
		
	} // <-- �޼ҵ� ������ ��
	
	public void method2() {
		System.out.println(global);
//		System.out.println(local); // method1�� �������� method2���� ��� �Ұ�
//		System.out.println(num); // method1�� �Ű����� method2���� ���Ұ�
	}
} // <-- Ŭ���� ������ ��
