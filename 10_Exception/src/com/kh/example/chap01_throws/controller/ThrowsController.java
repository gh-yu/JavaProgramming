package com.kh.example.chap01_throws.controller;

public class ThrowsController {
	
	public void method1() throws Exception {
		System.out.println("method1() ȣ���...");
		method2();
		System.out.println("method1() �����..."); // ��� �ȵ�
	}
	
	public void method2() throws Exception {
		System.out.println("method2() ȣ���...");
		method3();
		System.out.println("method2() �����..."); // ��� �ȵ�
	}
	
	public void method3() throws Exception{
		System.out.println("method3() ȣ���...");
		// ���� Excption �߻� : try~catch x
		throw new Exception();
//		 Unhandled exception type Exception : ó���� ���� ���� ����
//		System.out.println("method3() �����...");
		// Unreachable code : �������� ���ϴ� �ڵ�
		// ���ܰ� �߻��Ǹ� �ؿ� �ڵ尡 ���� �ֵ��� ������� �ʰ� ���α׷� �����
		// �� ���忡�� �߻���Ų ���ܰ� ó���� ���� �ʾƼ� ���� ���� ���� �Ұ�		
		// ���� �����൵ ���� �Ұ� -> ����� �� �ۿ� ����(���� �߻��� �������� try~catch������ ���� �� �����)
	}
}
