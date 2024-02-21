package jungsuk.ch03;

public class Exercise3_9 {

	public static void main(String[] args) {
		
		char ch = '$';

//		System.out.println( true ? "참": "거짓");

		//'a'부터 'z'까지 : 소문자  'a' <= ch <= 'z'
		//  ch >= 'a' && ch <= 'z'
		
		
		//'A'부터 'Z'까지 : 대문자
		
//		System.out.println(ch >= 'a' && ch <= 'z');
//		System.out.println(ch >= 'A' && ch <= 'Z');
		
		//System.out.println((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));
		
		//숫자 0 ~ 9
		//'0' ~ '9'
		//'0'부터 '9'까지 : 숫자  '0' <= ch <= '9'
		
		//System.out.println((ch >= '0' && ch <= '9'));		
		
		System.out.println(((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) || (ch >= '0' && ch <= '9'));
		
		boolean b = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) || (ch >= '0' && ch <= '9');
		
		System.out.println( b);
	}

}
