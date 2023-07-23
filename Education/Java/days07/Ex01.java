package Education.Java.days07;

import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		//		// 1. 구구단 가로 출력
		//		// for i=2~9		단
		//		//		for j=1~9
		//		for (int dan = 2; dan < 10; dan++) {
		//			System.out.printf(" [%d] 단\t", dan);
		//			for (int i = 1; i < 10; i++) {
		//				System.out.printf("%d*%d=%d \t", dan, i , dan*i);
		//			} //for
		//			System.out.println();
		//		} //for

		//		// 2. 구구단 세로 출력
		//		// for i = 1~9
		//		// 		for j = 2~9		단
		//		for (int dan = 2; dan < 10; dan++) {
		//			System.out.printf(" [%d단] \t", dan);
		//		} //for
		//		
		//		System.out.println();
		//		
		//		for (int i = 1; i < 10; i++) {
		//			for (int dan = 2; dan < 10; dan++) {
		//				System.out.printf("%d*%d=%d \t", dan, i , dan*i);
		//			} //for
		//			System.out.println();
		//		} //for

		//		// 3. 별찍기				_			*
		//		// 1: __*		i=1	j=2		j=1
		//		// 2: _***		i=2	j=1		j=3
		//		// 3: *****		i=3	j=0		j=5
		//		//					i+j=3		j=3-i		j=2*i-1
		//		for (int i = 1; i <= 3; i++) {	// 행갯수
		//			// 공백 for
		//			for (int j = 1; j <= 3-i; j++) {
		//				System.out.print("_");
		//			} //for
		//
		//			// 별 for
		//			for (int j = 1; j <= 2*i-1; j++) {
		//				System.out.print("*");			
		//			} //for
		//			
		//			System.out.println();
		//		} //for

		// 4. 이등변 삼각형 별찍기
		//		// 1: __*	
		//		// 2: _***	
		//		// 3: *****	
		for (int i = 1; i <= 3; i++) {	// 행갯수
			for (int j = 1; j <= 5; j++) {
				if (i+j>=4 && j-i<=2)  System.out.print("*");
				else System.out.print("_");
			}
			System.out.println();
		}



	} //main
} //class
