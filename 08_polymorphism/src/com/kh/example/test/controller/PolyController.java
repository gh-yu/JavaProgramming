package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class PolyController {
	public void method() {
		System.out.println("1. 부모타입 레퍼런스로 부모 객체 다루는 경우");
		Parent p1 = new Parent();
		// ㄴ부모타입 레퍼런스 ㄴ 부모 객체
		p1.printParent();

		System.out.println("2. 자식타입 레퍼런스로 자식 객체 다루는 경우");
		Child1 c1 = new Child1();
		// ㄴ자식타입 레퍼런스 ㄴ자식 객체
		c1.printChild1();
		c1.printParent();

		System.out.println("3. 부모타입 레퍼런스로 자식 객체 다루는 경우");
		Parent p2 = new Child2(); // 다형성 적용
		// ㄴ부모타입 레퍼런스 ㄴ자식 객체
		// 업 캐스팅 : 부모타입의 참조형 변수가 모든 자식 객체를 받을 수 있는 것
		p2.printParent(); // p2. 했을때 printChild2 메소드는 뜨지 않는다
//		p2.printChild2(); // 빨간 줄 에러 뜸, Parent타입이라 Parent에 대한 것만  보임
		((Child2) p2).printChild2(); // 레퍼런스 변수 앞에 클래스 형변환 -> Child2까지 시야 확장

		System.out.println("4. 자식타입 레퍼런스로 부모 객체 다루는 경우");
//		Child2 c2 = new Parent(); // 자식타입 레퍼런스 변수는 부모 객체를 받아줄 수 없어 에러 뜸
		// ㄴ자식타입 레퍼런스 ㄴ부모 객체
		// 내가 지금 보고자 하는건 Child2만큼의 객체인데 Heap메모리 영역에
		// Parent에 대한 객체 공간 생성하면 충족할 수 없음(Child2가 더 많은 것을 가지고 있음)ㄴ
		// 원하는 걸 맞춰줄 수 없기 때문에 적용 불가
//		Child2 c2 = (Child2)(new Parent());
//		Child2 c2 = (Child2)p1;

		Parent[] pArr = new Parent[4];
		// 업캐스팅 적용된 상태
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child2();
		pArr[3] = new Child1();

//		((Child1)pArr[0]).printChild1(); 
//		((Child2)pArr[1]).printChild2();
//		((Child2)pArr[2]).printChild2();
//		((Child1)pArr[3]).printChild1(); 
		
		System.out.println();
		System.out.println("== 간단 예제 ==");
		System.out.println();
		
		for (int i = 0; i < pArr.length; i++) {
		// instanceof 연산자 : 현재의 참조형 변수가 어떤 클래스형의 객체를 참조하고 있는지 확인할 때 사용
//		pArr[0].instanceof Child1 // pArr[0]에 들어가있는  객체가 Child1 타입이니? true
//		pArr[1].instanceof Child2 // pArr[1]에 들어가있는 객체가 Child2 타입이니? ture
//		pArr[2].instanceof Child1 // pArr[2]에 들어가있는  객체가 Child2 타입이니? false 
//		pArr[3].instanceof Child2 // pArr[3]에 들어가있는  객체가 Child1 타입이니? false				// instanceof 연산자의 결과 값은 true/false -> 조건식에 많이 사용
		// instanceof 연산자의 결과 값은 true/false -> 조건식에 많이 사용
			
			if (pArr[i] instanceof Child1) { // pArr[i]에 들어가있는 객체의 참조변수가 가리키는 객체가 Child1의 타입이니?
				((Child1)pArr[i]).printChild1();  
			} else if (pArr[i] instanceof Child2) {
				((Child2)pArr[i]).printChild2();
			}

		}
		
		System.out.println();
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i].print(); // print메소드는 Child1, Child2에서 재작성(오버라이딩)함
							 // 실행시켰을때, Parent클래스의 print메소드가 아닌 자식 객체의 메소드가 호출됨 
		}
	}

}
