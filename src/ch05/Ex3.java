package ch05;

public class Ex3 {

	public static void main(String[] args) {
		

		String str1="hong";
		
		String str2="hong";
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(str1==str2);
		
		
		System.out.println("====================");
		String str3=new String("hong");
		
		String str4=new String("hong");
		
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(str3==str4);
		
		System.out.println("-----------------");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		
		
		
		
	}

}
