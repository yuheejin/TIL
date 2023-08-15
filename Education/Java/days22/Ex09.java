package Education.Java.days22;

import java.util.Stack;

public class Ex09 {
	public static void main(String[] args) {
		// [ 스택(Stack) ]
		// 1. LIFO 구조 ( Last In First Out )
		//		───────────────┐
		//	→					C  B  A  │	
		// 		───────────────┘
		//	
		// → push()
		// ← pop()		peek()
		//    empty()
		// index search()
		//
		// 2. 스택 활용 : 웹브라우저 뒤로/앞으로
		
		// public class Stack<E> extends Vector<E>
		// public class Vector<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable
		// Vector <- List <- Collection
		Stack s = new Stack();
		s.push("유희진");
		s.push("임경재");
		s.push("김호영");
		s.push("이지현");
		System.out.println( s );
		
		/*
		// 맨 끝의 요소를 삭제하고 삭제한 요소 반환
		System.out.println( s.pop() );
		System.out.println( s );
		
		while ( !s.isEmpty()) {
			System.out.println( s.pop() );
		} //while
		*/
		
		// 맨 끝의 요소를 삭제하지 않고 읽어옴
		System.out.println( s.peek() );
		System.out.println( s.peek() );
		System.out.println( s.peek() );		
		System.out.println( s );
		
		// 뒤에서부터 몇번째에 있는지 반환
		System.out.println( s.search("임경재") );
				
	} //main
} //class