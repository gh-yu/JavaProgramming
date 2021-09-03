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
//		������ Ŭ���̾�Ʈ ���� 1:1 ���� ���(���� ������ ��������)
//	        ������ ���� �� ���� ������ Ŭ���̾�Ʈ�� ����Ǿ� �־�� ��
//	       ==> ������ Ŭ���̾�Ʈ�� ���� �����ϰ� ������ ���� ����Ǿ� Ŭ���̾�Ʈ�� ��û�� ��ٸ�
//	
//	ServerSocker
//		��Ʈ�� ����Ǿ� �ܺ��� ��û�� ��ٸ��� ��û�� ������ ���� �� Socket�� ������ ���ϰ� ���ϰ��� ����� �̷������ ��
//		�� ��Ʈ�� �� ServerSocker�� ���� ����
//	Socket
//		���μ��� �� ��� ���
//		InputStream/OutputStream ���� : �� ��Ʈ������ ���μ������� ����� �̷����
	
	public void serverStart() {
		// ������ TCP ���� ���α׷��� ����
		// 1. ���� ��Ʈ��ȣ ���ϱ�
		// 2. ������ ���� ��ü ���� �� ��Ʈ�� ����
		// 3. Ŭ���̾�Ʈ �ʿ��� ��û�� ���� ��ٸ�
		// 4. ��û�� ���� ���� �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
		// 5. ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
		// 6. ������Ʈ���� ���� ���� ����
		// 7. ��Ʈ���� ���� �а� ����
		// 8. ��� ����
		
		// 1. ���� ��Ʈ��ȣ ���ϱ� : 0~65535 (1023 ���ϴ� �̹� ������� ��Ʈ�� ���� �� �̻��� ���� ���� �� �̻� ���� ����, 5000���� �̻�)
		int port = 8500; // �� ������ ��Ʈ��ȣ ������� ���ϸ� ��

		try {
			// 2. ������ ���� ��ü ���� �� ��Ʈ�� ����
			ServerSocket server = new ServerSocket(port); // ServerSocket�� ���� ��ü ����, ������ �Ű������� port��ȣ ������ ���յ�
			
			// 3. Ŭ���̾�Ʈ �ʿ��� ��û�� ���� ��ٸ�
			 System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� �ֽ��ϴ�...."); // ��ٸ��� �� �ڵ�� x
			 
			// 4. ��û�� ���� ���� �� �ش� Ŭ���̾�Ʈ�� ���� ����(Socket) ��ü ����
			Socket client = server.accept(); // accept()���� ��ȯ���ִ� Socket�� Ŭ���̾�Ʈ�� ���� Socket��ü�� ��
			
			String clientIP = client.getInetAddress().getHostAddress(); // ����IP�� Ŭ���̾�ƮIP �� �� �� ��ǻ�Ϳ��� ����� IP�ּ� ����. ������ �ٸ�(�ٸ� ��ǻ�Ϳ� �����ϱ� ����). 
			System.out.println(clientIP + "�� ������ ��û��...");
			
			// 5. ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
			InputStream in = client.getInputStream(); // InputStream�� byte����
			OutputStream out = client.getOutputStream(); // OutputStream�� byte����
			
			// 6. ������Ʈ���� ���� ���� ����
			InputStreamReader isr = new InputStreamReader(in); // byte������ ���� ������ �ٲ��ִ� ������Ʈ��, �Ű������� ��ݽ�Ʈ���� in ����־� ��ü ����
			BufferedReader br = new BufferedReader(isr); // ���� ��� ������Ʈ��
//			BufferedReader br = new BufferedReader(new InputStreamReader(in)); // �� �� �� �� �ٷ� �ٲ� ��
			PrintWriter pw = new PrintWriter(out);
			
			// 7. ��Ʈ���� ���� �а� ����
			// Ŭ���̾�Ʈ -> ������ ������ �޼��� �б�
			String message = br.readLine();
			System.out.println(clientIP + "�� ���� �޼��� : " + message);
			// ���� -> Ŭ���̾�Ʈ�� �޼��� ����
			pw.println("������ �ݰ����ϴ�.");
			pw.flush(); // ���ۿ� ������������ �� ������ ����ִ� ��
			
			// 8. ��� ����
			pw.close(); // ��½�Ʈ�� �ݾ���
			br.close(); // �Է½�Ʈ�� �ݾ���
			server.close(); // ���� �ݾ���
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	
}
