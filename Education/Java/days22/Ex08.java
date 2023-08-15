package Education.Java.days22;

public class Ex08 {
	public static void main(String[] args) {
		// [ LinkedList 컬렉션 클래스 ]
		// 1. 배열
		//		(1) 장점 - 읽기 성능이 가능 빠르다.
		//		(2) 단점 - 배열크기 자동으로 증가, 감소 X, 삽입, 삭제 속도가 느림
		//			메모리상에 동일한 자료형으로 연속적으로 놓이게 한 것
		// 2. LinkedList
		//		(특징) 비연속적
		//		(1) ArrayList, Vector -> Element (요소 E)
		//		(2) Node (노드) 
		//			각 노드들은 연결되어 있다.
		//			[Node0]				[[0x100]Node1]	    	[[주소]Node]
		//			0x100				0x200
		//	노드추가			[Node2]
		//						0x400
		//
		//			[Node0]	[[0x100]Node2]		[[0x400]Node1]
		//			0x100	0x400					0x200
		//
		//			단방향 환형 LinkedList : 앞의 노드의 주소를 뒤의 노드가 가지고 있는 LinkedList
		//			양방향(double) 환형 LinkedList : 한 노드가 앞의 노드와 뒤의 노드의 주소를 가지고 있는 LinkedList
		//
		//			환형 LinkedList : 제일 뒤의 노드가 제일 앞의 노드의 주소를 가지는 경우
		//
		//
		//
		//

		Node node1 = new Node();
		node1.value = 10;

		Node node2 = new Node();
		node2.value = 20;
		node1.next = node2;
		
		Node node3 = new Node();
		node3.value = 30;
		node2.next = node3;
		
		Node node4 = new Node();
		node4.value = 40;
		node3.next = node4;
		
		
		// node2와 node3 사이에 node5를 [삽입]
		Node node5 = new Node();
		node5.value = 50;
		node2.next = node5;
		node5.next = node3;
		
		// node3 [삭제]
		node5.next = node3.next;
		
		
		
		
	} //main
} //class


class Node {
	int value;	//값
	Node next = null;	// 다음 노드의 주소를 참조
	// Node prev= null;		// 이전 노드의 주소를 참조
	
	
	
	
} //class Node