package Education.Java.days21;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Ex06 {
	public static void main(String[] args) {
		
		LocalTime t = LocalTime.now();
		
		// getXXX()
		// get()
		System.out.println( t.getHour() );
		System.out.println( t.getMinute() );
		System.out.println( t.getSecond() );
		System.out.println( t.getNano() );
		// 밀리세컨드
		System.out.println( t.get( ChronoField.MILLI_OF_SECOND ) );
		System.out.println( t.getLong( ChronoField.MILLI_OF_SECOND ) );
		
		// 30분 후에 점심
		t = t.plusMinutes(30);
		System.out.println( t );
		
		// 10분 전에 쉬는시간
		t = t.minusMinutes(10);
		System.out.println( t );
		
		// 1시간 30분 후에 점심
		t = t.plusMinutes(90);
		// t = t.plusHours(1).plusMinutes(30);
		System.out.println( t );
				
	} //main
} //class