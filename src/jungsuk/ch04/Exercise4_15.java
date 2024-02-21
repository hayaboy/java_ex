package jungsuk.ch04;

public class Exercise4_15 {

	public static void main(String[] args) {

		int number = 1221;
		int tmp = number;
		int result = 0; // number 변수 를 거꾸로 변환해서 담을 변수

		System.out.println((number ) % 10);
		System.out.println((number / 10) % 10);
		System.out.println((number / 100) % 10);
		System.out.println((number / 1000) % 10);
		System.out.println((number / 10000) % 10);
		
		
		
		
		
		System.out.println("==============");

//		for(int i=0;i<5;i++) {
//			         
//			result  = result*10 + tmp%10 ;
//			 tmp /= 10;
//					
//			
//			System.out.println(result);
//			
//		}	
		
		while (tmp != 0) {
			result  = result*10 + tmp%10 ;
			 tmp /= 10;			
			System.out.println(result);
			 
		}

		if(number == result) {
			System.out.println( number + " 회문수 ");
		}else {
			System.out.println( number + " X ");
		}

	}

}
