package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	
	public Child1() {
		Parent p = new Parent();
//		p.Num = 10; // private ->  접근 불가
		p.dNum = 0.0; // default -> 같은 패키지 내 접근 가능
		p.bool = false; // protected -> 같은 패키지 내 접근 가능
						//            (상속 관계 아니라도 같은 패키지라 가능)
		p.ch = 'A'; // public
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}
	
}
