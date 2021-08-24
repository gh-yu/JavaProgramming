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
		// ACADEMY가 들어가지 않은 이유? ACADEMY는 final변수(=상수)이기 때문에 값 변경x
		// 							생성자에서 새로운 값으로 초기화가 불가능하기 때문에 제외됨
		this.classRoom = classRoom;
		this.time = time;
//		this.score = score; // The static field Trainee.score should be accessed in a static way
		// this.score에 경고성 메시지가 뜨는 이유? this는 자신의 주소 값을 갖고 있는 레퍼런스 변수(참조 변수)
		//									주소 값을 갖는다는 말을 heap메모리 영역에 공간이 생겼다, 즉 객체가 생겼다는 말
		//									다시 말해, this로 접근하는 것은 객체를 만들어 접근하는 것과 같음
		//									static 변수/메소드는 객체를 만들어 접근하는게 아니라 클래스명. 으로 접근해야하기 때문에 경고성 메시지 뜨는 것
		Trainee.score = score; // 클래스명.static변수명 으로 접근해야함
	}
	
	public Trainee(char classRoom) {
		this.classRoom = classRoom;
	}
	
	
	public String inform() {
		return ACADEMY + " " + name + " 훈련생은 "
				+ classRoom + time + "반이고, 점수는 "
				+ score + "점입니다.";
	}
	
	
	// 지금까지는 필드에 있는 값을 초기화 하고 싶으면 매개변수 있는 생성자를 이용하였음
	// 매개변수 있는 생성자를 이용하여 값이 들어가 있는 채로 객체를 만들었는데
	// 데이터 값이 잘못 됐을 경우, 어떻게 데이터를 수정할 것인가?
	// -> 필드 하나씩만 갖고 있는 객체를 만들면 되지 않을까?
	// 일부 필드만 데이터를 조회하고 싶으면 어떻게 할 것인가?
	
	// name에 대한 setter, getter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	// ACADEMY에 대한 getter (상수는 한 번만 값 저장할 수 있기 때문에 setter메소드 사용 불가)
	public String getACADEY() {
		return ACADEMY;
	}
	
	// classRoom에 대한 setter, getter
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	public char getclassRoom() {
		return classRoom;
	}
	
	// time에 대한 setter, getter
	public void setTime(String time) {
		this.time = time;
	}
	public String getTime() {
		return time;
	}
	
	// score에 대한 setter, getter
	public static void setScore(double score) {
		Trainee.score = score; // score 변수는 static변수(클래스 변수), 클래스명.변수명 이렇게 써서 접근한다.
	}
	public static double getScore() {
		return score;
	}
}
