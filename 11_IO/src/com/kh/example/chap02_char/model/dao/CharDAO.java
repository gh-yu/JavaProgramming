package com.kh.example.chap02_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	public void fileOpen() {
		// ���Ϸκ��� ���ڱ������ �����͸� �о���� �ʹ�
		// ------  --------  -----------
		//  File   Stream x     Reader ==> FileReader
		FileReader fr = null;
		try {
			fr = new FileReader("b_char.txt");
		
//			fr.read(); // int ��ȯ, ���� �����ϸ� -1 ��ȯ
		
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value + " ");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	public void fileOpen2() {
		try (FileReader fr = new FileReader("test.txt");) { 
// Unhandled exception type IOException thrown by automatic close() invocation on fr
// java.io.FileReader.FileReader(String fileName) throws FileNotFoundException
// try~with~resource : �ڵ����� close ó��
// try �ڿ� (���� ��ü;) �ϴϱ� ���� �� ���� �� -> fr���� throws IOException�ϰ� �ֱ� ����
// �̿� ���� ���� ó�� �ʿ� catch���� IOException ����� �ʿ� ����
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value + " ");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void fileSave() {
		// ���Ͽ� ���ڱ������ �����͸� ����ʹ�
		// ---- --------  -----------
		// File Stream x    Writer ==> FileWriter
		FileWriter fw = null;
		try {
			fw = new FileWriter("b_char.txt", true); // , true ���̸� �̾��(false�ų� �� ���̸� �����)
			fw.write("��, IO ��մ�!"); // String
			fw.write('A');
			char[] cArr = {'a', 'p', 'p', 'l', 'e'}; // char[]
			fw.write(cArr);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileSave2() {
		
		// try~with~resource�� -> try������ try �ڿ� �Ұ�ȣ �ٿ��� (�ݾ���� �� ��ü;) 
		// �̷��� �ϸ� �ڵ����� close ó������ 
		try(FileWriter fw = new FileWriter("b_char.txt", true);) {
			fw.write("��, IO ��մ�!");
			fw.write('A');
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
