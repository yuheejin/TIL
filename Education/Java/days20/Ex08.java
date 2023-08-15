package Education.Java.days20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author heejin
 * @date 2023. 8. 9. - 오후 2:32:44
 * @subject	[ 형식화 클래스 ]
 * @content	DecimalFormat
 * 								format()		숫자 -> 원하는 형식의 문자열
 * 								parse()	 	문자열 -> 숫자
 * 					
 * 					SimpleDateFormat
 * 								format()		날짜 -> 원하는 형식의 문자열
 * 								parse()	 	문자열 -> 날짜
 * 					
 */
public class Ex08 {
	public static void main(String[] args) {		
		// 23년 8월 9일 "수요일" 
		// 날짜로 변환시키는 코딩
		String strDate = "23년 8월 9일 (수요일)";
		String pattern = "yy년 MM월 dd일 (E)";
		SimpleDateFormat sf = new SimpleDateFormat(pattern);
		try {
			Date date = sf.parse(strDate);
			System.out.println( date.toLocaleString() );
			// Date -> Calendar
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			System.out.println( Ex05.getPatternDate(c, pattern) );
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	} //main
} //class