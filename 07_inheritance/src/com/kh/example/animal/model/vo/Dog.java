package com.kh.example.animal.model.vo;

//	   	클래스 Dog는 상속한다 Animal을
public class Dog extends Animal{ // Dog와 Snake에서 중복되는 부분 없애고 Animal클래스에 한꺼번에 작성

	private double height;
	private String hair;
	
	public Dog() {}
	
	public Dog(String name, int age, double weight, double height, String hair) {
//		super.setName(name); // super. 으로 부모 메소드 호출해서 필드 값 세팅
//		super.setAge(age);
//		super.setWeight(weight);
		super(name, age, weight); // 부모 생성자 호출, 위처럼 따로할 필요 없이 생성자로 한 번에 값 세팅
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
//				// super. : 부모 객체를 가리키는 참조 변수 
//				// super. 으로 부모 클래스 객체 접근해서 메소드 호출(부모클래스 내에 있는 필드값 반환됨)
//				// super.name 으로는 사용 불가, 왜? name 접근제한자가 private이라서 다른 클래스에서 접근 불가능(자신의 클래스 내에서만 접근 가능)
//	}
	
//	@Override
//	public String inform() { // ctrl + space 눌러서 선택함	
//		return super.inform() + " " + height + " " + hair;
//	}
	
	@Override
		public String toString() { // Animal 클래스에 있는 toString메소드 오버라이딩
			return super.toString() + " " + height + " " + hair;
		}
	
}
