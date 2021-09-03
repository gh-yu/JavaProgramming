package com.kh.practice.file.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	public boolean checkName(String file) {
		
		File f = new File(file); // ���ϸ��� file ������ ��ü�� �ʵ� name�� �����, ������ �����Ѵٸ� ���ϸ��� ����� file������ ������

		if (f.exists()) { // f�� ��� ��ü�� �����̳� ���丮�� �����ϴ���
			return true; 
		} 
		
		return false;
		
	}

	
	public StringBuilder fileOpen(String file) {
		
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file));) {
			
//			int value;
//			while ((value = br.read()) != -1) { // br.read�޼ҵ� ���� ���� ������ ������ int������ ��ȯ�Ǳ� ����(�ٹٲ޹��ڵ� ���� ��ȯ)
//				sb.append((char)value);  // �ٹٲ� ���� ���� �� �ٿ��־, ����Ǿ� �ִ� �ٹٲ� ���� ���� ����� 
//			}		
			
			String value = null;
			while ((value = br.readLine()) != null) { // br.readLine�޼ҵ� �ٹٲ޹��� �Ƚ��Ͽ� �ٹٲ޹��� �ֱ� ���� ���ڿ� ��ȯ
				sb.append(value + "\n"); // sb�� �ٸ��� �ִ� �ٹٲ޹��ڱ��� ���� �ٿ��ֱ�  
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		return sb;
	}
	
//	public StringBuilder fileOpen(String file) {
//		
//		StringBuilder sb = new StringBuilder();
//		try (FileReader fr = new FileReader(file);) {
//			
//			int value;
//			while ((value = fr.read()) != -1) {
//				sb.append((char)value);
//			}		
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//		
//		return sb;
//	}



	public void fileSave(String file, String str) {
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file)); ){
		
			bw.write(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}



//	public void fileSave(String file, String str) {
//		
//		try (FileWriter fw = new FileWriter(file); ){
//		
//			fw.write(str);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	}
	
	public void fileEdit(String file, String str) {
		
		try (FileWriter fw = new FileWriter(file, true);) {
			
			fw.write(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
