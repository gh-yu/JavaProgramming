package com.kh.practice.generics.model.vo;

public class Farm {
	
	private String kind;
	
	public Farm() {}
	public Farm(String kind) {
//		setKind(kind);
		this.kind = kind;
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
}
