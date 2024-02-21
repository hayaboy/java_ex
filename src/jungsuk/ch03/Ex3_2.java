package jungsuk.ch03;

public class Ex3_2 {

	public static void main(String[] args) {
		
		int numOfApples = 10037; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기 바구니에 담을 수 있는 사과의 개수
		
		
		int numOfBucket =  numOfApples / sizeOfBucket;
		
		 numOfBucket =  ( numOfApples % sizeOfBucket == 0  ) ? numOfBucket : (numOfBucket +1) ;
		
		System.out.println(numOfBucket);
		
		
		
		//삼항연산자 두가지 경우에 해당하는 결과에 연산을 한 후 한 줄에 
		
//		System.out.println(  false ? "참" : "거짓");
//		
//		System.out.println(numOfApples % sizeOfBucket);
	
		
//		System.out.println(numOfApples % sizeOfBucket == 0);
		
		
		//System.out.println(  numOfApples % sizeOfBucket == 0 ? numOfBucket : numOfBucket +1);
		
		
		
		
		
	}

}
