package jungsuk.ch09;

public class Exercise9_9_2 {

	static String delChar(String src, String delCH) {

		
		StringBuffer sb = new StringBuffer(src.length());
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			
			//System.out.println(delCH.indexOf(ch)==-1);
			
			if(delCH.indexOf(ch)==-1) {
				sb.append(ch);
			}
			
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println(delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		
		System.out.println(delChar("(1 2 3 4\t5)", " \t"));
		
		//System.out.println("(1 2 3 4\t5)");

	}

}
