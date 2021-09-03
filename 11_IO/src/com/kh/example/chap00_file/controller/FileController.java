package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method() {
		File f1 = new File("test.txt"); // 이 자체로 파일 생성x, "test.txt"라는 파일의 정보를 가지고 있겠다
		try {
			f1.createNewFile(); // 새 파일 생성
			// 경로를 지정하지 않은 상태에서 파일을 생성해주면 프로젝트의 최상단에 파일이 만들어짐
			
			File f2 = new File("c:/test/test.txt"); 
			f2.createNewFile(); // 단순하게 파일만 만들어주는 메소드(경로가 없으면 만들 수 없음)
								// 경로 지정해줄때 해당 경로가 있어야 함 (c:/test 폴더가 있어야 함)
			
			File f3 = new File("c:/temp1/temp2");
			File f4 = new File("c:/temp1/temp2/test.txt");
//			f4.createNewFile(); // 해당 경로 없어서 파일 생성 못함
			f3.mkdirs(); // make directories 경로들을 만들어 줌, mkdir()메소드는 디렉토리 하나 생성
			f4.createNewFile();
			f4.delete(); // f4에 담긴 객체의 파일 삭제
			
			System.out.println(f2.exists()); // 파일 또는 디렉토리가 존재하는지(생성됐는지) true/false
			System.out.println(f3.exists());
			System.out.println(f4.exists());
			System.out.println(f3.exists());
			
			System.out.println(f1.getName()); // 파일 명
			System.out.println(f1.getAbsolutePath()); // 절대 경로
			System.out.println(f1.getPath()); // 상대 경로
			System.out.println(f1.length());
			System.out.println(f1.getParent()); // 프로젝트 안 제일 상위에 있으면 -> null 반환됨
			System.out.println(f4.getParent()); // 상위 경로 (어디에 속해 있는지 상위 디렉토리만 반환)
			System.out.println(f4.getAbsolutePath());
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		// f1.createNewFile();만 하면 Unhandled exception type IOException 에러 뜸 -> 
		// File클래스에 있는 createNewFile()메소드 호출 -> createNewFile()메소드는 throws IOException하고 있음 
		// IOException을 위임하고 있음
		// 파일 생성하려면 예외 처리 필수
		// try~catch문을 통해 예외처리 후 해당 프로젝트 클릭하고 fn+f5 또는 마우스 우클릭 Refresh 선택하면 새 파일 생성됨

	}
}
