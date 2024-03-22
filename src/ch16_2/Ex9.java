package ch16_2;

public class Ex9 {

	
	private static Student students[]= {
			new Student("홍", 95,96),
			new Student("신", 95,93)
			};
	
	
	
	static double avg(Function<Student> t){
		

		
		int sum=0;
		for(Student stu : students) {
			sum += t.apply(stu);
		}
		
		double avg=  (double)sum / students.length;
		
		return avg;
	}
	
	public static void main(String[] args) {
		
		double enAvg=avg(
				Student::getEnScore
				);
		
		
		System.out.println("영어 평균" + enAvg);

		System.out.println("==============");
		
		double mathAvg=avg(
				Student::getMathScore
				);
		
		
		System.out.println("수학 평균" + mathAvg);
	}

}
