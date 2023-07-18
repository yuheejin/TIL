package Education.Java.days03;

/**
 * @author heejin
 * @date 2023. 7. 17. - 오후 2:01:17
 * @subject 논리연산자
 * @content		참 / 거짓  boolean
 * 						1) 일반 논리 연산자
 * 							ㄱ. &&  일반 논리 AND 연산자 (논리곱)
 * 								(둘 다 참이면 참)
 * 									참 && 참 => 참
 * 									참 && 거짓 => 거짓
 * 									거짓 && 참 => 거짓
 * 									거짓 && 거짓 => 거짓 									
 * 							ㄴ. ||  일반 논리 OR 연산자 (논리합)
 * 								(둘 중 하나가 참이면 참, 둘 다 거짓이면 거짓)
 * 									참 || 참 => 참
 * 									참 || 거짓 => 거짓
 * 									거짓 || 참 => 거짓
 * 									거짓 || 거짓 => 거짓
 * 							ㄷ. !  부정(NOT) 연산자
 * 									!참 => 거짓
 * 									!거짓 => 참
 * 						2) 비트 논리 연산자 : & ^ | ~
 */
public class Ex05_04 {

	public static void main(String[] args) {
		
		// 연산자 우선 순위   예) * > +
		// 산술 > 비교 > 논리 > 대입
		System.out.println( 3 <= 5   &&  10 > 1 );
		System.out.println( 3 <= 5   &&  10 < 1 );
		
		// 경고: Dead code
		// 앞에 있는 비교 연산자에서 논리 연산자의 결과가 결정되기 때문에
		// 뒤에 있는 비교 연산자를 실행할 필요가 없다.
		System.out.println( 3 >= 5   &&  10 > 1 );
		System.out.println( 3 >= 5   &&  10 < 1 );
		
		System.out.println( 3 <= 5   ||  10 > 1 );
		System.out.println( 3 <= 5   ||  10 < 1 );
		System.out.println( 3 >= 5   ||  10 > 1 );
		System.out.println( 3 >= 5   ||  10 < 1 );
		
		// The operator ! is undefined for the argument type(s) int
		// ! 부정연산자는 int 피연산자에 사용할 수 없다.
		// ! boolean
		// System.out.println( !3<= 5 );
		// 비교 > 논리
		// <=      !
		// ! 부정연산자는 단항 연산자로 어떤 연산자보다 우선순위가 높다.
		System.out.println( !(3<= 5) );
		
	}//main

}//class
