package com.kh.example.chap01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		// ���Ϸκ��� byte������ �����͸� �о���� �ʹ�
		// ------  -------  ------------        
		//  File    Stream      Input ==> FileInputStream
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a_byte.txt");
			
//			while(fis.read() != -1) {
//				System.out.print((char)fis.read() + " "); // int�� ��ȯ -> char�� ����ȯ
//			}
			// FileInputStream.read() : int(��ȯ��)
			// �������� ���� ���� �������µ�, ������ ���� �����ϸ� -1 ��ȯ
			//  a_byte.txt���� abcdefgcde����Ǿ� �ִµ� bdfce ������ ����?
			// while�� ���ǽĿ� fis.read()�� �Ǿ�Ŀ�� ���� �� a ��������
			// while�� �� ��¹��忡���� fis.read()�� a ���� ���� b ������ ���
			// ���ǽĿ��� c ��������, ��¹��忡�� d������ d ���� ...

			int value; // ���Ͽ� �ִ� ������ ��ü ����ϱ� ���ؼ� value��� ������ ����
			while((value = fis.read()) != -1) {
				System.out.print((char)value + " ");
//				System.out.print((char)fis.read() + " ");
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // fis.read()���� throws�ϴ� ���� ó��
			e.printStackTrace();
		} finally {   
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileSave() {
		// ���Ͽ� byte������ �����͸� ���� �ʹ�
		// ---- -------  ------------
		// File Stream    Output  ==> FileOutputStream
		// ������ �������� ������ �ڵ����� ������ְ�, ������ �����Ѵٸ� ���
		
		FileOutputStream fos = null; // Ŭ������ �����ϴ� ������ �⺻�� null, try �ȿ��� �����ϰ� ���� ������ ������ try���� �ȸ� ��
		try {
			fos = new FileOutputStream("a_byte.txt");
			
			fos.write(97); 
			
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			fos.write(bArr); // �����, ��� ���(���� ���� ���) : abcdefg
							 // �̾�⿴���� aabcedfg���� �� �� �� �� �����������
			
			// bArr = bcdefg
			fos.write(bArr, 1, 3); // �ε��� 1(offset : ���� ��ġ)���� �����ؼ� 3�� ���ڴ�. cde
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // error�� �ֵ� ���� ������ ����
			try { //���� try~catch���� ������ �ٸ�
				fos.close(); // ���Ͽ� ������ ���� �� ������ �ݾ���� �Ѵ�.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	public void fileOpen2() {
		
		try (FileInputStream fis = new FileInputStream("a_byte.txt");) {
			
			int value = 0;
			while ((value = fis.read()) != -1) {
				System.out.print((char)value + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public void fileSave2() {
		
		try (FileOutputStream fos = new FileOutputStream("a_byte.txt", true);) {
			
			fos.write(97); 
			
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			fos.write(bArr); // �����, ��� ���(���� ���� ���) : abcdefg
							 // �̾�⿴���� aabcedfg���� �� �� �� �� �����������
			
			// bArr = bcdefg
			fos.write(bArr, 1, 3); // �ε��� 1(offset : ���� ��ġ)���� �����ؼ� 3�� ���ڴ�. cde
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
}
