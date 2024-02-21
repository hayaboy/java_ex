package ch12;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ex15 {

	public static void main(String[] args) {
	
		LocalDateTime startDateTime = LocalDateTime.now();
		
		System.out.println(startDateTime);
		
		System.out.println(LocalDateTime.of(2024, 12, 31, 0, 0,0));
		
		LocalDateTime endDateTime= LocalDateTime.of(startDateTime.getYear(), 12, 31, 0, 0,0);
		
		System.out.println(startDateTime.getYear());
		//TemporalUnit 		:A unit of date-time, such as Days or Hours.
		//ChronoUnit  : A standard set of date periods units.
		
		System.out.println(startDateTime.until(endDateTime, ChronoUnit.DAYS));
		
	}

}
