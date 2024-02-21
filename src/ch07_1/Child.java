package ch07_1;

public class Child extends Parent {

	String name;
	
	public Child() {
		this("홍길동");
		System.out.println("C");
	}

	public Child(String name) {
		
		this.name = name;
		System.out.println("C(String name) call");
	}
	
	
	
	
}
