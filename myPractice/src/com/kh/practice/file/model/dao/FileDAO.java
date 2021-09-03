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
		
		File f = new File(file); // 파일명은 file 값으로 객체의 필드 name에 저장됨, 파일을 생성한다면 파일명이 저장된 file값으로 생성됨

		if (f.exists()) { // f에 담긴 객체에 파일이나 디렉토리가 존재하는지
			return true; 
		} 
		
		return false;
		
	}

	
	public StringBuilder fileOpen(String file) {
		
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file));) {
			
//			int value;
//			while ((value = br.read()) != -1) { // br.read메소드 문자 끝에 도달할 때까지 int단위로 반환되기 때문(줄바꿈문자도 같이 반환)
//				sb.append((char)value);  // 줄바꿈 문자 같이 안 붙여넣어도, 저장되어 있는 줄바꿈 문자 같이 저장됨 
//			}		
			
			String value = null;
			while ((value = br.readLine()) != null) { // br.readLine메소드 줄바꿈문자 안식하여 줄바꿈문자 있기 전의 문자열 반환
				sb.append(value + "\n"); // sb에 줄마다 있는 줄바꿈문자까지 같이 붙여넣기  
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
