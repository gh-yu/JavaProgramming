package com.kh.variable;

public class A_Variable {
	public void declareVariable() { // ��� �޼ҵ�
		// ���� ���� �� �ʱ�ȭ
		// A. ���� ���� : Stack������ ���� �Ҵ�(����) -> �ڷ��� ������;
		// 1. ����
		boolean isTrue;
		// 2. ������
		// 2-1. ������
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		// 2-2. �Ǽ���
		float fNum;
		double dNum;
		// 3. ������
		// 3-1. ����
		char ch;
		// 3-2. ���ڿ�
		String str;
		
		// B. �ʱ�ȭ(����)
		isTrue = false; // true, false�� ���� ����
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
		fNum = 4.0f;
		dNum = 8.0d; // 8.0���� �־ ����

		ch = 'A'; // char�� -> '��' single quotation(Ȭ����ǥ) ���
		str = "A"; // String�� -> "��~" double quotation(�ֵ���ǥ) ���, Ȭ����ǥ ���� ���� ��
		
		System.out.println("isTrue�� �� : " + isTrue);  //System �ȿ� out �ȿ� println �޼ҵ�
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
	}
	
	
	public void initVariable() {
		// ���� ����� ���ÿ� �ʱ�ȭ
		// 1. ����
		boolean isTrue = true;
		
		// 2. ������
		// 2-1. ����
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		// 2-2. �Ǽ�
		float fNum = 4.0f;
		double dNum = 8.0;
		
		// 3. ������
		//3-1. ����
		char ch = '��';
		//3-2. ���ڿ�
		String str = "�ſ�";
		
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);		
	}	
}
