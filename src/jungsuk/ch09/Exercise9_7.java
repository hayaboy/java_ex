package jungsuk.ch09;

public class Exercise9_7 {

	
	static boolean contains(String src, String target) {
		
		
		boolean result=src.contains(target);
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));

	}

}
