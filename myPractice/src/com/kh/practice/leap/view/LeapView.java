package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	// ��� or ����
	// 1�� 1�� 1�� ~���ݱ��� ��ĥ�� ��������
	
	public LeapView() {
		LeapController lc = new LeapController();
		
//		Date today = new Date();
//		System.out.println(today);
		
		Calendar c = Calendar.getInstance(); 
		// CalendarŬ������ �����ڰ� protected, new������ ���� ��ü ���� �Ұ��� getInstance()�޼ҵ� ���� ��ü ����
		
//		GregorianCalendar gc = new GregorianCalendar(); // CalendarŬ������ �ļ�Ŭ������ CalendarŬ������ �ʵ�,�޼ҵ� ��� ����
//		
//		int year = gc.get(Calendar.YEAR); // gc�� �θ�Ŭ������ CalendarŬ������ get�޼ҵ带 �̿��� �ʵ� ������
//		System.out.println(year);
//		year = 2400; // ���� �� �������� �׽�Ʈ
		 
		int year = c.get(Calendar.YEAR);
		if (lc.isLeapYear(year) == false) {
			System.out.println(year + "���� ����Դϴ�.");
		} else {
			System.out.println(year + "���� �����Դϴ�.");
		}
		
		int month = c.get(Calendar.MONTH) + 1;  // ���� �� -1�� �� ������ ������ +1�������
//		System.out.println(month);
		int day = c.get(Calendar.DATE);
		System.out.println("�� ��¥ �� : " + lc.leapDate(c));
		
	} 

}
