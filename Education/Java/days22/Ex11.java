package Education.Java.days22;

import java.util.AbstractCollection;
import java.util.AbstractQueue;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ex11 {
	public static void main(String[] args) {
		// [ Priority Queue ]	- FIFO
		// - Priority 우선순위
		// - 우선순위가 높은 것부터 꺼내오는 큐
		
		// public class PriorityQueue<E> extends AbstractQueue<E> implements java.io.Serializable
		// public abstract class AbstractQueue<E> extends AbstractCollection<E> implements Queue<E>
		Queue q = new PriorityQueue();
		q.offer(3);
		q.offer(5);
		q.offer(2);
		q.offer(4);
		q.offer(1);
		
		System.out.println( q );
		
		while (!q.isEmpty()) {
			System.out.println( q.poll() );
		} //while
		
		// 우선순위가 높은 것부터 꺼내오는 큐
		// 작은 숫자가 우선순위가 높다.
		
	} //main
} //class