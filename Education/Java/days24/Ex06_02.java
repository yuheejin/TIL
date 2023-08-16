package days24;

import java.util.Arrays;
import java.util.Comparator;

class Ex06_02 {
	public static void main(String[] args) {
		String [] names = {"이지현", "임경재", "김호용", "유희진"};
		System.out.println( Arrays.toString(names) );
		
		// 부모타입 객체명 = new 부모타입(매개변수...){
		//		// 필드
		//		// 메서드
		//		@Override 재정의함수 구현.			
		// };
		
		/*
		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};
		
		Arrays.sort(names, c);
		*/
		
		/*
		// sort() 메서드 호출 부분
		// 매개변수로 익명클래스 사용한 예
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		*/
		
		Arrays.sort(names, (o1, o2) -> o2.compareTo(o1));
		
		System.out.println( Arrays.toString(names) );
		
	} //main
} //class

/*
// 1. Comparator 인터페이스를 구현한 클래스 선언
class StringDescendingComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1); // 내림차순
	}
}
*/