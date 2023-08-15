package Education.Java.days22;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Ex07 {
	public static void main(String[] args) {
		// Vector 컬렉션 클래스
		//   ㄴ List 인터페이스를 구현한 클래스
		//   ㄴ 순서 유지 O, 중복 허용 O
		//   ㄴ ArrayList와 동일 ( 차이점 )
		// 			ㄴ 멀티스레드에 안전 (동기화 처리)

		// StringBuilder : 멀티스레드 X, 동기화처리 X
		// StringBuffer : 멀티스레드 O, 동기화처리 O

		// public class Vector<E> extends AbstractList<E>  implements List<E>, RandomAccess, Cloneable, java.io.Serializable
		// public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>
		Vector v = new Vector();		// Vector도 ArrayList와 마찬가지로 기본생성자가 방을 10개 만든다. 
		v.addElement("김호영");  // add() 동일
		v.add("김성준");
		v.add("이지현");
		
		System.out.println( v.size() );  // 요소의 개수 3
		System.out.println( v.capacity() );  // 용량 10

		v.trimToSize();
		System.out.println( v.capacity() );  // 3

		v.setSize(5);  // [a][b][c][null][null]
		System.out.println( v.size() );  // 5
		System.out.println( v.capacity() );  // 6
		System.out.println( v );

		// get()과 elementAt()은 요소값을 반환함
		v.get(0);
		v.elementAt(0);

		// [반복자]와 [열거자]의 차이점
		// 반복자 : list가 작업(추가, 삭제, 변경)된 경우, 즉시 반영
		// The returned iterator is fail-fast.
		Iterator ir = v.iterator();
		
		// 열거자 : 처리중 변경이 일어나도 바뀐데이터가 아닌 기존의 데이터를 사용
		Enumeration en = v.elements();
		// hasMoreElements() : 요소 더 있니? [true/false]
		while (en.hasMoreElements()) {
			// nextElement() : 다음요소를 얻어옴
			String name = (String) en.nextElement();
			System.out.println( name );
		} //while
		
		/*
		String 제거한이름 = (String) v.remove(0);
		v.removeElementAt(0);
		*/
		
		// v(벡터) null 요소제거한 나머지 요소를 출력
		v.removeIf( n -> n == null );
		// v.forEach( System.out::println );
		// v.forEach( n->System.out.println(n) );
		System.out.println( v );
		
		
		// v.add(1, "임경재");
		v.insertElementAt("임경재", 1);
		System.out.println( v );
		
		List subList = v.subList(1, 3);
		System.out.println( subList );

	} //main
} //class