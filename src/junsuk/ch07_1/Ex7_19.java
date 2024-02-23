package junsuk.ch07_1;






public class Ex7_19 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		b.buy(new Tv());  // 1000 -100 : 900
		b.buy(new Computer()); // 900-200 : 700
		b.buy(new Tv()); //700-100 : 600
		b.buy(new Audio()); // 600 - 50 = 550
		b.buy(new Computer()); // 550- 200 : 350
		b.buy(new Computer()); // 350 - 200 : 150 
		b.buy(new Computer()); // 150 - 200 : X
		
		b.summary();
	}

}
