package jungsuk.ch07_1;

class Outer { // 외부 클래스
	static class Inner { // ( ) 내부 클래스 인스턴스 클래스
		int iv = 100;
	}
}

public class Exercise7_25 {

//	public static void main(String[] args) {
//		Outer outer =new Outer();
//		Outer.Inner inner=outer.new Inner();
//		System.out.println(inner.iv);
//	}
}
