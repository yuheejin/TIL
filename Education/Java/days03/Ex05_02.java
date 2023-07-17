package days03;

/**
 * @author kenik
 * @date 2023. 7. 17. - 오후 12:28:08
 * @subject  산술연산자
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		/*
		int i=10, j=3;
		System.out.println( i + j  ); // 13
		System.out.println( i - j  ); // 7
		System.out.println( i * j  ); // 30
		System.out.println( i / j  ); // 3.3333333 => 3 ( 몫 )
		System.out.println( (double)i / j  ); // 3.3333333 => 3 ( 몫 )
		// 나머지 연산자   %
		System.out.println( i % j  ); // 1
		*/
		
		// 산술 연산자 중에  / %  주의(기억) 
		//  ArithmeticException: / by zero
		//  산술적예외(오류)가 발생했다..
		// System.out.println( 10 / 0 ); 
		// System.out.println( 10.0 / 0 );  // Infinity 무한대

		// System.out.println( 10 % 0 ); 
		// System.out.println( 10.0 % 0 );  // NaN ( Not a Number )
	} // main

} // class





