package Education.Java.days18;

import java.util.Arrays;
import java.util.Collections;

public class Ex01 {
	public static void main(String[] args) {
		int [] m = {3, 5, 2, 4, 1};
		Arrays.sort(m);
		System.out.println( Arrays.toString(m) );
		
		/*
		// [1]
		int [] temp = new int[m.length];
		for (int i = m.length-1; i >= 0; i--) {
			temp[4-i] = m[i];
		} // for
		m = temp;
		System.out.println( Arrays.toString(m) );
		*/
		
		
		// The method sort(int[]) in the type Arrays is not applicable for the arguments (int[], Collections.reverseOrder())
		// int 배열은 Collections.reverseOrder()을 추가로 매개변수를 둘 수 없다.
		// Arrays.sort(T[] a, Comparator <? super T>c)
		// type T <- 반드시 클래스가 와야함
		// Arrays.sort(m, Collections.reverseOrder());
		
		// int[] -> Integer[] 래퍼클래스로 변환
		// 박싱, 언박싱
		Integer [] temp = Arrays.stream(m).boxed().toArray(Integer[]::new);
		Arrays.sort(temp, Collections.reverseOrder());
		System.out.println( Arrays.toString(temp) );		
		
	} //main
	
} //class