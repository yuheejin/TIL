package Education.Java.days20;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class Ex11 {
	public static void main(String[] args) {		
		// jdk1.0		Date
		// jdk1.1		Calendar
		// 
		// [ jdk1.8		새로 추가된 날짜, 시간 클래스 (java.time 패키지) ]
		// 1. java.time : 날짜, 시간을 다루는 핵심 클래스
		//			ㄴ java.time.chrono : 표준(ISO)이 아닌 날력 시스템을 위한 클래스 제공
		//			ㄴ java.time.format : 형식화(파싱) 클래스 제공
		//			ㄴ java.time.temporal(시간의) : 날짜, 시간의 필드(field)와 단위(unit) 클래스 제공 
		//			ㄴ java.time.zone : 시간대(time-zone) 클래스 제공
		//
		// 2. java.time : 날짜, 시간을 다루는 핵심 클래스
		//		1) 날짜 : LocalDate  클래스
		//		2) 시간 : LocalTime 클래스
		//		3) 날짜 + 시간 : LocalDateTime 클래스
		//		4) 날짜 + 시간 + 시간대 : ZonedDateTime 클래스
		//		1)~4) 모두 Temporal, TemporalAdjuster 인터페이스를 구현
		//
		// 3. new연산자로 객체 생생 X -> now(), of() 메서드
		// 
		// 4. 날짜와 날짜 사이의 간격 : Period
		//	   시간과 시간 사이의 간격 : Duration
		//		-> TemporalAmount 인터페이스 구현
		//
		// 5. 날짜와 시간의 [단위]를 정의해 놓은 것 
		//		ㄴ TemporalUnit 인터페이스
		//		ㄴ ChronoUnit 클래스
		// 
		// 6. 년, 월, 일 등의 날짜와 시간의 필드(field)를 정의해 놓은 것
		//		ㄴ TemporalField 인터페이스
		//		ㄴ ChronoField 클래스
		//			
		//	7. 특정 필드(년, 월, 일, 시간, 분, 요일 ..등) 가져오기
		//		ㄴ getXXX()
		//		ㄴ get(field)
		//
		// 8. 특정 필드 수정 : with(), plus(), minus()
		//		1) Date d.setYear(???);
		//		2) Calendar c.set(Calendar.YEAR, ???)	roll()	add()
		//		
		//
		
	} //main
} //class