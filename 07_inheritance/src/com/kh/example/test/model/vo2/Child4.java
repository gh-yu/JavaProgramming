package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent; // ��Ӱ���� �ϴ��� �ٸ� ��Ű���� import����� ��

public class Child4 extends Parent{
	public Child4() {
//		super.num = 10; // private, ���� Ŭ���� �ƴ�
//		super.dNum = 0.0; // default, ���� ��Ű�� �ƴ�
		super.bool = false; // protected, ��Ӱ���o, �ٸ� ��Ű���� ���� ����
		super.ch = 'A'; // public�̶� ���� ����
		
	}
}
