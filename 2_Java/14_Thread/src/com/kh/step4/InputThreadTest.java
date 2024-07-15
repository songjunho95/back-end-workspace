package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest {

// 프로세스 - 두 스레드 간의 Communication은 프로세스의 자원으로 해야 한다.
boolean check = false;
	
	public static void main(String[] args) {
		
		InputThreadTest process = new InputThreadTest();

		
		InputThread input = new InputThread(process);
		input.start();
		
		CountThread count = new CountThread(process);
		count.start();
			
		// 2. 카운팅 작업
		for (int i = 10; i > 0; i--) {
			if (process.check)
				break;
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		if (!process.check == false) {
			System.out.println("10초 경과! 값 입력 중지!!");
			System.exit(0); // 강제 종료!
		}
		
		
		
	}
   
}
