package ch11;

public class Ex11_6 {

	public static void main(String[] args) {

		String strArr[]= {"10", "2a"};
		
		int value=0;
		
		
		for(int i=0;i<=2;i++) {			
			
			try {
			
				value=Integer.parseInt(strArr[i]);
				
				//System.out.println(value);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 초과함");
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환 할 수 없음");
			}finally {
				System.out.println(value);
			}
			
			
			
		}
		

	}

}
