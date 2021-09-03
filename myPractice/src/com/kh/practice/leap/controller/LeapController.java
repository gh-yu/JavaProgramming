package com.kh.practice.leap.controller;

import java.util.Calendar;



public class LeapController {

	public boolean isLeapYear(int year) {
		
		if (year%4 == 0 && (year%100 != 0 || year%400 == 0)) { // 윤년 : 연도가 4의 배수, 100의 배수가 아니거나 400의 배수가 되는 해
			return true;
		} else {
			return false;
		}
	}

	public long leapDate(Calendar c) {
		int year = 1;
		int month = 0; // 0은 1월로 인지
		int date = 1;
		// 1년 1월 1일
		
		// GregorianCalendar클래스 연습
//		GregorianCalendar gc = new GregorianCalendar(year, month, date);
//		long time = gc.getTimeInMillis(); // Returns this Calendar's time value in milliseconds.
//		System.out.println(time);
		
//		Date startAD = new Date(time);  // milliseconds값 넣으면 그 때의 날짜를 인식
//		System.out.println(startAD); // Thu Sep 02 02:05:21 KST 2021
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
//		System.out.println(sdf.format(startAD)); 
		
		long countDay = 0L;		
		for (int i = year; i < c.get(Calendar.YEAR); i++) {
			if (isLeapYear(i)) {
				countDay += 366;
			} else {
				countDay += 365;
			}
		}
		
		
		for (int i = 1; i < c.get(Calendar.MONTH); i++) {
			switch (i) {
			case 2 : 
				if (isLeapYear(c.get(Calendar.YEAR))) {
					countDay += 29;
				} else {
					countDay += 28;
				}
				break;
			case 1 : case 3 : case 5: case 7 : case 8 : case 10 : case 12 :
				countDay += 31;
				break;
			default :
				countDay += 30;
			}
		}
		
		countDay += c.get(Calendar.DATE);
			
		return countDay;

	}

}
