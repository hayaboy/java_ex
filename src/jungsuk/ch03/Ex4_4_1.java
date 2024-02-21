package jungsuk.ch03;

public class Ex4_4_1 {

	public static void main(String[] args) {

		int tot = 0;

		int sign = -1;

		int i = 1;
		while (true) {

			if (i % 2 == 0) {
				tot = tot + i * (sign);

			} else {
				tot = tot + i;
			}

			if (tot >= 100) {
				System.out.println(tot);
				break;
			}

			i++;

		}
		System.out.println(i);

	}

}
