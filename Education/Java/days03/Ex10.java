<<<<<<< HEAD
package days03;

/**
 * @author kenik
 * @date 2023. 7. 17. - 오후 4:14:52
 * @subject  [연산자를 사용해서 수식으로 표현]
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		
		// 1) x는 10보다 크다.
		//        x > 10
		
		// 2) x는 10보다 크고, 20보다 작다.
		//      x > 10   &&   x  < 20
		
		// 3) x는 2의 배수이다. 
		//       x % 2 == 0
		
		// 4) x는 2의 배수 또는 3의 배수이다.
		//   x % 2 == 0  ||   x % 3 == 0
		
		// 5) x는 2의 배수이지만 6의 배수는 아니다.
		//   x % 2 == 0   &&  x % 6 != 0
		//   x % 2 == 0   &&  !(x % 6 == 0)
		
		// 6) 한 문자(ch)가  숫자이다. 
		//   '0' '1' '2' '3'~ '9'
		//   char ch == '1';
		//   ch == '0' || ch == '1' || ch == '2' ~ || ch == '9'		
		//   '0'                '9' 
		//   48 <= ch  && ch <= 57
		//   '0' <= ch  && ch <= '9'   ***
		
		// 7) 한 문자가 소문자이다.
		//   97(a) 98(b) 99(c) ~120(z)
		//   97 <= ch  && ch <= 120
		//   'a' <= ch  && ch <= 'z'   ***
		
		// 8) 한 문자가 알파벳이다 ( 대문자이거나 또는 소문자 이니 )
		//    ('a' <= ch  && ch <= 'z')  ||  ('A' <= ch  && ch <= 'Z')
		 
		

	} // main

} // class








=======
package Education.Java.days03;

import java.util.Scanner;

/**
 * @author heejin
 * @date 2023. 7. 17. - 오후 3:26:46
 * @subject 연산자를 사용해서 수식으로 표현 
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		
		// 1) x는 10보다 크다
		//		x > 10;

		// 2) x는 10보다 크고 20보다 작다.
		//		x > 10  &&  x < 20
		
		// 3) x는 2의 배수이다.
		//		x%2 == 0
		
		// 4) x는 2의 배수 또는 3의 배수이다.
		//		(x%2 == 0) || (x%3 == 0)
		
		// 5) x는 2의 배수이지만 6의 배수는 아니다.
		//		(x%2 == 0) && (x%6 != 0)	
		//		(x%2 == 0) && !(x%6 == 0)	
		
		// 6) 한 문자(ch)가 숫자이다.
		//		'0' '1' ...
		// 		char ch;
		//		ch == '0' || ch == '1' || ~ || ch == '9'
		//		'0' <= ch && ch <= '9'
		//		48 <= ch && ch <= 57
		//		'0'							'9'
		
		// 7) 한 문자가 소문자이다.
		//		97 ~ 120
		//		'a'		'z'
		//		97 <= ch && ch <= 120
		//		'a' <= ch && ch <= 'z'
		
		// 8) 한 문자가 알파벳(대문자이거나 또는 소문자)이다.
		// 		('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z')  
		
		
		
		int x = 4;
		System.out.println((x%2 == 0) && !(x%6 == 0));
		
		
	}//main
}//class
>>>>>>> branch 'main' of https://github.com/yuheejin/TIL.git
