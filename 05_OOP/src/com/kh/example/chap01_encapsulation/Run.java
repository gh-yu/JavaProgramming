package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account a = new Account();
		a.displayBalance();
		
		a.deposit(1000000); // deposit 메소드 호출할 때  정의된 대로 int값 1개 넘겨줘야 함
		a.displayBalance();
		
		a.deposit(1500000);
		a.displayBalance();
		
		a.withdraw(500000);
		a.displayBalance();
		
//		a.balance -= 5000000; // 괴도가 데이터에 접근해 500만원 빼감 -> 마이너스 잔액 됨, 외부에서 내 데이터에 접근 못하게 캡슐을 씌워야 함
		// 멤버변수 balance에 private 앞에 붙여줌 : 접근 제한
		// 오류 발생 -> The field Account.balance is not visible
		// 데이터 변경 불가능
		
		a.withdraw(100000);
		a.displayBalance(); 
		
	}
}
