package Education.Java.days20;

import java.text.MessageFormat;
import java.text.ParseException;

public class Ex10_02 {
	public static void main(String[] args) {		
		String source = "이름:이준희, 나이:20살, 성별:true";
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}";

		MessageFormat mf = new MessageFormat(pattern);
		try {
			Object [] objs = mf.parse(source);
			for (Object obj : objs) {
				System.out.println(obj);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// SQL 사용
		// INSERT INTO board (no, title, writer, content, regdate) VALUED ({0}, '{1}', '{2}', '{4}', {5})
		
	} //main
} //class