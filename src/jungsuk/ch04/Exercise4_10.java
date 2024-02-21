package jungsuk.ch04;

public class Exercise4_10 {

	public static void main(String[] args) {
		
		int num = 12345;

		int sum = 0;
		
		
//		System.out.println(num / 10000);
//		System.out.println( (num / 1000) % 10);
//		System.out.println( (num / 100) % 10) ;
		
//		System.out.println(num / 10);
//		System.out.println( (num / 100) % 10);
//		System.out.println( (num / 1000) % 10) ;
		
		int i=0;
		while(i<=10) {
			sum = sum + num %10;
			num = num / 10;
//			System.out.printf("%d %d \n", sum, num);
			i++;
		}
		System.out.println(sum);
		
//		int i=0;
//		while(i<=10) {
//			sum = sum + num %10;
//			num = num / 10;
//			System.out.printf("%d %d \n", sum, num);
//			i++;
//		}
		
		
	}

}
