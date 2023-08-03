package Education.Java.days16;

public class Ex11 {
	public static void main(String[] args) {
		// [ default 메서드 ]
		// 5년 지난 후 IA 조상 인터페이스에 
		// testXX() 추상메서드가 있었으면...
		// IA를 상속받은 모든 클래스에 testXX();를 다 오버라이딩 해야함
		// 이 때문에 default 메서드를 JDK1.8에서 추가함
		
		// 1) 여러 인터페이스를 구현하면 디폴트 메서드 충돌
		// 		=> 충돌나는 디폴트 메서드르 오버라이딩하면 해결.
		// 2) 조상클래스의 메서드와 디폴트 메서드 충돌
		//		=> 출동나는 디폴트 메서드는 무시가 된다.
		
	} //main
} //class


interface IA {
	// 3개 추상메서드
	default void testXX() {
	}
	/*
	void testXX();	// 5년 뒤에 추가...
						// IA를 상속받은 모든 클래스에 testXX();를 다 오버라이딩 해야하기 때문에
						// 조상 인터페이스에 추가하기는 어려움
	*/
}
// IA 인터페이스 implements 클래스 200개

interface IB extends IA {
	// 3개 추상메서드
	// 2개 추상메서드
}
// IB 인터페이스 implements 클래스 300개

interface IC extends IB {
	// 3개 추상메서드
	// 2개 추상메서드
	// 5개 추상메서드
}
// IC 인터페이스 implements 클래스 400개

interface ID extends IC {
	// 3개 추상메서드
	// 2개 추상메서드
	// 5개 추상메서드
	// 13개 추상메서드
}
// ID 인터페이스 implements 클래스 500개