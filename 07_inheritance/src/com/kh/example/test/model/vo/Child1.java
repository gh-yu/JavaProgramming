package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	
	public Child1() {
		Parent p = new Parent();
//		p.Num = 10; // private ->  ���� �Ұ�
		p.dNum = 0.0; // default -> ���� ��Ű�� �� ���� ����
		p.bool = false; // protected -> ���� ��Ű�� �� ���� ����
						//            (��� ���� �ƴ϶� ���� ��Ű���� ����)
		p.ch = 'A'; // public
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}
	
}
