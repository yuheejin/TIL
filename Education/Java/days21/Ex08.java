package Education.Java.days21;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class Ex08 {
	public static void main(String[] args) {
		// 이번 달이 마지막 날짜 몇 일까지...
		// 1. Date
		Date d = new Date();
		d.setMonth( d.getMonth()+1 );
		d.setDate( 0 );
		System.out.println( d.getDate() );
		
		// 2. Calendar
		Calendar c = Calendar.getInstance();
		System.out.println( c.getActualMaximum(Calendar.DATE) );
		
		// 3. LocalDate
		// String source = "2009-12-30";
		// LocalDate ld = LocalDate.parse(source);
		LocalDate ld = LocalDate.now();
		// [1]
		System.out.println( ld.lengthOfMonth() );	// 마지막 날짜
		LocalDate lastDate = ld.withDayOfMonth(ld.lengthOfMonth());	// 마지막 날짜 객체
		System.out.println( lastDate );
		// [2]
		LocalDate today = LocalDate.now();
		LocalDate lastDate2 = today.with( TemporalAdjusters.lastDayOfMonth() );
		System.out.println( lastDate2 );
		
				
	} //main
} //class