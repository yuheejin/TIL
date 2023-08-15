package Education.Java.days07;

public class Ex07_02 {
	public static void main(String[] args) {


		// 2. 1+2+4+7+11+16+...+191=???  규칙적인 수열
		//		 1	 2	 3	 4	 5..
		// 20개 항까지의 합을 출력

		//		int term = 1;	// 일반항
		//		int defference = 0;	// 계차
		//		int sum = 0;	// 총합
		//		
		//		for (int i = 1; i <= 20; i++) {
		//			term += defference;
		//			System.out.printf("%d+", term);
		//			sum += term;
		//			defference++;
		//		} //for
		//		System.out.printf( "\b=%d",sum);


		//		int term = 1;
		//		int sum = 0;
		//		for (int i = 0; i <= 19; i++) {
		//			term += i;
		//			sum += term;
		//			System.out.printf( "%d+",term);
		//		} //for
		//		System.out.printf( "\b=%d",sum);
		

		// 계차수열 식 사용해서 해보기
		int term, sum=0;
		for (int i = 1; i <= 20; i++) {
			// (n^2-n)/2+1
			term =  (int) ((Math.pow(i, 2)-i)/2+1);
			sum += term;
			System.out.printf("%d+", term );
		} // for
		System.out.printf( "\b=%d",sum);

	} //main
} //class
