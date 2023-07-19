package Education.Java.days05;

import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) throws IOException {

		int code = 0;
		char one;
/*
		// [1]
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read();
		//System.out.printf("code = %d\n", code);  // a 입력시  97    A 입력시 65 출력됨
		one = (char) code;
		System.out.printf("one = %c\n", one);

		// [2]
		System.in.skip(code);
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read();
		//System.out.printf("code = %d\n", code);  // a 입력시  97    A 입력시 65 출력됨
		one = (char) code;
		System.out.printf("one = %c\n", one);
*/
		// [1]
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read();
		System.out.printf("code = %d\n", code);  // a 입력시  97    A 입력시 65 출력됨
		one = (char) code;
		//System.out.printf("one = %c\n", one);

		/*
		System.in.read();		//13   \n
		System.in.read();		//10   \r
		*/
		//System.in.skip(2);
		// 남아있는 값을 다 버린다.
		System.in.skip(System.in.available());
		
		// [2]
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read();
		System.out.printf("code = %d\n", code);  // a 입력시  97    A 입력시 65 출력됨
		one = (char) code;
		//System.out.printf("one = %c\n", one);


	} // main
} // class