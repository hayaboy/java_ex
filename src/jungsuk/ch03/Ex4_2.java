package jungsuk.ch03;

public class Ex4_2 {

	public static void main(String[] args) {
		
		
	
		
		int tot=0;
		
		for(int i=1;i<=20;i++) {
//			System.out.println(i);
			
			if(!( (i % 2 ==0) || (i % 3 ==0)) ) {
//				System.out.println(i);
				
				tot += i;
			}
			
		}
		
		System.out.println(tot);
		
		//2 또는 3의 배수
		
		// num % 2 ==0 
		
		// num % 3 ==0
		

	}

}
