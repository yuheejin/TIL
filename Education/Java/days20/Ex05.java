package Education.Java.days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex05 {
	public static void main(String[] args) {		
		// Date X
		// Calendar O
		
		// 1) 2015  5  1 무슨 요일인가
		// [1]
		/*
		// c.set(Calendar.YEAR, 2015);
		// c.set(Calendar.MONTH, 5-1);
		// c.set(Calendar.DATE, 1);
		c.set(2015, 5-1, 1);	
		System.out.println( c.get(Calendar.DAY_OF_WEEK) );		// 금 6
		*/
		// [2]
		Calendar ca = new GregorianCalendar(2015, 5-1, 1);
		System.out.println( ca.get(Calendar.DAY_OF_WEEK) );		// 금 6
		
		// 2) 2015  5  몇일까지 있는가
		System.out.println(  ca.getActualMaximum(Calendar.DATE) );
		
		// 3) 원하는 포맷으로 객체 출력하기
		Calendar c = Calendar.getInstance();
		// 2015. 5. 1. 오전 9:11:12
		String pattern = "yyyy.MM.dd. a hh:mm:ss";
		// System.out.println( getPatternDate(new Date(), pattern) );
		System.out.println( getPatternDate(c, pattern) );
		
	} //main
	
	public static String getPatternDate(Object obj, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		if (obj instanceof Date) {
			Date d = (Date)obj;
			return sdf.format(d);
		} else if (obj instanceof Calendar) {
			Calendar c = (Calendar)obj;
			Date d = c.getTime();
			return sdf.format(d);
		}
		return null;
	} //getPatternDate
	
	/*
	public static String getPatternDate(Date d, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(d);
	} //getPatternDate

	public static String getPatternDate(Calendar c, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date d = c.getTime();
		return sdf.format(d);
	} //getPatternDate
	 */
	
} //class