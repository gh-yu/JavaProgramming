package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method() {
		File f1 = new File("test.txt"); // �� ��ü�� ���� ����x, "test.txt"��� ������ ������ ������ �ְڴ�
		try {
			f1.createNewFile(); // �� ���� ����
			// ��θ� �������� ���� ���¿��� ������ �������ָ� ������Ʈ�� �ֻ�ܿ� ������ �������
			
			File f2 = new File("c:/test/test.txt"); 
			f2.createNewFile(); // �ܼ��ϰ� ���ϸ� ������ִ� �޼ҵ�(��ΰ� ������ ���� �� ����)
								// ��� �������ٶ� �ش� ��ΰ� �־�� �� (c:/test ������ �־�� ��)
			
			File f3 = new File("c:/temp1/temp2");
			File f4 = new File("c:/temp1/temp2/test.txt");
//			f4.createNewFile(); // �ش� ��� ��� ���� ���� ����
			f3.mkdirs(); // make directories ��ε��� ����� ��, mkdir()�޼ҵ�� ���丮 �ϳ� ����
			f4.createNewFile();
			f4.delete(); // f4�� ��� ��ü�� ���� ����
			
			System.out.println(f2.exists()); // ���� �Ǵ� ���丮�� �����ϴ���(�����ƴ���) true/false
			System.out.println(f3.exists());
			System.out.println(f4.exists());
			System.out.println(f3.exists());
			
			System.out.println(f1.getName()); // ���� ��
			System.out.println(f1.getAbsolutePath()); // ���� ���
			System.out.println(f1.getPath()); // ��� ���
			System.out.println(f1.length());
			System.out.println(f1.getParent()); // ������Ʈ �� ���� ������ ������ -> null ��ȯ��
			System.out.println(f4.getParent()); // ���� ��� (��� ���� �ִ��� ���� ���丮�� ��ȯ)
			System.out.println(f4.getAbsolutePath());
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		// f1.createNewFile();�� �ϸ� Unhandled exception type IOException ���� �� -> 
		// FileŬ������ �ִ� createNewFile()�޼ҵ� ȣ�� -> createNewFile()�޼ҵ�� throws IOException�ϰ� ���� 
		// IOException�� �����ϰ� ����
		// ���� �����Ϸ��� ���� ó�� �ʼ�
		// try~catch���� ���� ����ó�� �� �ش� ������Ʈ Ŭ���ϰ� fn+f5 �Ǵ� ���콺 ��Ŭ�� Refresh �����ϸ� �� ���� ������

	}
}
