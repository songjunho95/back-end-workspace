package com.kh.step2;

import java.io.BufferedWriter;

import com.kh.step2.model.Card;

public class Application {
	
	public static void main(String[] args) {
		
		// 클래스 변수는 객체 생성 없이 호출 가능!
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		Card card1 = new Card();
		card1.kind = "Heart";
		card1.number = 7;
		
		Card card2 = new Card();
		card2.kind = "Spade";
		card2.number = 3;
		
		// 클래스 변수는 모든 객체가 하나의 저장공간을 공유하므로 항상 고통된 값을 갖는다.
		Card.width = 50;
		card2.height = 90;
		
		System.out.println("첫번째 카드는 " + card1.kind + " " + card1.number + "이며, "
								+ "크기는 " + card1.width + " X " + card1.height + " 입니다.");
		System.out.println("두번째 카드는 " + card2.kind + " " + card2.number + "이며,"
								+ "크기는 " + card2.width + " X " + card2.height + " 입니다.");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * BufferredReader, BufferedWriter
	 * 		: 입출력 효율을 높이기 위해(char[])를 사용하는 보조 스트림
	 * 		--> 라인 (line) 단위로 입출력이 편리하다
	 * 
	 * PringWriter : 프린터와 유사하게 출력하는
	 * 				 print(), println() 메서드를 가지고 있는 보조스트림
	 * 
	 * 
	 * */
		try(FileReader fr = new File Reader(fileName)
				 		BufferredReader br = new BufferedReader(fr);) {
						PrintWriter pw = new PrintWriter(new FileWriter(outfilenName));
		}
						FileWriter fw = new FileWriter(outfileName, true);
						
//						BufferedWriter bw = new BufferedWriter(fw);)
{
			
			String line = "";
			while((line = br.readLine()) != null) {
//				System.out.println(line);
				bw.write(line);
				bw.newLine(); // 라인 구문자(개행문자)를 출력
				pw.println(line);
			}
			
		}
	
	
	
	
	
	
	
	
	
	
}