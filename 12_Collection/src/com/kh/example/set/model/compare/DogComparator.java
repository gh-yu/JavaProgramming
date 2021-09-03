package com.kh.example.set.model.compare;

import java.util.Comparator;

import com.kh.example.set.model.vo.Dog;

public class DogComparator implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		String standard = o1.getName();
		String object = o2.getName();
		
		int result = standard.compareTo(object);
		if (result == 0) { // 이름이 같은 경우
			Double standardWeight = o1.getWeight(); // 비교주체의 무게
			Double objectdWeight = o2.getWeight();  // 비교대상의 무게
			return standardWeight.compareTo(objectdWeight); // 비교주체의 무게와 비교대상의 무게를 비교해서 오름차순으로 정렬
		} else {
			return result;
		}
	}

}
