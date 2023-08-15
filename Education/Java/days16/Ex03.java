package Education.Java.days16;

public class Ex03 {
	public static void main(String[] args) {
		// [ final 키워드 ]
		// 1. 지역변수 -> 상수
		// final double PI = 3.141592;
			
		FinalTest obj = new FinalTest();
		System.out.println( obj.PI );
		
		int value = 100;
		obj.finalTest(value);
		
		// The final field FinalTest.PI cannot be assigned
		// 상수화 되었기 때문에 다른 값으로 할당할 수 없다.
		// obj.PI = 3.14;		
	} //main
} //class


// 2. 최종클래스
// final을 class앞에 붙이면 Sub클래스를 가질 수 없는 최종(마지막) 클래스가 된다.
final class FinalTest {
	// 필드
	// public static final double PI=3.141592;  //명시적 초기화
	
	// The blank final field PI may not have been initialized
	final double PI;
	
	/*
	// 인스턴스 초기화 블럭
	{
		PI=3.14;
	}
	*/
	
	public FinalTest() {   //생성자 초기화
		PI=3.14;
	}
	
	// int value 지역변수, 매개변수
	// finalTest(){} 안에서 value는 상수로 쓰임
	public void finalTest( final int value ) {
		//
	}
	
} //class FinalTest


/*
// The type Parent is already defined
// 같은 패키지 안에서 이미 선언한 클래스임
class Parent {
	// 3. 재정의할 수 없는 최종(마지막) 메서드
	final void dispA() {
		// 구현~
	}
} //class Parent 

class Child extends Parent {
	// Cannot override the final method from Parent
	// 부모클래스에서 final로 선언했기 때문에, override 할 수 없다.
	@Override
	void dispA() {
	}
} //class Child
*/