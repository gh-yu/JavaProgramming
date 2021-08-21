package com.kh.example.chap03.branch;

public class B_Continue {
	public void method() {
		// 구구단 출력
		// 짝수 단과 짝수 수는 뺀 구구단 출력 
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				
				if (i % 2 == 0 || j % 2 == 0) {
					continue;
				}
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}
	}
	
	public void method1_1() {
		// 구구단 출력
		// 짝수 단과 짝수 수는 뺀 구구단 출력 
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				
//				if (i % 2 != 0 && j % 2 != 0) { 
				if (!(i % 2 == 0 || j % 2 == 0)) { // or문을 부정하면 ||도 반대로 돼서 && 효과
					System.out.println(i + " x " + j + " = " + i*j);
				}
			}
		}
	}
}
