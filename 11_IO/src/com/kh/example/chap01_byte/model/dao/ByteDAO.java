package com.kh.example.chap01_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		// 파일로부터 byte단위로 데이터를 읽어오고 싶다
		// ------  -------  ------------        
		//  File    Stream      Input ==> FileInputStream
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a_byte.txt");
			
//			while(fis.read() != -1) {
//				System.out.print((char)fis.read() + " "); // int로 반환 -> char로 형변환
//			}
			// FileInputStream.read() : int(반환값)
			// 데이터의 다음 값을 가져오는데, 데이터 끝에 도달하면 -1 반환
			//  a_byte.txt에는 abcdefgcde저장되어 있는데 bdfce 찍히는 이유?
			// while문 조건식에 fis.read()가 맨앞커서 다음 값 a 가져가고
			// while문 안 출력문장에서의 fis.read()가 a 다음 값인 b 가져와 출력
			// 조건식에서 c 가져가고, 출력문장에서 d가져와 d 찍힘 ...

			int value; // 파일에 있는 데이터 전체 출력하기 위해서 value라는 변수에 저장
			while((value = fis.read()) != -1) {
				System.out.print((char)value + " ");
//				System.out.print((char)fis.read() + " ");
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // fis.read()에서 throws하는 예외 처리
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
		// 파일에 byte단위로 데이터를 쓰고 싶다
		// ---- -------  ------------
		// File Stream    Output  ==> FileOutputStream
		// 파일이 존재하지 않으면 자동으로 만들어주고, 파일이 존재한다면 덮어씀
		
		FileOutputStream fos = null; // 클래스를 참조하는 변수는 기본값 null, try 안에다 선언하고 여기 없으면 영역이 try구문 안만 됨
		try {
			fos = new FileOutputStream("a_byte.txt");
			
			fos.write(97); 
			
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			fos.write(bArr); // 덮어쓰기, 출력 결과(파일 저장 결과) : abcdefg
							 // 이어쓰기였으면 aabcedfg였을 것 한 번 더 실행시켰으니
			
			// bArr = bcdefg
			fos.write(bArr, 1, 3); // 인덱스 1(offset : 시작 위치)부터 시작해서 3개 쓰겠다. cde
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // error가 있든 없든 무조건 실행
			try { //위의 try~catch문과 영역이 다름
				fos.close(); // 파일에 데이터 쓰기 후 무조건 닫아줘야 한다.
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
			fos.write(bArr); // 덮어쓰기, 출력 결과(파일 저장 결과) : abcdefg
							 // 이어쓰기였으면 aabcedfg였을 것 한 번 더 실행시켰으니
			
			// bArr = bcdefg
			fos.write(bArr, 1, 3); // 인덱스 1(offset : 시작 위치)부터 시작해서 3개 쓰겠다. cde
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
}
