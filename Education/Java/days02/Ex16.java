<<<<<<< HEAD
package days02;

/**
 * @author kenik
 * @date 2023. 7. 14. - 오후 4:27:36
 * @subject 형변환
 * @content
 */
public class Ex16 {

	public static void main(String[] args) {
		// 1. 자동형변환 - 2가지
		int i = 10; //         [][][][]		
		long l = i; // [][][][][][][][]
		float f = l;
		System.out.println( f );
		
		long L = l + i; // long + int = long
		
		
		// 2. 강제형변환
		//    3*(5+2)   () 최우선연산자
		//    (변환하고자하는 타입) cast 연산자        캐스트강제형변환
		
		int a = 20;
		int b = 3;
		System.out.println(  (double)a/b ); // 6.666666  몫 int/double=>int

	} // main

} // class








=======
package Education.Java.days02;

/**
 * @author heejin
 * @date 2023. 7. 14. - 오후 4:27:02
 * @subject 형변환
 * @content 
 */
public class Ex16 {

	public static void main(String[] args) {

		// 1. 자동형변환 - 2가
		// 더 큰 자료형에 할당될때
		int i = 10;	// 4byte 		  [][][][]
		long l = i;	// 8byte [][][][][][][][]
		System.out.println(l);
		
		// 실수형 자료형은 정수형 자료형보다 더 큰 자료형으로 인식됨
		float f = l;
		
		// 자료형끼리 연산할 때, 큰 자료형으로 결과가 나옴.
		long L = l + i;	// long + int 부터 연산됨. long + int = long
		
				
		// 2. 강제형변환
		//		3 * ( 5 + 2 )     <-- ( ) 최우선연산자
		//		( 변환하고자 하는 자료형 ) cast 연산자     캐스트 강제 형변환
		int a = 20;
		int b = 3;
		
		System.out.println( a/b );		// 6    		int / int = int
		System.out.println( a/(double)b );		// 6.666		int / double = double
		
		
	} //main

} //class
>>>>>>> branch 'main' of https://github.com/yuheejin/TIL.git
