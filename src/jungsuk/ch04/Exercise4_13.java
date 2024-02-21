package jungsuk.ch04;

public class Exercise4_13 {

	public static void main(String[] args) {

		String value = "1234";
		char ch = ' ';
		boolean isNumber = true;

		for (int i = 0; i < value.length(); i++) {
//			System.out.println( value.charAt(i));
			
			ch=value.charAt(i);
			isNumber = (ch >= '0' && ch <= '9');
			
//			System.out.println(isNumber);
			
			if(isNumber==false) {
				isNumber=false;
				break;
			}
			
		}

		if (isNumber) {
			System.out.println(value + " 는 숫자입니다.");
		} else {
			System.out.println(value + " 는 숫자가 아닙니다.");
		}

	}

}
