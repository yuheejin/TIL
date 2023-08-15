package Education.Java.days05;

import java.util.Scanner;

public class Ex04_03 {

	public static void main(String[] args) {
		
		// 1~10 합 for
		// [문제] 두 정수 n,m을 입력받아서
		// 두 정수 사이의 홀수의 합을 출력
		// 예) 2,5
		// 2+3+4+5=14
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print(">   두 정수 입력? ");
			
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int sum = 0;
			
			// Math.random()
			int min = Math.min(m, n);
			int max = Math.max(m, n);

			// for (int i = (min%2==0 ? min+1 : min); i <= max; i+=2) {
			// min = min%2==0 ? min+1 : min;
			if (min%2==0) min++;
			for (int i = min; i <= max; i+=2) {
				sum += i;
				System.out.printf(i == max ? "%d" : "%d+", i);
			} //for
			
			System.out.printf("=%d", sum);
			
		} catch (Exception e) {
			e.printStackTrace();
		} // try-catch
		
	} //main
} //class
