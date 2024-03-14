package jungsuk.ch09;

public class Exercise9_8 {
	
	
	static void round( double d, int n) {
		
		long result1=Math.round(d);
		//System.out.println(result1);
		
		//System.out.println(d-result1 );
		
//		System.out.println( (int) ((d-result1)*10) );
		
		
		//System.out.println( ((int) ((d-result1)*Math.pow(10, n+1) % 10 ) ));
		
		int result2=0;
		int result3=((int) ((d-result1)*Math.pow(10, n+1) % 10 ));
		
		if(result3>=5 && result3<=9) {
			 result2 = (int)((d-result1)* Math.pow(10, n)) + 1;
			//System.out.println(result2);
			
			System.out.printf("%d.%d\n" , result1, result2);
			
		}else {
			 result2 = (int)((d-result1)* Math.pow(10, n));
			//System.out.println(result2);
			
			System.out.printf("%d.%d\n" , result1, result2);
		}
		
		
		
		
		
		
		
//		return 0.0;
	}

	public static void main(String[] args) {
		round(3.1415,1);
		round(3.1415,2);
		round(3.1415,3);
//		round(3.1415,4);
//        round(3.1415,5);

	}

}
