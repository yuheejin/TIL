package Education.Java.days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author heejin
 * @date 2023. 8. 9. - 오후 12:46:51
 * @subject	add() / set() / roll 차이점
 * @content
 */
public class Ex06 {
	public static void main(String[] args) {		
		// 2023.8
		Calendar c = new GregorianCalendar(2023, 8-1, 1);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		c.add(Calendar.DATE, -dayOfWeek+1);
		
		System.out.println( Ex05.getPatternDate(c, "yyyy-MM-dd") );
		
	} //main
} //class