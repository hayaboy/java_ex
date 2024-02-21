package jungsuk.ch06;

public class SutdaCard {
	
	int num;
	boolean isKwang;
	
	public SutdaCard() {
		this(1,true);
	}
//
	public SutdaCard(int num, boolean isKwang) {
		super();
		this.num = num;
		this.isKwang = isKwang;
	}
//	
	String info(){
		//return  "" + this.num;
				
				
		return 		this.isKwang ? ""+this.num+"K" : "" + this.num;
	}

}
