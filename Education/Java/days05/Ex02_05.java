package Education.Java.days05;

import java.util.Scanner;

public class Ex02_05 {

	public static void main(String[] args) {
		// 한 문자를 입력받아서
		// 숫자, 알파벳(대,소문자), 한글, 특수문자(#$!%@)
		// 입니다라고 출력하세요.

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("> 한 문자를 입력?  ");
			String st = scanner.next();
			
			// 알파벳 모음인가?   [aeiouAEIOU]
			// 알파벳 자음인가?   [^aeiouAEIOU]
			//					자바에서 표현하는 정규표현식
			String regex = "[#$!%@]";
			System.out.println(st.matches(regex));
			
			if (st.matches(regex))
				System.out.println("특수문자(#$!%@) 입니다.");
									
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main
} // class