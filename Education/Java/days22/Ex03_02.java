package Education.Java.days22;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03_02 {
	public static void main(String[] args) {
		// 1) 팀원들의 이름을 요소로 추가  
		String[] names = {"박민석", "유희진", "고경림", "임경재", "이지현" , "김정주", "김호영"};
		ArrayList list = new ArrayList();
		for (int i = 0; i < names.length; i++) {
			list.add(names[i]);			
		} // for
					
		// 2) 반복자를 사용해서 모든 요소(팀원들) 출력
		dispList(list);			
		
		// 3) 팀원들의 인원수를 출력
		System.out.println( list.size() );	// 요소의 개수  7
		// System.out.println( list.trimToSize() );	// 남은 방의 개수 (기본초기 용량인 10개에서 7개 사용했으니 3을 반환)
		
		// 4) 두 번째 팀원이 누구인지 확인 후 "홍길동" 팀원으로 수정
		System.out.println( list.get(1) );
		// list.remove(1);
		// list.add(1, "홍길동");
		list.set(1, "홍길동");
		System.out.println(list);
		
		// 5) "홍길동" 팀원의 존재 유무를 확인 후 삭제
		if ( list.contains("홍길동")) {
			list.remove( list.indexOf("홍길동") );		// remove는 삭제된 요소를 반환한다.
		}
		System.out.println(list);
		
		// 6) "김"씨 팀원들만 삭제 후 확인.
		// list.removeIf( n -> ((String)n).charAt(0)=='김' );
		Iterator ir= list.iterator();
		ArrayList removeList = new ArrayList();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			// if ( name.startWith("김") ) {
			if ( name.charAt(0) == '김' ) {
				removeList.add(name);
			} //if
		} //while
		list.removeAll( removeList );
		System.out.println(list);
		
	} //main

	private static void dispList(ArrayList list) {
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println( name );
		} //while
	} //dispList
	
} //class