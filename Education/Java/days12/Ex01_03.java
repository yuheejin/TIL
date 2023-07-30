package Education.Java.days12;

public class Ex01_03 {
	public static void main(String[] args) {
		int [][] m = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
		dispM(m);
		
		int [][] n = new int [2][6];
		
		// 3*4 -> 2*6 변환
		// 3*4 -> 1*12 -> 2*6 변환
		// i  j
		// 0 0		0 0
		// 0 1		0 1
		// 0 2		0 2
		// 0 3		0 3
		// 1 0		0 4
		// 1 1		0 5
		// 1 2		1 0
		// 1 3		1 1
		// 2 0		1 2
		System.out.println();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[(i * m[i].length + j) / n[0].length][(i * m[i].length + j) % n[0].length] = m[i][j];
			} //for
		} //for
		dispM(n);
		
	} //main	

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d] ", m[i][j]);
			} //for
			System.out.println();
		} //for
	} //dispM
	
} //class