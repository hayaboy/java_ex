package jungsuk.ch09;

public class Exercise9_12 {

	static int getRand(int from, int to){
//		int result1= (int)(Math.random()*num1 + 1);			
//		int result2= (int)(Math.random()*num2);
//	
//		if(result1>result2) {	
//			
//			System.out.println(result1 + ",  " +  result2);
//		}else if(result2>result1) {
//			
//			System.out.println(result1 + ",  " +  result2);
//			
//		}else {
//			System.out.println(result1 + ",  " +  result2);
//		}
		
//		System.out.println("두 수 차이의 절대값" + Math.abs(to-from));
//		System.out.println("둘 중 작은 값" + Math.min(from,to));
		
//		System.out.println("더하기 전 각각의 값 ");
//		System.out.print((int)(Math.random() * (Math.abs(to-from)+1)));
//		
//		System.out.print(Math.min(from,to));
//		
//		System.out.println("=================");
		
		
		return  (int)(Math.random() * (Math.abs(to-from)+1))+ Math.min(from,to);
	}
	
	public static void main(String[] args) {
		
		//System.out.println(getRand(1, -3));   // 1 0 -1 -2 -3
	
		for(int i=0; i< 20; i++)
//			System.out.print("결과" + getRand(1,-3)+",");
			System.out.print(getRand(-3, 1)+",");

	}


	
}
