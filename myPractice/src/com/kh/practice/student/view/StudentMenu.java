package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	
	StudentController ssm = new StudentController();
	
	public StudentMenu() {
		
		Student[] sArr = ssm.printStudent();
		
		System.out.println("========== �л� ���� ��� ==========");
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i].inform());
		}
		
		System.out.println();
		System.out.println("========== �л� ���� ��� ==========");
		double[] dArr = ssm.avgScore();

		System.out.println("�л� ���� �հ� : " + dArr[0]);
		System.out.println("�л� ���� ��� : " + dArr[1]);

		System.out.println();
		System.out.println("========== ���� ��� ��� ==========");
		
		String result = "";
		for(int i = 0; i < sArr.length; i++) {
			if (sArr[i].getScore() >= ssm.CUT_LINE) {
				System.out.println(sArr[i].getName() + "�л���  ����Դϴ�");
			} else {
				System.out.println(sArr[i].getName() + "�л��� ����� ����Դϴ�.");
			}
			
		}
		
	}
}
