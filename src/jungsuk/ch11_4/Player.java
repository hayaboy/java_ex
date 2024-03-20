package jungsuk.ch11_4;

public class Player {
	String name;
	SutdaCard c1;
	SutdaCard c2;
	int point;

	Player(String name, SutdaCard c1, SutdaCard c2) {
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
	}

	public String toString() {
		return "[" + name + "]" + c1.toString() + "," + c2.toString();
	}
	
	
	
	

}
