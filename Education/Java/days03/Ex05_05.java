<<<<<<< HEAD
package days03;

/**
 * @author kenik
 * @date 2023. 7. 17. - 오후 2:27:02
 * @subject  단항연산자 ++ --  +  - ~(비트부정연산자) ! (cast) 등등
 * @content
 */
public class Ex05_05 {

	public static void main(String[] args) {
		System.out.println(  +3 );  // 양수
		System.out.println(  -3 );  // 음수
		
		// 비트부정(틸드)연산자  0->1, 1->0
		System.out.println( ~5 ); // -6
		//           0000 0101
		//           1111 1010
		
		// -1        1111 1001
		// 1의보수   0000 0110
		//                   6
		//                  -6
		
		// [-10 음수 저장 방법 ? 2의 보수법]
		// 


	} // main

} // class
=======
package Education.Java.days03;

/**
 * @author heejin
 * @date 2023. 7. 17. - 오후 2:26:31
 * @subject 단항연산자 - 우선순위가 제일 높음
 * 								++ -- + - ~(비트 부정연산자) ! ()(cast) 등등
 * @content 
 */
public class Ex05_05 {

	public static void main(String[] args) {
		
		System.out.println( +3 );	// 양수
		System.out.println( -3 );	// 음수
		
		//비트부정(틸드)연산자  0->1 / 1->0
		System.out.println(  ~5 );		// -6
												// 0000 0101   ->    1111 1010
												// 1111 1001        0000 0110        -(2^2 + 2^1)        -6
		// -10 음수 저장 방법?  2의 보수법을 거꾸로 하면 됨
		
		
		
	}//main

}//class
>>>>>>> branch 'main' of https://github.com/yuheejin/TIL.git
