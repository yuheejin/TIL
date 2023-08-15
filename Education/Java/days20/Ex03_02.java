package Education.Java.days20;

import java.util.Date;
/* 4. 설문조사 기간이 
    시작일 2023.8.2    00:00:00
    종료일  2023.8.15  18:00:00
    일 때  오늘 현재 설문이 가능/불가능한지를 체크해서 출력하세요.
  */
public class Ex03_02 {
	public static void main(String[] args) {		
		Date startDay = new Date(2023, 8, 2);
		Date endDay = new Date(2023, 8, 15, 18, 0);
		
		Date today = new Date(2023,8,9);
		
		System.out.printf( "현재 설문이 %s가능합니다." , ( today.after(startDay)  && today.before(endDay) ) ?  "":"불");
	} //main
} //class