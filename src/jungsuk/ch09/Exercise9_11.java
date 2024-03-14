package jungsuk.ch09;

public class Exercise9_11 {

	public static void main(String[] args) {

		try {

			

			int args0 = Integer.parseInt(args[0]);
			int args1 = Integer.parseInt(args[1]);
			
//			System.out.println(args0);
//			System.out.println(args1);
			
			if (args.length != 2 || args == null) {			

				System.out.println("두 개의 정수를 입력해주세요");
				return;
			} else if ( !(args0 >= 2 && args0 <= 9) || !(args1 >= 2 && args1 <= 9)) {
				System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.");
			} else {
				
				
				for(int i=args0;i<=args1;i++) {
					for(int j=1;j<=9;j++) {
						System.out.printf("%d*%d=%d \n", i, j, i*j);
					}
					System.out.println();
				}
				
				
				
				
				
				

			}
		} catch (Exception e) {
				System.out.println("두 개의 정수를 입력해주세요 ");
		}

	}

}
