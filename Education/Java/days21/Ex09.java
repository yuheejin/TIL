package Education.Java.days21;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.TemporalAdjusters.*;
import static java.time.DayOfWeek.*;

import java.time.DayOfWeek;

public class Ex09 {
	public static void main(String[] args) {
		// [ TemporalAdjusters 클래스 ]
		//		- 날짜, 시간 변경 : withXXX(), with(), plusXXX(), plus(), minusXXX(), minus()
		//		- 자주 사용되는 날짜, 시간 변경하는 메서드들을 미리 구현을 해 놓은 클래스
		LocalDate d = LocalDate.now();
		System.out.println( d );
		
		// 다음 달의 첫 날 : firstDayOfNextMonth()
		System.out.println( d.with( firstDayOfNextMonth() ) );
		
		// 이번 달의 첫날 : firstDayOfMonth()
		System.out.println( d.with( firstDayOfMonth() ) );
		
		// 올 해의 첫 날 : firstDayOfYear()
		System.out.println( d.with( firstDayOfYear() ) );
		
		// 다음 년도의 첫 날 : firstDayOfYear()
		// 올 해의 마지막 날
		// 이번 달의 마지막 날
		
		// 이번달 n번째 ?요일 : dayOfWeekInMonth(n, DayOfWeek)
		// 이번달 1번째 월요일 : firstInMonth( DayOfWeek)
		System.out.println( d.with( dayOfWeekInMonth(1, DayOfWeek.MONDAY) ) );
		System.out.println( d.with( firstInMonth( DayOfWeek.MONDAY) ) );
		
		// 지난 ?요일 : previous( DayOfWeek )
		System.out.println( d.with( previous( DayOfWeek.TUESDAY) ) );
		// 오늘을 포함 : previousOrSame( DayOfWeek )
		System.out.println( d.with( previousOrSame( DayOfWeek.TUESDAY) ) );
		
		// 다음 ?요일 : next( DayOfWeek )
		System.out.println( d.with( next( DayOfWeek.TUESDAY) ) );
		// 오늘을 포함 : nextOrSame( DayOfWeek )
		System.out.println( d.with( nextOrSame( DayOfWeek.TUESDAY) ) );
		
		// 3일 뒤에 만나자(약속)
		// d.plusDays(3);
		d = d.with( new DayAfter3일() );
		System.out.println( d );
		
	} //main
} //class

class DayAfter3일 implements TemporalAdjuster{

	@Override
	public Temporal adjustInto(Temporal temporal) {
		return temporal.plus(3, ChronoUnit.DAYS);
	}
	
} //class DayAfter3일


