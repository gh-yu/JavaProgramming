package com.kh.example.test.model.vo;

//     Ŭ���� Chid2�� ��ӹ޴´� ParentŬ������
public class Child2 extends Parent {
	private String str;
	
	public Child2() {
//		super.num = 10; // private ->  ���� �Ұ�
		super.dNum = 0.0; // default -> ���� ��Ű�� �� ���� ����
		super.bool = false; // protected -> ���� ��Ű�� �� ���� ���� 
						    //              (��� �����̱� ������ �ٸ� ��Ű������ ���� ����)
		super.ch = 'A'; // public
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}

}
