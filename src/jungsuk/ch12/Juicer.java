package jungsuk.ch12;

public class Juicer {

	
	
	public Juicer() {
	
	}
	
	
	//지네릭 메서드
	static <T extends Fruit> String makeJuice(FruitBox<T> box){
		
		String tmp = "";
		
		for(Fruit f: box.getList() ) {
			tmp += f +" ";
		}
		
		
		return tmp;
	}
	
}
