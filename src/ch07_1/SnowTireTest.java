package ch07_1;

public class SnowTireTest {

	public static void main(String[] args) {
		SnowTire snowTire=new SnowTire();
		
		Tire tire=snowTire;
		snowTire.run();
		
		tire.run();
	}

}
