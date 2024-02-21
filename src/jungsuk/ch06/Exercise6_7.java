package jungsuk.ch06;

class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		
		double result =  Math.sqrt(  (double)((x1 - this.x)*(x1 - this.x)) +    (double)((y1 - this.y)*(y1 - this.y))) ; 
		
		return result;
	}

}

public class Exercise6_7 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		
		System.out.println(p.x + "," + p.y);
		
		System.out.println(p.getDistance(2,2));
	}

}
