package jungsuk.ch12_1;

import java.util.ArrayList;

public class Ex12_4 {

	ArrayList<? extends Product> merge(ArrayList<? extends Product> list, ArrayList<? extends Product> list2) {
		ArrayList<? extends Product> newList = new ArrayList<>(list);
		//newList.addAll(list2);
		return newList;
	}

	public static void main(String[] args) {

	}

}
