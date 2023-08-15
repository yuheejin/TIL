package days23;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ex05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Set : HashSet, LinkedHashSet
		//       [ TreeSet ]
		// 1. 중복 허용 X, 순서 유지 X
		// 2. 이진 검색 트리라는 자료 구조로 데이터를 저장하는 컬렉션 클래스.
		// 3. 이진 검색 트리 - 검색, 정렬,범위 검색하는 데 성능이 높다.
		// 4. 링크드리스트 처럼 노드(node)가 서로 연결된 구조.
		// 5. 최상위 노드 : 루트(root)노드
		//    부모 - 자식 노드 관계
		//    형제 노드 관계
		// 6. 트리노드
		//   class TreeNode{
		//        TreeNode  left; // 왼쪽 자식노드
		//        Object    elememnt;
		//        TreeNode  right; // 오른쪽 자식노드
	    //   }
		TreeSet<Integer> ts = new TreeSet<>();
	    ts.add(7);
	    ts.add(4);
	    ts.add(9);
	    ts.add(1);
	    ts.add(5);
	    ts.add(6);
	    
	    // [1, 4, 5, 6, 7, 9]
	    System.out.println( ts );
	    // 정렬된 순서에서 첫 번째, 마지막번째 값
	    System.out.println( ts.first() );
	    System.out.println( ts.last() );
	    
	    SortedSet<Integer> ss = ts.subSet(4, 7);
	    System.out.println( ss );
	    
	    // 지정된값(1)보다 큰 값을 가진 가장 가까운 값 반환
	    System.out.println( ts.higher(1) ); //  4
	    System.out.println( ts.lower(4) );  // 1
	    
	    // 지정된값(3)과 같은 객체를 반환
	    //  트리 구조에 3값이 없으면 작은 값을 
	    // 가진 객체 중에 가장 가까운 값을 반환\
	    // null 반환
	    System.out.println( ts.floor(3) );  // 1
	    
	    System.out.println( ts.ceiling(3) );  // 4


	}  // main

} // class