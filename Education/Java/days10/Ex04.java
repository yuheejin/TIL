package Education.Java.days10;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int[] m = {3, 5, 2, 4, 1};
		// [3, 5, 2, 4, 1]
		System.out.println( Arrays.toString(m) );

		// [추가(append)]
		// [삽입(insert)]
		// [3, 5, 100, 2, 4, 1]
		int index = 2;
		int n=100;
		
//		// [1] System.arraycopy 사용
//		int[] temp = new int [m.length+1];
//		System.arraycopy(m, 0, temp, 0, index);
//		System.arraycopy(m, index, temp, index+1, m.length-index);
//		temp[index] = n;
//		m=temp;

		// [2] 반복문 사용
		int[] temp = new int [m.length+1];
		for (int i = 0; i < m.length; i++) {
			if( index > i )  temp[i] = m[i];
			else if ( index <= i ) temp[i+1] = m[i];
		} //for
		temp[index] = n;
		m=temp;		
		
		System.out.println( Arrays.toString(m) );

	} //main
} //class