package ch05;

import java.util.Scanner;

public class Ex9_1 {

	public static void main(String[] args) {

		int studentNumber = 0;

		// 학생들의 점수가 들어갈 배열(int)

		int scores[] = null;

		System.out.println("--------------------------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("--------------------------------------------------------------");
		System.out.print("선택> ");

		Scanner scanner = new Scanner(System.in);

		int start = scanner.nextInt();

		if (start != 1) {
			System.out.println("1번만 넣으세요");
		} else {
			boolean flag = true;
			while (flag) {

				System.out.println("--------------------------------------------------------------");
				System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
				System.out.println("--------------------------------------------------------------");
				System.out.print("선택> ");

				int menu = scanner.nextInt();

				switch (menu) {
				case 1 -> {
					System.out.println("학생수>");

					studentNumber = scanner.nextInt();
//						System.out.println(studentNumber);

					scores = new int[studentNumber];
				}
				case 2 -> {

					for (int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "]");
						scores[i] = scanner.nextInt();
					}

//						for (int i = 0; i < scores.length; i++) {
//							System.out.print(scores[i] + " ");
					//
//						}
					System.out.println();

				}
				case 3 -> {

					for (int i = 0; i < scores.length; i++) {
						System.out.print(scores[i] + " ");

					}
					System.out.println();

				}
				case 4 -> {
					// 최고 점수
					int max = Integer.MIN_VALUE;

					// 주어진 배열과 최소값 비교

					for (int i = 0; i < scores.length; i++) {
						if (scores[i] > max) {
							max = scores[i];
						}

					}

					System.out.println("최고점수 : " + max);

					// 평균점수

					int total = 0;
					for (int i = 0; i < scores.length; i++) {
						total += scores[i];
					}

					double avg = (double) total / scores.length;

					System.out.printf("평균점수 : %.1f \n", avg);

				}
				case 5 -> {
					flag = false;

				}
				}

			}

		}

		System.out.println("프로그램 종료");

	}

}
