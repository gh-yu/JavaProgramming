package com.kh.practice.list.library.model.vo;

public class Book implements Comparable<Book> { // Comparable인터페이스 상속받아 compareTo메소드 오버라이딩 -> 정렬기준 세우기
	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {}
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	
	@Override
	public String toString() {
		return "(" + title + "/" + author + "/" + category + "/" + price + ")";
	}


	@Override
	public int compareTo(Book o) {

		return title.compareTo(o.title); // 기존 String클래스에서 오버라이딩한 comparTo메소드 호출 -> 오름차순 정렬
		
	}
	
	// ArrayList와 같은 Collection클래스는 내부 메소드(remove메소드 등)에서 equals메소드 호출해서 같은 객체인지 비교하는데
	// 컬렉션의 각 요소, 즉 객체들간 같은지 다른지 주소값이 아닌 값을 통해 비교하려면 내가 만든 (제네릭으로 지정된 타입인)클래스에 맞게 equals메소드 재정의가 필요
	// 오버라이딩 후 controller나 view 등에서
	// 컬렉션 생성하여 컬렉션의 각 요소에 접근해 equals메소드 호출(BookList.get(i).equals(otherObj))하면 Object클래스의 메소드가 아닌 이 클래스에서 재정의된 equals메소드 호출됨
	// Book b = new Book(); b.equals(otherObj); 해도 이 오버라이딩된 equals메소드 호출하는 것
	@Override
	public boolean equals(Object obj) { 
		// 객체 측면
		if (this == obj) { // 주소값 같으면 같은 객체, 바로 true 반환
			return true;
		} else if (obj == null) { // 그게 아니고 obj가 null이면, false 반환
			return false;
		} 
		if (this.getClass() != obj.getClass()) { // 둘의 class가 다르면 false 반환
			return false;
		}
		
		// 데이터 측면
		Book other = (Book)obj;
		
		if (title ==  null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) { // String이라 equals메소드로 비교
			return false;
		} 
		if (!author.equals(other.author)) {
			return false;
		} 
		if (!category.equals(other.category)) {
			return false;
		}
		if (price != other.price) {
			return false;
		}
		
		return true;
		
	}
	
	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		
		result = prime * result + (title == null ? 0 : title.hashCode());
		result = prime * result + (author == null ? 0 : author.hashCode());
		result = prime * result + (category == null ? 0 : category.hashCode());
		result = prime * result + price;
		
		return result;
	}


}
