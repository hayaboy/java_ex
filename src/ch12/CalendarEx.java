package ch12;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		Calendar now=Calendar.getInstance();
		
		System.out.println(now);
		
		
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH) +1);
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		

	}

}
