package com.kh.example.animal.model.vo;

//	   	Ŭ���� Dog�� ����Ѵ� Animal��
public class Dog extends Animal{ // Dog�� Snake���� �ߺ��Ǵ� �κ� ���ְ� AnimalŬ������ �Ѳ����� �ۼ�

	private double height;
	private String hair;
	
	public Dog() {}
	
	public Dog(String name, int age, double weight, double height, String hair) {
//		super.setName(name); // super. ���� �θ� �޼ҵ� ȣ���ؼ� �ʵ� �� ����
//		super.setAge(age);
//		super.setWeight(weight);
		super(name, age, weight); // �θ� ������ ȣ��, ��ó�� ������ �ʿ� ���� �����ڷ� �� ���� �� ����
		this.height = height;
		this.hair = hair;
	}

	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String getHair() {
		return hair;
	}
	public void setHair(String hair) {
		this.hair = hair;
	}
	
//	public String inform() {
//		return super.getName() + " "  + 
//				super.getAge() + " " +
//				super.getWeight() + " " + height + " " + hair;
//				// super. : �θ� ��ü�� ����Ű�� ���� ���� 
//				// super. ���� �θ� Ŭ���� ��ü �����ؼ� �޼ҵ� ȣ��(�θ�Ŭ���� ���� �ִ� �ʵ尪 ��ȯ��)
//				// super.name ���δ� ��� �Ұ�, ��? name ���������ڰ� private�̶� �ٸ� Ŭ�������� ���� �Ұ���(�ڽ��� Ŭ���� �������� ���� ����)
//	}
	
//	@Override
//	public String inform() { // ctrl + space ������ ������	
//		return super.inform() + " " + height + " " + hair;
//	}
	
	@Override
		public String toString() { // Animal Ŭ������ �ִ� toString�޼ҵ� �������̵�
			return super.toString() + " " + height + " " + hair;
		}
	
}
