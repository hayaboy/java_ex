package jungsuk.ch05;

public class Exercise5_6 {

	public static void main(String[] args) {
	
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
		
		
		//System.out.println(money /coinUnit[0]);
		// 5* 500 =2500 
		//180
//		System.out.println( money /coinUnit[1]);
//		
//		System.out.println( money % coinUnit[0]);
		
		for(int i=0;i<coinUnit.length;i++) {
			
			System.out.printf("%d원   %d 개  \n" ,  coinUnit[i] , money /coinUnit[i]);
			
			money =money % coinUnit[i];
		}
		
		
	}

}
