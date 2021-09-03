package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {

	FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		
		return fd.checkName(file);
	}

	public void fileSave(String file, StringBuilder sb) {
		
		String str = sb.substring(0, sb.length()); // StringBuilder자료형 sb를 String으로 바꾸는 과정
		
//		String[] strArr = new String[str.length()]; 
//		String[] strArr = str.split("\n"); // 만약 cher배열로 넘겨줄거면 split해서 fd.fileSave에 넘겨줘서 for문 돌려서 한 줄씩 띄워서 저장 가능
		
		
		fd.fileSave(file, str);
	}

	public StringBuilder fileOpen(String file) {
		
		return fd.fileOpen(file);
	}

	public void fileEdit(String file, StringBuilder sb) {
		
		String str = sb.substring(0, sb.length());
		
		fd.fileEdit(file, str);
	}

}
