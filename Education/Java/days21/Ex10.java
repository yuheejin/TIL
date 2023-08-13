package Education.Java.days21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex10 {
	public static void main(String[] args) {
		// 날짜와 날짜 사이의 간격 (차) : Period
		// 시간과 시간 사이의 간격 (차) : Duration
		
		// - between() == until()
		// 		static 메서드		인스턴스 메서드
		
		// - of(), with()
		// - plus(), minus() 등등 메서드
		
		// 개강일로부터 얼마나 지났는가
		// 개강일
		LocalDate s = LocalDate.of(2023, 7, 13);
		// 오늘날짜
		LocalDate t = LocalDate.now();
		
		// 날짜 차  s <=  < t
		Period p = Period.between( s, t.plusDays(1) );
		int year = p.getYears();
		System.out.println( year );
		
		long month = p.get( ChronoUnit.MONTHS );
		System.out.println( month );
		
		long day = p.getDays();
		System.out.println( day );
		
		
		// 수업 시작한지 얼마나 지났는가  
		LocalTime st = LocalTime.of(9, 0, 0);
		LocalTime tt = LocalTime.now();
		
		// 시간 차 st <=  < tt
		Duration d = Duration.between(st, tt);
		long ss = d.getSeconds();
		System.out.println( (ss%(60*60)) %60 );	//초
		System.out.println( (ss%(60*60)) /60 );		//분
		System.out.println( ss/(60*60) );		//시간
		
		// java.time.temporal.UnsupportedTemporalTypeException
		// 지원하지 않음
		// long h = d.get( ChronoUnit.HOURS );
		
	} //main
} //class