package Education.Java.days22;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		// 2. 현재 날짜와 시간 정보를   LocalDateTime 클래스를 사용해서 아래와 같은 형식으로 출력하세요 . 
		// [출력형식] 2023/08/11 금요일   07:02:32.259
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		String pattern = "yyyy/MM/dd E요일   hh:mm:ss.SSS";
		DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
		System.out.println( df.format(dt) );
	} //main
} //class