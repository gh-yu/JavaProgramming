package com.kh.ezample.practice1.run;

import com.kh.ezample.practice1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member m = new Member();
		m.changeName("¿Ø∞«»÷");
		m.printName();
	}
}