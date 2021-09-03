package com.kh.example.chap02_tcp.sendExit.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public void startServer() {
		// ������ TCP ���� ���α׷��� ����
		// 1. ������ ��Ʈ ��ȣ ���ϱ�
		// 2. ������ ���� ��ü ���� �� ��Ʈ�� ����
		// 3. Ŭ���̾�Ʈ �ʿ��� ���� ��û�� ���� ��ٸ�
		// 4. ���� ��û�� ���� ��û ���� �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
		// 5. ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
		// 6. ���� ��Ʈ������ ���� ����
		// 7. ��Ʈ���� ���� �а� ����
		// 8. ��� ����
		
		// 1. ������ ��Ʈ ��ȣ ���ϱ�
		int port = 6666;
		
		try {
			// 2. ������ ���� ��ü ���� �� ��Ʈ�� ����
			ServerSocket server = new ServerSocket(port);
			
			// 3. Ŭ���̾�Ʈ �ʿ��� ���� ��û�� ���� ��ٸ�
			System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� �ֽ��ϴ�...");
			
			// 4. ���� ��û�� ���� ��û ���� �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
			Socket client = server.accept();
			String clientIP = client.getInetAddress().getHostAddress();
			System.out.println(clientIP + "�� ������ ��û��...");
			
			// 5. ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
			// 6. ���� ��Ʈ������ ���� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			PrintWriter pw = new PrintWriter(client.getOutputStream());
			
			// 7. ��Ʈ���� ���� �а� ����
			while (true) { // Ŭ���̾�Ʈ�� ������ �޼��� exit�ϱ� ������ ��� �ޱ� -> �� �� �ݺ����� �� �� while�� ���
				String message = br.readLine();
				
				if (!message.equals("exit")) {
					System.out.println(clientIP + "�� ���� �޼��� : " + message);
					pw.println("�޼��� �ޱ� ����");
					pw.flush();
				} else {
					System.out.println("���� ����");
					break;
				}

			}
			
			// 8. ��� ����
			pw.close();
			br.close();
			server.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
