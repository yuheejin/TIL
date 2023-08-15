package Education.Java.days19;

import java.util.Date;

/**
 * @author heejin
 * @date 2023. 8. 8. - 오후 3:27:34
 * @subject	날짜, 시간 클래스 + 형식화(fommatting) 클래스
 * @content	[일정관리]
 */
public class Ex11 {
	public static void main(String[] args) {
		// JDK 1.0		java.util.Date
		// JDK 1.1		java.util.Calendar
		//									ㄴ GregorianCalendar
		// JDK 1.8		java.time 패키지 안에 여러 하위 패키지와 다양한 클래스 추가
		
		// java.util.Date
		Date d = new Date();	// 현재 시간을 가져옴
		// System.out.println( d.toString() );
		System.out.println( d );  //Tue Aug 08 15:38:03 KST 2023
		
		// GMT : 그리니치 표준시, 세계 표준 시간
		// 세계표준시간 형태로 시간을 나타내라
		System.out.println( d.toGMTString() );  //8 Aug 2023 06:38:03 GMT
		
		System.out.println( d.toLocaleString() );  //2023. 8. 8. 오후 3:40:25
		
		// 년
		System.out.println( d.getYear() +1900 ); 
		// 월
		System.out.println( d.getMonth() +1 );
		// 일
		System.out.println( d.getDate() );
		// 시간
		System.out.println( d.getHours() );
		// 분
		System.out.println( d.getMinutes() );
		// 초
		System.out.println( d.getSeconds() );
		// 밀리세컨드   1000ms = 1s  X
		// 요일
		System.out.println( d.getDay() );
		
		// 1970.1.1  0:0:0 ~  ms long
		System.out.println( d.getTime() );
		
				
	} //main
} //class