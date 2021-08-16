package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	// 키보드로 가로, 세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
	// 계산 공식 -> 면적 : 가로 * 세로
	//			  둘레 : (가로 + 세로) * 2
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		sc.nextLine();
		System.out.print("세로 : ");
		double length = sc.nextDouble();
		
		System.out.println("면적 : " + (width * length));
		System.out.println("둘레 : " + ((width + length) * 2));
	}
}
