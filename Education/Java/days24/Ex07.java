package days24;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @subject 제네릭수, 어노테이션, 열거형
 * @content 자바IO
 * 			스레드 + 네트워크 X
 * 			람다식과 스트림 X
 */
class Ex07 {
	public static void main(String[] args) {
		// [ 제네릭(Generics) ]
		// 1. jdk 1.5 - 제네릭
		// 	  jdk 1.8 - 람다식
		// 2. 제네릭이란?
		// 		[다양한 타입의 객체]를 다루는 메서드, 컬렉션 클래스에서 [컴파일시] 타입을 체크해 주는 기능
		// 3. 왜? 객체의 타입을 컴파일 시에 체크하기 때문에 
		// 			1) 객체의 타입 안정성을 높이고   2) 형변환의 번거로움이 줄어든다. -> 코드가 간결해진다.
		// 
		// 
		
		/*
		// 제네릭을 사용하지 않으면 형변환을 계속 사용해야한다.
		// 이름(문자열)만 넣으려하나 나이 등 다른 형의 데이터가 들어갈 수 있다. <- 안정성이 떨어진다. 
		ArrayList list = new ArrayList();
		list.add("홍길동");
		// String <- Object get()  다운캐스팅(형변환)
		String name = (String) list.get(0);
		System.out.println( name );
		
		// int <- Integer <- Object get()
		list.add(20);
		int age = (int) list.get(1);
		System.out.println( age );
		
		list.add(true);
		list.add('A');
		*/
		
		// 제네릭 클래스
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("김정주");
		list.add("이지현");
		list.add("김호영");
		// list.add(20); <- int 넣을 수 없음
		/*
		String name = list.get(0);
		System.out.println( name );
		*/
		
		Iterator<String> ir = list.iterator();
		while (ir.hasNext()) {
			// 제네릭을 사용한 Iterator<String> ir을 사용했다면 다운캐스팅을 하지 않아도 된다.
			// String name = (String) ir.next();
			String name = ir.next();
			System.out.println( name );
		}
	} //main
}//class