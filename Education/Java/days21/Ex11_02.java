package Education.Java.days21;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex11_02 {
	public static void main(String[] args) {
		// DateTimeFormatter.format()
		// DateTimeFormatter.parse()
		
		/*
		// String source = "2023-08-10";
		
		// DateTimeParseException
		String source = "2023년 08월 10일 (목)";
		LocalDate d = LocalDate.parse(source);
		System.out.println( d );
		*/
		
		String source = "2023년 08월 10일 (목)";
		String pattern = "yyyy년 MM월 dd일 (E)";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		LocalDate d = LocalDate.parse(source, dtf);
		System.out.println( d );
		
		LocalTime t = LocalTime.parse("12:23:43");
		System.out.println( t );
				
	} //main
} //class