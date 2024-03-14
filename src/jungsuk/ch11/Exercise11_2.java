package jungsuk.ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Exercise11_2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);

		
		System.out.println(list);
		
		HashSet set = new HashSet(list);
		
		System.out.println(set);
		
		
		TreeSet tset = new TreeSet(set);
//		
//		
		System.out.println(tset);
//		
//		
//		
		Stack stack = new Stack();		

		stack.addAll(tset);
//		
		System.out.println(stack);
//
//		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
//			
		
		
		
		//11_3   a
		
		//11_4   6
		
		//
		
		
		

	}

}
