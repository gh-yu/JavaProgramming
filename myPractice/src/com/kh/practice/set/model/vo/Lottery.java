package com.kh.practice.set.model.vo;

public class Lottery {
	private String name;
	private String phone;
	
	public Lottery() {}
	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return name + "(" + phone + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		// 객체 측면
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} 
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		// 필드(데이터) 측면
		Lottery other = (Lottery)obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) { // 두 비교 대상의 name 값이 같지 않으면
			return false;
		} 
		if (phone == null) {
			if (other.phone != null) {
				return false;
			}
		} else if (!phone.equals(other.phone)) { // 두 비교 대상의 phone 값이 같지 않으면
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + (name == null ? 0 : name.hashCode());
		result = PRIME * result + (phone == null ? 0 : phone.hashCode());
		
		return result;
	}


}
