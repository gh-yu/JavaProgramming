package com.kh.example.chap01_String.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringController {
	
	public void method1() {
		// String test
		String str1 = "java";
		String str2 = "java"; // str1
		String str3 = new String("java"); // new Ű���带 ���� ���ο� ��ü ���� ����
	
		System.out.println("str1 : " + str1); // str1�� ������ java�� �ƴ� �ּҰ� ���;� ��
		System.out.println("str2 : " + str2); // but, �����Ͱ� ���� -> toString()�� �������̵��� �Ǿ���.
		System.out.println("str3 : " + str3);
		
		boolean bool1 = str1 == str2; // ���ڿ������� == �񱳴� �ּҰ� ��
		boolean bool2 = str1 == str3;
		System.out.println("str1�� str2�� �ּҴ� ������? : " + bool1);
		System.out.println("str1�� str3�� �ּҴ� ������? : " + bool2);
		
		System.out.println("str1�� hashCode : " + str1.hashCode()); // hashCode : �ּҰ��� ���ڷ� �ٲ� ��
		System.out.println("str2�� hashCode : " + str2.hashCode()); 
		System.out.println("str3�� hashCode : " + str3.hashCode()); // ���ڿ� ���� ������(equals) ���� hashCode ��µ�
		// ���� �ּҰ� �� �� ��µ�
		
		str1 += "API";
		System.out.println("str1 : " + str1); 
		System.out.println("str2 : " + str2); 
		System.out.println("str3 : " + str3);
		System.out.println("str1�� ���ּҰ� : " + System.identityHashCode(str1)); // �����Ͱ��� �ٸ� -> �ּҰ� �ٸ��� ���
		System.out.println("str2�� ���ּҰ� : " + System.identityHashCode(str2));
		System.out.println("str3�� ���ּҰ� : " + System.identityHashCode(str3)); // System.identityHashCode() <- �� �ּҰ�
		// �ּҰ� ���� �ٸ��� ��µ�
	}
	
	public void method2() {
		// StringBuffer/StringBuilder
		// � ���ڿ��� �۾��� �� ����ؼ� ���ڿ��� �����ؾ��� ��� StringŬ������ '�Һ�'�̶�� Ư¡ ��
		// ���� ���� ����� ���� ��ġ�� �ٲ��ֱ� ������ �������÷��Ͱ� ��� �������ϴ� ������ ����
		// StringŬ������ ���� ������ ���� �б⸸ ���� ��쿡 �� ����
		// ������ ���� ��� StringBuffer�� StringBuilder�� �̿��ϴ� ���� �� ����
		// ����/������ ���� �޸� ����(����=�ӽð���)�� ���ο� ���ϴµ� �ʱ⿡�� 16���� ������ ����� �ڵ����� ����
		// �� Ŭ������ ���̴� ����ȭ�� �Ǵ��� �ȵǴ����� ����
		
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("�ʱ� buffer1�� ���뷮 : " + buffer1.capacity());
		System.out.println("buffer1�� ���ִ� ���� ���� ���� : " + buffer1.length());
		
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer(100); // ���� 100���� ����(�Ҵ�)
		System.out.println("�ʱ� buffer2�� ���뷮 : " + buffer2.capacity());
		System.out.println("buffer12�� ���ִ� ���� ���� ���� : " + buffer2.length());
		
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("�ʱ� buffer3�� ���뷮 : " + buffer3.capacity()); // �⺻ ���뷮 16 + abc���� 3 = 19�� �ʱ���뷮
		System.out.println("buffer3�� ���ִ� ���� ���� ���� : " + buffer3.length());
		
		System.out.println();
		
		System.out.println("buffer3�� ���ּҰ� : " + System.identityHashCode(buffer3));
		// append(String str):StringBuffer
		//		    �Ű�����	        ��ȯ��
//		buffer3.append("abc"); // StringBufferŬ������ append�޼ҵ� : ���ڿ� �߰�
//		System.out.println("abc �߰� ���� buffer3 : " + buffer3);
//		System.out.println("abc �߰� ���� buffer3 �뷮 : " + buffer3.capacity()); // �ʱ� ���뷮 19 �״����
//		System.out.println("abc �߰� ���� buffer3 ���� : " + buffer3.length());
	
//		System.out.println();
//		buffer3.append("def");
//		System.out.println("def �߰� ���� buffer3 : " + buffer3);
//		System.out.println("def �߰� ���� buffer3 �뷮 : " + buffer3.capacity());
//		System.out.println("def �߰� ���� buffer3 ���� : " + buffer3.length());
		
		buffer3.append("abc").append("def"); // �޼ҵ� ü�̴� : �޼ҵ� �ڿ� �޼ҵ� ü������ ����
//StringBuffer  ------------
//		StringBuffer.append(String str):StringBuffer

		System.out.println("abc, def �߰� ���� buffer3 : " + buffer3);
		System.out.println("abc, def �߰� ���� buffer3 �뷮 : " + buffer3.capacity());
		System.out.println("abc, def �߰� ���� buffer3 ���� : " + buffer3.length());
		System.out.println("buffer3�� ���ּҰ� : " + System.identityHashCode(buffer3)); // �ּҰ� �״��, �� ������ ��
		
		System.out.println();
		
		// insert(int offset, String str):StringBuffer
		// ���ϴ� ��ġ�� str�� �߰��ϴ� �޼ҵ�
		buffer3.insert(2, "zzz");
		System.out.println("�ε��� 2�� zzz�߰� ���� buffer3 : " + buffer3);
		
		// delete(int start, int end):StringBuffer
		// start <= index < end
		// start�� �ε������� end -1�� �ε�������
		buffer3.delete(2, 5);
		System.out.println("�ε��� 2���� �ε���5���� ���� ���� buffer3 : " + buffer3);
		
		// reverse()
		buffer3.reverse();
		System.out.println("reverse ���� buffer3 : " + buffer3);
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append("zzz").insert(2, "yy").reverse().delete(1,3); 
		System.out.println(sb);
	}
	
	public void method3() {
		String str = "Hello world";
		
		// charAt(int index):char
		// String�� index��°�� char ��ȯ
		char ch = str.charAt(4);
		System.out.println(ch);
		
		// concat(String str):String
		// ���� �� �ڿ� str�� �߰����ִ� �޼ҵ�
		String concatStr = str.concat("!!!");
		System.out.println(concatStr); // Hello world!!! ���
		str += "!!!";
		System.out.println(str); // Hello world!!! ���
		
		// equals():boolean
		System.out.println("concatStr.equals(str) : " + concatStr.equals(str));
		
		// sustring(int beginIndex):String <- �ε����� ���� ������ ������
		// subString(int beginIndex, int endIndex):String <- �ε����� ���۰� �� ������
		// String�� �Ϻ� ��ȯ <- beginIndex ����
		// ���� ���� �޼ҵ�, ����ϱ�
		System.out.println("str.substring(6) : " + str.substring(6));
		System.out.println("str.subString(0,4) " + str.substring(0, 4)); // �ε��� 0~3���� ��µ�
		
		// replace(char oldChar, char newChar):String
		// oldChar�� newChar�� ��ü�� ���ڿ� ��ȯ
		System.out.println("str.replace('1', 'e') : " + str.replace('l', 'e')); // str�� 'l'�� 'e'�� �ٲ�
		
		// toUpperCase()/toLowerCase():String
		//
		System.out.println("str.toUpperCase() : " + str.toUpperCase());
		System.out.println("str.toLowerCase() : " + str.toLowerCase());
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Ͻðڽ��ϱ�?(y/n) : ");
		String answerStr = sc.nextLine().toLowerCase(); // �Է��� ���ڿ��� �� �ҹ��ڷ� �ٲ��� Y�� y �Է��ϸ� y�� ��
		char answer = answerStr.charAt(0);
		if (answer == 'y') {
			System.out.println("��� �Ѵ�ϴ�.");
		} else if (answer == 'n') {
			System.out.println("�׸� �Ѵ�ϴ�.");
		}
		
		// equalsIgnorCase():boolean
		// ��ҹ��ڸ� ������ �ʰ� ���ڿ� ��
		String str2 = "WONDERFUL";
		String str3 = "wonderful";
		System.out.println(str2.equals(str3)); // false ��µ�
		System.out.println(str2.equalsIgnoreCase(str3)); // true ��µ�
		
		System.out.print("�� �Ͻðڽ��ϱ�?(y/n) : ");
		String answerStr2 = sc.nextLine();
		if (answerStr2.substring(0,1).equalsIgnoreCase("y")) {
			System.out.println("��� �Ѵ�ϴ�.");
		} else if (answerStr2.substring(0,1).equalsIgnoreCase("n")) {
			System.out.println("�׸� �Ѵ�ϴ�.");
		}
		
		// trim():STring
		// ��/�ڿ� �ִ� �� ������ ������ ���ڿ� ��ȯ
		// �α����� �� �ڿ� �����̽� ���� �Ǽ��ϴ��� trim()�޼ҵ带 ���� ����� �����Ͽ� �α��� �����ϰ� ����
		// �α��� ó�� �� �� ��� ���� ����
		String str4 = "      Java";
		String str5 = "Java      ";
		String str6 = "   Java   ";
		String str7 = "Ja      va"; // ���̿� �ִ� �����̽� �� ������
		System.out.println(str4 + " : " + str4.trim());
		System.out.println(str5 + " : " + str5.trim());
		System.out.println(str6 + " : " + str6.trim());
		System.out.println(str7 + " : " + str7.trim()); // ���̿� �ִ� �����̽��� �������� ����
		
		
		// split(String str):String[] // String[]�迭�� ��ȯ
		// ���ڿ��� �и����ִ� �޼ҵ�
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framework";
		splitStr.split(", "); // ", "(��ǥ����)�� �������ڷ� �ؼ� �����ְڴ�
		String[] strArr = splitStr.split(", "); // ", "�� �������ڷ� �ؼ� ������ �迭 �ε����� �ּҰ� ��� �� String��ü�迭�� ��ȯ
		System.out.println(strArr);
		
		// �Ϲ� for��
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		// ���� for�� = for-each
		for (String s : strArr) { // strArr �ε��� ������ ��� -> String s��� �ӽú����� 0, 1, 2.. �ε��� for�� �������� ���ʷ� ����
			System.out.println(s);
		}
		
	}
	
	public void method4() {
		String str = "Java, Oracle, JDBC, Front, Server, Framework";
		StringTokenizer st = new StringTokenizer(str, ", ");
		System.out.println("�и��� ���ڿ� ���� : " + st.countTokens());
		
		// hasMorTokens():boolean
		// ���� ��ū(�и��� ���ڿ�) ���� �ִٸ� true ��ȯ
		while(st.hasMoreTokens()) { 
			System.out.println(st.nextToken());
			// nextToken():String
			// �ش��ϴ� ���� �� ��ȯ
		}
		
		String str2 = "Apple,Banana-Cream*Dessert#Egg Fruits";
		String[] strArr = str2.split(",-*# ");
//		String[] strArr = str2.split(",|-|*|#| "); // ����ǥ����
		for (String s : strArr) {
			System.out.println(s); // ���� �ȵż� ��µ�
		}
		
		StringTokenizer st2 = new StringTokenizer(str2, ",-* #");
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken()); // �������ڸ��� ���еż� ��µ�
		}
		
	}
	
}
