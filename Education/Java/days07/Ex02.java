package Education.Java.days07;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {


		// 행의 갯수를 입력받아 이등변 삼각형 별찍기
		// 1: __*				3	5		
		// 2: _***				4	7
		// 3: *****				5 	9
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("> 행의 갯수 입력?  ");
			int row = scanner.nextInt();
			int col = row*2-1;
			for (int i = 1; i <= row; i++) {	// 행갯수
				for (int j = 1; j <= col; j++) {
					if (i+j>=row+1 && j-i<=row-1)  System.out.print("*");
					else System.out.print("_");
				} //for
				System.out.println();
			}  //for		
		} catch (Exception e) {
			e.printStackTrace();
		} //try-catch


	} //main
} //class
