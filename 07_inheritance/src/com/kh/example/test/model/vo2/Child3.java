package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;

public class Child3 {
	public Child3() {
		Parent p = new Parent(); // ��Ӱ���x, �����Ϸ��� ��ü ����
//		p.num = 10; // private, ���� Ŭ���� �ƴ�
//		p.dNum = 0.0; // default, ���� ��Ű�� �ƴ�
//		p.bool = false; // protected, ��Ӱ���x, ���� ��Ű�� �ƴ�
		p.ch = 'A'; // public�̶� ���� ����
	}
}
