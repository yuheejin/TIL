package Education.Java.days05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 한 문자를 입력받아서
		// 숫자, 알파벳(대,소문자), 한글, 특수문자(#$!%@)
		// 입니다라고 출력하세요.

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("> 한 문자를 입력?  ");
			String st = scanner.next();

			char stToCh = st.charAt(0);
			
			if ( 0 <= stToCh && stToCh <= 9 )
				System.out.println("숫자 입니다.");
			else if (('a' <= stToCh && stToCh <='z') || ('A' <= stToCh && stToCh <='Z'))
				System.out.println("알파벳(대, 소문자) 입니다.");
			else if ()
				System.out.println("알파벳(대, 소문자) 입니다.");
			else if ('#' == stToCh || '$' == stToCh  || '!' == stToCh || '%' == stToCh  || '@' == stToCh )
				System.out.println("특수문자(#$!%@) 입니다.");
			else
				System.out.println("알 수 없는 문자입니다.");
		
			/*
			char[] stt = st.toCharArray();

			if ( 0 <= stt[0] && stt[0] <= 9 )
				System.out.println("숫자 입니다.");
			else if (('a' <= stt[0] && stt[0] <='z') || ('A' <= stt[0] && stt[0] <='Z'))
				System.out.println("알파벳(대, 소문자) 입니다.");
			else if ('#' == stt[0] || '$' == stt[0]  || '!' == stt[0] || '%' == stt[0]  || '@' == stt[0] )
				System.out.println("특수문자(#$!%@) 입니다.");
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main
} // class