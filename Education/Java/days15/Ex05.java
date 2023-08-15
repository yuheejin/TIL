package Education.Java.days15;

import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		// 단일 상속
		// 다중 상속 : 자바는 다중상속을 지원하지 않음
		/* class Tv { int power; }
		 * class VCR { int power; }
		 * 								다중상속 안됨 -> [인터페이스]로 구현
		 * class TVCR extends Tv, VCR {		// Tv + VCR
		 * 		int power;
		 * 		int power;
		 * }
		 * 
		 * 이유: 상속받고자 하는 클래스들에 같은 이름을 갖는 필드가 있을 경우, 혼동이 오기 때문임
		 */
		
		// [ 오버라이딩 주의사항 ]
		// 1. 정의 : 부모클래스로부터 상속받은 메서드를 재정의하는 것
		// 2. override 사전적의미 == overwrite == 위에 덮어쓰다.
		// 3. 오버라이딩의 조건
		//		1) 메서드명 동일
		//		2) 매개변수 동일
		//		3) 리턴타입 동일
		// 		4) 접근지정자는 부모의 접근지정자 범위보다 같거나 넓어야 된다.
		//		5) 부모의 메서드보다 많은 수의 예외를 선언할 수 없다.
		//		6) 인스턴스 메서드 <-> static 메서드     서로 변경 불가하다.
		
		
	} //main
} //class


class Parent {
	public int print(String n, int a) throws IOException {
		return 100;
	}
} //class Parent


class Child extends Parent {

	// cannot reduce the visibility of the inherited method from parent
	// 부모의 접근지정자 범위보다 같거나 넓어야 된다.
	// The method print(String) of type Child must override or implement a supertype method
	// 부모의 매개변수와 동일해야한다.
	// The return type is incompatible with Parent.print(String, int)
	// 부모의 리턴타입과 동일해야한다.
	@Override
	public int print(String n, int a) throws IOException, NullPointerException {
		return 200;
	}
	
	// 오버로딩
	public int print(String n) throws IOException, NullPointerException {
		return 200;
	}
	
} //class Child