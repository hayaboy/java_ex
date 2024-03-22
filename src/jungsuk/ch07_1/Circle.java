package jungsuk.ch07_1;

public class Circle extends Shape{

	 double r;
	
	 
	 
	 
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Circle(Point p) {
		super(p);
		// TODO Auto-generated constructor stub
	}




	public Circle(double r) {
		super();
		this.r = r;
	}




	@Override
	double calcArea() {
		
		return Math.PI*r*r;
	}

	

}
