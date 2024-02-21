package ch03;

public class Ex7 {

	public static void main(String[] args) {
		
		
		double x=5.0;
//		double y=0.0;
		double y=2.0;
		
		double z= 5 % y;
		
		System.out.println(z);
		
		System.out.println(Double.isNaN(z));
		
		if(Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없음");
		}else {
			double result=z+10;
			System.out.println(result);
		}

	}

}
