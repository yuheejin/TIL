package Education.Java.days09;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		// [배열] + 제어문
		// 1. 자료형
		//	   기본형 (8가지)
		//		ㄴ 숫자형
		//			ㄴ 정수형
		//				ㄴ 문자
		//			ㄴ 실수형
		//		ㄴ 논리형
		//	   참조형 - [배열], 클래스, 인터페이스
		// 2. 정의 - 동일한 자료형을 메모리 상에 연속적으로 놓이게 한 것.
		//		(array)
		// 3. 배열 선언
		//			자료형 [] 변수명, 참조변수, 배열명;
		//			예) int [] m;
		//				동적영역(heap)						스택(stack)영역
		//				lowerbound   upperbound
		//				요소 == 첨자값 == index
		//				0요소	  1요소	2요소
		//				[4byte][4byte][4byte]			[0x100 주소값]
		//				0x100								kors
		//
		// 		배열 생성
		//			m = new int[3]
		// 4. 배열크기 = 배열명.length
		//		upperbound = 배열명.length-1 
		//		(윗 첨자값)
		//		lowerbound = 0 
		//		(아랫 첨자값)
		// 5. 예)

		int [] kors = new int[3];

		// 100점으로 초기화
		//		for (int i = 0; i < kors.length; i++) {
		//			kors[i] = 100;
		//		} //for
		// Arrays 클래스 - 배열을 사용하기 쉽도록 기능(함수)이 구현된 클래스
		// 1) Arrays.toString(kors);
		// 2) Arrays.fill(kors, 100);
		// Exception in thread "main" java.lang.NullPointerException
		// 참조하고 있던 주소 대신에 null이 입력되어있어 나타나는 오류
		kors = null; 

		dispKors(kors);
	} //main

	public static void dispKors(int[] kors) {
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("kors[%d]=%d\n", i, kors[i]);
		} //for

	}
} //class