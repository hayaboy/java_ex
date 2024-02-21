package jungsuk.ch06;

public class Ex6_22 {

	static boolean isNumber(String str) {

		boolean result = false;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			System.out.println(ch);

			if (ch >= '0' && ch <= '9') {

				result = true;
				
			} else {
				result = false;
			}

		}
		return result;

	}

	public static void main(String[] args) {

		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}

}
