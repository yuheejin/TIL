package Education.Java.days11;

import java.util.Arrays;
import java.util.Random;

public class Ex04_02 {
	public static void main(String[] args) {
		// 문제) int [] m = new int[	30];		0~9 임의의 정수
		// 0 - 3개
		// 1 - 0개
		//     :
		// 9 - 4개

		// [2]
		int[] m = new int[30];
		int n;
		// counts [0] = 0의 갯수
		// counts [1] = 1의 갯수 ...
		int [] counts = new int[10];	// 0 초기화
		for (int i = 0; i < m.length; i++) {
			// m[i] = (int)(Math.random()*10);
			n = getRandomInt(0, 9);
			m[i] = n;
			counts[n]++;
		} //for
	} //main

	// 두 정수 사이의 값을 랜덤으로 가져오는 메서드
	public static int getRandomInt(int min, int max) {
		return (int)( Math.random()*(max-min+1) )+min;
	} //getRandomInt
} //class
