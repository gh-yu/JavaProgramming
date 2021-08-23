package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
//		for (int i = 1; i <= arr.length; i++) {
//			arr[i-1] = i;
//			System.out.print(arr[i-1] + " ");
//		}
	}
	
	public void practice2() {
		int arr[] = new int[10];
		
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = arr.length - i;
//			System.out.print(arr[i] + " ");
//		}
	}
	
	public void practice3() {
		// 입력받은 양의 정수만큼 배열 크기 할당하여 1부터 입력받은 값까지 초기화 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for (int i = num; i > 0; i--) {
			arr[num - i] = num - i + 1;
			System.out.print(arr[num - i] + " ");
		}
	}
	
	public void practice3_1() {
		// 입력받은 양의 정수만큼 배열 크기 할당하여 1부터 입력받은 값까지 초기화 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for (int i = num; i > 0; i--) { // 배열 끝부터 넣음
			arr[i - 1] = i;
		}
		
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
	}	
	
	public void practice3_2() {
		// 입력받은 양의 정수만큼 배열 크기 할당하여 1부터 입력받은 값까지 초기화 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for (int i = 0; i < num; i++) {
			arr[num - i - 1] = num - i;
		}
		
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고
		// 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()];
		
		int iCount = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			if (arr[i] == ch) {
				if (iCount == 0) {
					System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : " + i);
					iCount++;
				} else {
					System.out.print(" " + i);
					iCount++;
				}
			}
 		}
		if (iCount > 0) {
			System.out.println();
			System.out.println(ch + " 개수 : " + iCount);
		} else {
			System.out.println(str + "에 " + ch + "가 존재하지 않습니다.");
		}		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[] {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int index = sc.nextInt();
		
		if (index >= 0 && index <= 6) {
			System.out.println(arr[index] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
			
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		
		for (int i = 0; i < length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수 : ");
			int oddNum = sc.nextInt();
			
			if (oddNum >= 3 && oddNum % 2 != 0) {
				
				int[] arr = new int[oddNum];
				
				for (int i = 0; i < oddNum; i++) {
				
					if (i <= oddNum / 2) {
						arr[i] = i + 1;
						System.out.print(arr[i] + ", ");
					} else {
						if (i != oddNum - 1) {
							arr[i] = oddNum - i;
							System.out.print(arr[i] + ", ");
						} else {
							arr[i] = oddNum - i;
							System.out.print(arr[i]);
						}
					} 
				}
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"후라이드", "양념", "간장", "마늘"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.nextLine();
		
		boolean cheak = false; // int count = 0; 으로 대체 가능
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(str)) {
				System.out.println(str + "치킨 배달 가능");
				cheak = true;
				break;
			}
		}
		if (!cheak) {
			System.out.println(str + "치킨은 없는 메뉴입니다.");
		}
			
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		
		char[] arr1 = new char[str.length()];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = str.charAt(i);
		}
		
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		for (int i = 0; i < arr2.length; i++) {
			if (i < 8) {
				System.out.print(arr2[i]);
			} else {
				System.out.print('*');
			}
		}
	}
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}	
	}
	
	public void practice12() {
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println();
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice12_1() {
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		
		int i = 0;
		int max = arr[i];
		int min = arr[i];
		for (int j = i + 1; j < arr.length; j++) {
//			max = arr[i]; 여기에 넣으면 값이 잘 안 나옴.. 왜?
//			min = arr[i];
			if (arr[j] > max) {
				max = arr[j];
			} else if (arr[j] < min) {
				min = arr[j];
			}
		}
		System.out.println();
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice13() {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			
			int random = (int)(Math.random() * 10 + 1);
			
			for (int j = 0; j < arr.length;) {
				if (i == j) {
					arr[i] = random;
				} else if (arr[j] == random) {
					random = (int)(Math.random() * 10 + 1);
					j = 0;
					continue;
				}
				j++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice13_1() { // 13번 코드 간결한 버전
		// 배열크기가 10인 배열에 1~10 사이의 난수를 중복 없이 저장하여 출력
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for (int j = 0; j < i;) {
//				if (i != j && arr[j] == arr[i]) { // i != j 는 필요 없는 조건, j가 i보다 작을때로 for문 조건 뒀기 때문
				if (arr[j] == arr[i]) {
					arr[i] = (int)(Math.random() * 10 + 1);
					j = 0;
					continue;
				}
				j++;
			}
			System.out.print(arr[i] + " ");
		}		
		
	}
	
	public void practice13_2() { // 답안 코드
		// 배열크기가 10인 배열에 1~10 사이의 난수를 중복 없이 저장하여 출력
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length;) {
			
			int random = (int)(Math.random() * 10 + 1);
			boolean overlap = false;
			
			for (int j = 0; j < i; j++) {
				if (arr[j] == random) {
					overlap = true;
					break;
				} 	
			}
			
			if (!overlap) {
				arr[i] = random;
				System.out.print(arr[i] + " ");
				i++;
			}
		}		
	}		
	
	public void practice14() {
		// 로또 번호 자동 생성기 프로그램 작성, 중복 값 없이 오름차순으로 정렬하여 출력
		int[] arr = new int[6];
		
		for (int i = 0; i < arr.length; i++) { // 중복 값 없이 배열 초기화
			
			arr[i] = (int)(Math.random() * 45 + 1);
			
			for (int j = 0; j < i;) {
				if (arr[j] == arr[i]) {
					arr[i] = (int)(Math.random() * 45 + 1);
					j = 0;
					continue;
				}
				j++;
			}
		}
		

		for (int i = 0; i < arr.length; i++) { // 오름차순 정렬
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;				
				}
			}
		}

		for (int i = 0; i < arr.length; i++) { // 출력
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice14_1() { // 오름차순 정렬 반복문 안에 프린트문 넣으면 중복 값 발생&오름차순 정렬 제대로 안됨
		// 로또 번호 자동 생성기 프로그램 작성, 중복 값 없이 오름차순으로 정렬하여 출력
		int[] arr = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 45 + 1);
			
			for (int j = 0; j < i;) {
				if (arr[j] == arr[i]) {
					arr[i] = (int)(Math.random() * 45 + 1);
					j = 0;
					continue;
				}
				j++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) { // // 정렬 전(확인용), 중복 값 없이 잘 나옴
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;				
				}
			}
//			System.out.print(arr[i] + " "); // 이 프린트문때문에 중복 값 발생&오름차순 정렬 문제 발생
		}
	
		for (int i = 0; i < arr.length; i++) { // 배열값 프린트해주기 위한 반복문
			System.out.print(arr[i] + " "); 
		}
	}
	
	public void practice14_2() { // 답안 코드 참고, 오름차순 정렬 for문 수정 및 출력 같이
		// 로또 번호 자동 생성기 프로그램 작성, 중복 값 없이 오름차순으로 정렬하여 출력
		int[] arr = new int[6];
		
		for (int i = 0; i < arr.length; i++) { // 중복 값 없이 배열 초기화
			
			arr[i] = (int)(Math.random() * 45 + 1);
			
			for (int j = 0; j < i;) {
				if (arr[j] == arr[i]) {
					arr[i] = (int)(Math.random() * 45 + 1);
					j = 0;
					continue;
				}
				j++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) { // 정렬 전(확인용)
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		for (int i = 0; i < arr.length; i++) { // 오름차순 정렬&출력
			for (int j = i; j < arr.length; j++) { 
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;				
				}
			}
			
			System.out.print(arr[i] + " ");
		}

	}
	
	public void practice15() {
		
	}
	
	public void practice16() {
		
	}
}
