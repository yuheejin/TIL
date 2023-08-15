package Education.Java.days08;

public class Ex06_02 {
	public static void main(String[] args) {
		int n=10;

		// 1~n 합 재귀 함수
		int result = recursiveSum(n);
		System.out.printf("1~%d=%d\n", n, result);
	} //main

	private static int recursiveSum(int n) {
		if (n==1) return n;
		else return n+recursiveSum(n-1);
	} //recursiveSum
	
} //class