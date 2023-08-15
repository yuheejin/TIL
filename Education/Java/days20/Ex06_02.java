package Education.Java.days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author heejin
 * @date 2023. 8. 9. - 오후 12:46:51
 * @subject	add() / set() / roll 차이점
 * @content
 */
public class Ex06_02 {
	public static void main(String[] args) {		
		// 2023.8
		Calendar c = new GregorianCalendar(2023, 8-1, 1);
		// 날짜를 셋팅
		// c.set(Calendar.DATE, 0);		// 7.31
		// c.set(Calendar.DATE, -1);	// 7.30
		// c.set(Calendar.DATE, 10);
		// c.set(Calendar.DATE, 32);

		// 날짜를 더해줌
		// c.add(Calendar.DATE, -1);	// c 날짜 1감소
		// c.add(Calendar.DATE, 1);		// c 날짜 1증가
		
		// 월은 변하지 않으면서 날짜를 더해줌
		c.roll(Calendar.DATE, -1);
		System.out.println( Ex05.getPatternDate(c, "yyyy-MM-dd") );
	} //main
} //class