package Education.Java.days08;

/**
 * @author heejin
 * @date 2023. 7. 24. - 오후 2:13:41
 * @subject	재귀함수
 * @content
 */
public class Ex08 {
	public static void main(String[] args) {
		// 2^3 = 2*2*2 = 8
		// [거듭제곱] == 누승 == 멱 == pow
		// 밑수(2)를 지수(3)만큼 반복해서 곱하는 것

//		// 일반함수
//		double result = pow(2,-3);
//		System.out.println(result);
//		
//		double result1 = pow(2,3);
//		System.out.println(result1);
		
		// 재귀함수
		double result = recursivePow(2,-3);
		System.out.println(result);
		
		double result1 = recursivePow(2,3);
		System.out.println(result1);
		
	} //main

	
	// 재귀함수
	private static double recursivePow(int n, int m) {
		if(m == 1) return n;
		else if (m==0) return 1;
		else if (m<0) return 1/(n * recursivePow(n, -m) );
		else return n *recursivePow(n, m-1);
	} //recursivePow
	
	
	
	// 일반함수
	private static double pow(int n, int m) {
		double result = 1.0;
		
		// int exp =m;
		// if (m<0) exp=-m;
		int exp = Math.abs(m);
		
		for (int i = 0; i < exp; i++) {
			result *= n;
		} //for
		
		return m<0? 1/result: result;
	} //pow
	
} //class