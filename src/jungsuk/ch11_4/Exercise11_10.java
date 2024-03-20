package jungsuk.ch11_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercise11_10 {

	public static void main(String[] args) {

		//Set set = new HashSet();

//		System.out.println(set);
//		
//		System.out.println(set.size());
//		
		
		List set = new ArrayList();
//		
		Collections.shuffle(set);
//


		int[][] board = new int[5][5];
		
		// HashSet은 중복을 허용하지 않고 순서를 유지하지 않기 때문에 발생하는 문제이
		//다. 
		//아무리 임의의 순서로 저장을 해도 해싱 알고리즘의 특성상 한 숫자가 고정된 위치에 저장되기 때문이다
//
		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 30) + 1 + "");
		}
//
		System.out.println(set);
//
		Iterator it = set.iterator();

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
			}
			System.out.println();
		}

	}

}
