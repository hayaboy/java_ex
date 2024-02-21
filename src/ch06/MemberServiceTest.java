package ch06;

public class MemberServiceTest {

	public static void main(String[] args) {
	
		MemberService memberService=new MemberService();
		
		boolean  result=memberService.login("hong", "1234");
		
		//System.out.println(result);
		
		if(result) {
			System.out.println("로그인 됨");
			//memberService.logout("hong");
			
		}else {
			System.out.println("id 또는 password가 올바르지 않음");
		}
	}

}
