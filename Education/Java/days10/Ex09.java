package Education.Java.days10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Ex09 {
	public static void main(String[] args) {
		/*
		1. 1차원, 2차원, 3차원 배열 (다차원 배열)
		2. 정렬(sort) - 버블, 셀렉션 등
		3. 검색(search) - 이진, 시퀀스
		4. 다차원 활용 예제

		클래스
		 */

		// 문제) int [] m = new int[	30];		0~9 임의의 정수
		// 0 - 3개
		// 1 - 0개
		//     :
		// 9 - 4개

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