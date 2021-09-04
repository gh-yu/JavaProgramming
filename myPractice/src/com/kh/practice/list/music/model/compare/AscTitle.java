package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		
//		String standard = o1.getTitle();
//		String other = o2.getTitle();
//		int result = standard.compareTo(other);
		
//		int result = o1.getTitle().compareTo(o2.getTitle());  // �ؿ� �ڵ�� ��� ����
		int result = o1.compareTo(o2); // MusicŬ�������� comparTo()�޼ҵ� �������̵� -> title.comparTo().o.title ��ȯ
		if (result == 0) { // �� ������ ������
			return o1.getSinger().compareTo(o2.getSinger()); // ���� ������ �������� ����(1 ���ϵ�)
		} else {
			return result;
		}
	}

}
