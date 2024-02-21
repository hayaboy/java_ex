package jungsuk.ch07;

class Parent {
	int x = 100;

	Parent() {
		
		this(200);
		System.out.println("Parent - 기본 생성자");
	}

	Parent(int x) {
		this.x = x;
		System.out.println("Parent - 하나짜리 생성자");
	}

	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {
		this(1000);
		System.out.println("Child - 기본 생성자");
	
	}

	Child(int x) {
		this.x = x;
		System.out.println("Child - 하나짜리 생성자");
	}
}

public class Ex7_7 {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x="+c.getX());
	}

}
