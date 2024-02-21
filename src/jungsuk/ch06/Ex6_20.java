package jungsuk.ch06;

public class Ex6_20 {

	static int[] shuffle(int arr[]) {

		// int randomIdx=(int)(Math.random()*arr.length) +1;
		// System.out.println(randomIdx);
		for (int i = 0; i < arr.length; i++) {

			int randomIdx = (int) (Math.random() * arr.length);
			//System.out.println(randomIdx);
			//System.out.println("===================");
			// 값 교환
			int tmp = arr[i];
			arr[i] = arr[randomIdx];
			arr[randomIdx] = tmp;

			
//			if (i != randomIdx) {
//				arr[i] = arr[randomIdx];
//			}

		}

		return arr;
	}

	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		int randomIdx=(int)(Math.random()*original.length) +1;
//		System.out.println(randomIdx);
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		// System.out.println(result);
		System.out.println(java.util.Arrays.toString(result));

	}

}
