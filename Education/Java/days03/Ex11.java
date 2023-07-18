package Education.Java.days03;

import java.util.Scanner;

/**
 * @author heejin
 * @date 2023. 7. 17. - 오후 4:41:03
 * @subject (시험) 인덱스(index) 연산자 설명 
 * @content			[]
 * 					String[] args : 있으면 받는다.
 * 					String args : 문자열 args가 필요하다
 */
public class Ex11 {

	public static void main(String[] args) {
		// 1. 국어점수를 저장할 변수를 선언
		// int kor;		// cpu는 처리단위가 4바이트니까 byte보다 int가 더 효율적이다.
		
		// 2. 국어점수를 5만명 저장할 변수를 선언
		// 인덱스 [] 연산자를 사용해서 배열 선언
		
		// 	참조형 : 배열, 클래스, 인터페이스
		//		Heap이라는 동적 영역에 할당됨
		//		변수가 어떠한 주소를 참조하고 있어서 참조형이라고 함
		
		//	배열
		// 		1. 배열 정의? 동일한 자료형을 메모리 상에 연속적으로 놓이게 한 것.
		// 		2. 배열 선언 형식
		// 			자료형 [] 배열명;
		// 			자료형 [] 배열명 = new 자료형 [배열크기];
		
		// int[] kors;
		// int kors[] = new int[5];
		int[] kors = new int[5];
		
		// 요소개수 == 배열크기
		// kors[0] == 아래첨자값
		// kors[4] == 위첨자값 
		kors[0] = 90;
		kors[1] = 100;
		kors[2] = 80;
		
		System.out.println(kors[0]);	// 90
		System.out.println(kors[1]);	// 100
		System.out.println(kors[2]);	// 80
		
		
		System.out.println( kors.length ); // 배열 크기
		System.out.println( kors.length ); // 배열 크기-1 == 윗 첨자값
				
	}//main
}//class