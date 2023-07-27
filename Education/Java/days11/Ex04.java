package Education.Java.days11;

import java.util.Arrays;
import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		// 문제) int [] m = new int[	30];		0~9 임의의 정수
		// 0 - 3개
		// 1 - 0개
		//     :
		// 9 - 4개

		// [1]
		int[] m = new Random().ints(30, 0, 10).toArray();

		System.out.println( Arrays.toString(m) );

		int checkNum = 9, count;
		for (int i = 0; i <= checkNum; i++) {
			count=0;

			for (int j = 0; j < m.length; j++) {
				if (i == m[j]) count++;
			} //for
			System.out.printf("%d - %d개\n", i, count);
		} //for
		
	} //main
} //class