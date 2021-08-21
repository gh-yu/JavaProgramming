package com.kh.example.chap05_constructor.run;

import java.util.Date;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		User u1 = new User(); // User() -> �⺻ ������(�Ű����� ����), ��ü ������ �� �� �̿�		
//		System.out.println("u1 : " + u1); 
		u1.inform(); // �⺻���� null, null, null, null ��µ�
		
		// ��ü ���� �� �޼ҵ带 ���� �Ű������� �޾Ƽ� ������ �����Ű�°� �ƴ϶�
		// ��ü ������ ���ÿ� ������ �����ų �� �ֵ��� �Ű����� �ִ� ������ ���� ���� �̿��Ͽ� ��ä ����
		User u2 = new User("user01", "pas01", "���ǰ�", new Date());
//		System.out.println("u2 : " + u2);
		u2.inform();
		
		User u3 = new User("user02", "pas02", "������");
//		System.out.println("u3 : " + u3);
		u3.inform();
		
		User u4 = new User("user04", "pas04");
//		System.out.println("u4 : " + u4);
		u4.inform();
	}

}
