package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	// 얕은 복사 : 배열의 주소만 복사
	// 깊은 복사 : 동일한 새로운 배열을 하나 생성하여 실제 내부 값 복사
	//			1) for문		2) System.arraycopy		3)Arrays.copyOf		4) clone (X)
	public void method1() {
		int[] originArr = {1, 2, 3, 4, 5}; // 선언과 동시에 초기화
		int[] copyArr = originArr; // 얕은 복사
		
		System.out.println("orginArr : " + originArr);
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " "); 
		}
		System.out.println();		
		System.out.println("copyArr : " + copyArr); // originArr과 같은 주소값 출력됨
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		
		System.out.println();
		copyArr[0] = 99; // copyArr 사본 배열의 0번째 배열 데이터 바꿈
		System.out.println();
		
		System.out.println("orginArr : " + originArr);
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " "); 
		}
		System.out.println();		
		System.out.println("copyArr : " + copyArr); // originArr과 같은 주소값 출력됨
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		
		// 원본배열과 사본배열이 서로 참조하고 있는 배열이 같음(주소 값이 같음)
		// 원본이나 사본 둘 중 하나만 바꿔도 같은 데이터 값을 가짐
	}
	
	// 깊은 복사
	public void method2() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[originArr.length];
		
		// for문을 이용한 복사
		for (int i = 0; i < originArr.length; i++) {
			copyArr[i] = originArr[i];
		}
		
		System.out.println("orginArr : " + originArr);
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " "); 
		}
		System.out.println();		
		System.out.println("copyArr : " + copyArr);
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		
		System.out.println();
		copyArr[0] = 99;
		System.out.println();
		
		System.out.println("orginArr : " + originArr);
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " "); 
		}
		System.out.println();		
		System.out.println("copyArr : " + copyArr);
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		
		// 원본 배열과 사본 배열이 서로 참조하고 있는 배열이 다름(주소 값이 다름)
		// 사본 데이터 값이 바뀌어도 원본 배열에 영향을 미치지 않음
	}
	
	public void method3() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		System.out.println("orginArr : " + originArr);
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " "); 
		}
		System.out.println();		
		System.out.println("copyArr : " + copyArr);
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		
		// System.arraycopy() 이용한 복사
//		System.arraycopy(src, srcPos, dest, destPos, length);
//			src		: 원본 배열
//			srcPos  : 원본 배열에서 복사를 시작할 위치
//			dest	: 복사 배열
//			destPos : 복사 배열에서 붙여넣기를 시작할 위치
//			length  : 복사 길이
		
		// 원본 배열의 0번째서부터 원본배열 길이만큼 복사 후, 복사 배열 3번째에서부터 붙여넣기
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		System.out.println();
		System.out.println();
		
		System.out.println("orginArr : " + originArr);
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " "); 
		}
		System.out.println();		
		System.out.println("copyArr : " + copyArr);
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		
		System.out.println();
		originArr[0] = 99;
		System.out.println();
		
		System.out.println("orginArr : " + originArr);
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " "); 
		}
		System.out.println();		
		System.out.println("copyArr : " + copyArr);
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
	}
	
	public void method4() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		System.out.println("orginArr : " + originArr);
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " "); 
		}
		System.out.println();		
		System.out.println("copyArr : " + copyArr);
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		
//		Arrays.copyOf(original, newLength)
//			original 	: 원본 배열
//			newLength	: ?????
		
		copyArr = Arrays.copyOf(originArr, originArr.length); // copyOf() 메소드 인트 배열(int[])을 반환 
		// Arrays.copyOf() -> 새로운 배열 생성 (바꿔치기)
			
		System.out.println();
		System.out.println();
		
		System.out.println("orginArr : " + originArr);
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " "); 
		}
		System.out.println();		
		System.out.println("copyArr : " + copyArr);
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		
		System.out.println();
		originArr[0] = 99;
		System.out.println();
		
		System.out.println("orginArr : " + originArr);
		for (int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " "); 
		}
		System.out.println();		
		System.out.println("copyArr : " + copyArr);
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}		
	}
}
