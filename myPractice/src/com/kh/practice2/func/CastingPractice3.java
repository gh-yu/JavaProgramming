package com.kh.practice2.func;

public class CastingPractice3 {
	// 선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+,-,*,/)과 형변환을 이용하여 주석에 적힌 값과 같은 값이 나오도록 코드를 작성하세요
	public void method() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2);
		System.out.println((int)dNum);
		
		System.out.println(iNum2 * dNum);
		System.out.println((double)iNum1);
		
		System.out.println((double)iNum1 / iNum2);
		System.out.println(dNum);
		
		System.out.println((int)fNum);
		System.out.println(iNum1 / (int)fNum); // float형으로 자동 형변환 이루어지기 때문에 int형으로 출력하고 싶으면 int 명시 강제 형변환
											   // 같은 4byte지만 int보다 float이 더 많은 값을 나타낼 수 있기 때문에
		System.out.printf("%.7f\n", iNum1 / fNum);
		System.out.printf("%.16f\n", (iNum1 / (double)fNum));
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println(ch + iNum1);
		System.out.println((char)(ch + iNum1)); 
	}
}
