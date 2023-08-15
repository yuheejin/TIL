<<<<<<< HEAD
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
=======
package Education.Java.days03;

import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		
		//java.util.IllegalFormatConversionException: d != java.lang.String
		//잘못된 Conversion 형식(%d)때문에 오류가 발생함
		System.out.printf("%d\n","홍길동");
		
	    //%tm %te,%tY	
		
		Calendar c = Calendar.getInstance();
		System.out.printf("%1$tm %1$te %1$ty\n", c);
		
		//printf의 기본형식
		//%[argument_index$][flags][width][.precision]conversion
		
		System.out.printf("%(d\n",-123); //(123)
		System.out.printf("%,d\n",1234123); //1,234,123****
		

	}//main

}//class
>>>>>>> branch 'main' of https://github.com/yuheejin/TIL.git
