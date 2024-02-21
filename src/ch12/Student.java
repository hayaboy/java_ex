package ch12;

public class Student {

	private String studentNum;

	public Student(String studentNum) {
		
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	
	
	@Override
	public int hashCode() {
		int hashCode=studentNum.hashCode();
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		//if(obj instanceof Student stu) {
		if(obj instanceof Student) {
			Student stu=(Student)obj;
			if(this.studentNum.equals(stu.getStudentNum())) {
				return true;
			}
		}
		
		return false;
	}
	
	
}
