package com.kh.example.chap02_tryCatch.controller;

import java.io.IOException;

public class TryCatchController {
	public void method1() {
		System.out.println("method1() ȣ���...");
		try {
			method2();
			System.out.println("���� �߻� �ÿ��� ��µ��� ����"); 
			// ���� : ���x , method2()ȣ���ϰ� ����(��ź)�� �޾Ƽ�
			// method2(); ������ ���ƿ� �ٷ� catch���� �Ѿ -> catch������ ���� ó�� ����
		} catch (IOException e) { // �� catch���� Exception catch�� �ؿ� ������ ���� �� ��
// Unreachable catch block for IOException. It is already handled by the catch block for Exception
// IOEXception(�� ����) catch���� ������ �� ����. �װ��� �̹� Exception(�� ����) catch���� ���� ó���Ǿ���.			
			e.printStackTrace();
		} catch (Exception e) { 
// ExceptionŬ������ Exception�� �ֻ���(�θ�, ����)Ŭ������ ��� ����(�ڽ�, �ļ�)Ŭ������ �� �޾��� �� ����
// IOException�� Exception�� �ڽ�Ŭ���� ��ü�̱� ������ �Ű������� ������ ���� �� ����
			System.out.println("Excetion���� ����");
		} finally {
			System.out.println("finally {} ���� ���� ���� �߻� ���ο� ��� ���� ������ ����");
		}
		System.out.println("method1() �����...");
	}
	
	public void method2() throws IOException {
		System.out.println("method2() ȣ���...");
//		throw new NullPointerException();
		// ���� ó�� ������ �ʾҴµ��� ���� ǥ�� �ȶ�
		// NullPointerException�� RuntimeException�� �ļ� Ŭ������ ����ó���� �ʿ����� ����
		// Unchecked Exception
		throw new IOException();
		
//		System.out.println("method2() �����...");
//		// Unreachable code
	}
}
