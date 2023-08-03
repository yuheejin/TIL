package Education.Java.days16;

public class Ex01 {
	public static void main(String[] args) {
		// 추상클래스도 일종의 클래스이기 때문에 업캐스팅이 가능함
		Parent p1 = new Descendant();
		Child p2 = new Descendant();
		
	} //main
	
} //class

// 상속계층도
// 자식클래스
// 공통적인 멤버 가진 부모클래스, abstract 키워드 - 추상클래스
// 일종의 클래스
abstract class Parent {
	// 필드
	// 메서드
	abstract void dispA();
	abstract void dispB();
}

/*
// The type Child must implement the inherited abstract method Parent.dispA()
// 부모클래스가 추상 메서드를 가지고 있기 때문에, 추상메서드를 오버라이딩해라, 아니면 Child도 추상 클래스로 선언해라 
class Child extends Parent {
	// 필드
	// 메서드
}
*/

/*
class Child extends Parent {
	@Override
	void dispA() {
	}

	@Override
	void dispB() {
	}
}
*/

// 부모가 가지고 있는 2개의 추상메서드 중 하나만 오버라이팅하면 한개의 추상메서드는 남아있다.
// 따라서 자식 클래스도 추상메서드로 선언해야한다.
abstract class Child extends Parent {
	@Override
	void dispA() {
	}
}

class Descendant extends Child {
	@Override
	void dispB() {
	}
}