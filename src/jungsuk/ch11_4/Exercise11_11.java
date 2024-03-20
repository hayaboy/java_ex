package jungsuk.ch11_4;

import java.util.HashSet;

public class Exercise11_11 {

	public static void main(String[] args) {
		
		SutdaCard c1 = new SutdaCard(3,true);
		SutdaCard c2 = new SutdaCard(3,true);
		SutdaCard c3 = new SutdaCard(1,true);
		
		
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		
		HashSet set = new HashSet();

		set.add(c1);
		set.add(c2);
		set.add(c3);
		System.out.println(set);

	}

}
