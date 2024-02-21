package jungsuk.ch06;


public class PlayingCard {

	
	int kind; //인스턴스 필드(변수)
	int num; //인스턴스 필드(변수)
	
	static int width;  //스태틱 필드(변수)
	static int height; //스태틱 필드(변수)

	PlayingCard(int k, int n) {  // k, n은 지역 변수
		kind = k;
		num = n;
	}

	public static void main(String args[]) { // args, card은 객체, 인스턴스, 참조변수, 지역 변수
		PlayingCard card = new PlayingCard(1, 1);
	}

}
