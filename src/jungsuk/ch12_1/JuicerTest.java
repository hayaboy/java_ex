package jungsuk.ch12_1;

public class JuicerTest {

	public static void main(String[] args) {
		//Juicer.<Apple>makeJuice(new FruitBox<Fruit>());
		//Juicer.<Fruit>makeJuice(new FruitBox<Grape>());
		Juicer.<Fruit>makeJuice(new FruitBox<Fruit>());
		Juicer.makeJuice(new FruitBox<Apple>());
		//Juicer.makeJuice(new FruitBox<Object>());
	}

}
