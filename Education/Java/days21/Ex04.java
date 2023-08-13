package Education.Java.days21;

import java.text.MessageFormat;
import java.text.ParseException;

public class Ex04 {
	public static void main(String[] args) {
		
		String source = "번호:1,이름:홍길동,주소:서울 양천구 목동";
		String pattern = "번호:{0},이름:{1},주소:{2}";
		MessageFormat mf = new MessageFormat(pattern);
		Object[] obj;
		try {
			obj = mf.parse(source);
			// [1]
			// for (int i = 0; i < obj.length; i++) {
			// 	System.out.println(obj[i]);
			// } // for

			//[2]
			pattern = "{0}\n\t{1}\n\t{2}";
			System.out.println( MessageFormat.format(pattern, obj[0], obj[1], obj[2]) );
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
				
	} //main
} //class