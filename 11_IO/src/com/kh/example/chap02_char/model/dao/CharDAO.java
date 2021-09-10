package com.kh.example.chap02_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	public void fileOpen() {
		// 파일로부터 문자기반으로 데이터를 읽어오고 싶다
		// ------  --------  -----------
		//  File   Stream x     Reader ==> FileReader
		FileReader fr = null;
		try {
			fr = new FileReader("b_char.txt");
		
//			fr.read(); // int 반환, 끝에 도달하면 -1 반환
		
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
// try~with~resource : 자동으로 close 처리
// try 뒤에 (닫을 객체;) 하니까 빨간 줄 에러 뜸 -> fr에서 throws IOException하고 있기 때문
// 이에 대한 예외 처리 필요 catch절로 IOException 잡아줄 필요 있음
			
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
		// 파일에 문자기반으로 데이터를 쓰고싶다
		// ---- --------  -----------
		// File Stream x    Writer ==> FileWriter
		FileWriter fw = null;
		try {
			fw = new FileWriter("b_char.txt", true); // , true 붙이면 이어쓰기(false거나 안 붙이면 덮어쓰기)
			fw.write("와, IO 재밌다!"); // String
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
		
		// try~with~resource문 -> try문에서 try 뒤에 소괄호 붙여서 (닫아줘야 될 객체;) 
		// 이렇게 하면 자동으로 close 처리해줌 
		try(FileWriter fw = new FileWriter("b_char.txt", true);) {
			fw.write("와, IO 재밌다!");
			fw.write('A');
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
