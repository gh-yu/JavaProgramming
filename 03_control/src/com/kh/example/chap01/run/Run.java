package com.kh.example.chap01.run;

import com.kh.example.chap01.condition.A_If;
import com.kh.example.chap01.condition.B_Switch;

public class Run {
	public static void main(String[] args) { // ���� �޼ҵ忡�� ���α׷� ����(���� ��ư�� ����)
//		A_If ai = new A_If();
//		ai.method1(); // A_IfŬ���� �ȿ� �ִ� �޼ҵ� ȣ��
//		ai.method2();
//		ai.method3();
//		ai.method4();
	
		B_Switch bs = new B_Switch(); // �˸��� ���� ���� -> Ŭ������ �޶�, RunŬ�������� B_SwitchŬ������ (�����ؼ�) �ȿ� �ִ� �޼ҵ���� ȣ���ϱ� ���ؼ�
//		bs.method1(); // �˸��̸� �̿��ؼ� B_SwitchŬ���� �ȿ� �ִ� �޼ҵ�1 ȣ��
//		bs.method2();	
//		bs.method3();	
//		bs.method4();
		bs.method5(); // �޼ҵ�5 ȣ�� -> �޼ҵ�5 ���� �ڵ� ������ �Ʒ��� �����(�Է� -> �޴� ��ȣ 1 ����)
					  // -> �޼ҵ�5 ���� switch case 1 ���� ���๮ ���� -> method1() ȣ���
				      // -> �޼ҵ�1�� ���� �޼ҵ�1 ���� �ڵ� �����
				      // -> �޼ҵ�1 '}' �� ������ ����Ǹ� �޼ҵ�1�� �ҷ��� �޼ҵ�5�� ���ư�
				      // -> �޼ҵ�5���� �޼ҵ�1 �ҷ��� ��(switch�� case 1 ��)���� ���ƿͼ� �� �Ʒ� �ڵ� ����
			          // -> �޼ҵ�5�� ����Ǹ� ȣ���ߴ� ��, �� ���� �޼ҵ忡�� ȣ���� �κ����� ���ƿͼ� �Ʒ� �ڵ� ����
					  // -> ���� �޼ҵ� �� ������ JVM ����(�� ó�� JVM�� ���� �޼ҵ�(���� �޼ҵ�) �����Ŵ)
	}
}
