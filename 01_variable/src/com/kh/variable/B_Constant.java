package com.kh.variable;

public class B_Constant {
	public void finalConstant() {
		int age;
		final int AGE; //����� �빮�ڷ� ������� ����
		
		age = 20;
		AGE = 20;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		System.out.println("----------------------");
		
		// ���� �� ����
		age = 30;
//		AGE = 30;
		// The final local variable AGE may already have been assigned
		// : ��� �� ���� �Ұ�
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
	}
}