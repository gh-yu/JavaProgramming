package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	public void mainMenu() {
		while (true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1 : fileSave(); break;
			case 2 : fileOpen(); break;
			case 3 : fileEdit(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	private void fileSave() {
//		System.out.println("파일에 저장할 내용을 입력하세요.");
//		System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
//		System.out.print("내용 : ");
		
//		StringBuilder inputStr = new StringBuilder();
//		while (true) {
//			inputStr.append(sc.nextLine()); // 이렇게 하면 한꺼번에 칠 수는 있지만 저장될 때 내용 중간중간 줄바꿈문자는 저장안됨
//			if (inputStr.length() > 5) {
//				if (inputStr.substring((inputStr.length() - 5), inputStr.length()).equals("ex끝it")) {
//					inputStr.delete((inputStr.length() - 5), inputStr.length());
//					break;
//				} 
//			}
//
//		}
		StringBuilder sb = new StringBuilder();
		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			
			String str = sc.nextLine();
			if(!(str.equals("ex끝it"))) {
//				sb.append(str).append('\n');
				sb.append(str + "\n"); // sc.nextLine()은 사용자가 엔터 치면 버퍼에 있는 엔터, 즉 줄바꿈문자까지 가져가고 줄바꿈문자 제외하고 저장됨
			} else {
				break;
			}
		}

		System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
		String fileName = sc.nextLine();
		
		while (true) {
			if (fc.checkName(fileName)) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
				char input = sc.nextLine().toLowerCase().charAt(0);
				
				if (input == 'y') {
					fc.fileSave(fileName, sb);
					break;
				} else if (input == 'n') {
					System.out.println("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
					fileName = sc.nextLine();
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			} else if (fc.checkName(fileName) == false) {
				fc.fileSave(fileName, sb);
				break;
			}
		}	
	}	
	
	
	private void fileOpen() {
		System.out.print("열 파일 명 : ");
		String fileName = sc.nextLine();
		
		if (fc.checkName(fileName)) {
			System.out.println(fc.fileOpen(fileName));
		} else {
			System.out.println("없는 파일입니다.");
		}
	
	}

	private void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String fileName = sc.nextLine();
		
		if (fc.checkName(fileName)) {
			StringBuilder sb = new StringBuilder();
			while (true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				
				String str = sc.nextLine();
				
				if (!(str.equals("ex끝it"))) {
					sb.append(str + "\n");
				} else {
					break;
				}
			}
			fc.fileEdit(fileName, sb);
								
		} else {
			System.out.println("없는 파일입니다.");
		}
	}


}
