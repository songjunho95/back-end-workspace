package com.kh.socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 클라이언트가 보낸 메세지를 받아서 
 * 다시 클라이언트에게 받은 메세지를 보낸다

 * 
 * 
 * 서버측 로직 
 * 1. ServerSocket 생성 port : 60000
 * 2. 클라이언트가 서버에 접속하면 accept로 받아서 Socket 하나 리턴
 * 3. 소켓으로부터 스트림 리턴
 * */

public class ChatServer {
	
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(60000);
			Socket s = server.accept();
			ServerSocket server = new ServerSocket(60000);
			
			// 클라이언트가 보낸 메세지를 받아서 
			BufferedReader br = new BufferedReader(s.getInputStream()));
			
			
			
			// 다시 클라이언트에게 받은 메세지를 보낸다
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			
			// 다시 서버가 보낸 메세지를 받아서 클라이언트 자신의 콘솔창에 출력한다
			
			
			BufferedReader br2 = (new BufferedReader(s.getInputStream()));
			
			
			String line = null;
			while(true) {
				String line = br.readLine();
				pw.println(line);
				
				String serverMsg = br2.readLine();
				System.out.print("내가 보낸 메세지 : " + serverMsg);
				
				
				
				
				
				
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
