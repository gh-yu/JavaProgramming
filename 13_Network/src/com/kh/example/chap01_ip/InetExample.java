package com.kh.example.chap01_ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetExample {
	public static void main(String[] args) {
		try {
			// InetAddress.getLocalHost():InetAddress 반환
			InetAddress localIP = InetAddress.getLocalHost(); // static메소드  <- 클래스이름.메소드명();
			//                                지역 호스트(네트워크에 연결되어 있는 컴퓨터)의 Host명과 IP주소 반환
			System.out.println(localIP);
			System.out.println("내 PC명 : " + localIP.getHostName()); // 호스트 이름 반환
			System.out.println("내 IP : " + localIP.getHostAddress()); // 호스트 IP주소 반환
			
			byte[] ipAdress = localIP.getAddress(); // IP주소를 byte배열로 반환
			for (byte b : ipAdress) {
				System.out.println(b + " "); // -가 출력됨 -> byte 표현 범위 : -128~127, 범위 벗어나면 오버플로우(129가 들어오면 -127로)
			}
			
			System.out.println();
			System.out.println();
			
			InetAddress iei = InetAddress.getByName("www.iei.or.kr"); // 도메인(사이트 주소)을 통해 IP주소를 얻음
			System.out.println(iei);
			System.out.println("iei 서버 명 : " +iei.getHostName());
			System.out.println("iei 서버 ip : " + iei.getHostAddress());
			
			System.out.println();
			
			InetAddress[] google = InetAddress.getAllByName("www.google.com");
			System.out.println("구글 IP 개수 : " + google.length); // 1개 나옴
			for (InetAddress ip : google) {
				System.out.println(ip.getHostAddress());
			}
			
			System.out.println();
			
			InetAddress[] naver = InetAddress.getAllByName("www.naver.com"); 
			System.out.println("네이버 IP 개수 : " + naver.length); // 2개 나옴
			for (InetAddress ip : naver) {
				System.out.println(ip.getHostAddress());
			}
			
			
		} catch (UnknownHostException e) { // IP주소 반환하지 못했을때의 예외가 있을 수 있음 -> throws로 넘겨받아 처리
			e.printStackTrace();
		}
	}
}
