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
		System.out.println(time); // 지나간 시간의 millisecond값 가지고 있으면 그 때의 시간을 활용 가능
		
		Date date = new Date(2022, 1, 25); // The constructor Date(int, int, int) is deprecated
	}
	
	public void method2() {
//		Calendar c = new Calendar(); // Calender클래스의 생성자 protected로 객체 생성 불가
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
		
		int month = c.get(Calendar.MONTH) + 1; // 날짜 관련 클래스에서 달(월)은 0부터 시작 : 1월=0, 2월=1, ..., 12월=11
		System.out.println(month);

		int date = c.get(Calendar.DATE);
		System.out.println(date);
		
		int amPm = c.get(Calendar.AM_PM); // 0=오전, 1=오후
		int amPm2 = c.get(Calendar.AM);
		System.out.println(amPm);
		System.out.println(amPm == 1 ? "오후 " : "오전");
		
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour);
		int hour24 = c.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour24);
		
		int min = c.get(Calendar.MINUTE);
		System.out.println(min);

		int sec = c.get(Calendar.SECOND);
		System.out.println(sec);
		
		int day = c.get(Calendar.DAY_OF_WEEK); // 요일 : 일요일=1, 월요일=2, ..., 토요일=7
		System.out.println(day);
	}
	
	public void method3() {
		int year = 2022;
		int month = 0; // 0을 1월로 인지, 1은 2월로 인지
		int date = 25;
		int hour = 17;
		int min = 50;
		int sec = 0;
		// 우리반 종강일
		
		GregorianCalendar gc = new GregorianCalendar(year, month, date, hour, min, sec);
		long time = gc.getTimeInMillis();
		
		Date endDay = new Date(time);
		System.out.println(endDay); // Tue Jan 25 17:50:00 KST 2022
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		String end = sdf.format(endDay);
		System.out.println(end);
	
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a HH시 mm분 ss초"); // HH : 24시간 형식으로
		String end2 = sdf2.format(endDay);
		System.out.println(end2);
	}
	
}
