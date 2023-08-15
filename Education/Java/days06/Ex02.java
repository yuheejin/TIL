package Education.Java.days06;

import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) throws IOException {

		int code = 0;
		
		// Syntax error on token "continue", invalid VariableDeclaratorId
		// 문법에러 "continue" 라는 토큰에, 나쁜 변수
		// 변수 선언자 id가 잘못되었다. (예약어이기 때문에 변수명으로 사용 불가능)
		// char continue = 'y';
		char con = 'y';
		do {
			
			System.out.print("> 한 문자 입력 ? ");
			code = System.in.read();
			System.out.printf("code = %c\n", (char) code);
			
			System.in.skip(System.in.available());		// 스트림에 남아 있는 값을 전부 지움
			
			System.out.print("\n\n 계속하시겠습니까?  ");
			// br, scanner, System.in.read()
			code = System.in.read();  // 'y' 'n'
			con = (char) code;
			
			System.in.skip(System.in.available());		// 스트림에 남아 있는 값을 전부 지움
			
		} while (con == 'y' || con == 'Y');
		
		System.out.println("   end   ");
		
		
		/*		
		// [1]
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read();
		System.out.printf("code = %d\n", (char) code);  // a 입력시  97    A 입력시 65 출력됨
		
		// System.in 입력스트림 ['a'] ['\r'   13] ['\n'   10]
		// a 엔터 ('\r'  '\n')
		// 0~ 255 int read()    next 1byte
		System.in.skip(System.in.available());
		
		// [2]
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read();
		System.out.printf("code = %d\n", (char) code);  // a 입력시  97    A 입력시 65 출력됨
		*/
		
		
	} //main
} //class
