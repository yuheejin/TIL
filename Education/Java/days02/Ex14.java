<<<<<<< HEAD
package days02;

/**
 * @author kenik
 * @date 2023. 7. 14. - 오후 3:30:48
 * @subject
 * @content
 */
public class Ex14 {

	public static void main(String[] args) {
		// ㄴ. 실수계열 - float(4), [double(8)]
		float f ;  // 32비트 [[0][00000000 8지수][00000000000000000000000 23 가수]]
		double d ; // 64비트 [[0][00000000000 11지수][0000000000000000000000000000000000000000000000000000 52]
		
		//  10 -> 0000 1010
		// -10 -> 2의 보수법 -> 1111 0110
		// 'A' -> 65 -> 00000000 01000001
		//    9.1234567 실수
		// 1001.000111111001101011011011.....
		// 1.XXX   x 2^n  정규화
		// 1.001000111111001101011011011..... x 2^3
		
		// 모든 실수 자료형  double 기본으로 사용하자.
		// Type mismatch: cannot convert from double to float
		float pi = 3.14f;
		// float pi = (float) 3.14;
		// double pi = 3.14;
		
		System.out.printf("pi = %f", pi);

	} // main

} // class
=======
package Education.Java.days02;

import java.math.BigInteger;

/**
 * @author heejin
 * @date 2023. 7. 14. - 오후 3:29:58
 * @subject ㄴ. 실수계열 - float(4 byte), [ double(8 byte) ]
 * @content
 */
public class Ex14 {

	public static void main(String[] args) {
		
//		float f;		// 32 bit [[0][00000000 8지수][00000000000000000000000 23가수]] 
//		double d;	// 64 bit [[0][00000000000 11지수][0000000000000000000000000000000000000000000000000000 52가수]]
//		
		//  10 -> 0000 1010
		// -10 -> 2의 보수법 -> 1111 0110
		// 'A' -> 65 -> 00000000 01000001
		//		 9.1234567 실수
		// 	1001.000111111001101011011011...
		// 	1.XXX  * 2^n 정규화
		// 	1.001000111111001101011011011... * 2^3
		
		// 실수는 오차가 있는 자료형임.
		// 따라서 돈과 관련된 작업에서는 사용하면 안됨.
		// 모든 실수 값을 저장할 자료형은 double을 기본으로 사용하자
		// 		why? 조금이라도 오차를 줄이기 위해서
		//				더 큰 값을 저장하기 위해서는?
		//				BigInteger 사용
		//				BigDecimal 사용
		
		// Type mismatch: cannot convert from double to float
		// 자료형 안맞음
		//float pi = 3.14;
		float pi = (float) 3.14;
		//float p = 3.14f; 혹은 3.14F;
		
		System.out.printf("pi= %f", pi);
		
	} //main

} //class
>>>>>>> branch 'main' of https://github.com/yuheejin/TIL.git
