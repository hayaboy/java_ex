package jungsuk.ch09;

public class Exercise9_13 {

	
	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
		}

	
	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		
		if (key == null || key.length() == 0)
		return 0;
		
		
		//System.out.println("#" + src.indexOf(key));
		
		System.out.println(src.indexOf(key)!= -1);
		
//		while(src.indexOf(key) != -1) {
		while(   (index=src.indexOf(key, pos)) != -1) {
			
			count++;
			pos = index + key.length();
			//0 -> 0 + 2
			//2
		}
		
		
		
		return count;
	}
	
	public static void main(String[] args) {
		
		String src = "aabbccAABBCCaa";
		//System.out.println(src);
		System.out.println("aa를 " + stringCount(src, "aa") +" 개 찾았습니다 ."); 
	}

}
