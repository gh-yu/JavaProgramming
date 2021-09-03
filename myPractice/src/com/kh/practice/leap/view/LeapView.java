package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	// 평년 or 윤년
	// 1년 1월 1일 ~지금까지 며칠이 지났는지
	
	public LeapView() {
		LeapController lc = new LeapController();
		
//		Date today = new Date();
//		System.out.println(today);
		
		Calendar c = Calendar.getInstance(); 
		// Calendar클래스는 생성자가 protected, new연산자 통해 객체 생성 불가능 getInstance()메소드 통해 객체 생성
		
//		GregorianCalendar gc = new GregorianCalendar(); // Calendar클래스의 후손클래스라 Calendar클래스의 필드,메소드 사용 가능
//		
//		int year = gc.get(Calendar.YEAR); // gc의 부모클래스인 Calendar클래스의 get메소드를 이용해 필드 가져옴
//		System.out.println(year);
//		year = 2400; // 윤년 잘 나오는지 테스트
		 
		int year = c.get(Calendar.YEAR);
		if (lc.isLeapYear(year) == false) {
			System.out.println(year + "년은 평년입니다.");
		} else {
			System.out.println(year + "년은 윤년입니다.");
		}
		
		int month = c.get(Calendar.MONTH) + 1;  // 현재 달 -1한 값 나오기 때문에 +1해줘야함
//		System.out.println(month);
		int day = c.get(Calendar.DATE);
		System.out.println("총 날짜 수 : " + lc.leapDate(c));
		
	} 

}
