package com.kh.example.chap01_throws.run;

import com.kh.example.chap01_throws.controller.ThrowsController;

public class Run {
//	public static void main(String[] args) throws Exception {
	public static void main(String[] args) {
		ThrowsController tc = new ThrowsController();
		
		try {
			tc.method1();
		} catch (Exception e) {
//			e.printStackTrace();
			// 예외 내용 및 발생 위치를 콘솔에 출력해주는 메소드
			System.out.println("예외상황이 발생했습니다.");
		}
		
		System.out.println("정상적으로 종료됨..."); // 예외 처리 위에서 해줘서 출력됨
	}
}
