package com.kh.homework.employee.view;

import java.util.Scanner;

import com.kh.homework.employee.controller.EmployeeController;

public class EmployeeMenu {
	Scanner sc = new Scanner(System.in) ;
	
	EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() { // ���� �޴��� ����ϴ� �⺻ ������
	
		int menuNum = 0;
		boolean check = false;
		while (menuNum != 9) {
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("3. ��� ����");
			System.out.println("4. ��� ���");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ�� �������� : ");
			menuNum = sc.nextInt();
			
			switch (menuNum) {
			case 1 : 
				insertEmp(); 
				check = true; 
				break;
			case 2 : 
				if (check) {
					updateEmp(); 
				} else {
					System.out.println("������ ��� �����Ͱ� �����ϴ�.");
				}
				break;
			case 3 : 
				deleteEmp(); 
				check = false; 
				break;
			case 4 :
				if (check) {
					printEmp(); 
				} else {
					System.out.println("��� �����Ͱ� �����ϴ�.");
				}
				break; 
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
			}
		}
	
	}
	
	public void insertEmp() {
		
		System.out.print("��� ��ȣ : ");
		int empNo = sc.nextInt();
		sc.nextLine();
		System.out.print("��� �̸� : ");
		String name = sc.nextLine();
		System.out.print("��� ���� : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("��ȭ ��ȣ : ");
		String phone = sc.nextLine();
		
		while (true) {
			System.out.print("�߰� ������ �� �Է��Ͻðڽ��ϱ�?(y/n) : ");
			char input = sc.nextLine().charAt(0);
			
			if (input == 'y' || input == 'Y') {
				System.out.print("��� �μ� : ");
				String dept = sc.nextLine();
				System.out.print("��� ���� : ");
				int salary = sc.nextInt();
				System.out.print("���ʽ� �� : ");
				double bonus = sc.nextDouble();
				ec.add(empNo, name, gender, phone, dept, salary, bonus);
				return;
				
			} else if (input == 'n'|| input == 'N') {
				ec.add(empNo, name, gender, phone);
				return;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}	
		
	}
	
	public void updateEmp() {

		
		while (true) {
			System.out.println("���� �ֽ��� ��� ������ �����ϰ� �˴ϴ�.");
			System.out.println("����� � ������ �����Ͻðڽ��ϱ�?");
			System.out.println("1. ��ȭ ��ȣ");
			System.out.println("2. ��� ����");
			System.out.println("3. ���ʽ� ��");
			System.out.println("9. ���ư���");
			System.out.print("�޴� ��ȣ�� �������� : ");
			int menuNum = sc.nextInt();
			
			sc.nextLine();
			switch (menuNum) {
			case 1 :
				System.out.print("������ ��ȭ ��ȣ : ");
				ec.modify(sc.nextLine());
				return;
			case 2 :
				System.out.print("������ ��� ���� : ");
				ec.modify(sc.nextInt());
				return;
			case 3 :
				System.out.print("������ ���ʽ� �� : ");
				ec.modify(sc.nextDouble());
				return;
			case 9 :
				System.out.println("���� �޴��� ���ư��ϴ�.");
				return;
			default : System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
			}
		}

	}
	
	public void deleteEmp() {
		ec.remove();
		System.out.println("������ ������ �����Ͽ����ϴ�.");
	}
	
	public void printEmp() {
		System.out.println(ec.inform());
	}

}
