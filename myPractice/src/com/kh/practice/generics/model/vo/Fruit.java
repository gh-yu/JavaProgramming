package com.kh.practice.generics.model.vo;

public class Fruit extends Farm {

	private String name;
	
	public Fruit() {}
	public Fruit(String kind, String name) {
//		setKind(kind);
		super(kind);
		this.name = name; 
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
