<<<<<<< HEAD
package days01;

// Alt + Shift + J
/**
 * @author kenik
 * @date 2023. 7. 13. - 오후 3:36:25
 * @subject  자바의 변수와 상수
 * @content  1. 변수,상수 개념 설명
 *                  2. 변수 선언 형식
 *                  3. 예제
 */
public class Ex03 {

	public static void main(String[] args) {
		// 1. 변수(variable)
		//      1) 변하는 수( 수학 의미 )
		//      2) 메모리상의 값을 저장하는 공간( 프로그램 언어 )
		
		// 2. 상수(const)
		//      1) 변하지 않는 수 ( == 고정된 수 )
		//      2) 메모리상의 값을 저장하는 공간( 프로그램 언어 )
		
		// [선언 형식]  1. 클래스 , 2. 함수(메서드)
		// 3. 변수 선언 형식
		//         자료형 변수명[=초기값];
		//         자료형== 데이타 타입(data type)
		
		// 4. 실습
		// ; 세미콜론  명령라인 종결 연산자
		// 이창익 cannot be resolved to a variable
		// 자바에서 문자열 == 문자의 나열        "문자열"
		// 자바에서 한 문자                                '이'
		// 이창익       변수로 인식을 한다. 
		// System.out.println(이창익);
		
		// 이름을 저장하는 문자열변수 선언
		
		// 변수이름을 명명하는 규칙 p26 
		String name = "이창익";  // = 대입(할당)연산자
		System.out.println(  name  );  
		
		// Duplicate local variable name
		// name 로컬(지역)변수 중복 선언되었다.
	    name = "이준희";  // = 대입(할당)연산자		
		System.out.println(  name   );

	} // main

} // class
=======
package Education.Java.days01;

// Alt + Shift + j
/**
 * @author heejin
 * @date 2023. 7. 13. - 오후 3:36:30
 * @subject 자바의 변수와 상수
 * @content 1. 변수, 상수 개념 설명
 *                2. 변수 선언 형식
 *                3. 예제
 */
public class Ex03 {

	public static void main(String[] args) {
		// 1. 변수 (variable)
		//    1) 변하는 수 (수학적 의미)
		//    2) 메모리상의 값을 저장하는 공간 (프로그래밍 언어)
		// 2. 상수 (const)
		//    1) 변하지 않는 수 (== 고정된 수)
		//    2) 메모리상의 값을 저장하는 공간 (프로그래밍 언어)
		
		// [선언 형식] 1. 클래스, 2. 함수(메서드)
		// 3. 변수 선언 형식
		//		자료형 변수명 [= 초기값];
		//		자료형 == 데이타 타입 (data type)
		
		// 4. 실습
		// ; 세미콜론 명령라인 종결 연산자
		// "" 없을 시 err : 유희진 cannot be resolved to a variable
		// 자바에서 문자열 == 문자의 나열      "문자열"
		// 자바에서 한문자							'유'
		// 유희진  	변수로 인식을 한다.
		// System.out.println(유희진);
		
		// 이름을 저장하는 문자열변수 선언
		// 자료형 변수명 [=초기값];
		// 변수 이름 명명 규칙   p26
		// 1. 반드시 숫자가 아닌 문자로 시작해야한다. (한글도 가능)
		// 2. 공백 포함할 수 없다.
		// 3. 특수기호는 '$'와 '_'만 허용한다.
		// 4. 대/소문자를 구분한다.
		// 5. 자바에서 미리 지정한 예약어는 사용할 수 없다.
		// 6. 소문자로 시작하고 새로운 단어가 결합되 첫 글자를 대문자로 변경한다.
		
		String name = "유희진";   // = 대입(할당)연산자
		System.out.println(name);
		
		// err : Duplicate local variable name
		// name local(지역)변수 중복 선언 됨
		// String name = "홍길동";
		name = "홍길동";   // = 대입(할당)연산자
		System.out.println(name);
		
		
	} //main
	
} //class
>>>>>>> branch 'main' of https://github.com/yuheejin/TIL.git
