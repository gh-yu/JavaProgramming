package com.kh.example.chap01_encapsulation;

public class Account {
	// ��� ������ -> private : �ۿ��� �� �� ������ ������
	private String name = "������"; 
	private String phone = "010-1111-2222";
	private String pwd = "q1w2e3";
	private int bankCode = 3030;
	private int balance = 0; // �ܾ�
	
	// �Ա��� ���� �޼ҵ�
	public void deposit(int money) { // (int money) -> �����͸� �޾ƿ��� ����
		if (money > 0) {
			balance += money;
			System.out.println(name + "���� ���¿� " + money + "���� �ԱݵǾ����ϴ�.");
		} else {
			System.out.println("�߸��� �ݾ��� �ԷµǾ����ϴ�.");
		}
	}
	
	// ����� ���� �޼ҵ�
	public void withdraw(int money) {
		if (money <= balance) {
			balance -= money;
			System.out.println(name + "���� ���¿��� " + money + "���� ��ݵǾ����ϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�. �ܾ��� Ȯ���ϼ���.");
		}
	}
	
	// �ܾ� ��ȸ�� ���� �޼ҵ�
	public void displayBalance() { // �޼ҵ带 ������ �� ��ȣ �ȿ� �ƹ� �͵� �� �־����� ������ �� �޾ƿ�.
		System.out.println(name + "���� ���¿� �ܾ��� " + balance + "���Դϴ�.");
	}
	
}
