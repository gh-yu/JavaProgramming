package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
		// �Ǽ������� ����, ����, ���� �� ������ ������ �Է� �޾� ������ ����� ����ϼ���.
		// �� �� ������ ����� ���������� ó���ϼ���.
		public void method() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���� : ");
			double kor = sc.nextDouble();
			
			sc.nextLine();
			System.out.print("���� : ");
			double eng = sc.nextDouble();
			
			System.out.print("���� : ");
			double math = sc.nextDouble();
			
			// double -> int ���� ����ȯ
			int total = (int)(kor + eng + math);
			int avg = total / 3;
			
			System.out.println("���� : " + total);
			System.out.println("��� : " + avg);
			
			// double ������ ��� �� ������ �� ����Ҷ� ���� ����ȯ
//			double total = kor + eng + math;
//			double avg = total / 3;
//			
//			System.out.println("���� : " + (int)total);
//			System.out.println("��� : " + (int)avg);
			
			// ���� ���� �� ����� ��� ������� �ٷ� ����ȯ�� �� ���
//			System.out.println("���� : " + (int)(kor + eng + math));
//			System.out.println("��� : " + (int)((kor + eng + math) / 3));
		}
}
