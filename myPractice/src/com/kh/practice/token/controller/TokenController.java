package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public String afterToken(String str) {
		
//		String[] strArr = str.split(" ");
//		
//		str = "";
//		for (String s : strArr) { // 향상된 for문
//			str += s;
//		}
//		
//		return str;
		
//		StringTokenizer st = new StringTokenizer(str, " ");
//		
//		str = "";
//		while (st.hasMoreTokens()) {
//			str += st.nextToken();
//		}
//
//		return str;
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		String str2 = "";
		while (st.hasMoreTokens()) { // Token이 있으면  true
			str2 += st.nextToken(); // Token 다음 값(문자열) 반환
		}

		return str2;
		
	}

	public String firstCap(String input) {
	
		String[] inputArr = input.split("");
		
		
		inputArr[0] = inputArr[0].toUpperCase();
	
		String str = "";
		for (int i = 0; i < inputArr.length; i++) {
			
			str += inputArr[i];
		}
		return str;
		
	}

	public int findChar(String inputStr, char findCh) {
		
//		char[] ch = new char[inputStr.length()];
//		
//		int countCh = 0;
//		for (int i = 0; i < inputStr.length(); i++) {
//			ch[i] = inputStr.charAt(i);
//			if (ch[i] == findCh) {
//				countCh++;
//			}
//		}
		
		
		int countCh = 0;
		for (int i = 0; i < inputStr.length(); i++) {
			if (inputStr.charAt(i) == findCh) {
				countCh++;
			}
		}
		
		return countCh;
	}
	
}
