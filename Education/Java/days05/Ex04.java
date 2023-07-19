package Education.Java.days05;

public class Ex04 {

	public static void main(String[] args) {
		/*
		// [1] 1+2+3+...+8+9+10=55 출력

		int sum = 0;

		for (int i = 1; i < 11; i++) {
			sum += i ;
			System.out.printf(i == 10 ? "%d" : "%d+", i);
		} //for

		System.out.printf("=%d\n",sum);
		 */

		/*
		// [2] 1+3+5+...+9=25 출력 / 1~10까지 홀수의 합
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if ( i%2 != 0) {
				sum += i ;
				System.out.printf(i == 10 ? "%d" : "%d+", i);
			} //if
		} //for

		System.out.printf("=%d\n",sum);
		 */

		/*
		// [3] 1+3+5+...+9=25 출력 / 1~10까지 홀수의 합
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if ( i%2 == 0) continue;
			sum += i ;
			System.out.printf(i == 10 ? "%d" : "%d+", i);
		} //for

		System.out.printf("=%d\n",sum);
		 */
		
		/*
		// [4] 1+3+5+...+9=25 출력 / 1~10까지 홀수의 합
		int sum = 0;
		for (int i = 1; i < 11; i+=2) {
			sum += i ;
			System.out.printf(i == 10 ? "%d" : "%d+", i);
		} //for

		System.out.printf("=%d\n",sum);
		 */

		// [5] 1~n까지의 합 출력
		int n = 5;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			// if ( i%2 == 0) continue;
			sum += i ;
			System.out.printf(i == n ? "%d" : "%d+", i);
		} //for

		System.out.printf("=%d\n",sum);

	} //main
}
