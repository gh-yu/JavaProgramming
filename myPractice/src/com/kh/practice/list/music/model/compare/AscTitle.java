package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		
//		String standard = o1.getTitle();
//		String other = o2.getTitle();
//		int result = standard.compareTo(other);
		
//		int result = o1.getTitle().compareTo(o2.getTitle());  // 밑에 코드랑 결과 같음
		int result = o1.compareTo(o2); // Music클래스에서 comparTo()메소드 오버라이딩 -> title.comparTo().o.title 반환
		if (result == 0) { // 곡 제목이 같으면
			return o1.getSinger().compareTo(o2.getSinger()); // 가수 명으로 오름차순 정렬(1 리턴됨)
		} else {
			return result;
		}
	}

}
