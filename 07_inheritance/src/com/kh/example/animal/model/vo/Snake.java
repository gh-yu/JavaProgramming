package com.kh.example.animal.model.vo;

//		클래스 Snake는 상속한다 Animal을
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
//	public String inform() { // 오버라이딩 되어 있는 상태, but 완벽하게 오버라이딩 되었다고 말할 수 없음
//		return super.getName() + " "  + 
//				super.getAge() + " " +
//				super.getWeight() + " " + pattern;
////		return super.inform() + " " + pattern; // 부모 클래스(Animal) 객체의 inform() 메소드 사용해서 값 불러오기
//	}
	
//	@Override 
//	public String inform(String name) { // ctrl + space 눌러서 선택함
//		return super.inform() + " " + pattern;
//	}
	
	@Override
	public String toString() { // Animal 클래스에 있는 toString메소드 오버라이딩
		return super.toString() + " " + pattern;
	}
}
