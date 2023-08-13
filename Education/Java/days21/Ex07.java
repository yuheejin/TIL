package Education.Java.days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex07 {
	public static void main(String[] args) {
		// LocalDate	날짜
		// LocalTime	시간
		// LocalDateTime		날짜+시간
		/*
		LocalDateTime dt = LocalDateTime.now();
		
		// 2023-08-10T11:19:54.447036200
		System.out.println( dt );
		
		// truncatedTo : 절삭(내림)
		dt = dt.truncatedTo( ChronoUnit.DAYS );
		System.out.println( dt );
		*/
		
		/*
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.of(d, t);
		LocalDateTime dt2 = d.atTime(t);
		LocalDateTime dt3 = t.atDate(d);
		*/
		
		LocalDateTime dt = LocalDateTime.now();
		// LocalDateTime -> LocalDate 변환
		LocalDate d = dt.toLocalDate();
		// LocalDateTime -> LocalTime 변환
		LocalTime t = dt.toLocalTime();
		
				
	} //main
} //class