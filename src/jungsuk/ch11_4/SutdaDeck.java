package jungsuk.ch11_4;

import java.util.HashMap;

public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	int pos = 0; // 다음에 가져올 카드의 위치
	HashMap jokbo = new HashMap(); // HashMap

	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = i < 10 && (num == 1 || num == 3 || num == 8);
			cards[i] = new SutdaCard(num, isKwang);
		}
		//registerJokbo();
	}

	
	void registerJokbo() {
		
	}
	
	int getPoint(Player p) {
		if(p==null) return 0;
		SutdaCard c1 = p.c1;
		SutdaCard c2 = p.c2;
		Integer result = 0;
		return result.intValue();
	}
	
}
