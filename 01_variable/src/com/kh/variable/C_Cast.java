package com.kh.variable;

public class C_Cast {
	/*
	 * ����ȯ : ���� �ڷ����� �ٸ� �ڷ������� ��ȯ�ϴ� ��(�ٲٴ� ��)
	 * 
	 * ���� ����ȯ�� �� ���� �տ� �ٲ� �ڷ����� ������־�� ��
	 *     (�ٲ� �ڷ���)�� or (�ٲ� �ڷ���)����
	 * �ڵ� ����ȯ������ �ڷ��� ��ø� ������ �� ������
	 * ���� ����ȯ������ �ʼ������� ������־�� ��
	 */
	public void rule1() {
		boolean flag = true;
//		flag = 100; // boolean �ڷ����� ������ true/false�� �� �� ���� = ����ȯ ����
		
		// �ڵ� ����ȯ : ũ��(���� ����)�� ���� �ڷ����� ū �ڷ������� �ٲ�� ��
		// ex. byte->int, int->long, int->double, long->float, char->int
		int num = 'A'; // String�� int������ ��ȯ �Ұ�
		System.out.println("num : " + num);
		
		char ch = 97; // 97 = ������ �⺻���� int�̱� ������ ���ͷ��� ���� ��ü, char�� ���� �ȿ� 97�� ���� ������ ���� ����
		System.out.println("ch : " + ch);
		
//		char ch2 = -97; // char ������ 0~65535, ����� �����ϱ� ������ ���� �Ұ��� -> ���� ��
		
		// ������ ������ ���� ������ ���� �ƴ� �ڷ����� �߿�, num�� int������ ����ȯ �ʿ�
//		char ch2 = num; // �̴�δ� ����, ū �ڷ����� ���� �ڷ������� ��ȯ�� ���� �����ڰ� ����, �տ� �ٲ� �ڷ��� ���
		char ch2 = (char)num; // ���� ����ȯ = ����� ����ȯ
		System.out.println("ch2 : " + ch2);
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3 : " + ch3);
		// �������� ?�� ���� ������ ��ü�� ����ǥ�� �ƴ϶�, -97�� ���� ���ڸ� ã�� ���߱� ������ ������ ����
	}
	public void rule2() {
		int iNum = 10;
		long lNum = 100L;
		
//		int iSum = iNum + lNum; 
		//			int	   long
		//�ڵ�����ȯ   long    long
		//				long    // ��� ����� long�� int�� �����Ϸ��� �ϴ� ����

		// ��� 1 : ���� ����� long �ڷ������� �ޱ�
		long lSum = iNum + lNum;
		System.out.println("lSum : " + lSum);
		
		//��� 2 : long���� int������ ���� ����ȯ
		int iSum1 = iNum + (int)lNum;
		System.out.println("iSum1 : " + iSum1);		
		
		// ��� 3 : ���� ����� int�� ���� ����ȯ
		int iSum2 = (int)(iNum + lNum);
		System.out.println("iSum2 : " + iSum2);
	}
}
