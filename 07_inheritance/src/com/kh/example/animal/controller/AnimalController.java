package com.kh.example.animal.controller;

import com.kh.example.animal.model.vo.Animal;
import com.kh.example.animal.model.vo.Dog;
import com.kh.example.animal.model.vo.Snake;

public class AnimalController {
	public void method() {
		Animal a = new Animal("강아지", 9, 6.3);
//		System.out.println(a.inform());
//		System.out.println(a.toString());
		System.out.println(a); // a라는 참조변수에 Animal클래스의 객체를 담아놓음. 그러면 a에는 주소값이 뜰 것
							   // but, 출력했을때 주소값이 안 뜨고 toString메소드를 불러온 결과가 출력됨
							   // 강아지 9 6.3 이 출력됨
							   // toString메소드 기능 :  그 객체에 대한 대표값을 문자열 형식으로 반환
							   // toString메소드 오버라이딩(부모 클래스의 메소드 재작성)해서 대표값인 주소값 대신 다른 반환값 설정하여 반환  
		Dog d = new Dog();
		d.setName("초코");
		d.setAge(1);
		d.setWeight(5.2);
		d.setHeight(50);
		d.setHair("장모");
//		System.out.println(d.inform());
//		System.out.println(d.toString());
		System.out.println(d);
		
		Dog d2 = new Dog("딸기", 2, 2.5, 30, "단모");
//		System.out.println(d2.inform());
//		System.out.println(d2.toString()); // 생성자 안에 this.height = height; this.hair = hair; 코드만 존재
										 // name, age, weight은 기본값 출력됨 <- Dog 생성자 안에 해당 (부모)필드 초기화하고 있지 않아서 
									     // super.setName(name); 생성자 안에 부모클래스의 메소드 사용해서 (부모)필드값 초기화
									     // 또는 super(name, age, weight); 부모 생성자 호출, 위처럼 따로할 필요 없이 생성자로 한 번에 값 세팅
		System.out.println(d2);
		
		
		Snake s = new Snake();
		s.setName("방울이");
		s.setAge(1);
		s.setWeight(6.3);
		s.setPattern("육각");
		System.out.println(s.toString());
		
		Snake s2 = new Snake("비단이", 2, 3.6, "빗살");
//		System.out.println(s2.inform());
//		System.out.println(s2.toString());
		System.out.println(s2);
	
	
	}	
}
