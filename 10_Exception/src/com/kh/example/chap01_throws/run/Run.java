package com.kh.example.chap01_throws.run;

import com.kh.example.chap01_throws.controller.ThrowsController;

public class Run {
//	public static void main(String[] args) throws Exception {
	public static void main(String[] args) {
		ThrowsController tc = new ThrowsController();
		
		try {
			tc.method1();
		} catch (Exception e) {
//			e.printStackTrace();
			// ���� ���� �� �߻� ��ġ�� �ֿܼ� ������ִ� �޼ҵ�
			System.out.println("���ܻ�Ȳ�� �߻��߽��ϴ�.");
		}
		
		System.out.println("���������� �����..."); // ���� ó�� ������ ���༭ ��µ�
	}
}
