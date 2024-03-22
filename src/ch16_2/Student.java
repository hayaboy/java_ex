package ch16_2;



public class Student {
	
	
	private String name;
	private int enScore;
	private int mathScore;
	
	public Student() {
	
	}
	
	public Student(String name, int enScore, int mathScore) {
		super();
		this.name = name;
		this.enScore = enScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnScore() {
		return enScore;
	}

	public void setEnScore(int enScore) {
		this.enScore = enScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	

}
