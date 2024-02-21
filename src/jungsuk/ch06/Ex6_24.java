package jungsuk.ch06;

public class Ex6_24 {
	
	static int abs(int num) {
		if(num>=0) {
			return num;
		}else {
			return -1*num;
		}
		
	}
	
	
	

	public static void main(String[] args) {
		
		int value = 5;
		System.out.println(value+"의 절대값 :"+ abs(value)); 
		value = -10;
		System.out.println(value+"의 절대값 :"+abs(value));
	}

}
