package com.kh.example.chap02_tcp.sendMsg.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public void clientStart() {
		// 클라이언트용 TCP 프로그래밍 순서
		// 1. 서버의 IP주소와 서버가 정한 포트 번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
		// 2. 서버와의 입출력 스트림 오픈
		// 3. 보조스트림으로 성능 개선
		// 4. 스트림을 통해 일고 쓰기
		// 5. 통신 종료
		

		try {
			// 1. 서버의 IP주소와 서버가 정한 포트 번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
			int port = 8500;
//			String serverIP = "192.157.10.99";
			String serverIp = InetAddress.getLocalHost().getHostAddress(); // 지금 서버를 내 컴퓨터로 만들었기 때문, 내 IP주소로 가져 오는 것.
			Socket socket = new Socket(serverIp, port);
			
			// 서버와 연결 실패할 경우 null을 반환하기 때문에 연결에 성공했을 때만 진행할 수 있도록 if문 작성
			if (socket != null) {
				
			}
			// 2. 서버와의 입출력 스트림 오픈
			// 3. 보조스트림으로 성능 개선
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			
			// 4. 스트림을 통해 읽고 쓰기
			// 클라이언트 -> 서버 메세지 전송
			pw.println("반가워요"); // 메세지 먼저 전송
			pw.flush();
			
			// 서버 -> 클라이언트 메세지 읽기
			String message = br.readLine();
			System.out.println(message);

			// 5. 통신 종료
			pw.close();
			br.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
	}
}
