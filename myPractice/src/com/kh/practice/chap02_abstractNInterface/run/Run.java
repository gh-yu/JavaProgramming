package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		
		String[] str = new PhoneController().method();
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
			System.out.println();
		}
	}

}
