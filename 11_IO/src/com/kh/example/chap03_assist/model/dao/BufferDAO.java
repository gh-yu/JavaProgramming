package com.kh.example.chap03_assist.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferDAO {
	public void inputByte() {
		// ���Ͽ� �ִ� �����͸� ����Ʈ ������� ������ �о���� �ʹ�
		// ---			  -------     ---- ---------
		// File            Stream           Input  => FileInputStream       
		//                           Buffered      => BufferedInputStream  // ������ �о�� �� �ִ� ������Ʈ�� (���� ���)
						
		try (FileInputStream fis = new FileInputStream("c_buffer.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);) {
			
			int value;
			while ((value = bis.read()) != -1) {
				System.out.print((char)value + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void outputByte() {
		// ���Ͽ� �ִ� �����͸� ����Ʈ ������� ������ ���� �ʹ�
		// ---			  -------     ---- -----
		// File            Stream          Output  => FileInputStream       
		//                          Buffered       => BufferedOutputStream

//		BufferedOutputStream bos = null;
		try (FileOutputStream fos = new FileOutputStream("c_buffer.txt", true);
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			
			bos.write(65);
			
			byte[] bArr = {66, 67, 68 ,69};
			bos.write(bArr);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} /* finally {
			try {
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} */
		
	}
	
	
	public void outputChar() {
		// ���Ͽ� ���� ������� �����͸� ������ ����;�
		// ---  ------           ---- -----
		// File  Stream x            Writer => FileWriter
		//                     Buffered     => BufferedWriter
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt", true));) {
			bw.write("�ȳ��ϼ���\n");
			bw.write("�ݰ����ϴ�");
			bw.write('\n');
			bw.write("����������\n");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	public void inputChar() {
		// ���Ͽ� ���� ������� �����͸� ������ �а� �;�
		// ---  -------          ---  ------
		// File  Stream x             Reader => FileReader
		//                      Buffered     => BufferedReader
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));){

			String value = null; 
			while ((value = br.readLine()) != null) // ��Ʈ���� ���� �����ϸ� null�� ��ȯ
				System.out.println(value);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public void ioTest() { // sc.nextLine() ���  BufferedReader.readLine()�޼ҵ� ����ؼ� �Է¹ޱ�
		// ����ڿ��� �̸��� ���̸� �Է� �ް�, ������� 10�� ���� ���̸� ���
		// �⺻ �����
		// System.in : InputStream -> ����Ʈ ���
		// System.out : printStream -> ����Ʈ ���
		try (InputStreamReader isr = new InputStreamReader(System.in);  // -> ����Ʈ ����� ���� ������� �ٲ���
		          BufferedReader br = new BufferedReader(isr);
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			
			
			System.out.print("�̸� �Է� : ");
			String name = br.readLine();
			System.out.print("���� �Է� :");
			int age = Integer.parseInt(br.readLine());
			
//			System.out.println(name + "���� 10�� �� ���̴� " + (age + 10) + "���Դϴ�.");
			bw.write(name + "���� 10�� �� ���̴� " + (age + 10) + "���Դϴ�.");
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
