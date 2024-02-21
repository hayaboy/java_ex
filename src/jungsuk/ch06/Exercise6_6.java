package jungsuk.ch06;

public class Exercise6_6 {
	
	
	static double getDistance(int x, int y, int x1, int y1) {
	
		
		 double result=Math.sqrt(    ((double)x1-(double)x)*((double)x1-(double)x)    +    ((double)y1-(double)y)* ((double)y1-(double)y) );
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(getDistance(0,0,3,4));
	}
}
