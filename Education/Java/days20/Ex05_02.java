package Education.Java.days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex05_02 {
	public static void main(String[] args) {		
		// SimpleDataFormat 형식화 클래스
		// "yyyy. MM. dd. 오전 hh:11:12"
		String pattern = "yyyy.MM.dd. a hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		/*
		// Date 클래스를 형식화
		Date today = new Date();
		String strToday = sdf.format(today);
		System.out.println( strToday );
		*/
		
		// Calender 클래스 사용해서 형식화
		Calendar c = Calendar.getInstance();
		// Calendar -> Date 형 변환 
		// [1] Date today = new Date( c.getTimeInMillis() );
		// [2] Date today = c.getTime();
		Date today = c.getTime();
		String strToday = sdf.format(today);
		System.out.println( strToday );
		
	} //main
} //class