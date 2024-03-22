package jungsuk.ch12_1;

public class BoxTest {

	public static void main(String[] args) {
		Box<?> b1=new Box();

		Box<?> b2 = new Box<>();
		 //Box<?> b = new Box<>();
		//Box<?> b = new Box<Object>();
		//Box<Object> b = new Box<Fruit>();
		 Box b3 = new Box<Fruit>();
		 
		Box<? extends Fruit> b4=new Box<Apple>();
		//new Box<? extends Fruit>();
		 
		 //Box<? extends Object> b = new Box<? extends Fruit>();

	}

}
