package ch12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex16 {

	public static void main(String[] args) {
Date d=new Date();
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY년 MM월 dd일 E요일 HH시 mm분");
		
		System.out.println(sdf.format(d));

	}

}
