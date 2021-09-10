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
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			int[] pNum = pc.personCount(); // 인덱스 0에는 저장된 학생 수, 인덱스 1에는 저장된 사원 수 저장되어 있음
			System.out.println("현재 저장된 학생은 " + pNum[0] + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pNum[1] + "명입니다.");
			
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			if (menuNum == 1) {
				studentMenu();
			} else if (menuNum == 2) {
				employeeMenu();
			} else if (menuNum == 9) {
				System.out.println("종료합니다.");
				return;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}

	}
	
	private void studentMenu() {
		while (true) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			int check = 0;
			if (menuNum == 1 && check == 0) {
				if (pc.personCount()[0] < 3) { 
					insertStudent();
				} else {
					System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
					check = menuNum;
				}

			} else if (menuNum == 2) {
				printStudent();
			} else if (menuNum == 9) {
				System.out.println("메인으로 돌아갑니다.");
				return;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	private void employeeMenu() {
		while (true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 선택 : ");
			int menuNum = Integer.parseInt(sc.nextLine());
			
			int check = 0;
			if (menuNum == 1 && check == 0) {
				if (pc.personCount()[1] < 10) {
					insertEmployee();
				} else {
					System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
					check = menuNum;
				}

			} else if (menuNum == 2) {
				printEmployee();
			} else if (menuNum == 9) {
				System.out.println("메인으로 돌아갑니다.");
				return;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	private void insertStudent() {
		
		while (true) {
			System.out.print("학생 이름 : ");
			String name = sc.nextLine();
			System.out.print("학생 나이 : ");
			int age = Integer.parseInt(sc.nextLine());
			System.out.print("학생 키 : ");
			double height = Double.parseDouble(sc.nextLine());
			System.out.print("학생 몸무게 : ");
			double weight = Double.parseDouble(sc.nextLine());
			System.out.print("학생 학년 : ");
			int grade = Integer.parseInt(sc.nextLine());
			System.out.print("학생 전공 : ");
			String major = sc.nextLine();
			
			pc.insertStudent(name, age, height, weight, grade, major);
			if (pc.personCount()[0] < 3) {
				System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				char user = sc.nextLine().toLowerCase().charAt(0);
				if (user == 'n') {
					break;
				}
			} else {
				System.out.println("학생 메뉴로 돌아갑니다.");
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
			System.out.print("사원 이름 : ");
			String name = sc.nextLine();
			System.out.print("사원 나이 : ");
			int age = Integer.parseInt(sc.nextLine());
			System.out.print("사원 키 : ");
			double height = Double.parseDouble(sc.nextLine());
			System.out.print("사원 몸무게 : ");
			double weight = Double.parseDouble(sc.nextLine());
			System.out.print("사원 급여 : ");
			int salary = Integer.parseInt(sc.nextLine());
			System.out.print("사원 부서 : ");
			String department = sc.nextLine();
			
			pc.insertEmployee(name, age, height, weight, salary, department);
			if (pc.personCount()[1] < 10) {
				System.out.println("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				char user = sc.nextLine().toLowerCase().charAt(0);
				if (user == 'n') {
					break;
				}
			} else {
				System.out.println("사원 메뉴로 돌아갑니다.");
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
