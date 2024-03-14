package jungsuk.ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_1_2 {

	public static void main(String[] args) {

		// 매월 1일이 무슨 요일인지 확인

		// 1일이 일요일이라면 8

		// 월요일이라면 14
		// 화요일이라면 13

		Calendar cal = Calendar.getInstance();
	
//		System.out.println(cal);
		
		cal.set(2010, 0, 1); // cal 2010 1 1 의 날짜를 년 월 일로 설정한다
		
		for (int i = 0; i < 12; i++) {
		
			int weekday = cal.get(Calendar.DAY_OF_WEEK); // 1일의 요일을 구한다
			
			
			
			int secondSunday = (weekday == 1) ? 8 : 16 - weekday;
			
			
			
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			
			Date d = cal.getTime(); // Calendar.Date를  변환한다
			
			System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));
			
			// 1 . 날짜를 다음달 일로 변경한다
			
			cal.add(Calendar.MONTH, 1);
			
			cal.set(Calendar.DAY_OF_MONTH, 1);

		}

	}
}
