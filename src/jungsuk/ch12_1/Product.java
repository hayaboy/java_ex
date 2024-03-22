package jungsuk.ch12_1;

public class Product {
	
	
	String productName;
	
	public Product() {
	
	}

	public Product(String productName) {
		super();
		this.productName = productName;
	}
	
	
	@Override
	public String toString() {
		
		return this.productName;
	}
	

}
