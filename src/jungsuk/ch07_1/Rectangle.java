package jungsuk.ch07_1;

public class Rectangle extends Shape{

	 double width;
	 double height;
	
	 
	 
	 
	 public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Rectangle(Point p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	
	


	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}


	@Override
	double calcArea() {
		
		return width*height;
	}

	
	 boolean isSquare(){
		 if(width*height!=0 && width == height) {
			 return true;
		 }else {
			 return false;
		 }
		 
		
	 }
}
