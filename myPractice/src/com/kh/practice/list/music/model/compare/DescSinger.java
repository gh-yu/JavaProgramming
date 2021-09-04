package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class DescSinger implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		return -o1.getSinger().compareTo(o2.getSinger());
	}
	
}
