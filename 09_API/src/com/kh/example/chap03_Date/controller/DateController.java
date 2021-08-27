package com.kh.example.chap03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class DateController {
	public void method1() {
		Date today = new Date();
		System.out.println(today);
		System.out.println(today.getTime());
		// Fri Aug 27 12:33:45 KST 2021
		// 1630035225793
		
		Date time = new Date(1630035225793L);
		System.out.println(time); // ������ �ð��� millisecond�� ������ ������ �� ���� �ð��� Ȱ�� ����
		
		Date date = new Date(2022, 1, 25); // The constructor Date(int, int, int) is deprecated
	}
	
	public void method2() {
//		Calendar c = new Calendar(); // CalenderŬ������ ������ protected�� ��ü ���� �Ұ�
		Calendar c = Calendar.getInstance();
		System.out.println(c);
//		StringTokenizer st = new StringTokenizer(c, ",");
//		while (st.hasMoreTokens()) {
//			System.out.println(sc.nextToken());
//		}
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = c.get(Calendar.MONTH) + 1; // ��¥ ���� Ŭ�������� ��(��)�� 0���� ���� : 1��=0, 2��=1, ..., 12��=11
		System.out.println(month);

		int date = c.get(Calendar.DATE);
		System.out.println(date);
		
		int amPm = c.get(Calendar.AM_PM); // 0=����, 1=����
		int amPm2 = c.get(Calendar.AM);
		System.out.println(amPm);
		System.out.println(amPm == 1 ? "���� " : "����");
		
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour);
		int hour24 = c.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour24);
		
		int min = c.get(Calendar.MINUTE);
		System.out.println(min);

		int sec = c.get(Calendar.SECOND);
		System.out.println(sec);
		
		int day = c.get(Calendar.DAY_OF_WEEK); // ���� : �Ͽ���=1, ������=2, ..., �����=7
		System.out.println(day);
	}
	
	public void method3() {
		int year = 2022;
		int month = 0; // 0�� 1���� ����, 1�� 2���� ����
		int date = 25;
		int hour = 17;
		int min = 50;
		int sec = 0;
		// �츮�� ������
		
		GregorianCalendar gc = new GregorianCalendar(year, month, date, hour, min, sec);
		long time = gc.getTimeInMillis();
		
		Date endDay = new Date(time);
		System.out.println(endDay); // Tue Jan 25 17:50:00 KST 2022
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� a hh�� mm�� ss��");
		String end = sdf.format(endDay);
		System.out.println(end);
	
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy�� MM�� dd�� E���� a HH�� mm�� ss��"); // HH : 24�ð� ��������
		String end2 = sdf2.format(endDay);
		System.out.println(end2);
	}
	
}
