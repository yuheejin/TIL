package days24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Ex03 {

	public static void main(String[] args) {
		
		// Arrays : 배열 사용하기 쉽도록 기능이 구현된 클래스
		//			sort(), binarySearch(), fill(), copy() 등등
		
		// Collections : Collection 클래스를 사용하기 쉽도록 기능이 구현된 클래스
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);	// []
		
		// 1,2,3,4,5
		// list.add(1);
		//					  <? super Object>의 의미
		// param : (Collection<? super Object>, Object...)
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);	// [1, 2, 3, 4, 5]
		
		Collections.rotate(list, 2);
		System.out.println(list);	// [4, 5, 1, 2, 3]
		
		Collections.swap(list, 0, 2);
		System.out.println(list);	// [1, 5, 4, 2, 3]
		
		Collections.shuffle(list);
		Collections.shuffle(list);
		Collections.shuffle(list);
		System.out.println(list);	// 무작위로 섞임
		
		Collections.sort(list);
		System.out.println(list);	// [1, 2, 3, 4, 5]

		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);	// [5, 4, 3, 2, 1]
		
		Collections.fill(list, -1);
		System.out.println(list);	// [-1, -1, -1, -1, -1]		

		// Collections.copy(null, null);
		// Collections.replaceAll(null, null, null);
		// 등등
		
	} //main
	
}//class