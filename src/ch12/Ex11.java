package ch12;

import java.util.StringTokenizer;

public class Ex11 {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";

		StringTokenizer strtkn = new StringTokenizer(str, ",");

		System.out.println(strtkn);
		

		
		while (strtkn.hasMoreElements()) {
			System.out.printf( "%s,"     , strtkn.nextToken());
		}
	}

}
