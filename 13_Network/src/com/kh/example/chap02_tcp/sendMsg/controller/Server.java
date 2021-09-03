package com.kh.example.chap02_tcp.sendMsg.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
// TCP(Transmission Control Protocol)
//		서버와 클라이언트 간의 1:1 소켓 통신(연결 지향적 프로토콜)
//	        데이터 전송 전 먼저 서버와 클라이언트가 연결되어 있어야 함
//	       ==> 서버와 클라이언트를 따로 구현하고 서버가 먼저 실행되어 클라이언트의 요청을 기다림
//	
//	ServerSocker
//		포트와 연결되어 외부의 요청을 기다리다 요청이 들어오면 수락 후 Socket을 생성해 소켓과 소켓간의 통신이 이루어지게 함
//		한 포트에 한 ServerSocker만 연결 가능
//	Socket
//		프로세스 간 통신 담당
//		InputStream/OutputStream 보유 : 이 스트림으로 프로세스간의 통신이 이루어짐
	
	public void serverStart() {
		// 서버용 TCP 소켓 프로그래밍 순서
		// 1. 서버 포트번호 정하기
		// 2. 서버용 소켓 객체 생성 후 포트와 결합
		// 3. 클라이언트 쪽에서 요청이 오길 기다림
		// 4. 요청이 오면 수락 후 해당 클라이언트에 대한 소켓 객체 생성
		// 5. 연결된 클라이언트와 입출력 스트림 생성
		// 6. 보조스트림을 통해 성능 개선
		// 7. 스트림을 통해 읽고 쓰기
		// 8. 통신 종료
		
		// 1. 서버 포트번호 정하기 : 0~65535 (1023 이하는 이미 사용중인 포트가 많아 그 이상인 숫자 권장 그 이상 숫자 권장, 5000번대 이상)
		int port = 8500; // 내 서버의 포트번호 마음대로 정하면 됨

		try {
			// 2. 서버용 소켓 객체 생성 후 포트와 결합
			ServerSocket server = new ServerSocket(port); // ServerSocket에 대한 객체 생성, 생성자 매개변수에 port번호 넣으면 결합됨
			
			// 3. 클라이언트 쪽에서 요청이 오길 기다림
			 System.out.println("클라이언트의 요청을 기다리고 있습니다...."); // 기다리는 건 코드로 x
			 
			// 4. 요청이 오면 수락 후 해당 클라이언트에 대한 소켓(Socket) 객체 생성
			Socket client = server.accept(); // accept()에서 반환해주는 Socket이 클라이언트에 대한 Socket객체가 됨
			
			String clientIP = client.getInetAddress().getHostAddress(); // 서버IP와 클라이언트IP 둘 다 내 컴퓨터에서 만들면 IP주소 같음. 원래는 다름(다른 컴퓨터와 연결하기 때문). 
			System.out.println(clientIP + "가 연결을 요청함...");
			
			// 5. 연결된 클라이언트와 입출력 스트림 생성
			InputStream in = client.getInputStream(); // InputStream은 byte단위
			OutputStream out = client.getOutputStream(); // OutputStream은 byte단위
			
			// 6. 보조스트림을 통해 성능 개선
			InputStreamReader isr = new InputStreamReader(in); // byte단위를 문자 단위로 바꿔주는 보조스트림, 매개변수에 기반스트림인 in 집어넣어 객체 생성
			BufferedReader br = new BufferedReader(isr); // 성능 향상 보조스트림
//			BufferedReader br = new BufferedReader(new InputStreamReader(in)); // 위 두 줄 한 줄로 바꾼 것
			PrintWriter pw = new PrintWriter(out);
			
			// 7. 스트림을 통해 읽고 쓰기
			// 클라이언트 -> 서버로 전송한 메세지 읽기
			String message = br.readLine();
			System.out.println(clientIP + "가 보낸 메세지 : " + message);
			// 서버 -> 클라이언트로 메세지 전송
			pw.println("만나서 반갑습니다.");
			pw.flush(); // 버퍼에 남아있을지도 모를 데이터 비워주는 것
			
			// 8. 통신 종료
			pw.close(); // 출력스트림 닫아줌
			br.close(); // 입력스트림 닫아줌
			server.close(); // 서버 닫아줌
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	
}
