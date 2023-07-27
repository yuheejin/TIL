package Education.Java.days11;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex02_02 {
	public static void main(String[] args) {
		// 검색 (Search)
		// 1. 순차검색 (sequential Search)
		// 2. 이진검색 (binary Search)   + 정렬
		
		// int [] m =  {3,5,2,4,1};
		// 위의 코딩처럼 배열 m을 사용 -> 단점
		// 1) 요소추가 (배열크기 자동 증가/감소)
		// 2) 요소삽입 (배열크기 자동 증가/감소) + 값 뒤로 밀기
		// 3) 요소삭제 (배열크기 자동 증가/감소) + 값 앞으로 밀기
		
		// -> 컬렉션(collection) 클래스
		// ArrayList<Element>
		// ArrayList<E> jdk 1.5 제네릭스
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(1);
		
		int index = list.indexOf(4);	// 찾고자하는 요소값을 넣어주면 그 요소의 인덱스값을 리턴함
		System.out.println(index);	//3
		
		System.out.println(list);	//[3, 5, 2, 4, 1]
		list.add(index, 100);
		System.out.println(list);	//[3, 5, 2, 100, 4, 1]
	} //main
} //class