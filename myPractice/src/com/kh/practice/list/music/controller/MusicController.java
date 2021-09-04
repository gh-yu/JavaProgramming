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
		if (musicList.add(new Music(title, singer))) { // add�޼ҵ� boolean�� ��ȯ - �޼ҵ� ȣ��� �÷����� ����Ǹ� true��ȯ
			result = 1;
		}
		
		return result;
	}

	public int addAtZero(String title, String singer) {
		
		// isEmpty() �޼ҵ� - list�� ��� ��ü�� ������ true ��ȯ (Returns true if this list contains no elements)
						
//		if (!musicList.isEmpty()) { // list�� ��� ��ü�� ������? <- �� ���� �ʿ� ����
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
//		if (musicList.get(0).equals(new Music(title, singer))) { // �̷��� �ϸ� ��ü �� ���� �� �ֵ��� model.vo���� equals�޼ҵ� �������̵��������
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
			if (musicList.get(i).getTitle().equalsIgnoreCase(title)) { // ��ҹ��� ������� ������ Ȯ��
				m = musicList.get(i);
			}
		}		
		return m;
	}

	public Music removeMusic(String title) {
		
		Music m = null;
		for (int i = 0; i < musicList.size();) { 
			if (musicList.get(i).getTitle().equalsIgnoreCase(title)) {
				m = musicList.get(i); // ���� �� ��ü�� �ʱ�ȭ
				musicList.remove(musicList.get(i));
				i = 0; // �ߺ��� ��� �� ���� ���� ������ �� �˻�
			} else {
				i++; 
			}
		}
	
		return m;
		
//		Music[] m = new Music[musicList.size()]; // ������ Music(��ü)�� �������� ��츦 ����� ��ü�迭 ���� �� �Ҵ� 
//		int count = 0;
//		for (int i = 0; i < musicList.size();) { 
//			if (musicList.get(i).getTitle().equalsIgnoreCase(title)) {
//				m[count] = musicList.get(i);
//				count++;
//				musicList.remove(musicList.get(i));
//				i = 0; // �����Ǹ� ������ �и��� �Ǳ� ������ �ε��� 0���� �ٽ� �˻�
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
				m = musicList.get(i); // ���� �� ��ü�� �ʱ�ȭ
//				musicList.get(i).setTitle(setTitle);
//				musicList.get(i).setSinger(setSinger); // �̷��� �ϸ� m ��ȯ������ �ʵ� ������ ä�� ��ȯ��
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

