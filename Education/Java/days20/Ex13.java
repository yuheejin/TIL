package Education.Java.days20;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex13 {
	public static void main(String[] args) {		
		LocalDate d = LocalDate.now();
		System.out.println( d );	//2023-08-09
		
		d.withYear(2020);
		System.out.println( d );	//2023-08-09
		
		// String은 변경 불가능한 객체이므로 다시 대입해줘야 한다.
		String a = "xyzz";
		a = a.replace('x', 't');
		System.out.println( a );
		
		// LocalDate 도 마찬가지로 변경 불가능한 객체이므로 같은 작업을 해줘야한다.
		d = d.withYear(2020);
		d = d.withMonth(5);
		d = d.withDayOfMonth(11);
		System.out.println( d );	//2020-05-11
		
		d = d.with( ChronoField.YEAR, 2010 );
		d = d.with( ChronoField.MONTH_OF_YEAR, 7 );
		d = d.with( ChronoField.DAY_OF_MONTH, 3 );
		System.out.println( d );	//2010-07-03
		
	} //main
} //class