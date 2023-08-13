package Education.Java.days22;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Ex12 {
	public static void main(String[] args) {
		// [ iterator(반복자)와 Enumerator(열거자) ]
		// ListIterator
		// 		ㄴ iterator에 양방향으로 조회기능이 추가된 반복자
		// 		ㄴ List 구현한 클래스에만 사용 가능
		
		// 다음 요소 있니?		이전 요소 있니?
		// hasNext()		hasPrevious()
		// next()				previous()
		
		Vector v = new Vector();
		v.add("유희진");
		v.add("임경재");
		v.add("김호영");
		v.add("이지현");
		
		ListIterator ir = v.listIterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println( name );
			if (name.equals("김호영")) break;
		} //while
		
		System.out.println( "\n> 역 방향으로 진행하자~~" );
		while (ir.hasPrevious()) {
			String name = (String) ir.previous();
			System.out.println( name );
		} //while
		
	} //main
} //class