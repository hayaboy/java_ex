package jungsuk.ch06;

class Test{
	int num1=2;
	
	//인스턴스 변수 초기화 블록 
	{
		num1=3; 
	}
//	
	public Test() {
		num1=4;
	}
}


public class Ex6_14 {

	public static void main(String[] args) {
		
//		Test test=new Test();
//		System.out.println(test.num1);
		System.out.println("메인 앞");
		m2();
		System.out.println("메인 뒤");
		
	}

	static void m1() {
		System.out.println("m1 앞");
		System.out.println("m1");
		System.out.println("m1 뒤");
	}
	
	static void m2() {
		System.out.println("m2 앞");		
		m1();
		System.out.println("m2 뒤");
		
	}
	
	
	
	//16 a e
	//17 b	
	
	
	
	
}
