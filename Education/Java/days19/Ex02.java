package Education.Java.days19;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String a = "abc1Addfggg4556b";
		int n = 6;
		System.out.println( Arrays.toString( solution(a, n) ));

	} //main

	public static String[] solution(String my_str, int n) {
		/*
		// [1]
		int arrayLen = my_str.length()/n;
		boolean plusLenSw = (my_str.length()%n != 0);
		String[] answer = new String [arrayLen + ( plusLenSw? 1:0) ];
		
		int i;
		for (i = 0; i < arrayLen; i++) {
			answer[i] = my_str.substring(i*n, i*n+n);
		} // for
		
		if (plusLenSw) answer[arrayLen] = my_str.substring(i*n);
		return answer;
		*/

		// [2]
		int answerLength = (int)Math.ceil( (double)my_str.length()/n );
		String [] answer = new String [answerLength];
		int beginIndex=0, endIndex, index=0;
		String str = null;
		int my_strLength = my_str.length();
		
		while ( index != answerLength ) {
			endIndex = beginIndex + n;
			if(endIndex > my_strLength) endIndex =my_strLength;
			str = my_str.substring(beginIndex, endIndex);
			answer[index++] = str;
			beginIndex = endIndex;
		} // while
		
		return answer;
		
		/*
		// [3]
		int i = 0, idx = 0;
		try {
		   for (             ; i < my_strLength ; i+=n, idx++) {
		       answer[idx] =   my_str.substring(i, i+n );
		     } 
		} catch (Exception e) {
		   answer[idx] =   my_str.substring(i);
		}
		*/
	}

} //class

