package Education.Java.days20;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex04 {
	public static void main(String[] args) {		
		// jdk1.1 Calendar 추상클래스 - 날짜, 시간
		// 추상클래스이기 때문에 생성자 사용 X
		// Calendar c = new Calendar();
		
		// public class GregorianCalendar extends Calendar
		// 업캐스팅해서 사용
		// Calendar c = new GregorianCalendar();
		//	ㄴ BuddhistCalendar 태국에서 사용하는 캘린더
		// 지역마다 쓰는 달력이 다르기 때문에, Calendar가 추상클래스로 만들어짐.
		Calendar c = Calendar.getInstance();
		// c.add(int field 날짜, 월, 년도, 시간, 분 초 등등 , int amount);
		// c.clear(int field);  == d2.setHours(0);
		// 년
		System.out.println( c.get(Calendar.YEAR) );
		// 월
		System.out.println( c.get(Calendar.MONTH) );
		// 일
		System.out.println( c.get(Calendar.DATE) );
		System.out.println( c.get(Calendar.DAY_OF_MONTH) ); // 그 달의 몇일째인지 반환
		System.out.println( c.get(Calendar.DAY_OF_YEAR) );  // 그 년도의 몇일째이지 반환
		// 시간
		System.out.println( c.get(Calendar.HOUR) );	// 12(0~11)
		System.out.println( c.get(Calendar.HOUR_OF_DAY) );		// 24(0~23)
		// 분
		System.out.println( c.get(Calendar.MINUTE) );
		// 초
		System.out.println( c.get(Calendar.SECOND) );
		// 밀리세컨드
		System.out.println( c.get(Calendar.MILLISECOND) );
		// 요일
		// Date			0(일)~6(토)
		// Calendar		1(일)~7(토)
		System.out.println( c.get(Calendar.DAY_OF_WEEK) );
		System.out.println( c.get(Calendar.WEEK_OF_MONTH) );	// 해당월의 몇번째 주
		System.out.println( c.get(Calendar.WEEK_OF_YEAR) );	// 해당년의 몇번째 주
		// 오전 오후
		System.out.println( c.get(Calendar.AM) );
		System.out.println( c.get(Calendar.AM_PM) );
		
		
	} //main
} //class