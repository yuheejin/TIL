package Education.Java.days22;

import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Ex10 {
	public static void main(String[] args) {
		// [ 큐(Queue) ] 
		// 1. FIFO (First In First Out)
		//		───────────────
		//	→			C  B  A	 		→  	
		// 		───────────────
		//
		// queue : 	offer()			poll(), peek()
		// stack :	push()			pop(), peek()

		// [ 데큐(Dque) ]
		// 1. Double Queue
		//		───────────────
		//	→								 →  	
		//				C  B  A	   	
		//	←								 ← 	
		// 		───────────────

		// public interface Queue<E> extends Collection<E>
		// Collection 인터페이스를 상속받은 인터페이스
		Queue q = new LinkedList();
		q.offer("유희진");
		q.offer("임경재");
		q.offer("김호영");
		q.offer("이지현");
		
		while ( !q.isEmpty() ) {
			System.out.println( q.poll() );
			// String name = (String) q.remove();
			// System.out.println( name );
		} //while
		
		
		Deque dq = new LinkedList();
		dq.offerFirst("홍길동");
		// dq.offerLast("황길동");
		
		dq.pollFirst();
		// dq.pollLast();
		
	} //main
} //class