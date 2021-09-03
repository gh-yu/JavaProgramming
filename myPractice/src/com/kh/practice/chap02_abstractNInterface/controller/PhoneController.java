package com.kh.practice.chap02_abstractNInterface.controller;

import java.util.Arrays;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	
	String[] result = new String[2];
	
	public String[] method() {
		
		Phone[] pArr = {new GalaxyNote9(), new V40()};	
		
		
		for (int i = 0; i < pArr.length; i++) {
			if (pArr[i] instanceof GalaxyNote9) {
				result[i] = ((GalaxyNote9)pArr[i]).printInformation();
			} else if (pArr[i] instanceof V40) {
				result[i] = ((V40)pArr[i]).printInformation();
			}
		}
		
		return result; 
	}

}
