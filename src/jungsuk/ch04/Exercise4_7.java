package jungsuk.ch04;

public class Exercise4_7 {

	public static void main(String[] args) {

		// 0<= 어떤 값 <1
//		System.out.println(Math.random());
//
//		System.out.println((int) (Math.random() * 10) + 1);
//
//		for (int i = 1; i <= 100; i++) {
//			System.out.println((int) (Math.random() * 6) + 1);
//		}

//		int num1 = (int) (Math.random() * 6) + 1;
//
//		int num2 = (int) (Math.random() * 6) + 1;

//		for (int i = 1; i <= 6; i++) {
//			for (int j = 1; j <= 6; j++) {
//				if( i +j == 6) {
//					System.out.printf("(%d, %d)", i, j);
//				}
//			}
//			System.out.println();
//		}
		
		
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if( 2*i + 4*j == 10) {
					System.out.printf("(x=%d, y=%d)", i, j);
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
