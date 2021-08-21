package com.kh.example.array;

import java.util.Scanner;

public class A_Array {
//	�迭�� ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��
	
// 	�迭�� ����
//		�ڷ���[] �迭��;
//		�ڷ��� �迭��[];
//	�迭�� �Ҵ�
//		�ڷ���[] �迭�� = new �ڷ���[�迭ũ��];
//		�ڷ��� �迭��[] = new �ڷ���[�迭ũ��];
//		new�����ڸ� ���� Heap�޸� ������ ������ �迭 ũ�⸸ŭ ����
//		������ �Ǵ� ���� �� ������ ���� �ּ� �� �߻�
//		�߻��� �ּ� ���� ���� �����ڿ� ���� �迭�� ������ ����(�����ϰ� ����)
//	�迭�� �ʱ�ȭ
//		1) �ε��� �̿� : zero-based
//		2) for�� �̿� : ��Ģ�� ���� ���� ��� ����
//		3) ����� ���ÿ� �ʱ�ȭ
//			�ڷ���[] �迭�� = {��};
//			�ڷ���[] �迭�� = new �ڷ���[]{��};
	public void method1() {
		int num1 = 10; // �� ���� �����ָ� ������ �����Ⱚ ��(Stack������ �ִ� �͵���)
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		int num6 = 60;
		int num7 = 70;
		int num8 = 80;
		int num9 = 90;
		
		int[] arr = new int[9];
//		System.out.println(arr[0]); // �� ���� �����൵ �⺻������ �ڵ� �ʱ�ȭ(Heap �޸� ������ �ִ� ��������)
//		System.out.println(arr[1]); // = Heap�޸� ������ ������ �����ϸ� �ʱ�ȭ ���� ������ �ʾƵ� �⺻������ �˾Ƽ� �ʱ�ȭ������
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
//		System.out.println(arr[6]);
//		System.out.println(arr[7]);
//		System.out.println(arr[8]);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		

		System.out.println();
		// �ε����� �̿��� �ʱ�ȭ
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[3] = 30;
//		arr[4] = 40;
//		arr[5] = 50;
//		arr[6] = 60;
//		arr[7] = 70;
//		arr[8] = 80;
//		arr[9] = 90;
		
		// ��Ģ�� ���̹Ƿ�  for���� �̿��� �ʱ�ȭ
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (i+1) * 10;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
			System.out.print(arr[i] + " "); // ����ְ� ���, ����ְ� ��� �ݺ�
		}
		
		System.out.println();
		
		System.out.println(arr); // Heap������ �Ҵ��� �޸� ������ �뷫���� �ּҰ� ��µ�
		
	}
	
	public void method2() {
		// ����� ���ÿ� �ʱ�ȭ
		int[] iArr1 = {1, 2, 3, 4, 5};
		int[] iArr2 = new int[] {11, 22, 33, 44, 55};
		String[] strArr = {"red", "orange", "yellow"};
		
		for(int i = 0; i <iArr1.length; i++) {
			System.out.print(iArr1[i] + " ");
		}
		System.out.println();
		for(int i = 0; i <iArr2.length; i++) {
			System.out.print(iArr2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
	}
	
	public void method3() {
		// 5���� ������ ���� int�� �迭 iArr
		int[] iArr = new int[5];
		// 10���� ������ ���� char�� �迭 cArr
		char[] cArr = new char[10];
		
		for (int i = 0; i < iArr.length; i++) { // int�� �⺻���� 0���� �ڵ� �ʱ�ȭ�Ǿ� ����
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < cArr.length; i++) { // char�� �⺻�� null�� �ʱ�ȭ�Ǿ� ����, ����ϸ� �� ���̴� ���� ��µ�
			System.out.print(cArr[i] + "|"); 
		}
		System.out.println();
		
		System.out.println("iArr : " + iArr);
		System.out.println("cArr : " + cArr);
		
		System.out.println();
		
		// ����ڿ��� �Է¹޾� �迭ũ��(�迭����) �缳��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Ҵ��� �迭�� ũ�� �Է� : ");
		int size = sc.nextInt();
		
		iArr = new int[size]; // Heap������ ���� ���� �Ҵ�, ���� ������ �޸� ������ �ּҰ� iArr ������ ���Ե�. �������� �ϳ��� ���� ���� ����, ���� �ּҰ��� �������� ������ ���� �迭 ������ ������ �������� jvm�� �ڵ����� ��������.
		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		System.out.println("iArr : " + iArr); // �ּҴ� �״���ϱ�? X, �ּҰ� �޶���(Heap������ �޸𸮰��� ���� ���� new!!)
		
		iArr = null; // null�� ���ԵǸ鼭 ������ ����Ǿ��� �ּҰ� ������, Heap���� �迭 �������� ������ �������鼭 jvm�� �ڵ� ����
	}
}
