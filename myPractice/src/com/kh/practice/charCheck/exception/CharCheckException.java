package com.kh.practice.charCheck.exception;

public class CharCheckException extends Exception { // Exception ���
	
	public CharCheckException() {} // �⺻ ������ 1��
	public CharCheckException(String msg) { // �Ű����� �ִ� ������ 1��
		super("üũ�� ���ڿ� �ȿ� ������ ���ԵǾ� �ֽ��ϴ�"); // ���� �߻��� ����ϰ� ���� ���ڿ�
	}
}
