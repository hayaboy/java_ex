package ch12;

public class Ex12 {
	public static void main(String[] args) {
		
		
		Integer obj1=100;
		Integer obj2=100;		
		Integer obj3=300;
		Integer obj4=300;
		
		// 값의 범위가 -128 ~ 127은 값 비교, 그 이외에는 번지 비교
		System.out.println( obj1 == obj2); 
		
		System.out.println( obj3 == obj4); 
	}
}
