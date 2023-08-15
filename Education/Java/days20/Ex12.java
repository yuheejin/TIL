package Education.Java.days20;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

public class Ex12 {
	public static void main(String[] args) {		
		LocalDate d = LocalDate.now();
		// LocalDate d = LocalDate.of(2023,8,9);
		// LocalDate d = LocalDate.ofYearDay(2023, 365);
		System.out.println( d );		//2023-08-09
		
		// 년 [1]
		int year = d.getYear();
		System.out.println( year );
		// 년 [2]
		year = d.get( ChronoField.YEAR );
		System.out.println( year );
		
		// 월 [1]
		Month eMonth = d.getMonth();
		System.out.println( eMonth );	//AUGUST
		// 월 [2]
		int iMonth = d.getMonthValue();
		System.out.println( iMonth );	//8
		// 월 [3]
		iMonth = d.get( ChronoField.MONTH_OF_YEAR );
		System.out.println( iMonth );	//8
		
		// 일 [1]
		int date = d.getDayOfMonth();
		System.out.println( date );
		// 일 [2]
		date = d.get( ChronoField.DAY_OF_MONTH );
		System.out.println( date );

		// 요일 [1]
		DayOfWeek dayOfWeekDay = d.getDayOfWeek();
		System.out.println( dayOfWeekDay );		//WEDNESDAY
		// 요일 [2]
		int day = d.get( ChronoField.DAY_OF_WEEK );
		System.out.println( day );		//3
		
		
		
		LocalTime t = LocalTime.now();
		System.out.println( t );
		// 시간 [1]
		int hour = t.getHour();
		System.out.println( hour );	//16
		// 시간 [2]
		hour = t.get( ChronoField.CLOCK_HOUR_OF_DAY );	// 1~24
		System.out.println( hour );	//16
		// 시간 [3]
		hour = t.get( ChronoField.HOUR_OF_DAY );	// 0~23
		System.out.println( hour );	//16
		// 시간 [4]
		hour = t.get( ChronoField.CLOCK_HOUR_OF_AMPM );	// 1~12
		System.out.println( hour );	//4
		// 시간 [5]
		hour = t.get( ChronoField.HOUR_OF_AMPM );	// 0~11
		System.out.println( hour );	//4
		
		// 분 [1]
		int minute = t.getMinute();
		System.out.println( minute );	//38
		// 분 [2]
		minute = t.get( ChronoField.MINUTE_OF_HOUR );
		System.out.println( minute );	//38
		// 분 [3]
		minute = t.get( ChronoField.MINUTE_OF_DAY );
		System.out.println( minute );	//998
		
		// 초 [1]
		int second = t.getSecond();
		System.out.println( second );	//21
		// 초 [2]
		second = t.get( ChronoField.SECOND_OF_MINUTE );
		System.out.println( second );	//21
		// 초 [3]
		second = t.get( ChronoField.SECOND_OF_DAY );
		System.out.println( second );	//60021
		
		// 밀리세컨드 [1]
		int msecond = t.getNano();
		System.out.println( msecond );	//866457500
		// 밀리세컨드 [2]
		msecond = t.get( ChronoField.NANO_OF_SECOND );
		System.out.println( msecond );	//866457500
		
		
	} //main
} //class