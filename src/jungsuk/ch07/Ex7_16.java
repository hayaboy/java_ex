package jungsuk.ch07;

class Car {
}

class FireEngine extends Car implements Movable {
}

class Ambulance extends Car {
}

public class Ex7_16 {

	public static void main(String[] args) {

		FireEngine fe = new FireEngine();

		//System.out.println(fe instanceof FireEngine);
		System.out.println(fe instanceof Movable);
		System.out.println(fe instanceof Object);
		System.out.println(fe instanceof Car);
		
		//System.out.println(fe instanceof Ambulance);

	}

}
