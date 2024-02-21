package jungsuk.ch04;

import java.util.Scanner;

public class Exercise4_14_1 {

	public static void main(String[] args) {
		
		int secret = (int) (Math.random() * 100) + 1;
		System.out.println("정답 " + secret);
		
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			count++;
			System.out.print("1 100 :");
			int guess = sc.nextInt(); 
			
			
			if (guess > secret) {
				System.out.println("추측한 수가 답보다 크다");
			} else if (guess < secret) {
				System.out.println("추측한 수가 답보다 작다");
			} else {
				System.out.println("정답");
				System.out.println(count);
				break;
			}
			
			
		}while(true);
	}

}
