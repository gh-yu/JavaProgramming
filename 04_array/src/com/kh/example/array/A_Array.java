package com.kh.example.array;

import java.util.Scanner;

public class A_Array {
//	배열은 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	
// 	배열의 선언
//		자료형[] 배열명;
//		자료형 배열명[];
//	배열의 할당
//		자료형[] 배열명 = new 자료형[배열크기];
//		자료형 배열명[] = new 자료형[배열크기];
//		new연산자를 통해 Heap메모리 영역에 공간을 배열 크기만큼 생성
//		생성이 되는 순간 그 공간에 대한 주소 값 발생
//		발생한 주소 값은 대입 연산자에 의해 배열명 공간에 대입(참조하고 있음)
//	배열의 초기화
//		1) 인덱스 이용 : zero-based
//		2) for문 이용 : 규칙이 있을 때만 사용 가능
//		3) 선언과 동시에 초기화
//			자료형[] 배열명 = {값};
//			자료형[] 배열명 = new 자료형[]{값};
	public void method1() {
		int num1 = 10; // 값 대입 안해주면 변수에 쓰레기값 들어감(Stack영역에 있는 것들은)
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		int num6 = 60;
		int num7 = 70;
		int num8 = 80;
		int num9 = 90;
		
		int[] arr = new int[9];
//		System.out.println(arr[0]); // 값 대입 안해줘도 기본값으로 자동 초기화(Heap 메모리 영역에 있는 공간들은)
//		System.out.println(arr[1]); // = Heap메모리 영역에 공간을 생성하면 초기화 따로 해주지 않아도 기본값으로 알아서 초기화시켜줌
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]);
//		System.out.println(arr[6]);
//		System.out.println(arr[7]);
//		System.out.println(arr[8]);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		

		System.out.println();
		// 인덱스를 이용한 초기화
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[3] = 30;
//		arr[4] = 40;
//		arr[5] = 50;
//		arr[6] = 60;
//		arr[7] = 70;
//		arr[8] = 80;
//		arr[9] = 90;
		
		// 규칙이 보이므로  for문을 이용한 초기화
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (i+1) * 10;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
			System.out.print(arr[i] + " "); // 집어넣고 출력, 집어넣고 출력 반복
		}
		
		System.out.println();
		
		System.out.println(arr); // Heap영역에 할당한 메모리 공간의 대략적인 주소값 출력됨
		
	}
	
	public void method2() {
		// 선언과 동시에 초기화
		int[] iArr1 = {1, 2, 3, 4, 5};
		int[] iArr2 = new int[] {11, 22, 33, 44, 55};
		String[] strArr = {"red", "orange", "yellow"};
		
		for(int i = 0; i <iArr1.length; i++) {
			System.out.print(iArr1[i] + " ");
		}
		System.out.println();
		for(int i = 0; i <iArr2.length; i++) {
			System.out.print(iArr2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
	}
	
	public void method3() {
		// 5개의 공간을 가진 int형 배열 iArr
		int[] iArr = new int[5];
		// 10개의 공간을 가진 char형 배열 cArr
		char[] cArr = new char[10];
		
		for (int i = 0; i < iArr.length; i++) { // int의 기본값인 0으로 자동 초괴화되어 있음
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < cArr.length; i++) { // char의 기본값 null로 초기화되어 있음, 출력하면 안 보이는 문자 출력됨
			System.out.print(cArr[i] + "|"); 
		}
		System.out.println();
		
		System.out.println("iArr : " + iArr);
		System.out.println("cArr : " + cArr);
		
		System.out.println();
		
		// 사용자에게 입력받아 배열크기(배열길이) 재설정
		Scanner sc = new Scanner(System.in);
		System.out.print("새로 할당한 배열의 크기 입력 : ");
		int size = sc.nextInt();
		
		iArr = new int[size]; // Heap영역에 공간 새로 할당, 새로 생성된 메모리 공간의 주소가 iArr 공간에 대입됨. 변수에는 하나의 값만 저장 가능, 이전 주소값은 지워지기 때문에 이전 배열 공간과 연결이 끊어지고 jvm이 자동으로 삭제해줌.
		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		System.out.println("iArr : " + iArr); // 주소는 그대로일까? X, 주소가 달라짐(Heap영역에 메모리공간 새로 생성 new!!)
		
		iArr = null; // null이 대입되면서 이전에 저장되었던 주소값 지워짐, Heap영역 배열 공간과의 연결이 끊어지면서 jvm이 자동 삭제
	}
}
