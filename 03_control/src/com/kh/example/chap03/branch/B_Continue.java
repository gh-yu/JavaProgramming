package com.kh.example.chap03.branch;

public class B_Continue {
	public void method() {
		// ������ ���
		// ¦�� �ܰ� ¦�� ���� �� ������ ��� 
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				
				if (i % 2 == 0 || j % 2 == 0) {
					continue;
				}
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}
	}
	
	public void method1_1() {
		// ������ ���
		// ¦�� �ܰ� ¦�� ���� �� ������ ��� 
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				
//				if (i % 2 != 0 && j % 2 != 0) { 
				if (!(i % 2 == 0 || j % 2 == 0)) { // or���� �����ϸ� ||�� �ݴ�� �ż� && ȿ��
					System.out.println(i + " x " + j + " = " + i*j);
				}
			}
		}
	}
}
