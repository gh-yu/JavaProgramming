package com.kh.example.test.model.vo;

//     클래스 Chid2는 상속받는다 Parent클래스를
public class Child2 extends Parent {
	private String str;
	
	public Child2() {
//		super.num = 10; // private ->  접근 불가
		super.dNum = 0.0; // default -> 같은 패키지 내 접근 가능
		super.bool = false; // protected -> 같은 패키지 내 접근 가능 
						    //              (상속 관계이기 때문에 다른 패키지여도 접근 가능)
		super.ch = 'A'; // public
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}

}
