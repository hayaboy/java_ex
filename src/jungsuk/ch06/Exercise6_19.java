package jungsuk.ch06;

public class Exercise6_19 {

	public static void change(String str) {
		System.out.println("-------");
		System.out.println(str);
		//str += "456";
		
		str = str + "456";
		//" ABC123456"
		System.out.println(str);
		System.out.println("메인 밖 해쉬코드"+System.identityHashCode(str));
		
	}

	public static void main(String[] args) {

		String str = "ABC123";
		System.out.println("메인 안" + System.identityHashCode(str));
		change(str);
		System.out.println("------------");
		System.out.println("메인 안 해쉬코드"+System.identityHashCode(str));
		System.out.println(str);
	}

}
