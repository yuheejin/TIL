package Education.Java.days21;

import java.text.MessageFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class Ex02 {
	public static void main(String[] args) {
//		Date d = new Date(2023, 7, 13);
//		int addDate = d.getDate() + 100;
//		d.setDate(addDate);
//		System.out.printf( "%d년 %d월 %d일", d.getYear(), d.getMonth(), d.getDate() );
//		
		Calendar c = Calendar.getInstance();
		c.set(2023, 7, 13);
		c.add(Calendar.DATE, 100);
		System.out.printf( "%d년 %d월 %d일", c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE) );
//		
//		LocalDate ld = LocalDate.of(2023, 7, 13);
//		ld = ld.plusDays(100);
//		System.out.printf( "%d년 %d월 %d일", ld.get(ChronoField.YEAR), ld.get(ChronoField.MONTH_OF_YEAR), ld.get(ChronoField.DAY_OF_MONTH) );
		
		
//		
//		LocalDateTime endLdt = LocalDateTime.of(2023, 12, 27, 0, 0, 0);
//		LocalDateTime nowLdt = LocalDateTime.now();
//		int result = endLdt.getNano()-nowLdt.getNano();
//		
		
//		Date endD = new Date(2023-1900, 12-1, 27);
//		Date nowD = new Date();
//		long result = endD.getTime() - nowD.getTime();
//		System.out.println( result );
//		
//		int[] str = {24*60*60*1000, 60*60*1000, 60*1000, 1000,1};
//		long[] 몫 = new long [5];
//		for (int i = 0; i < str.length; i++) {
//			몫[i] = result/str[i];
//			result = result%str[i];
//		} // for
//		
//		String pattern = "{0}일 {1}시간 {2}분 {3}초 {4}밀초";
//		MessageFormat mf = new MessageFormat(pattern);
//		System.out.println( mf.format(pattern, 몫[0], 몫[1], 몫[2], 몫[3], 몫[4]) );
//		
//		String source = "번호:1,이름:홍길동,주소:서울 양천구 목동";
//		String pattern = "번호:{0},이름:{1},주소:{2}";
//		MessageFormat mf = new MessageFormat(pattern);
//		try {
//			Object[] obj = mf.parse(source);
//			for (int i = 0; i < obj.length; i++) {
//				System.out.println(obj[i]);
//			} // for
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		
		
	} //main
} //class