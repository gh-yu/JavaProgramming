package com.kh.practice.list.library.model.vo;

public class Book implements Comparable<Book> { // Comparable�������̽� ��ӹ޾� compareTo�޼ҵ� �������̵� -> ���ı��� �����
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
	public boolean equals(Object obj) {
		// ��ü ����
		if (this == obj) { // �ּҰ� ������ ���� ��ü, �ٷ� true ��ȯ
			return true;
		} else if (obj == null) { // �װ� �ƴϰ� obj�� null�̸�, false ��ȯ
			return false;
		} 
		if (this.getClass() != obj.getClass()) { // ���� class�� �ٸ��� false ��ȯ
			return false;
		}
		
		// ������ ����
		Book other = (Book)obj;
		
		if (title ==  null) {
			if (other.title != null) {
				return false;
			}
		} else if (title != other.title) {
			return false;
		} 
		if (!author.equals(other.author)) {
			return false;
		} 
		if (category != other.category) {
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


	@Override
	public int compareTo(Book o) {
		
		return title.compareTo(o.title); // ���� StringŬ�������� �������̵��� comparTo�޼ҵ� ȣ�� -> �������� ����
	}

}