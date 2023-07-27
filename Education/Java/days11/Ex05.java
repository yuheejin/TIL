package Education.Java.days11;

import java.util.Arrays;
import java.util.Iterator;

public class Ex05 {
	public static void main(String[] args) {
		// 버블 정렬
		// m[i] > m[i+1] 오름차순 정렬 (ascending)
		// m[i] < m[i+1] 내림차순 정렬 (decending)
		int [] m = {3,5,2,4,1};
		//bubbleSort(m);

		// 선택정렬
		// selectionSort(m);
		selectionSort2(m);
		System.out.println( Arrays.toString(m) );

		// 삽입정렬
		// 병합정렬
	} //main

	public static void selectionSort2(int[] m) {
		// 매번 자리변경하지 말고, 제일 작은 값하고 한번만 자리 변경
		int minIndex, temp;
		for (int i = 0; i < m.length-1; i++) {
			minIndex = i; 
			for (int j = i+1; j < m.length; j++) {
				if(m[minIndex]>m[j]) minIndex = j;
			} //for
			temp = m[i];
			m[i] = m[minIndex];
			m[minIndex] = temp;
		} //for
 
	} //selectionSort

	public static void selectionSort(int[] m) {
		// 0   	1   	2   	3   	4		index
		// 3   	5   	2   	4   	1		element
		// [선택]
		// 0-1		0-2	0-3	0-4		1	5	3	4	2	-1회전
		// 			[선택]
		// 1-2		1-3	1-4				1	2	5	4	3	-2회전
		//					[선택]
		// 2-3		2-4						1	2	3	5	4	-3회전
		//							[선택]
		// 3-4									1	2	3	4	5	-4회전

		for (int i = 0; i < m.length-1; i++) {
			for (int j = i+1; j < m.length; j++) {
				if(m[i] > m[j]) {
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				} //if
			} //for
		} //for

	} //selectionSort

	public static void bubbleSort(int[] m) {
		for (int i = 1; i <=4; i++) {
			for (int j = 0; j <=4-i; j++) {
				System.out.printf("%d-%d ", j, j+1 );
				if( m[j] > m[j+1]) {
					System.out.print( " *** ");
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				}
				System.out.println( Arrays.toString(m));
			} // for
			System.out.println();
		} // for
	} //bubbleSort

} //class