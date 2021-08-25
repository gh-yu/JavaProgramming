package com.kh.example.animal.model.vo;

//		Ŭ���� Snake�� ����Ѵ� Animal��
public class Snake extends Animal{
	
	private String pattern;
	
	public Snake() {}
	
	public Snake(String name, int age, double weight, String pattern) {
		super(name,age,weight);
		this.pattern = pattern;
	}
	
	
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
//	@Override 
//	public String inform() { // �������̵� �Ǿ� �ִ� ����, but �Ϻ��ϰ� �������̵� �Ǿ��ٰ� ���� �� ����
//		return super.getName() + " "  + 
//				super.getAge() + " " +
//				super.getWeight() + " " + pattern;
////		return super.inform() + " " + pattern; // �θ� Ŭ����(Animal) ��ü�� inform() �޼ҵ� ����ؼ� �� �ҷ�����
//	}
	
//	@Override 
//	public String inform(String name) { // ctrl + space ������ ������
//		return super.inform() + " " + pattern;
//	}
	
	@Override
	public String toString() { // Animal Ŭ������ �ִ� toString�޼ҵ� �������̵�
		return super.toString() + " " + pattern;
	}
}
