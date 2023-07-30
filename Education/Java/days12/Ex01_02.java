package Education.Java.days12;

public class Ex01_02 {
	public static void main(String[] args) {
		// 3행 4열 2차원 배열 m 선언 1~12 배열초기화
		int [][] m = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
		
		dispM(m);
		
		int [] n = new int [m.length*m[0].length];
		
		// 2차원 -> 1차원 배열로 변환
		//[1]
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				// n의 index = m열갯수 * m행갯수 + m열갯수
				n[m[i].length*m.length+m[i].length] = m[i][j];
			} //for
		} //for
		
//		//[2]
//		for (int i = 0; i < n.length; i++) {
//			n[i]=m[i/4][i%4];
//		} //for
		
		dispM(n);
	} //main	

	private static void dispM(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.printf("[%d] ", n[i]);
		} //for
		System.out.println();
	} //dispM

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d] ", m[i][j]);
			} //for
			System.out.println();
		} //for
	} //dispM
	
} //class