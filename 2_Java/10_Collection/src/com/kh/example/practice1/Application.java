package com.kh.example.practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Application {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		// 기존 로또 번호는 6개, 보너스 번호가 필요해서 1개 더 추가;
		while(lotto.size() < 7) {
			
			int num = (int) (Math.random() * 45 + 1 );
			if(!lotto.contains(num)) {
				lotto.add(num);
			}
			
		}
		
	}
}