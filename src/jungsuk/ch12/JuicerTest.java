package jungsuk.ch12;

public class JuicerTest {

	public static void main(String[] args) {
		
//		Juicer.makeJuice(new FruitBox<Fruit>());
//		Juicer.makeJuice(new FruitBox<Grape>());
		
		Juicer.<Apple>makeJuice(new FruitBox<Apple>());
		Juicer.<Grape>makeJuice(new FruitBox<Grape>());
		Juicer.<Fruit>makeJuice(new FruitBox<Fruit>());
		Juicer.makeJuice(new FruitBox<Apple>());
		//Juicer.makeJuice(new FruitBox<Object>());
	}

}
