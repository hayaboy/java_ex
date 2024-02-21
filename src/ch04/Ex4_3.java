package ch04;

public class Ex4_3 {

	public static void main(String[] args) {
		
		int tot=0;
		
		for(int i=1;i<=100;i++) {
//			System.out.println(i);

			//3의 배수
			
			if(i %3 == 0) {
//				System.out.println(i);
				
				tot=tot + i;
			}
			
			
		}
			System.out.println(tot);
	}

}
