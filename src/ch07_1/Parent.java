package ch07_1;

public class Parent {

	String nation;

	public Parent() {

		this("대한민국");
		System.out.println("P()");
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("P(String nation) call");
	}

}
