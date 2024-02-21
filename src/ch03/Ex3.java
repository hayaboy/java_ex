package ch03;

public class Ex3 {

	public static void main(String[] args) {
		
		//요구사항
		
		// 534자루의 연필(pencils)

		// 30명 학생(students)
		
		
		//몫: 1인당 가질 수 있는 연필
		
		
		
//		534 / 30
		
		
		int pencils=534;
		int students=30;
		
		
		int pencelsPerStudent = pencils / students;
		
		System.out.println(pencelsPerStudent);
		
		int pencilLeft = pencils % students;
		
		
		System.out.println(pencilLeft);
		
		

	}

}

