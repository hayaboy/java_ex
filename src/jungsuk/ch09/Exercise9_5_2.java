package jungsuk.ch09;

public class Exercise9_5_2 {

	public static int count(String src, String target) {
		int count = 0; // 찾은 횟수
		int pos = 0;
		
		while(true) {
			
			pos=src.indexOf(target, pos);
			//System.out.println(pos);
			
			if(pos!=-1) {
				count++;
				
				pos += target.length();
			}else {
				break;
			}
			
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
	}

}
