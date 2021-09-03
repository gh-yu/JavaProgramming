package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {

	public int countAlpha(String s) throws CharCheckException {
		
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				count++;
			} else if (ch == ' ') {
				throw new CharCheckException("예외 발생");
			}
		}	
		return count;
	}

}
