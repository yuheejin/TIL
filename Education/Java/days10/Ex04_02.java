package Education.Java.days10;

import java.util.Arrays;

public class Ex04_02 {
	public static void main(String[] args) {
		int[] m = {3, 5, 2, 4, 1};
		System.out.println( Arrays.toString(m) );
//		// 수정
//		int index = 2;
//		m[2] = 100;
		
		// 삭제
//		// [1] System.arraycopy 사용
//		int index = 2;
//		int[] temp = new int [m.length-1];
//		System.arraycopy(m, 0, temp, 0, index);
//		System.arraycopy(m, index+1, temp, index, m.length-index-1);
//		m=temp;

		// [2] 반복문 사용
		int index = 2;
		int[] temp = new int [m.length-1];
		for (int i = 0; i < temp.length; i++) {
			if( index > i )  temp[i] = m[i];
			else if ( index <= i ) temp[i] = m[i+1];
		} //for
		m=temp;		
		
		System.out.println( Arrays.toString(m) );
		
	} //main
} //class