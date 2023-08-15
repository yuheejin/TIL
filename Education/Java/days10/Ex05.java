package Education.Java.days10;

import java.util.Arrays;

/**
 * @author heejin
 * @date 2023. 7. 26. - 오후 2:41:25
 * @subject	카드(화투) 섞기
 * @content	
 */
public class Ex05 {
	public static void main(String[] args) {
		int[] m = new int[10];

		for (int i = 0; i < m.length; i++) {
			m[i] = i+1;
		} //for
		System.out.println(Arrays.toString(m));

		// 0~9  *10번
		shuffle(m);

		System.out.println(Arrays.toString(m));

	} //main

	// [3]
	public static void shuffle(int[] m) {
		int idx, temp;

		for (int i = 0; i < 100; i++) {
			idx = (int)( Math.random()*(m.length-1) )+1;
			temp = m[0];
			m[0] = m[idx];
			m[idx] = temp;
		} //for
	} //shuffle

	//	// [2]  (문제점) randIndex1 ==randIndex2
	//	public static void shuffle(int[] m) {
	//		int randIndex1, randIndex2, temp;
	//
	//		for (int i = 0; i < 10; i++) {
	//			randIndex1 = (int)(Math.random()*m.length);
	//			randIndex2 = (int)(Math.random()*m.length);
	//			if( randIndex1 ==randIndex2 ) {
	//				i--;
	//				continue;
	//			}
	//
	//			temp = m[randIndex1];
	//			m[randIndex1] = m[randIndex2];
	//			m[randIndex2] = temp;
	//		} //for
	//	} //shuffle
	

	//	// [1]
	//	public static void shuffle(int[] m) {
	//		int randIndex1, randIndex2, temp;
	//		
	//		for (int i = 0; i < 10; i++) {
	//			randIndex1 = (int)(Math.random()*m.length);
	//			randIndex2 = randIndex1;
	//			while (randIndex1 == randIndex2) {
	//				randIndex2 = (int)(Math.random()*m.length);
	//			} //while
	//
	//			temp = m[randIndex1];
	//			m[randIndex1] = m[randIndex2];
	//			m[randIndex2] = temp;
	//		} //for
	//	} //shuffle


} //class