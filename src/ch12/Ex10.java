package ch12;

public class Ex10 {

	public static void main(String[] args) {
		String str="";
		long startTime1 = System.nanoTime();
		for(int i=1;i<=100;i++) {
			str +=i;
//			System.out.println(str);
		}
		
		
		long endTime1 = System.nanoTime();
		
		System.out.println(endTime1 -startTime1 );
		
		System.out.println(str);
		
		System.out.println("==================");
		long startTime2 = System.nanoTime();
		StringBuilder str2 = new StringBuilder("");
		
		for(int i=1;i<=100;i++) {
			str2.append(i);
		}
		long endTime2 = System.nanoTime();
		System.out.println("StringBuilder이용시"  + str2.toString());
		
		System.out.println(endTime2 -startTime2 );
		
	}

}
