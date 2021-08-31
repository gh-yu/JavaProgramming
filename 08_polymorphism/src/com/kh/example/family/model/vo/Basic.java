package com.kh.example.family.mode.vo;

//import java.awt.event.MouseListener;
import java.io.Serializable;

// 인터페이스끼리도 상속 가능 : extends -> 다중 상속
public interface Basic extends Cloneable, Serializable{
	//						   	Marker interface
	//							: 내부에 선언된 메소드는 없고 이름만 있는 인터페이스
	//							: 메소드 구현(완성)이 목적이 아니라 클래스의 특성을 나타내주기 위함

	// Cloneable, Serializable와 같이 속이 비어있는 인터페이스를 
	// -> 이 인터페이스는 클론을 위한 거야 이렇게 표시할 때(Mark할 때) 사용
	
	
	public static final double PI = 3.14;
	String nation = "대한민국";
	// interface 안에 있는 필드는 묵시적으로 public static final
	
	public abstract void eat(); // 클래스 다이어그램에서 기울여서 나타내면 abstract
	void sleep();
	// interface 안에 있는 메소드는 묵시적으로 public abstract
	
}

