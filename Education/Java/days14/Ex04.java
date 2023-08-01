package Education.Java.days14;

public class Ex04 {
	public static void main(String[] args) {
		// [ private 필드 선언 ] 
		// 1. 이유
		// 		1) private 필드 + 유효한 값만을 필드가 사용
		//		2) 필드를 읽기전용, 쓰기전용으로 사용
		Person p1 = new Person( true );
		System.out.println( p1.isGender() );
		
		// 2. 방법  getter, setter 겟셋 추가
		p1.setAge(20);
		System.out.println( p1.getAge() );

		//		// 접근지정자를 사용해서 필드 은닉화
		//		// The field Person.name is not visible
		//		p1.name ="홍길동";
		//		p1.age=20;
		//		p1.gender=true;

	} //main
} //class


// The public type Person must be defined in its own file
// 하나의 자바 파일 안에 여러개의 클래스를 선언할 수 있지만, 파일명과 같은 클래스만 public으로 선언할 수 있다.
// public class Person {
// }

// 다른패키지에서는 사용할 수 없다.
// class Person {
// } 