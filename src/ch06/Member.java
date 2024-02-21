package ch06;

public class Member {
	
	//이름, 아이디, 패스워드, 나이
	
	String name;
	String id;
	String password;
	int age;
	
	//생
	public Member() {
	
	}
	
	Member(String id, String password){
		this.id= id;
		this.password= password;
	}

}
