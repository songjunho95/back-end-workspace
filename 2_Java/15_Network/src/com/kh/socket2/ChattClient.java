package com.kh.socket2;

import java.io.BufferedReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 키보드로 입력받은 데이터를 읽어서 서버로 보낸다
 * 다시 서버가 보낸 메세지를 받아서 클라이언트 자신의 콘솔창에 출력한다.
 * 
 * 클라이언트 로직
 * 1. 소켓 생성
 * 2. 스트림 
 * 
 * 
 * 
 * 
 * */




public class ChattClient {

	
	public static void main(String[] args) {
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();
			
			
			// 키보드로 입력받은 데이터를 읽어서 서버한테 보낸다 
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			
			
			String line = "";
			while((line = br.readLine())!=null) {
				pw.println(line);
			}
		} catch (){
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		Socket s = new Socket();
		
		
	}
	
	
	
	
	
	
	
	
	
}
