package com.kh.practice.generics.model.vo;

public class Vegetable extends Farm{

	private String name;
	
	public Vegetable() {}
	public Vegetable(String kind, String name) {
		super(kind);
		this.name = name; 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return super.toString() + ": " + name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} 
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		Vegetable other = (Vegetable)obj;		

		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}

		if (!super.equals(obj)) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = super.hashCode();
		result = result * PRIME + (name == null ? 0 : name.hashCode());
		return super.hashCode();
	}

}
