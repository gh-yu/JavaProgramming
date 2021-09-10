package com.kh.practice.map.model.vo;

public class Member {

	private String password;
	private String name;
	
	public Member() {}
	public Member(String password, String name) {
		this.setPassword(password);
		this.setName(name);
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
//		return password + "(" + name + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		// 객체 접근
		if (this == obj) {
			return true; 
		} else if (obj == null) {
				return false;
		} if (this.getClass() != obj.getClass()) { 
		// this.getClass():class 클래스 풀네임 반환-> 출력 결과 : class com.kh.practice.map.model.vo.Member
			return false; 
		}
		
		// 필드(데이터 접근
		Member other = (Member)obj;
		
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
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
		result = result * PRIME + (password == null ? 0 : password.hashCode());
		result = result * PRIME + (name == null ? 0 : name.hashCode());
		return result;
	}

}
