package com.codegnan.jodaapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println("current date: "+date);

		LocalTime time=LocalTime.now();
		System.out.println("current time: "+time);
		
		
		///two at a time
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println("date and time:" +datetime);
		
		int dd=datetime.getDayOfMonth();
		int mm=datetime.getMonthValue();
		int yy=datetime.getYear();
	
		
			System.out.println("Day: "+dd);
			System.out.println("Month: "+mm);
			System.out.println("year: "+yy);
			
			int hh=datetime.getHour();
			int m=datetime.getMinute();
			int s=datetime.getSecond();
			int nn=datetime.getNano();
			
			System.out.println("Hour : "+hh);
			System.out.println("Minute : "+m);
			System.out.println("Seconds : "+s);
			System.out.println("Nano Seconds : "+nn);
			
			
			
			LocalDateTime dt=LocalDateTime.of(1995,Month.APRIL,28,12,45 );
			System.out.println(dt);
			
			System.out.println("After six months :"+dt.plusMonths(6));
			System.out.println("before six months :"+dt.minusMonths(6));
			
			//zone
			ZoneId zone=ZoneId.systemDefault();
			System.out.println(zone);
			//setting zone id america
			ZoneId la=zone.of("America/Los_Angeles");
			ZonedDateTime zt=ZonedDateTime.now(la);
			System.out.println(zt);
	}

}
