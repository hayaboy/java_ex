package jungsuk.ch04;

import java.util.Scanner;

public class Exercise4_14 {

	public static void main(String[] args) {
		// 컴퓨터가 난수로 발생시킬 수

		// System.out.println((int)(Math.random()*100)+1);

		int secret = (int) (Math.random() * 100) + 1;

		System.out.println(secret);

		int guess = 0;

		// import 단축키 : ctrl shift o

		Scanner sc = new Scanner(System.in);

		while (true) {
			guess = sc.nextInt();
//			System.out.println(guess);					

			if (guess > secret) {
				System.out.println("추측한 수가 답보다 크다");
			} else if (guess < secret) {
				System.out.println("추측한 수가 답보다 작다");
			} else {
				System.out.println("정답");
				break;
			}
		}

	}

}
