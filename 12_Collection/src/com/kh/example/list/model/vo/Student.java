package com.kh.example.list.model.vo;


public class Student implements Comparable<Student> {
	
	private String name;
	private int score;
	
	public Student() {}
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return name + "(" + score + "��)";
	}
	
	@Override      // equals ȣ���ߴٴ� �� ��(Student)��� ��ü�� �����ƴٴ� ��
	public boolean equals(Object obj) { // �Ű����� Object�� ���� ���� ��ü
		// ��ü ����
		if (this == obj)  { // ���� �ּҰ��� ���ٸ�
			return true;    // -> ���� obj�� ����
		} if (obj == null) { // ���� ��ü �����ż� �ּҰ� �ִµ� obj�� null�̸�? 
			return false;    // -> ���� obj�� ���� �ʴ�
		}
		if (getClass() != obj.getClass()) { // ���� Ŭ������ �ƴϸ�
			return false;
		}
		
		// �ʵ�(������) ����
		Student other = (Student)obj; // ���� ���� �ٸ� �ָ� StudentŸ������ ����ȯ�ؼ� StudentŸ�� other��� ���������� �������
		                              // ObjectŬ������ �θ�Ŭ����, �ڽ�Ŭ������ ����ȯ
		if (name == null) {           // �� ���� null�ε�
			if (other.name != null) { // ���� ���� �ٸ� �ִ� null�� �ƴϸ�
				return false;         // ���� �ʴ�
			}
		} else if (!name.equals(other.name)) { // String ��, ���� �ʴٸ�
			return false;           
		} if (score != other.score) {
			return false;
		}
		
		return true; // �� ���ǹ��� �ش����� ������ ���ٴ� ��, true ��ȯ
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + (name == null ? 0 : name.hashCode());
		result = PRIME * result + score;
		
		return result;
	}
	
//	@Override
//	public int compareTo(Object o) {
//		Student other = (Student)o;
//		String otherName = other.name;
//		return name.compareTo(otherName);
//	}
	
	@Override
	public int compareTo(Student o) {
		// �̸�(String)���� �������� 
		
		// �� ��ü(��)�� �� ���(o)�� ���ϴµ�
		// �� ��ü�� �� ���� ������ 0,
		// �� ��ü�� �� ��󺸴� ũ�� 1,
		// �� ��ü�� �� ��󺸴� ������ -1 ��ȯ
		return name.compareTo(o.name); // StringŬ���� ���ο��� ���ı���(��������) ������ ����
//		return -name.compareTo(o.name); // - �ٿ��ָ� ��������
		
	}
	
}
