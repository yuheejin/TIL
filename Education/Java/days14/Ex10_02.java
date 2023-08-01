package Education.Java.days14;

public class Ex10_02 {
	// [필드]
	// 인스턴스 변수
	String name = "익명";	//명시적 초기화
	int age;	
	boolean gender = true;	// 명시적 초기화
	// 클래스 변수
	static double rate = 0.05;	// 명시적 초기화
	
	Ex10_02() {
		this.name = "홍길동";		// 생성자 초기화
		this.age = 10;		// 생성자 초기화
		this.gender = false;		// 생성자 초기화
		
		// The static field Ex10_02.rate should be accessed in a static way
		// static 변수이기 때문에 주로 생성할때 초기화하지 않음
		this.rate = 0.01;
	}
	
	
	{
		// [인스턴스 초기화 블럭]
		// 오버로딩된 생성자에서 중복되는 초기화 코딩이 있다면
		// 그 중복 초기화 코딩을 인스턴스 초기화 블럭으로 
		// 따로 선언할 때 사용하는 블럭이다.
	}
	
	
	static {
		// [클래스 초기화 블럭] - 클래스 변수 초기화 목적
		// 객체 생성과 상관없이 클래스가 호출될때
		// 최초 한번만 static 초기화 블럭이 실행된다.
	}
	
	
	public static void main(String[] args) {
		System.out.println( Ex10_02.rate );
		
		Ex10_02 obj = new Ex10_02();
		System.out.println( obj.name );
		System.out.println( Ex10_02.rate );
		
		// 필드 (멤버변수) 초기화 방법
		// 1) 명시적 초기화 
		// 2) 생성자 초기화
		// 3) 초기화 블럭 {}
		//		3-1) 인스턴스 초기화 블럭 - 인스턴스변수 초기화 목적
		//		3-2) 클래스 초기화 블럭 - 클래스변수 초기화 목적
		
	} //main
} //class