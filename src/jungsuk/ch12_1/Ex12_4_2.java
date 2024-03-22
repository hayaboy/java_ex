package jungsuk.ch12_1;

import java.util.ArrayList;

public class Ex12_4_2 {

	static <T extends Product>ArrayList<T> merge(ArrayList<T> list, ArrayList<T> list2) {
		ArrayList<T> newList = new ArrayList<>(list);
		newList.addAll(list2);
		return newList;
	}

	public static void main(String[] args) {
		ArrayList<Product> arrList1=new ArrayList<>();
		arrList1.add(new Product("모자"));
		arrList1.add(new Product("옷"));
		
		ArrayList<Product> arrList2=new ArrayList<>();
		arrList2.add(new Product("농구공"));
		arrList2.add(new Product("야구공"));
		
		ArrayList arr=merge(arrList1, arrList2);
		System.out.println(arr.toString());
		
	}

}
