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
		
		Fruit other = (Fruit)obj;
		
//		if (super.getKind() == null) {
//			if (other.getKind() != null) {
//				return false;
//			}
//		} else if (super.getKind().equals(other.getKind())) {
//			return false;
//		}
		
		if (!super.equals(obj)) {
			return false;
		}

		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}

		return true;
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
//		result = result * PRIME + (super.getKind() == null? 0 : super.getKind().hashCode());
		result = super.hashCode();
		result = result * PRIME + (name == null ? 0 : name.hashCode());
		return super.hashCode();
	}

}
