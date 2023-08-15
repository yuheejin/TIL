<<<<<<< HEAD
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





=======
package Education.Java.days03;

/**
 * @author heejin
 * @date 2023. 7. 17. - 오후 1:43:35
 * @subject  4. 연산자의 종류(기능에 따라)
		      	       ㄱ. 산술연산자 : + - * / 
 * @content
 */
public class Ex05_02 {

	
	//***산술연산자
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int i=10, j=3;
		System.out.println( i + j ); // 13
		System.out.println( i - j ); // 7
		System.out.println( i * j ); // 30
		System.out.println( i / j ); // 3==>int (정수)끼리 연산하여 나머지값이 안나옴
		System.out.println( (double)i / j ); //3.3333 ==> 실수 나오게하려면 double로 강제형변환
		//나머지연산자 %
		System.out.println( i % j ); // 1
		*/
		
		//**산술 연산자 중에 /, % 주의사항
		
		//System.out.println(10 / 0); //정수를 0으로 나눴을 때
		//java.lang.ArithmeticException: / by zero 
		//산술적 예외(오류)발생
		//System.out.println(10.0 / 0); //실수를 0으로 나눴을 때 : infinity 무한대 상수값
		
		System.out.println(10 % 0); //java.lang.ArithmeticException: / by zero 
		//System.out.println(10.0 % 0); //NaN ( Not a Number)
		
	}//main

}//class
>>>>>>> branch 'main' of https://github.com/yuheejin/TIL.git
