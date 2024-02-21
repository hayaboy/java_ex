package ch06;

public class MemberService {

	// DB에 이 값이 정해져 있다라고 생각!!!
	// 필
	// Member m1 = new Member("hong", "1234");

	String id = "hong";
	String password = "12345";
	// 생

	// 메

	// id와 패스워드를 넣어주면서 로그인하다.
	boolean login(String id, String password) {

//		System.out.println(m1.id);
//		System.out.println(m1.password);

		// id가 "hong",(그리고) and
//		if (this.id.equals(id) && this.password.equals(password)) {
//			//System.out.println("로그인함");
//			return true;
//		} else {
//			return false;
//		}

		if (this.id.equals(id) && this.password.equals(password)) {
			return true;
		} else {
			return false;
		}

	}

	// id를 넣어주면서 로그아웃하다.
	void logout(String id) {
//		System.out.println("로그아웃함");
		System.out.println(this.id + "님 로그아웃");
	}
}
