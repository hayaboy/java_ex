package jungsuk.ch09;

import java.nio.file.Paths;

public class Exercise9_3 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
//		System.out.println(Paths.get(fullPath));
		
		//System.out.println(fullPath.lastIndexOf("\\"));
		
		int num=fullPath.lastIndexOf("\\");
		
//		System.out.println(fullPath.substring(0, num));
		
		path=fullPath.substring(0, num);
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);

//		System.out.println(fullPath.substring(num+1));
		fileName = fullPath.substring(num+1);
		System.out.println("fileName:"+fileName);

	}

}
