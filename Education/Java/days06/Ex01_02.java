package Education.Java.days06;

import java.util.Arrays;
import java.util.Random;

public class Ex01_02 {
	public static void main(String[] args) {
		
		// [문제] 10개 정수를 임의의 값(5~15)으로 저장 -> 가장 큰값
		
		/*
		// 0.0 <= Math.random() < 1.0
		// 0.0 <= Math.random()*11 < 11.0
		// 5.0 <= Math.random()*11+5 < 16.0
		// 5 <= (int)(Math.random()*11+5) < 16
		int [] m = new int [10];
		for (int i = 0; i < m.length; i++) {
			m[i] = (int)(Math.random()*11+5);
		} //for
		 */
		
		
		// 매개변수 seed를 주지 않으면 현재 시스템의 시간을 사용함
		Random rnd = new Random();
		// 0 <= rnd.nextInt(100) < 100
		rnd.nextInt(100);
				
		int [] m = new int [10];
		for (int i = 0; i < m.length; i++) {
			m[i] = rnd.nextInt(11)+5;
		} //for
		
		// m 배열의 각 요소를 출력(확인)
		System.out.println(Arrays.toString(m));
		
		
//		int max = m[0];
//		
////		for (int i = 1, len = m.length; i < len; i++) {
////			max = max>m[i] ? max : m[i]; 
////		} //for
//		
//		for (int i = 1, len = m.length; i < len; i++) {
//			if (max < m[i]) {
//				max = m[i];
//			} //if 
//		} //for
		
		int max, min;
		max = min = m[0];
		
		for (int i = 1, len = m.length; i < len; i++) {
			
			if (max < m[i]) {
				max = m[i];
			} else {
				min = m[i];
			} // if else
			
		} //for
		
		System.out.printf("max : ", max);
				
	} //main	
} // class
