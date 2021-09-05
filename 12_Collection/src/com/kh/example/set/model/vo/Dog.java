package com.kh.example.set.model.vo;

public class Dog implements Comparable<Dog>{
	private String name;
	private double weight;
	
	public Dog() {}
	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return name + "(" + weight + "kg)";
	}
	
	@Override
	public boolean equals(Object obj) { // ObjectŬ����(�θ����� Ŭ����)�� �Ű����� obj�� DogŬ������ ��ü �ּҰ� �޾���(��ĳ����)
		
		// ��ü�� ����
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		
		// �����Ϳ� ����
		Dog other = (Dog)obj; // �Ű������� ���� Object�� ��ü�� Dog���� �����(�ٿ�ĳ����) 
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) { // ���� �ʴٸ� false��ȯ(�ߺ� x��� ��)
			return false;
		}
		
		if (weight != other.weight) {
			return false;
		}
		
		
		return true;
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + (name == null ? 0 : name.hashCode());
		result = PRIME * result + (int)weight;
		
		return result;
	}
	
	@Override
	public int compareTo(Dog o) {
		double object = o.weight;
		
		
		if (weight > object) {
			return -1; // 1�� �����ϸ� ��������, -1�� �����ϸ� ��������
		} else if (weight == object) {
			return 0;
		} else {
			return 1;
		}
		
		// �����ڷ��� double�� �޼ҵ� ����� ���� WapperŬ���� �̿��ؼ� ����ڽ�����
//		Double standard = weight; 
//		Double object = o.weight;
//		return -standard.compareTo(object);

	}	
	
}
