package com.kh.example.chap06_method.run;

import com.kh.example.chap06_method.controller.MethodPractice;
import com.kh.example.chap06_method.model.vo.Trainee;

public class Run {
	public static void main(String[] args) {
		MethodPractice mp = new MethodPractice();
		
//		String str = mp.method1(); // cannot convert from void to String
		mp.method1(); // ��ȯ �� void, return�Ǵ� �� ����, �ȿ� return�� ���� ����

//		mp.method2(); // ���� ��ȯ�ޱ� �ϳ� ������ ���� ���� �ʾ� �����Ͱ� ���ư�
//		int result1 = mp.method2(); // method2 ���� -> ��ȯ�� 0, �� ��ü�� 0�̶�� ���� ������ ��
//		System.out.println(result1);
		System.out.println(mp.method2());
		
		mp.method3(10, 20);
		
		String result2 = mp.method4("������", 27);
		System.out.println(result2);
		
		char[] result3 = mp.method5(); // ���� ����
		System.out.println("Run result3 : " + result3);
		for(int i = 0; i < result3.length; i++) {
			System.out.print(result3[i]);
		}
		
		System.out.println();
		
		Trainee result4 = mp.method6(); // ���� ����
		System.out.println("Run result4 : " + result4);
		System.out.println(result4.inform());
		
//		Trainee t1 = new Trainee("���ǰ�", 'H', "����", 98.5);
//		System.out.println(t1.inform());
//		Trainee t2 = new Trainee('G');
//		System.out.println(t2.inform());
		
		result4.setName("������");
		result4.setClassRoom('G');
		System.out.println(result4.inform());
		
		System.out.println(result4.getACADEY());
		System.out.println(result4.getclassRoom());
		System.out.println(result4.getName());
		System.out.println(result4.getTime());
		System.out.println(Trainee.getScore());
	}	
}
