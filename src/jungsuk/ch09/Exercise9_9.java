package jungsuk.ch09;

public class Exercise9_9 {

	static String delChar(String src, String delCH) {

		char ch1 = ' ';
		char ch2 = ' ';

		StringBuffer sb = new StringBuffer();
	
		for (int i = 0; i < delCH.length(); i++) {
			ch1 = src.charAt(i);	
			//System.out.println("문자로 분리:" + ch1);
			for (int j = 0; j < delCH.length(); j++) {
				ch2 = delCH.charAt(j);			
				if (ch1 == ch2) {					
					src=src.replace(ch1, ' ');					
				}

			}

		}


		
		return src.replaceAll(" ", "");
	}

	public static void main(String[] args) {

		System.out.println(delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		
		System.out.println(delChar("(1 2 3 4\t5)", " \t"));
		
		//System.out.println("(1 2 3 4\t5)");

	}

}
