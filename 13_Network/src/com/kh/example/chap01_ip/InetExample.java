package com.kh.example.chap01_ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetExample {
	public static void main(String[] args) {
		try {
			// InetAddress.getLocalHost():InetAddress ��ȯ
			InetAddress localIP = InetAddress.getLocalHost(); // static�޼ҵ�  <- Ŭ�����̸�.�޼ҵ��();
			//                                ���� ȣ��Ʈ(��Ʈ��ũ�� ����Ǿ� �ִ� ��ǻ��)�� Host��� IP�ּ� ��ȯ
			System.out.println(localIP);
			System.out.println("�� PC�� : " + localIP.getHostName()); // ȣ��Ʈ �̸� ��ȯ
			System.out.println("�� IP : " + localIP.getHostAddress()); // ȣ��Ʈ IP�ּ� ��ȯ
			
			byte[] ipAdress = localIP.getAddress(); // IP�ּҸ� byte�迭�� ��ȯ
			for (byte b : ipAdress) {
				System.out.println(b + " "); // -�� ��µ� -> byte ǥ�� ���� : -128~127, ���� ����� �����÷ο�(129�� ������ -127��)
			}
			
			System.out.println();
			System.out.println();
			
			InetAddress iei = InetAddress.getByName("www.iei.or.kr"); // ������(����Ʈ �ּ�)�� ���� IP�ּҸ� ����
			System.out.println(iei);
			System.out.println("iei ���� �� : " +iei.getHostName());
			System.out.println("iei ���� ip : " + iei.getHostAddress());
			
			System.out.println();
			
			InetAddress[] google = InetAddress.getAllByName("www.google.com");
			System.out.println("���� IP ���� : " + google.length); // 1�� ����
			for (InetAddress ip : google) {
				System.out.println(ip.getHostAddress());
			}
			
			System.out.println();
			
			InetAddress[] naver = InetAddress.getAllByName("www.naver.com"); 
			System.out.println("���̹� IP ���� : " + naver.length); // 2�� ����
			for (InetAddress ip : naver) {
				System.out.println(ip.getHostAddress());
			}
			
			
		} catch (UnknownHostException e) { // IP�ּ� ��ȯ���� ���������� ���ܰ� ���� �� ���� -> throws�� �Ѱܹ޾� ó��
			e.printStackTrace();
		}
	}
}
