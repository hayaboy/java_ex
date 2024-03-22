package jungsuk.ch12_1;

public class Box<T extends Fruit> {

	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
}
