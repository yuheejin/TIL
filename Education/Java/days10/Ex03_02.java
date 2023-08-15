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

public class Ex03_02 {

	public static void main(String[] args) throws IOException {
		int [] m = new int [3];
		m[0] = 5;
		m[1] = 3;
		m[2] = 7;
		
		// java.lang.ArrayIndexOutOfBoundsException
		// m[3] = 10;

		// 1. 원래 배열크기 + 3 증가
		// [][][][][][]		[]temp
		int index = 3;
		if( index == m.length ) {
			int[] temp = new int [ m.length+3 ];
			for(int i=0; i < m.length; i++)  temp[i] = m[i];		// 2. m -> temp 요소 복사
			m = temp;		// 3. temp 배열을 m 배열로 바꾸는 코딩
							// 			temp는 if안에 있는 지역변수이기때문에 if문을 나오면 사라짐
							//			기존에 m이 가지고 있던 heap영역의 값들은 가비지 값으로 자동으로 지워짐
		} //if

		m[3] = 10;
		System.out.println(Arrays.toString(m));

	} //main
} //class