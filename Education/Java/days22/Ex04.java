package Education.Java.days22;

import java.time.LocalDateTime;

public class Ex04 {
	public static void main(String[] args) {
		// 4. java.time.LocalDateTime 클래스 사용
		//   1) 설문 시작일 : 23.8.10   9:00:00
		//   2) 설문 종료일 : 23.8.15  18:00:00
		//   지금 현재 설문 가능여부에 대해서 출력하세요.  ( 가능, 불가능 )
		
		LocalDateTime dt = LocalDateTime.now();
		LocalDateTime sdt = LocalDateTime.of(2023, 8, 10, 9, 0, 0);
		LocalDateTime edt = LocalDateTime.of(2023, 8, 15, 18, 0, 0);
		
		System.out.println( dt.isAfter(edt) );
		
		/*
		LocalDate a = LocalDateTime.of(2012, 6, 30, 12, 00);
		LocalDate b = LocalDateTime.of(2012, 7, 1, 12, 00);
		   a.isAfter(b) == false
		   a.isAfter(a) == false
		   b.isAfter(a) == true
		*/
		
		// 현재 시간을 포함하지 않고 결과를 내기 때문에 아래와 같이 하는 것이 더 옳다.
		System.out.printf( "%s", dt.isAfter(edt) || dt.isBefore(sdt) ? "불가능" : "가능" );
		
		
		
	} //main
} //class