package ch12;

import java.io.UnsupportedEncodingException;

public class Ex9 {
	public static void main(String[] args) throws Exception {
		
		byte byteArr[]= {-20, -107, -120,-21,-123,-107};
		
//		String str=new String(byteArr, "utf-8");
		String str=new String(byteArr);
		System.out.println(str);
		
	}
	

}
