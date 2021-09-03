package com.kh.example.map.model.vo;

public class Snack {
	private String flavor;
	private int price;
	
	public Snack() {}
	public Snack(String flavor, int price) {
		this.flavor = flavor;
		this.price = price;
	}
	
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return flavor + "[" + price + "원]";
	}
	
	@Override
	public boolean equals(Object obj) {
		//객체에 접근
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		// 데이터에 접근
		Snack other = (Snack)obj;
		
		if (flavor == null) {
			if (other.flavor != null) { 
				return false;
			}
		} else if (!flavor.equals(other.flavor)) { // 내가 갖고 있는 falvor와 ohter가 갖고 있는 flavor가 같지 않다면
			return false;                          // false 반환(같지 않다)
		}
		if (price != other.price) {
			return false;
		}
		
		return true;
	
	}
	
	@Override
	public int hashCode() {
		
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + (flavor == null ? 0 : flavor.hashCode());
		result = PRIME * result + (int)price;
		
		return result; 
	}
	
	
}
