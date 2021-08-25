package com.kh.homework.employee.view;

import java.util.Scanner;

import com.kh.homework.employee.controller.EmployeeController;

public class EmployeeMenu {
	Scanner sc = new Scanner(System.in) ;
	
	EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() { // 메인 메뉴를 출력하는 기본 생성자
	
		int menuNum = 0;
		boolean check = false;
		while (menuNum != 9) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");
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
					System.out.println("수정할 사원 데이터가 없습니다.");
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
					System.out.println("사원 데이터가 없습니다.");
				}
				break; 
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		}
	
	}
	
	public void insertEmp() {
		
		System.out.print("사원 번호 : ");
		int empNo = sc.nextInt();
		sc.nextLine();
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		System.out.print("사원 성별 : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("전화 번호 : ");
		String phone = sc.nextLine();
		
		while (true) {
			System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
			char input = sc.nextLine().charAt(0);
			
			if (input == 'y' || input == 'Y') {
				System.out.print("사원 부서 : ");
				String dept = sc.nextLine();
				System.out.print("사원 연봉 : ");
				int salary = sc.nextInt();
				System.out.print("보너스 율 : ");
				double bonus = sc.nextDouble();
				ec.add(empNo, name, gender, phone, dept, salary, bonus);
				return;
				
			} else if (input == 'n'|| input == 'N') {
				ec.add(empNo, name, gender, phone);
				return;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}	
		
	}
	
	public void updateEmp() {

		
		while (true) {
			System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
			System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
			System.out.println("1. 전화 번호");
			System.out.println("2. 사원 연봉");
			System.out.println("3. 보너스 율");
			System.out.println("9. 돌아가기");
			System.out.print("메뉴 번호를 누르세요 : ");
			int menuNum = sc.nextInt();
			
			sc.nextLine();
			switch (menuNum) {
			case 1 :
				System.out.print("수정할 전화 번호 : ");
				ec.modify(sc.nextLine());
				return;
			case 2 :
				System.out.print("수정할 사원 연봉 : ");
				ec.modify(sc.nextInt());
				return;
			case 3 :
				System.out.print("수정할 보너스 율 : ");
				ec.modify(sc.nextDouble());
				return;
			case 9 :
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			default : System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		}

	}
	
	public void deleteEmp() {
		ec.remove();
		System.out.println("데이터 삭제에 성공하였습니다.");
	}
	
	public void printEmp() {
		System.out.println(ec.inform());
	}

}
