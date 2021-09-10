package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {

	public boolean checkDouble (int num1, int num2) throws NumRangeException {
		
		if (num1 >= 1 && num1 <= 100 && num2 >= 1 && num2 <= 100) {
			if (num1 % num2 == 0) {
				return true;
			} else {
				return false;
			}
		} else {
//			throw new NumRangeException("예외 발생!"); 
			// 			NumRangeException(String msg)
			// new연산자로 예외 객체 생성 및 String을 매개변수로 하는 생성자호출, 예외(객체) 던지기(throw)
			throw new NumRangeException("1부터 100 사이의 값이 아닙니다."); 
		}

	}

}
