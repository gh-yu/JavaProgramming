package com.kh.example.family.mode.vo;

//import java.awt.event.MouseListener;
import java.io.Serializable;

// �������̽������� ��� ���� : extends -> ���� ���
public interface Basic extends Cloneable, Serializable{
	//						   	Marker interface
	//							: ���ο� ����� �޼ҵ�� ���� �̸��� �ִ� �������̽�
	//							: �޼ҵ� ����(�ϼ�)�� ������ �ƴ϶� Ŭ������ Ư���� ��Ÿ���ֱ� ����

	// Cloneable, Serializable�� ���� ���� ����ִ� �������̽��� 
	// -> �� �������̽��� Ŭ���� ���� �ž� �̷��� ǥ���� ��(Mark�� ��) ���
	
	
	public static final double PI = 3.14;
	String nation = "���ѹα�";
	// interface �ȿ� �ִ� �ʵ�� ���������� public static final
	
	public abstract void eat(); // Ŭ���� ���̾�׷����� ��￩�� ��Ÿ���� abstract
	void sleep();
	// interface �ȿ� �ִ� �޼ҵ�� ���������� public abstract
	
}

