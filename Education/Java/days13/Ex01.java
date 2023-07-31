package Education.Java.days13;

public class Ex01 {
	public static void main(String[] args) {
		int [][] m = new int[5][5];
		
		fillM(m);
		dispM(m);
		
	} //main

	public static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.printf("[%02d]",m[i][j]);
			} // for
			System.out.println();
		} // for		
	} //dispM

	public static void fillM(int[][] m) {
//		// [1]
//		for (int i = 0; i < m.length-1; i++) {
//			for (int j = 0; j < m[i].length-1; j++) {
//				m[i][j] = i*(m[i].length-1)+j+1;
//			} // for
//		} // for		
//		
//		for (int i = 0; i < m.length; i++) {
//			int sum = 0;
//			int sum1 = 0;
//			for (int j = 0; j < m.length-1; j++) {
//				sum += m[i][j];
//				sum1 += m[j][i];
//			} // for
//			m[i][m[i].length-1] = sum;
//			m[m[i].length-1][i] = sum1;
//		} // for
		
		//[2]
		for (int i = 0; i < m.length-1; i++) {
			for (int j = 0; j < m[i].length-1; j++) {
				m[i][j] = i*(m[i].length-1)+j+1;
				m[i][m[i].length-1] += m[i][j];
				m[m.length-1][j] += m[i][j];
				m[m.length-1][m[i].length-1] += m[i][j];
			} // for
		} // for		
	} //fillM
	
} //class
