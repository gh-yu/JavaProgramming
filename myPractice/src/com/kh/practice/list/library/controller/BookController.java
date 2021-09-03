package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	public BookController() { // �ʱ� �� 4��
		bookList.add(new Book("�ڹ��� ����", "���� ��", "��Ÿ", 20000));
		bookList.add(new Book("���� ���� �˰���", "������", "��Ÿ", 15000));
		bookList.add(new Book("����� ���", "������ ����", "�ι�", 12000));
		bookList.add(new Book("����� ���� ��ĥ �� �ִ�", "�� ������̾�", "�ǰ�", 19800));
	}
	
	public void insertBook(Book b) {
		
		bookList.add(b); // �÷��ǿ� �Ű������� ���� ��ü b �߰�, ������ ��ü list�� �ϳ��� ����
		
	}

	public ArrayList<Book> selectList() {
		
		return bookList;
		
	}

	public ArrayList<Book> selectBook(String keword) {
	
		ArrayList<Book> searchList = new ArrayList<Book>();
		for (int i = 0; i < bookList.size(); i++) {

			bookList.get(i);
			if (bookList.get(i).getTitle().contains(keword)) {
				searchList.add(bookList.get(i));
			}
		}
		
		return searchList; // Ű���尡 ���Ե� Title�� ���� ��ü���� ��Ƴ��� �÷��� ��ȯ
	}

	public Book deleteBook(String title, String author) {
		
		Book removeBook = null;
		
		for (int i = 0; i < bookList.size();) {
			
			if (bookList.get(i).getTitle().equals(title) && bookList.get(i).getAuthor().equals(author)) { // ���� �� ���� ���� �� ������
				removeBook = bookList.get(i); // ���� �� ��� b��ü�� ����
				bookList.remove(bookList.get(i)); // �ش� �÷����� ���(��ü) ����
				i = 0; // �����ǰ� ���� �÷��� ���� ���� �����Ǳ� ������ index 0���� �ٽ� �˻�
			} else { // i++�� for�� ���� �ʿ� ������ ������ i=0�ص� i++�� 1���� �˻��ϰ� ��, �׷��� else{i++}�� ������ ���� ����
				 i++;
			}
		}
		
//		if (list.size() > 0) { // title, author ��ġ�ϴ� ��ҵ� ������ �������ѵ�, ��ġ�ϴ� ��Ҷ� ��� 1���� ��� ���� ��Ȳ, ��� 1�� �˻� ���� ����
//			if (list.get(0).getTitle().equals(title) && list.get(0).getAuthor().equals(author)) { //  <- �� for������ else{i++;} �� �ذ�
//				list.remove(list.get(0));
//		    }
//		}
		
		return removeBook; // ������ �� ������ null ��ȯ�� ��
		
	}

	public int ascBook() { // ���� �� ���� �������� ����

		// sort�޼ҵ� �θ��� ��, BookŬ�������� comparable�������̽� ��ӹ޾� compareTo�޼ҵ� �������̵��ؼ� ���� ���� ������� ��
		// ���� ���� Ŭ������ StringŬ������ �޸� ������� ���ı����� ����. ���ı��� �����ֱ� ������ ���� ��. ���ı����� �־��  sort�޼ҵ� ����� �۵���.
		Collections.sort(bookList);
		return 1;
	}

}
