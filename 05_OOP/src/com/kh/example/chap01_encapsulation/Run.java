package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account a = new Account();
		a.displayBalance();
		
		a.deposit(1000000); // deposit �޼ҵ� ȣ���� ��  ���ǵ� ��� int�� 1�� �Ѱ���� ��
		a.displayBalance();
		
		a.deposit(1500000);
		a.displayBalance();
		
		a.withdraw(500000);
		a.displayBalance();
		
//		a.balance -= 5000000; // ������ �����Ϳ� ������ 500���� ���� -> ���̳ʽ� �ܾ� ��, �ܺο��� �� �����Ϳ� ���� ���ϰ� ĸ���� ������ ��
		// ������� balance�� private �տ� �ٿ��� : ���� ����
		// ���� �߻� -> The field Account.balance is not visible
		// ������ ���� �Ұ���
		
		a.withdraw(100000);
		a.displayBalance(); 
		
	}
}
