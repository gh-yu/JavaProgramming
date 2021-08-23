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
		// �Է¹��� ���� ������ŭ �迭 ũ�� �Ҵ��Ͽ� 1���� �Է¹��� ������ �ʱ�ȭ �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for (int i = num; i > 0; i--) {
			arr[num - i] = num - i + 1;
			System.out.print(arr[num - i] + " ");
		}
	}
	
	public void practice3_1() {
		// �Է¹��� ���� ������ŭ �迭 ũ�� �Ҵ��Ͽ� 1���� �Է¹��� ������ �ʱ�ȭ �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for (int i = num; i > 0; i--) { // �迭 ������ ����
			arr[i - 1] = i;
		}
		
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
	}	
	
	public void practice3_2() {
		// �Է¹��� ���� ������ŭ �迭 ũ�� �Ҵ��Ͽ� 1���� �Է¹��� ������ �ʱ�ȭ �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
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
		String[] arr = {"���", "��", "����", "������", "����"};
		
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		// ���ڿ��� �Է� �޾� ���� �ϳ��ϳ��� �迭�� �ְ�
		// �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ��� ������ �� ��° �ε����� ��ġ�ϴ��� �ε����� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()];
		
		int iCount = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			if (arr[i] == ch) {
				if (iCount == 0) {
					System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : " + i);
					iCount++;
				} else {
					System.out.print(" " + i);
					iCount++;
				}
			}
 		}
		if (iCount > 0) {
			System.out.println();
			System.out.println(ch + " ���� : " + iCount);
		} else {
			System.out.println(str + "�� " + ch + "�� �������� �ʽ��ϴ�.");
		}		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[] {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int index = sc.nextInt();
		
		if (index >= 0 && index <= 6) {
			System.out.println(arr[index] + "����");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
			
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		
		for (int i = 0; i < length; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("�� �� : " + sum);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("���� : ");
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
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"�Ķ��̵�", "���", "����", "����"};
		
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		
		boolean cheak = false; // int count = 0; ���� ��ü ����
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(str)) {
				System.out.println(str + "ġŲ ��� ����");
				cheak = true;
				break;
			}
		}
		if (!cheak) {
			System.out.println(str + "ġŲ�� ���� �޴��Դϴ�.");
		}
			
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
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
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
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
//			max = arr[i]; ���⿡ ������ ���� �� �� ����.. ��?
//			min = arr[i];
			if (arr[j] > max) {
				max = arr[j];
			} else if (arr[j] < min) {
				min = arr[j];
			}
		}
		System.out.println();
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}
	
	public void practice13() {
		// 10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
		// 1~10 ������ ������ �߻����� �ߺ��� ���� ���� �迭�� �ʱ�ȭ�� �� ����ϼ���.
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
	
	public void practice13_1() { // 13�� �ڵ� ������ ����
		// �迭ũ�Ⱑ 10�� �迭�� 1~10 ������ ������ �ߺ� ���� �����Ͽ� ���
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for (int j = 0; j < i;) {
//				if (i != j && arr[j] == arr[i]) { // i != j �� �ʿ� ���� ����, j�� i���� �������� for�� ���� �ױ� ����
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
	
	public void practice13_2() { // ��� �ڵ�
		// �迭ũ�Ⱑ 10�� �迭�� 1~10 ������ ������ �ߺ� ���� �����Ͽ� ���
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
		// �ζ� ��ȣ �ڵ� ������ ���α׷� �ۼ�, �ߺ� �� ���� ������������ �����Ͽ� ���
		int[] arr = new int[6];
		
		for (int i = 0; i < arr.length; i++) { // �ߺ� �� ���� �迭 �ʱ�ȭ
			
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
		

		for (int i = 0; i < arr.length; i++) { // �������� ����
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;				
				}
			}
		}

		for (int i = 0; i < arr.length; i++) { // ���
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice14_1() { // �������� ���� �ݺ��� �ȿ� ����Ʈ�� ������ �ߺ� �� �߻�&�������� ���� ����� �ȵ�
		// �ζ� ��ȣ �ڵ� ������ ���α׷� �ۼ�, �ߺ� �� ���� ������������ �����Ͽ� ���
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
		
		for (int i = 0; i < arr.length; i++) { // // ���� ��(Ȯ�ο�), �ߺ� �� ���� �� ����
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
//			System.out.print(arr[i] + " "); // �� ����Ʈ�������� �ߺ� �� �߻�&�������� ���� ���� �߻�
		}
	
		for (int i = 0; i < arr.length; i++) { // �迭�� ����Ʈ���ֱ� ���� �ݺ���
			System.out.print(arr[i] + " "); 
		}
	}
	
	public void practice14_2() { // ��� �ڵ� ����, �������� ���� for�� ���� �� ��� ����
		// �ζ� ��ȣ �ڵ� ������ ���α׷� �ۼ�, �ߺ� �� ���� ������������ �����Ͽ� ���
		int[] arr = new int[6];
		
		for (int i = 0; i < arr.length; i++) { // �ߺ� �� ���� �迭 �ʱ�ȭ
			
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
		
		for (int i = 0; i < arr.length; i++) { // ���� ��(Ȯ�ο�)
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		for (int i = 0; i < arr.length; i++) { // �������� ����&���
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
