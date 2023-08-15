package Education.Java.days19;

import java.util.StringTokenizer;

public class Ex04 {
	public static void main(String[] args) {
		// StringTokenizer 클래스
		String str = "고경림,김성준,김정주,김호영";
		// String [] str.split(regex);
		
		StringTokenizer st = new StringTokenizer(str, ",");
		/*
		int tokensNum = st.countTokens();
		System.out.println( tokensNum );
		
		for (int i = 0; i < tokensNum; i++) {
			System.out.println( st.nextToken() );
		} // for
		*/
		
		while (st.hasMoreTokens()) {		// 가져올 token이 있으면  true, 없으면 false
			System.out.println( st.nextToken() );
		} //while
	
		// Exception in thread "main" java.util.NoSuchElementException
		// System.out.println( st.nextToken() );
		
	} //main
} //class