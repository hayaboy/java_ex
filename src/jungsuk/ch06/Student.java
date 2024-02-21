package jungsuk.ch06;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return this.kor + this.eng + this.math;
	}

	double getAverage() {

		int tot = getTotal();

		double avg = (double) tot / 3;
		//System.out.println(avg);
		return  ((int)(avg* 10.0 + 0.5)/10.0);
	}
	
	
	
	float getAverage2() {

		int tot = getTotal();

		float avg = (float) tot / 3;
		//System.out.println(avg);
		return  (float) ((int)(avg* 10.0 + 0.5)/10.0);
	}

	String info() {
		return this.name + "," + this.ban + "," + this.no + "," + this.kor + "," + this.eng + "," + this.math + "," + getTotal() + "," + getAverage();
	}


}
