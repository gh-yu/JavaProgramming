package com.kh.example.chap06_method.model.vo;

public class Trainee {
	private String name;
	private final String ACADEMY = "KH";
	private char classRoom;
	private String time;
	public static double score;
	
	public Trainee() {}
	
	public Trainee(String name, char classRoom, String time, double score) {
		this.name = name;
		// ACADEMY�� ���� ���� ����? ACADEMY�� final����(=���)�̱� ������ �� ����x
		// 							�����ڿ��� ���ο� ������ �ʱ�ȭ�� �Ұ����ϱ� ������ ���ܵ�
		this.classRoom = classRoom;
		this.time = time;
//		this.score = score; // The static field Trainee.score should be accessed in a static way
		// this.score�� ��� �޽����� �ߴ� ����? this�� �ڽ��� �ּ� ���� ���� �ִ� ���۷��� ����(���� ����)
		//									�ּ� ���� ���´ٴ� ���� heap�޸� ������ ������ �����, �� ��ü�� ����ٴ� ��
		//									�ٽ� ����, this�� �����ϴ� ���� ��ü�� ����� �����ϴ� �Ͱ� ����
		//									static ����/�޼ҵ�� ��ü�� ����� �����ϴ°� �ƴ϶� Ŭ������. ���� �����ؾ��ϱ� ������ ��� �޽��� �ߴ� ��
		Trainee.score = score; // Ŭ������.static������ ���� �����ؾ���
	}
	
	public Trainee(char classRoom) {
		this.classRoom = classRoom;
	}
	
	
	public String inform() {
		return ACADEMY + " " + name + " �Ʒû��� "
				+ classRoom + time + "���̰�, ������ "
				+ score + "���Դϴ�.";
	}
	
	
	// ���ݱ����� �ʵ忡 �ִ� ���� �ʱ�ȭ �ϰ� ������ �Ű����� �ִ� �����ڸ� �̿��Ͽ���
	// �Ű����� �ִ� �����ڸ� �̿��Ͽ� ���� �� �ִ� ä�� ��ü�� ������µ�
	// ������ ���� �߸� ���� ���, ��� �����͸� ������ ���ΰ�?
	// -> �ʵ� �ϳ����� ���� �ִ� ��ü�� ����� ���� ������?
	// �Ϻ� �ʵ常 �����͸� ��ȸ�ϰ� ������ ��� �� ���ΰ�?
	
	// name�� ���� setter, getter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	// ACADEMY�� ���� getter (����� �� ���� �� ������ �� �ֱ� ������ setter�޼ҵ� ��� �Ұ�)
	public String getACADEY() {
		return ACADEMY;
	}
	
	// classRoom�� ���� setter, getter
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	public char getclassRoom() {
		return classRoom;
	}
	
	// time�� ���� setter, getter
	public void setTime(String time) {
		this.time = time;
	}
	public String getTime() {
		return time;
	}
	
	// score�� ���� setter, getter
	public static void setScore(double score) {
		Trainee.score = score; // score ������ static����(Ŭ���� ����), Ŭ������.������ �̷��� �Ἥ �����Ѵ�.
	}
	public static double getScore() {
		return score;
	}
}
