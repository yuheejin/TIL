package days03;

/**
 * @author kenik
 * @date 2023. 7. 17. - 오후 4:41:07
 * @subject *** (시험) 인덱스(index) 연산자 설명 ***
 * @content                []
 *                   String[] args 
 */
public class Ex11 {

	public static void main(String[] args) {
		// 1. 국어점수를 저장할 변수를 선언.
		// int kor;
		// kor = 100;
		// syso( kor );
		
		// 2. 국어점수를 500만명 저장할 변수를 선언.
		/*
		 * int 홍길동kor; 
		 * int 이창익kor; 
		 * int 이준희kor;
		 */
		
		/*
		int kor00001;
		int kor00002;
		int kor00003;
		:
		int kor50000;
		*/
		
		// 5:00 수업시작~
		// 인덱스[] 연산자를 사용해서 배열 선언
		/*
		 * 참조형 : 배열, 클래스, 인터페이스
		 * 
		 * 1. 배열 정의 ? 동일한 자료형을 메모리 상에 연속적으로 놓이게 한것.
		 * 2. 배열 선언 형식
		 *    자료형 [] 배열명 = new 자료형[배열크기];
		 *    자료형  배열명[] = new 자료형[배열크기];
		 * */
		
		int[] kors = new int[5];
		// int kors[] = new int[5];
		
		System.out.println(  kors.length ); // 배열크기
		System.out.println(  kors.length - 1 ); // 배열크기-1=윗첨자값
		
		
		kors[0] = 90;
		kors[1] = 100;
		kors[2] = 80;
		
		System.out.println( kors[0] ); // 90
		System.out.println( kors[1] ); // 100
		System.out.println( kors[2] ); // 80

	} // main

} // class







