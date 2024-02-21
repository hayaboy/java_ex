package jungsuk.ch05;

public class Exercise5_8 {

	public static void main(String[] args) {

		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4]; // { 0, 0, 0, 0 }

		for (int i = 0; i < answer.length; i++) {
			counter[answer[i] - 1]++;
		}

		for (int i = 0; i < counter.length; i++) {
			System.out.print(counter[i]);

			for (int j = 0; j < counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 1은 3개 , 개수 3이므로 별이 ***
		// 2은 2개 , 개수 2이므로 별이 **
		// 3은 2개 , 개수 2이므로 별이 **
		// 4은 4개 , 개수 4이므로 별이 ****

	}

}
