package com.kh.variable;

public class C_Cast {
	/*
	 * 형변환 : 현재 자료형을 다른 자료형으로 변환하는 것(바꾸는 것)
	 * 
	 * 원래 형변환을 할 때는 앞에 바꿀 자료형을 명시해주어야 함
	 *     (바꿀 자료형)값 or (바꿀 자료형)변수
	 * 자동 형변환에서는 자료형 명시를 생략할 수 있지만
	 * 강제 형변환에서는 필수적으로 명시해주어야 함
	 */
	public void rule1() {
		boolean flag = true;
//		flag = 100; // boolean 자료형은 무조건 true/false만 들어갈 수 있음 = 형변환 예외
		
		// 자동 형변환 : 크기(값의 범위)가 작은 자료형이 큰 자료형으로 바뀌는 것
		// ex. byte->int, int->long, int->double, long->float, char->int
		int num = 'A'; // String은 int형으로 변환 불가
		System.out.println("num : " + num);
		
		char ch = 97; // 97 = 정수의 기본형인 int이긴 하지만 리터럴로 숫자 자체, char의 범위 안에 97이 들어가기 때문에 문제 없음
		System.out.println("ch : " + ch);
		
//		char ch2 = -97; // char 범위는 0~65535, 양수만 가능하기 때문에 저장 불가능 -> 에러 남
		
		// 변수를 대입할 때는 변수의 값이 아닌 자료형이 중요, num은 int형으로 형변환 필요
//		char ch2 = num; // 이대로는 에러, 큰 자료형을 작은 자료형으로 변환할 때는 개발자가 결정, 앞에 바꿀 자료형 명시
		char ch2 = (char)num; // 강제 형변환 = 명시적 형변환
		System.out.println("ch2 : " + ch2);
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3 : " + ch3);
		// 실행결과인 ?는 실제 데이터 자체의 물음표가 아니라, -97에 대한 문자를 찾지 못했기 때문에 나오는 문자
	}
	public void rule2() {
		int iNum = 10;
		long lNum = 100L;
		
//		int iSum = iNum + lNum; 
		//			int	   long
		//자동형변환   long    long
		//				long    // 계산 결과인 long을 int로 저장하려고 하니 에러

		// 방법 1 : 수행 결과를 long 자료형으로 받기
		long lSum = iNum + lNum;
		System.out.println("lSum : " + lSum);
		
		//방법 2 : long형을 int형으로 강제 형변환
		int iSum1 = iNum + (int)lNum;
		System.out.println("iSum1 : " + iSum1);		
		
		// 방법 3 : 수행 결과를 int로 강제 형변환
		int iSum2 = (int)(iNum + lNum);
		System.out.println("iSum2 : " + iSum2);
	}
}
