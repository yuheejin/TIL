package Education.Java.days07;

import java.util.stream.IntStream;

public class Ex07_03 {
	public static void main(String[] args) {
		//[문제] 피보나치 수열
		// 항이 100같거나 작을 때까지의 수열을 출력하고
		// 합을 구해서 출력
		// 1+1+2+3+5+8+13+... 항

//		int [] pibo = new int [20];
//		pibo[0] = 1;
//		pibo[1] = 1;
//		System.out.printf("%d+%d+",pibo[0],pibo[1]);
//		
//		for (int i = 2; pibo[i-2] + pibo[i-1] <= 100 ; i++) {
//			pibo[i] = pibo[i-2] + pibo[i-1];
//			System.out.printf("%d+",pibo[i]);
//		} //for
//		System.out.printf( "\b=%d", IntStream.of(pibo).sum() );
		
		
//		// [A]
//		int firstTerm, secondTerm, nextTerm, sum;
//		firstTerm = secondTerm = 1;
//		sum = firstTerm + secondTerm;
//		System.out.printf("%d+%d+",firstTerm, secondTerm);
//		
//		while( firstTerm + secondTerm <= 100 ) {
//			nextTerm = firstTerm + secondTerm;
//			firstTerm = secondTerm;
//			secondTerm = nextTerm;
//			sum +=nextTerm; 
//			System.out.printf("%d+",nextTerm);
//		} //while
//		System.out.printf("\b=%d",sum);
		
		// [B]
		int firstTerm, secondTerm, nextTerm, sum;
		firstTerm = secondTerm = 1;
		sum = firstTerm + secondTerm;
		System.out.printf("%d+%d+",firstTerm, secondTerm);
		
		while( (nextTerm =  firstTerm + secondTerm) <= 100 ) {
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			sum +=nextTerm; 
			System.out.printf("%d+",nextTerm);
		} //while
		System.out.printf("\b=%d",sum);
		
	} //main
} //class
