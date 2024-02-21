package ch04;

public class Ex4_5 {

	public static void main(String[] args) {

		// 4x +5y = 60
		//(x,y)  
		// 단, x와 y는 10 이하의 자연수
		// x 1,2,3,4,5,6,7,8,9,10
		// y 1,2,3,4,5,6,7,8,9,10
		
		//이중(nested)for문
		
		for(int x=1;x<=10;x++) {
			for(int y=1;y<=10;y++) {
				//4*x + 5*y == 60
				if(4*x + 5*y == 60) {
					System.out.printf("(%d, %d) \n",x,y);
				}
			}
//			System.out.println();
		}
		

	}

}
