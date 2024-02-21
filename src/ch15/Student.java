package ch15;

public class Student {

	
	public int studentNum;
	public String name;
	
	
	public Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}
	
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student stu) {
			if (this.studentNum == stu.getStudentNum()) {
				return true;
			}

		}
		return false;
	}


	public int getStudentNum() {
		return studentNum;
	}


	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	

}
