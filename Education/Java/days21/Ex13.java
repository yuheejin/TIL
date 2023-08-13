package Education.Java.days21;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex13 {
	public static void main(String[] args) {
		// 1. 컬렉션 클래스 - ArrayList
		// 		ㄴ 가장 많이 사용되는 컬렉션 클래스
		// 		ㄴ List 인터페이스를 구현한 클래스
		//			( 순서 유지 O, 중복 허용 O)
		// 		ㄴ 배열 요소(Element)
		// 		ㄴ 배열 단점을 ArrayList로 해결		days10.Ex03.java 참고
		
		String[] names = new String[3];
		names[0] = "주강민";
		names[1] = "정하영";
		names[2] = "임경재";
		System.out.println( names.length );
		// ArrayIndexOutOfBoundsException
		// names[3] = "이지현";
		
		// 검색 후 출력
		for (int i = 0; i < names.length; i++) {
			if ( names[i].equals("정하영") ) {
				System.out.println( names[i] );
			} //if
		} // for
		
		
		// Constructs an empty list with an initial capacity of ten.
		// 초기 용량은 10개로 잡힘
		// ArrayList list = new ArrayList();
		ArrayList list = new ArrayList(3);	// 요소를 3개 가질 수 있는 list 선언
		list.add("주강민");	// list 끝에 요소 추가
		list.add("정하영");	// list 끝에 요소 추가
		list.add("임경재");	// list 끝에 요소 추가
		System.out.println( list.size() );
		list.add("이지현");
		System.out.println( list.size() );
		System.out.println( list.get(1) );
		
		// 검색 후 출력
		System.out.println( list.contains("정하영") );
		
		// 매개변수로 받은 값을 앞에서부터 찾아 index 값을 반환
		int index = list.indexOf("정하영");
		// 매개변수로 받은 값을 뒤에서부터 찾는다.
		index = list.lastIndexOf("정하영");
		if ( index != -1 ) {
			System.out.println( list.get(index) );
			// 요소 1개 삭제
			list.remove(index);
			// 요소 1개 추가
			list.add(index, "홍길동");
		} else System.out.println( "정하영은 없다." );
		
		System.out.println( list );
		
		
		// *** iterator() ***
		// 요소를 순차적으로 처리할 수 있는 반복자(Iterator)를 반환하는 메서드 
		Iterator ir = list.iterator();
		
		// 다음 요소가 있으면 true / 없으면 false : hasNext() 
		while (ir.hasNext()) {
			// 다음 요소를 얻어오는 메서드 : next()
			String name = (String) ir.next();
			System.out.println( name );
		} //while
		

		// 모든 요소 삭제
		list.clear();
		System.out.println( list );
		System.out.println( list.isEmpty() );
				
	} //main
} //class