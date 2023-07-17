package days03;

import java.util.Calendar;

/**
 * @author kenik
 * @date 2023. 7. 17. - 오전 11:31:06
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// java.util.IllegalFormatConversionException: d != java.lang.String
		// System.out.printf("%d\n", "홍길동");
		
		
		Calendar c = Calendar.getInstance();
		System.out.printf("%1$tm %1$te %1$tY\n", c);
		
		// %[argument_index$][flags][width][.precision]conversion
		// %                                               d
		System.out.printf("%1$c %1$C\n", 'a');
		System.out.printf("%1$x %% %1$X\n", 30);
		
		System.out.printf("%(d\n", -123);
		System.out.printf("%,d\n", 12323423); // 기억

	} // main

} // class
