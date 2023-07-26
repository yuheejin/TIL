package Education.Java.days10;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author heejin
 * @date 2023. 7. 26. - 오전 11:16:42
 * @subject	배열 단점 -> 컬렉션 클래스
 * @content	1) 배열의 크기가 자동으로 증가하지 못한다.
 */

import java.util.Iterator;
import java.util.Scanner;

public class Ex03_03 {

	public static void main(String[] args) throws IOException {
		
		// [1] Arrays 클래스 : 배열을 다루기 쉽도록 기능이 구현된 클래스
		int[] arr = {1,2,3,4,5};
		int[] arrCopy = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arrCopy));		// [3, 4]

		// [2]
		int [] m = new int [3];
		m[0] = 5;
		m[1] = 3;
		m[2] = 7;
		
		int index = 3;
		if( index == m.length ) {
			int[] temp = new int [ m.length+3 ];
			
			// m		[1][2][3][4][5]
			// temp	[][][][2][3][]
			// System.arraycopy(m, 1, temp, 4, 2);
			System.arraycopy(m, 0, temp, 0, m.length);
			
			m = temp;
		} //if
		
		m[3] = 10;
		System.out.println(Arrays.toString(m));
		
	} //main
} //class