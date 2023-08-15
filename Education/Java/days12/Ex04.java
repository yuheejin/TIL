package Education.Java.days12;

import java.util.Iterator;

public class Ex04 {
	public static void main(String[] args) throws InterruptedException {
		int [][] m = new int [5][5];
		
//		fillM(m);
//		dispM(m);
//		
//		System.out.println();
		
		// fillM02(m);
		// fillM03(m);
		// fillM04(m);
		// fillM05(m);
		fillM06(m);
		// magicSquare(m);
		dispM(m);
		
	} //main	
	
	
	private static void magicSquare(int[][] m) throws InterruptedException {
		// 1) 첫 번째 행의 가운데 열 = 1
		// 2-1) 출력값이 5의 배수라면 행만 증가
		// 2-2) 2-1이 아니라면,  행 감소, 열 증가   반복적으로 처리 
		//							ㄴ 행 -1 > 가장큰 행값 처리. 
		//							ㄴ 열  5 > 가장작은 열값 처리
		int row=0, col=m.length/2;
		for (int input = 1; input <= m.length * m[0].length; input++) {
			m[row][col] = input;
			dispM(m);
			Thread.sleep(1000); //1초
			
			if (input%5==0) row++;
			else {
				row--;	col++;
				if(row == -1) row=m.length-1;
				else if(col == m.length) col=0;				
			} //if-else
		} //for		
	} //magicSquare


	private static void fillM06(int[][] m) {
		/*
		00
		01
		02
		03
		04
		14
		24
		34
		44
		43
		42
		41
		40
		30
		31
		32
		33
		 */
		int num = 1;
		int minRow = 0, maxRow = m.length-1;
		int minCol = 0, maxCol = m[0].length-1;

		while (num <= m.length*m[0].length) {
			// 위쪽 행 (왼쪽 -> 오른쪽)
			for (int i = minCol; i <= maxCol; i++) {
				m[minRow][i] = num++;
			}
			minRow++;

			// 오른쪽 열 (위쪽 -> 아래쪽)
			for (int i = minRow; i <= maxRow; i++) {
				m[i][maxCol] = num++;
			}
			maxCol--;

			// 아래쪽 행 (오른쪽 -> 왼쪽)
			for (int i = maxCol; i >= minCol; i--) {
				m[maxRow][i] = num++;
			}
			maxRow--;

			// 왼쪽 열 (아래쪽 -> 위쪽)
			for (int i = maxRow; i >= minRow; i--) {
				m[i][minCol] = num++;
			}
			minCol++;
		} //while
	} //fillM06
	
	private static void fillM05(int[][] m) {
		// [1]
		int input=1;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j <= i; j++) {
				m[j][i-j] = input++;
			} //for
		} //for

		for (int i = 1; i < m.length; i++) {
			for (int j = i; j < m.length; j++) {
				m[j][4+i-j] = input++;
			} //for
		} //for
	} //fillM05

	private static void fillM04(int[][] m) {
		// [1]
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][(i%2==0)? j : 4-j] = m[i].length*i+j+1;
			} //for
		} //for
		
		// [2]
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = m[i].length*i+((i%2==0) ? j+1 : 5-j);
			} //for
		} //for
	} //fillM04
	
	private static void fillM03(int[][] m) {
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[i].length; j++) {
//				m[i][j] = (5-i)+5*j;
//			} //for
//		} //for
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[4-j][i] = m[i].length*i+j+1;
			} //for
		} //for
	} //fillM03
	
	private static void fillM02(int[][] m) {
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[i].length; j++) {
//				m[i][j] = (m.length*m[i].length) - (m[i].length*i+j);
//			} //for
//		} //for

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[m[i].length-1-i][m[i].length-1-j] = m[i].length*i+j+1;
			} //for
		} //for
	} //fillM02
	
	private static void fillM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = m[i].length*i+j+1;
			} //for
		} //for
	} //fillM

	private static void dispM(int[][] m) {
		System.out.println("\n\n\n\n");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d] ", m[i][j]);
			} //for
			System.out.println();
		} //for
	} //dispM
	
} //class