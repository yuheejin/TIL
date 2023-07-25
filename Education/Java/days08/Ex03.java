package Education.Java.days08;

public class Ex03 {

	public static void main(String[] args) {
		// 1+1+2+3+5+8+13+21+34+55+=143
		int firstTerm = 1;  // 첫 번째 항
		int secondTerm = 1; // 두 번째 항
		int nextTerm;
		int sum = firstTerm + secondTerm;
		System.out.printf("%d+%d+",firstTerm, secondTerm);
		
		for (int i = 1; i <= 8; i++) {
			nextTerm = firstTerm + secondTerm;
			System.out.printf("%d+", nextTerm);
			sum += nextTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		} // for
		 
		System.out.printf("=%d\n", sum);

	} // main

} // class
