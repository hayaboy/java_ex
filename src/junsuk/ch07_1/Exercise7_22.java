package junsuk.ch07_1;

public class Exercise7_22 {

	

	public static void main(String[] args) {
		Rectangle shape	=new Rectangle(5,6);
		double result=shape.calcArea();
		System.out.println(result);
		System.out.println(shape.isSquare());
		Rectangle shape2	=new Rectangle(5,5);
		System.out.println(shape2.isSquare());
		
		Circle shape3	=new Circle(5);
		double result2=shape3.calcArea();
		System.out.println(result2);
		
	}

}
