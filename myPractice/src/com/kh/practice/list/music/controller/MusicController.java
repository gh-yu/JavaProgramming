package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.compare.DescSinger;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	ArrayList<Music> musicList = new ArrayList<Music>();
	
	public int addList(String title, String singer) {
		int result = 0;
													   // Collection.add(E e):boolean -> true if this collection changed as a result of the call
		if (musicList.add(new Music(title, singer))) { // add메소드 boolean값 반환 - 메소드 호출로 컬렉션이 변경되면 true반환
			result = 1;
		}
		
		return result;
	}

	public int addAtZero(String title, String singer) {
		
		// isEmpty() 메소드 - list에 담긴 객체가 없으면 true 반환 (Returns true if this list contains no elements)
						
//		if (!musicList.isEmpty()) { // list에 담긴 객체가 있으면? <- 이 조건 필요 없음
//			musicList.add(0, new Music(title, singer)); // ArrayList.add(int index, Music element)
//		}
		
		musicList.add(0, new Music(title, singer)); // ArrayList.add(int index, Music element):void
		return 1;
		
//		Music atZero = new Music(title, singer);
//		musicList.add(0, atZero);
//		if (musicList.get(0).equals(atZero)) {
//			return 1;
//		}
//		return 0;
		
//		musicList.add(0, new Music(title, singer));
//		if (musicList.get(0).equals(new Music(title, singer))) { // 이렇게 하면 객체 간 비교할 수 있도록 model.vo에서 equals메소드 오버라이딩해줘야함
//			return 1;
//		}
//		return 0;
	}

	public ArrayList<Music> printAll() {
		
		return musicList;
		
	}

	public Music searchMusic(String title) {
		
		Music m = null;
		for (int i = 0; i < musicList.size(); i++) {
			if (musicList.get(i).getTitle().equalsIgnoreCase(title)) { // 대소문자 상관없이 같은지 확인
				m = musicList.get(i);
			}
		}		
		return m;
	}

	public Music removeMusic(String title) {
		
		Music m = null;
		for (int i = 0; i < musicList.size();) { 
			if (musicList.get(i).getTitle().equalsIgnoreCase(title)) {
				m = musicList.get(i); // 삭제 전 객체로 초기화
				musicList.remove(musicList.get(i));
				i = 0; // 중복된 곡명 더 있을 수도 있으니 또 검색
			} else {
				i++; 
			}
		}
	
		return m;
		
//		Music[] m = new Music[musicList.size()]; // 삭제된 Music(객체)이 여러개일 경우를 대비해 객체배열 선언 및 할당 
//		int count = 0;
//		for (int i = 0; i < musicList.size();) { 
//			if (musicList.get(i).getTitle().equalsIgnoreCase(title)) {
//				m[count] = musicList.get(i);
//				count++;
//				musicList.remove(musicList.get(i));
//				i = 0; // 삭제되면 앞으로 밀리게 되기 때문에 인덱스 0부터 다시 검사
//			} else {
//				i++; 
//			}
//		}
//		
//		m = Arrays.copyOf(m, count);
//		return m;
		
	}
		

	public Music setMusic(String title, String setTitle, String setSinger) {
		Music m = null;
		for (int i = 0; i < musicList.size(); i++) { 
			if (musicList.get(i).getTitle().equalsIgnoreCase(title)) {
				m = musicList.get(i); // 수정 전 객체로 초기화
//				musicList.get(i).setTitle(setTitle);
//				musicList.get(i).setSinger(setSinger); // 이렇게 하면 m 반환했을때 필드 수정된 채로 반환됨
				musicList.set(i, new Music(setTitle, setSinger)); // ArrayList.set(int index, Music element):Music
																  // Replaces the element at the specified position in this list with the specified element.
			}
		}
		return m;
		
	}

	public int ascTitle() {
		Collections.sort(musicList, new AscTitle()); // Collections.sort(List<Music> list, Comparator<? super Music> c):Music
		return 1;
	}

	public int descSinger() {
		musicList.sort(new DescSinger()); // ArrayList.sort(Comparator<? super Music>:void
		return 1;
	}
	
	
}

