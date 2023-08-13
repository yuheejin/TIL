package Education.Java.days21;

import java.text.MessageFormat;
import java.util.Date;

public class Ex03 {
	public static void main(String[] args) {
		
		Date endD = new Date(2023-1900, 12-1, 27);
		Date nowD = new Date();
		long result = endD.getTime() - nowD.getTime();
		System.out.println( result );
		
		int[] str = {24*60*60*1000, 60*60*1000, 60*1000, 1000,1};
		long[] 몫 = new long [5];
		for (int i = 0; i < str.length; i++) {
			몫[i] = result/str[i];
			result = result%str[i];
		} // for
		
		String pattern = "{0}일 {1}시간 {2}분 {3}초 {4}밀초";
		MessageFormat mf = new MessageFormat(pattern);
		System.out.println( mf.format(pattern, 몫[0], 몫[1], 몫[2], 몫[3], 몫[4]) );
		
		
		
	} //main
} //class