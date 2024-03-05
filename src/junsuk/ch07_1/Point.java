package junsuk.ch07_1;

public class Point {

	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}

}
