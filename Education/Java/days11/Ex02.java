package Education.Java.days11;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int [] m =  {3,5,2,4,1};
		
		// 정수 4가 있는 위치(index)에 100을 삽입
		int n = 4;
		int input=100;
		int index = sequentialSearch(m,n);
		System.out.println("index =" + index);

		// System.arraycopy()
		int [] temp = new int [m.length+1];
		for (int i = 0; i < m.length; i++) {
			temp[ i<index? i : i+1 ] = m[i];
		} //for
		temp[index] = input; 
		
		m=temp;
		System.out.println(Arrays.toString(m));
	} //main

	public static int sequentialSearch(int[] m, int n) {
		int index = -1;
		for (int i = 0; i < m.length; i++) {
			if (n == m[i]) {
				index = i;
				break;
			} //if
		} //for
		return index;
	} //sequentialSearch
	
} //class
