package ch04;

public class Ex4_4_2 {

	public static void main(String[] args) {

//		System.out.println((int)(Math.random() * 6) + 1);

//		int num1=(int)(Math.random() * 6) + 1;
//		int num2=(int)(Math.random() * 6) + 1;
		
		int num1=0;
		int num2=0;

//		int result=num1+num2;

		while (num1 + num2 != 5) {
			 num1 = (int) (Math.random() * 6) + 1;
			 num2 = (int) (Math.random() * 6) + 1;
//			int result = num1 + num2;
			 System.out.printf("(%d, %d) ", num1, num2);
//			if (result == 5) {
//				System.out.printf("(%d, %d) ", num1, num2);
//				break;
//			}

		}

	}

}
