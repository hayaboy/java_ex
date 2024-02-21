package ch05;

public class Ex1 {

	public static void main(String[] args) {
		
		
		int num1=4;
		
		
		String str1=new String("hong");
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
		
		str1=null;
		
		System.out.println(System.identityHashCode(str1));
	}
	
//	num1=7;

}
