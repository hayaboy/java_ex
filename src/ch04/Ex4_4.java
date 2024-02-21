package ch04;

public class Ex4_4 {

	public static void main(String[] args) {
		
		//greater than or equal to 0.0 and less than 1.0
		// 0.0 <=  나오는 수  < 1.0
		
		// 나오는 수 >= 0.0    and     나오는 수  < 1.0
		
		
		
		System.out.println(Math.random());
		
		//주사위 1 2,3,4,5,6
		
		System.out.println((int)Math.random() * 10);
		
		
		System.out.println((int)(Math.random() * 6) + 1);
		
//		System.out.println("=======================");
//		for(int i=0;i<10000;i++) {
//			System.out.println((int)(Math.random() * 6) + 1);
//		}
		
		System.out.println("-------------------------");
		for(int i=0;i<10000;i++) {
			System.out.println((int)(Math.random() * 7) );
		}
		
	}

}
