package Education.Java.days02;

//Alt + Shift + j
/**
 * @author heejin
 * @date 2023. 7. 14. - 오전 11:04:45
 * @subject 표준 입력, 표준 출력 => System 클래스
 * @content 객체 == 개체 == Object == class == 물건
 * 				   System 클래스 안에 [표준 출력 함수]
 * 				   1. println() - 출력 후 개행
 * 							void println​(boolean x)
 *  			   2. printf()
 *  						PrintStream printf​(String format, Object... args)
 *  			   3. print()
 *  					 	void print​(int i)
 */
public class Ex05 {
	
	public static void main(String[] args) {
		// java.lang 패키지 안에 있는 System 클래스
		// java.lang.System.out.함수호출(출력할 값);
		// 함수(메서드) 3가지 파악 => 정확히 사용할 수 있다.
		//   1. 함수의 기능(일) 파악
		//   2. 함수가 일처리를 할 때 필요한 값 파악 ( 매개변수, 파라미터, 인자, 인수 )
		//   3. 함수가 일처리를 한 후에 반환(리턴)하는 값 파악 ( 리턴값, 리턴자료형 )
		
		// main() 함수
		//   1. 기능?  프로그램 시작, 종료 일
		//   2. 매개변수?  문자열 배열 args == arguments == 인자들
		//   3. 리턴 값 없음. <- 자료형 void 선언
		
		// 리턴자료형과 연관되어 있음. 클래스 수업 끝날 때쯤 다시 설명할 예정
		//System.out.printf("홍길동").printf("20");
		System.out.println("홍길동");
		System.out.println("홍일동");
		System.out.println("홍이동");
		
		// 개행(줄바꿈) 방법
		System.out.print("홍길동" + '\n');
		System.out.print("홍일동\n");
		System.out.print("홍이동");
		System.out.println();  // 개행
		System.out.print("홍삼동");
		
		// Alt + Shift + A : 세로 편집 가능 단축키
		
	} //main

} //class
