package days24;

class Ex09 {
	public static void main(String[] args) {
		// [ 제네릭스의 제한 ]
		// 1) 제네릭 클래스에서는 정적 필드를 선언할 수 없다.
		// 2) static 메서드의 매개변수로 T타입 사용할 수 없다.
		
	} //main
	
}//class

class Box02<T> {
	// Cannot make a static reference to the non-static type T
	// 1) 제네릭 클래스에서는 정적 필드를 선언할 수 없다.
	// 		T는 컴파일 시 정해지는데, static은 프로그램 실행시 올라가기 때문에, 컴파일 되기 전에 올라가기 때문에 선언 불가하다.
	// static T item2;	// 정적 필드 선언
	
	// Cannot make a static reference to the non-static type T
	// 2) static 메서드의 매개변수로 T타입 사용할 수 없다.
	// static int compare(T t1, T t2) {
	// 	  return 0;
	// }
	
	// 3) T 타입의 배열은 선언할 수 있다.
	T[] itemArr;
	
	
} //class Box02