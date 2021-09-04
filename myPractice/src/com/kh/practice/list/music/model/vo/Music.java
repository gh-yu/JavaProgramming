package com.kh.practice.list.music.model.vo;

public class Music implements Comparable<Music> {

	private String title;
	private String singer;
	
	public Music() {}
	public Music(String title, String singer) {
//		this.setTitle(title); 
		this.title = title;
		this.singer = singer;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return singer + " - " + title;
	}
	
	@Override
	public int compareTo(Music o) {
		return title.compareTo(o.title); // 곡 명 오름차순 정렬
	}


}
