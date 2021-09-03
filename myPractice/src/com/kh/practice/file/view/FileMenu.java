package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	public void mainMenu() {
		while (true) {
			System.out.println("***** My Note *****");
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch (menuNum) {
			case 1 : fileSave(); break;
			case 2 : fileOpen(); break;
			case 3 : fileEdit(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}

	private void fileSave() {
//		System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
//		System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
//		System.out.print("���� : ");
		
//		StringBuilder inputStr = new StringBuilder();
//		while (true) {
//			inputStr.append(sc.nextLine()); // �̷��� �ϸ� �Ѳ����� ĥ ���� ������ ����� �� ���� �߰��߰� �ٹٲ޹��ڴ� ����ȵ�
//			if (inputStr.length() > 5) {
//				if (inputStr.substring((inputStr.length() - 5), inputStr.length()).equals("ex��it")) {
//					inputStr.delete((inputStr.length() - 5), inputStr.length());
//					break;
//				} 
//			}
//
//		}
		StringBuilder sb = new StringBuilder();
		while (true) {
			System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
			System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
			System.out.print("���� : ");
			
			String str = sc.nextLine();
			if(!(str.equals("ex��it"))) {
//				sb.append(str).append('\n');
				sb.append(str + "\n"); // sc.nextLine()�� ����ڰ� ���� ġ�� ���ۿ� �ִ� ����, �� �ٹٲ޹��ڱ��� �������� �ٹٲ޹��� �����ϰ� �����
			} else {
				break;
			}
		}

		System.out.print("������ ���� ���� �Է����ּ���(ex. myFile.txt) : ");
		String fileName = sc.nextLine();
		
		while (true) {
			if (fc.checkName(fileName)) {
				System.out.print("�̹� �����ϴ� �����Դϴ�. ����ðڽ��ϱ�?(y/n) : ");
				char input = sc.nextLine().toLowerCase().charAt(0);
				
				if (input == 'y') {
					fc.fileSave(fileName, sb);
					break;
				} else if (input == 'n') {
					System.out.println("������ ���� ���� �Է����ּ���(ex. myFile.txt) : ");
					fileName = sc.nextLine();
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				}
			} else if (fc.checkName(fileName) == false) {
				fc.fileSave(fileName, sb);
				break;
			}
		}	
	}	
	
	
	private void fileOpen() {
		System.out.print("�� ���� �� : ");
		String fileName = sc.nextLine();
		
		if (fc.checkName(fileName)) {
			System.out.println(fc.fileOpen(fileName));
		} else {
			System.out.println("���� �����Դϴ�.");
		}
	
	}

	private void fileEdit() {
		System.out.print("������ ���� �� : ");
		String fileName = sc.nextLine();
		
		if (fc.checkName(fileName)) {
			StringBuilder sb = new StringBuilder();
			while (true) {
				System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
				System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
				System.out.print("���� : ");
				
				String str = sc.nextLine();
				
				if (!(str.equals("ex��it"))) {
					sb.append(str + "\n");
				} else {
					break;
				}
			}
			fc.fileEdit(fileName, sb);
								
		} else {
			System.out.println("���� �����Դϴ�.");
		}
	}


}
