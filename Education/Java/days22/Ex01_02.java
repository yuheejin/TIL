package Education.Java.days22;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex01_02 {
	public static void main(String[] args) {
		// 2-2. String s = "2023.08.11 (금)" 문자열을 LocalDate 클래스로 변환시키세요.
		String s = "2023.08.11 (금)";
		String pattern = "yyyy.MM.dd (E)";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		LocalDate d = LocalDate.parse(s, dtf);
		System.out.println( d );
		
	} //main
} //class