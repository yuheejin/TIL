package Education.Java.days06;


public class Ex06_03 {
	public static void main(String[] args) {
		
		/*
		// [1] 가로로 구구단 출력
		for (int dan = 2; dan < 10; dan++) {
			
			for (int i = 1; i < 10; i++) {
				// System.out.printf("%d*%d=%d \t", dan, i, dan*i);
				System.out.printf("%d*%d=%02d ", dan, i, dan*i);
			} //for
			
			System.out.println();
			
		} //for
		*/
		
		// [2] 세로로 구구단 출력
		//int danNum = 2;
		for (int i = 2; i < 10; i++) {
			System.out.printf(" [%d]단\t",i);
		} //for
		
		System.out.println();
		for (int i = 1; i < 10; i++) {
			
				for (int dan = 2; dan < 10; dan++) {
					System.out.printf("%d*%d=%d\t", dan, i, dan*i);
					
				} //for
			
			System.out.println();
			
		} //for
		
		
	} // main
} // class