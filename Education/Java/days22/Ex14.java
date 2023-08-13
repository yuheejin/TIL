package Education.Java.days22;

import java.util.HashSet;

public class Ex14 {
	public static void main(String[] args) {
		// [ Set 인터페이스를 구현한 컬렉션 클래스 ]
		// - 특징 : 순서유지 X, 중복허용 X
		// - Collection 인터페이스의 자식클래스
		// - HashSet 컬렉션 클래스
		// (참고) Set + 순서 유지O ==> LinkedHashSet 컬렉션 클래스 사용
		
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(1);
		hs.add(15);
		hs.add(10);
		
		// 1) [1, 9, 10, 15] 저장 순서 유지 X
		System.out.println( hs );
		
		// 2) [1, 9, 10, 15] 중복 허용 X
		hs.add(1);
		System.out.println( hs );
		
		System.out.println( hs.size() );
		
	} //main
} //class