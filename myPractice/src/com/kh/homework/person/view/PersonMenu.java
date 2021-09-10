package com.kh.homework.person.view;

import java.util.Scanner;

import com.kh.homework.person.model.vo.Employee;
import com.kh.homework.person.controller.PersonController;
import com.kh.homework.person.model.vo.Student;

public class PersonMenu {

	PersonController pc = new PersonController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		while (true) {
			System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.");
			int[] pNum = pc.personCount(); // �ε��� 0���� ����� �л� ��, �ε��� 1���� ����� ��� �� ����Ǿ� ����
			System.out.println("���� ����� �л��� " + pNum[0] + "���Դϴ�.");
			System.out.println("����� �ִ� 10����� ������ �� �ֽ��ϴ�.");
			System.out.println("���� ����� ����� " + pNum[1] + "���Դϴ�.");
			
			System.out.println("1. �л� �޴�");
			System.out.println("2. ��� �޴�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ ���� : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			if (menuNum == 1) {
				studentMenu();
			} else if (menuNum == 2) {
				employeeMenu();
			} else if (menuNum == 9) {
				System.out.println("�����մϴ�.");
				return;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}

	}
	
	private void studentMenu() {
		while (true) {
			System.out.println("1. �л� �߰�");
			System.out.println("2. �л� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ ���� : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			int check = 0;
			if (menuNum == 1 && check == 0) {
				if (pc.personCount()[0] < 3) { 
					insertStudent();
				} else {
					System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
					check = menuNum;
				}

			} else if (menuNum == 2) {
				printStudent();
			} else if (menuNum == 9) {
				System.out.println("�������� ���ư��ϴ�.");
				return;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	private void employeeMenu() {
		while (true) {
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ ���� : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			int check = 0;
			if (menuNum == 1 && check == 0) {
				if (pc.personCount()[1] < 10) {
					insertEmployee();
				} else {
					System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
					check = menuNum;
				}

			} else if (menuNum == 2) {
				printEmployee();
			} else if (menuNum == 9) {
				System.out.println("�������� ���ư��ϴ�.");
				return;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}

	private void insertStudent() {
		
		while (true) {
			System.out.print("�л� �̸� : ");
			String name = sc.nextLine();
			System.out.print("�л� ���� : ");
			int age = Integer.parseInt(sc.nextLine());
			System.out.print("�л� Ű : ");
			double height = Double.parseDouble(sc.nextLine());
			System.out.print("�л� ������ : ");
			double weight = Double.parseDouble(sc.nextLine());
			System.out.print("�л� �г� : ");
			int grade = Integer.parseInt(sc.nextLine());
			System.out.print("�л� ���� : ");
			String major = sc.nextLine();
			
			pc.insertStudent(name, age, height, weight, grade, major);
			if (pc.personCount()[0] < 3) {
				System.out.println("�׸��Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
				char user = sc.nextLine().toLowerCase().charAt(0);
				if (user == 'n') {
					break;
				}
			} else {
				System.out.println("�л� �޴��� ���ư��ϴ�.");
				return;
			}
		}

	}

	private void printStudent() {
		Student[] s = pc.printStudent();
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) { 
				System.out.println(s[i]);
			}
		}
	}

	private void insertEmployee() {
		
		while (true) {
			System.out.print("��� �̸� : ");
			String name = sc.nextLine();
			System.out.print("��� ���� : ");
			int age = Integer.parseInt(sc.nextLine());
			System.out.print("��� Ű : ");
			double height = Double.parseDouble(sc.nextLine());
			System.out.print("��� ������ : ");
			double weight = Double.parseDouble(sc.nextLine());
			System.out.print("��� �޿� : ");
			int salary = Integer.parseInt(sc.nextLine());
			System.out.print("��� �μ� : ");
			String department = sc.nextLine();
			
			pc.insertEmployee(name, age, height, weight, salary, department);
			if (pc.personCount()[1] < 10) {
				System.out.println("�׸��Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
				char user = sc.nextLine().toLowerCase().charAt(0);
				if (user == 'n') {
					break;
				}
			} else {
				System.out.println("��� �޴��� ���ư��ϴ�.");
				return;
			}
		}
	}

	private void printEmployee() {
		
		Employee[] e = pc.printEmployee();
		
		for (int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				System.out.println(e[i]);
			}
		}
	}
	
}
