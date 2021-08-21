package com.kh.practice.chap01.control;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		// �Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ "�����޴��Դϴ�"��, ���� ��ȣ�� ������ "���α׷��� ����˴ϴ�."�� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");	
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("�Է� �޴��Դϴ�.");
			break;
		case 2:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 3:
			System.out.println("��ȸ �޴��Դϴ�.");
			break;
		case 4:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 7:
			System.out.println("���α׷��� ����˴ϴ�.");
			break;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if (num > 0 && num % 2 == 0) {
			System.out.println("¦����");
		} else if (num % 2 == 1) {
			System.out.println("Ȧ����");
		} else {
			System.out.println("����� �Է����ּ���.");
		}
		
		// �ι�° ����
//		if (num > 0 && num % 2 == 0) {
//			System.out.println("¦����");
//		} else if (num > 0 && num % 2 != 0) {
//			System.out.println("Ȧ����");
//		} else {
//			System.out.println("����� �Է����ּ���.");
//		}
		
		// �ڵ� ���, �� �� ���� ������ �����ϸ� �����ϱ� ����
//		if (num > 0) {
//			if (num % 2 == 0) {
//				System.out.println("¦����");
//			} else {
//				System.out.println("Ȧ����");
//			} 
//		} else {
//			System.out.println("����� �Է����ּ���.");
//		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		System.out.print("�������� : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + eng);
			System.out.println("���� : " + math);
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + avg);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		String season = "";
		
		switch (month) {
		case 1 : case 2 : case 12 : 
			season = "�ܿ�";
			break;
		case 3 : case 4 : case 5 :
			season = "��";
			break;
		case 6 : case 7 : case 8 :
			season = "����";
			break;
		case 9 : case 10 : case 11 :
			season = "����";
			break;
		default :
//			System.out.println(month + "���� �߸� �Էµ� ���Դϴ�.");
			season = "�߸� �Էµ� ��";
		}
//		if (month > 0 && month < 13) {
			System.out.println(month + "���� " + season + "�Դϴ�.");
//		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		String id = "myId";
		String pwd = "myPassword12";
				
		System.out.print("���̵� : ");
		String userId = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String userPwd = sc.nextLine();
		
		if (id.equals(userId) && pwd.equals(userPwd)) {
			System.out.println("�α��� ����");
		} else if (!userId.equals("myId")) { // = id.equals(userId)
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		} else {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
		
//		if (id.equals(userId)) {
//			if (pwd.equals(userPwd)) {
//				System.out.println("�α��� ����");
//			} else {
//				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
//			}
//		} else {
//			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
//		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
//		String rating = sc.nextLine();
//		
//		String Admin = "ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�";
//		String Mem = "�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�";
//		String NonMem = "�Խñ� ��ȸ";
		
		// if~else if~else��
//		if (rating.equals("������")) {
//			System.out.println(Admin);
//		} else if (rating.equals("ȸ��")) {
//			System.out.println(Mem);
//		} else if (rating.equals("��ȸ��")) {
//			System.out.println(NonMem);
//		} else {
//			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//		}
		
		// �ڵ� ��� - switch�� 
		switch (sc.nextLine()) {
		case "������" :
			System.out.print("ȸ������, �Խñ� ���� ");
		case "ȸ��" :
			System.out.print("�Խñ� �ۼ�, ��� �ۼ� ");
		case "��ȸ��" :
			System.out.print("�Խñ� ��ȸ");
			break;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}	
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		

		if (height <= 0 || weight <= 0) { // height = 0 -> bmi : infinty => ����
										  // weight = 0 -> bmi : 0 => ��ü��
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else {
			double bmi = weight / (height * height);
			System.out.println("BMI ���� : " + bmi);
		
			if (bmi < 18.5) {
				System.out.println("��ü��");
			} else if (bmi < 23) {
					System.out.println("����ü��");
			} else if (bmi < 25) {
				System.out.println("��ü��");
			} else if (bmi < 30) {
				System.out.println("��");
			} else {
				System.out.println("�� ��");
			}
		}
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		char oper = sc.nextLine().charAt(0);
		
		double result = 0;
		if (num1 > 0 && num2 > 0) {
			switch (oper) {
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '/' : result = (double)num1 / num2; break;
			case '%' : result = num1 % num2; break;
			default : System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); return;
			}
			
			if (oper == '/') {
				System.out.printf("%d %c %d = %.6f", num1, oper, num2, result);
			} else {
				System.out.printf("%d %c %d = %d", num1, oper, num2, (int)result);
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ����� �Է����ּ���. ���α׷��� �����մϴ�.");
		}
		
	}
	
	public void practice9() {
		// �߰����, �⸻���, ��������, �⼮ȸ���� �Է��ϰ� Pass �Ǵ� Fail�� ����ϼ���.
		// �� ������ �߰���� 20%, �⸻��� 30%, ���� 30%, �⼮ 20%�� �̷���� �ְ�
		// �� ��, �⼮ ������ �⼮ ȸ���� �� ���� ȸ�� 20ȸ �߿��� �⼮�� ���� ���� ������ ����ϼ���
		// 70�� �̻��� ��� pass, 70�� �̸��̰ų� ��ü ������ 30% �Ἦ �� Fail�� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ���� : ");
		int midScore = sc.nextInt();
		System.out.print("�⸻ ��� ���� : ");
		int finalScore = sc.nextInt();
		System.out.print("���� ���� : ");
		int assignScore = sc.nextInt();
		System.out.print("�⼮ ȸ�� : ");
		int attendNum = sc.nextInt();
		
		int attendScore = attendNum * 5; // �⼮ ����(100�� ����), �� ���� ȸ�� 20 * 5 = 100
		
		System.out.println("=============== ��� ===============");
		
		if (attendScore <= 70) { // �⼮ ȸ�� �����ϸ� else �κ� ����x, �⼮ ���� 70�� ���� = 30% �̻� �Ἦ
			System.out.println("Fail [�⼮ ȸ�� ���� " + attendNum + "/20)]");
		} else {
			System.out.println("�߰� ��� ����(20) : " + midScore * 0.2);
			System.out.println("�⸻ ��� ����(30) : " + finalScore * 0.3);
			System.out.println("���� ����       (30) : " + assignScore * 0.3);
			System.out.println("�⼮ ����       (20) : " + attendScore * 0.2);
			
			double totalScore = (midScore * 0.2) + (finalScore * 0.3) + (assignScore * 0.3) + (attendScore * 0.2);
		
			System.out.println("���� : " + totalScore);
			
			if (totalScore >=  70) {
				System.out.println("PASS");
			} else if (totalScore < 70) {
				System.out.println("Fail [���� �̴�]");
			}
		}	
		
	}
	
	public void practice10() {
		// �տ� ������ �ǽ������� �����Ͽ� ������ �� �ִ� �޴�ȭ���� �����ϼ���.
		Scanner sc = new Scanner(System.in);
	
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");
		System.out.print("����  : ");
		int input = sc.nextInt();
		
		switch (input) {
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8(); break;
		case 9 : practice9(); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}
