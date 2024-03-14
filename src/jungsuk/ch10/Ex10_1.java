package jungsuk.ch10;

import java.time.LocalDateTime;
import java.util.Calendar;

public class Ex10_1 {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		
		
		System.out.println(now);
		
		System.out.println(Calendar.getInstance());
		
		Calendar cal=Calendar.getInstance();
		
		cal.set(2010, 0, 1);
		
	
		System.out.println(cal);
		
		
		//1일의 요일을 구함
		
		System.out.println((Calendar.DAY_OF_WEEK));  //일 1 ....
		
		//System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 6은 금
		
		
		for(int i=1;i<=12;i++) {
			int monthFirstYoil =cal.get(Calendar.DAY_OF_WEEK);
			//System.out.println(monthFirstYoil);
			
			if(monthFirstYoil==6) {
				System.out.println(i+"월의 2번째 일요일은" + (i+9));
			}
			
			if(monthFirstYoil==5) {
				System.out.println(i+"월의 2번째 일요일은" + (i+8));
			}
			
			if(monthFirstYoil==4) {
				System.out.println(i+"월의 2번째 일요일은" + (i+7));
			}
			
		}
		
				
	}

}
