package jungsuk.ch09;

public class Exercise9_10 {

	static void format(String str, int length, int align) {

		char [] charArr1= new char[length];
		
		char charArr2 [] = str.toCharArray();
		
		int diff = length - str.length();
		System.out.println("diff:" + diff);
		
		if(str!=null && str.length()!=0 ) {
			
			switch(align) {
			case 0:
				if(length < str.length()) {
					
					str=str.substring(0, length);
					
				}else {
					
					
					for(int i=0;i<length;i++) {
						charArr1[i]=' ';
					}
				
					//System.out.println(charArrr1.toString());
					
					//System.out.print("#");
					for(int i=0;i<length;i++) {					
						//System.out.print(charArr1[i]);					
					}
					//System.out.print("#");
					
					
					//System.out.println(charArr2);
					
					System.arraycopy(charArr2, 0, charArr1, 0, charArr2.length);
					//System.out.print("복사결과 :" );
					
					for(int i=0;i<charArr2.length;i++) {					
						System.out.print(charArr1[i]);					
					}
					
				}
				break;
			case 1:
				
				System.arraycopy(charArr2, 0, charArr1, diff/2, charArr2.length);
				for(int i=0;i<charArr2.length;i++) {					
					System.out.print(charArr1[i]);					
				}
				
				
				break;
			case 2:
				break;
			}
			
			
			
			
		
			
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		String str = "가나다"; 
		format(str,7,0); // 왼쪽 정렬
		System.out.println();
		format(str,7,1); // 가운데 정렬
//		System.out.println(format(str,7,2)); // 오른쪽 정렬

	}

}
