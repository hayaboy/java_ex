package jungsuk.ch11_4;



public class Student implements Comparable {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total; // 총점
	int schoolRank; // 전교등수

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Student) {
			Student targetStudent = (Student) o;			
			
			return  targetStudent.total - this.total;
		} else {
			return -1;
		}
	
	}

	public String toString() {
		return name
		+","+ban
		+","+no
		+","+kor
		+","+eng
		+","+math
		+"총점:,"+getTotal()
		+","+getAverage()
		+","+schoolRank; // 새로추가		
		}

}
