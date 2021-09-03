package com.kh.example.list.model.compare;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// �� ��ü : o1
//		int standard = o1.getScore();
		Integer standard = o1.getScore(); // IntegerŬ������ compareTo()�޼ҵ� �̿��ؼ� ������ ��
		// �� ��� : o2                    // WapperŬ������ �ٲ���� �޼ҵ� ��� ����
//		int object = o2.getScore();
		Integer object = o2.getScore();
		
		// ��������
		// �� ��ü�� �� ��󺸴� ũ�� 1
		// �� ��ü�� �� ���� ������ 0
		// �� ��ü�� �� ��󺸴� ������ -1 ��ȯ
		
//		if (standard > object) {
//			return 1;
//		} else if (standard == object) {
//			return 0;
//		} else {
//			return -1;
//		}
		
//		return standard.compareTo(object); // �������� IntegerŬ������ comparTo�޼ҵ� �̿�(���ı��� ������ �ִ� �޼ҵ�)
//		return -standard.compareTo(object); // ��������

		// �� ���� �ڷ��� �Ѳ����� ���� ����
		int result = -standard.compareTo(object); // ����(int) ��������
		String standardName = o1.getName(); // �� ��ü �̸�
		String objectName = o2.getName();   // �� ��� �̸�
		
		if (result == 0) { // => ������ ���� ���
			return standardName.compareTo(objectName); // => �̸�(String) �������� ����
		} else {
			return result; // �ƴϸ� ���� ���������� ����
		}
		
	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}


}
