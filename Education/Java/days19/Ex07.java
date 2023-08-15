package Education.Java.days19;

public class Ex07 {
	public static void main(String[] args) {
		// [ 오토박싱(boxing)과 오토언박싱(unboxing) ]
		int i = 100;		//변수
		
		// JDK 1.5이전
		// Integer k = new Integer(i);
		
		// JDK 1.5이후  
		Integer j = i;	// 기본형(i) -> 객체(j) : 오토박싱 (boxing)
		int k = j;		// 객체(j) -> 기본형(i) : 오토언박싱 (boxing)
		
		test(i);		// int -> Integer boxing -> Object 업캐스팅
		test(3.14);	// double	기본형
		test(j);		// Integer	클래스
		test(1L);
		test('a');
		test(true);
		
	} //main

	//								모든 자료형을 매개변수로 받아서 처리하겠다.
	private static void test(Object i) {	// Integer -> int 형변환 (오토언박싱)
		System.out.println( i );
	}
	
	/*
	private static void test(int i) {	// Integer -> int 형변환 (오토언박싱)
		System.out.println( i );
	}
	*/
	
} //class