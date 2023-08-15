package Education.Java.days22;

import java.util.LinkedList;

public class Ex08_02 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("김호영");
		list.add("이지현");
		list.add("김정주");
		System.out.println( list );
		
		list.addFirst("유희진");
		System.out.println( list );
		
		list.add(1, "임경재");
		System.out.println( list );
		
		System.out.println( list.size() );
		
		System.out.println( list.contains("김동현") );	// false
		System.out.println( list.indexOf("김동현") );	// -1
		System.out.println( list.lastIndexOf("김동현") );	// -1
		
		// 김정주 -> 고경림 수정
		int index = -1;
		if ( (index = list.indexOf("김정주")) != -1 ) {
			list.set(index, "고경림");
		} //if
		System.out.println( list ); 
		
		// [비교]				읽기		중간에 삽입/삭제		맨뒤에 삽입/삭제		비고
		// 1. ArrayList		빠르다		느리다					빠르다					
		// 2. LinkedList	느리다		빠르다					느리다					데이더 많을수록 접근성 많이 떨어짐
		
	} //main
} //class