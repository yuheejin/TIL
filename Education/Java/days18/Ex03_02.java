package Education.Java.days18;

public class Ex03_02 {
	public static void main(String[] args) {
		// 주민등록번호가 같으면 동일한 사람(객체)이다.
		Person p1 = new Person("111", "홍길동"); 
		Person p2 = new Person("111", "홍길둥"); 

		// 3) Object.toString()
		//		days18.Person@be11		(48657의 16진수: be11)
		//		패키지명.클래스명@해시코드의 16진수 값 
		System.out.println( p1.toString() );
		System.out.println( p2.toString() );

		System.out.println( p1 );
		System.out.println( p2 );
		
		// 이름은 개명했다 생각하고, 주민등록번호가 같은지 여부만 판단
		// Object -> equals() 메서드를 오버라이딩
		// System.out.println( p1.equals(p2) );	
		System.out.println( p1.hashCode() );  //48657
		System.out.println( p2.hashCode() );  //48657
		
	} //main	
} //class


// Person 클래스의 객체가 복제(clone) 되도록 코딩
// 1) implements Cloneable 구현
// 2) public Object clone() 오버라이딩
class Person implements Cloneable {
	String rrn;
	String name;
	
	public Person(String rrn, String name) {
		super();
		this.rrn = rrn;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// return "Person [rrn=" + rrn + ", name=" + name + "]";
		return String.format("Person [rrn=%s, name=%s]", this.rrn, this.name);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Person) {
			Person p = (Person) obj;	//다운캐스팅
			return this.rrn.equals(p.rrn);
		} //if
		return false;
	}

	@Override
	public int hashCode() {
		return this.rrn.hashCode();
	}

	/*
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		
		Object obj = null;
		obj = super.clone();
		return obj;
	}
	*/
	

	// 오버라이딩 조건(주의사항)
	// 리턴형이 같아야한다.... Object -> Person ??? 
	// JDK1.5 공변반환타입 (convariant return type )추가
	//		- 오버라이딩 할 때 조상 메서드의 반환타입을 자식 클래스 타입으로 변경이 가능하다.
	@Override
	protected Person clone() {
		Person p = null;
		try {
			p = (Person) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
	
} //class Person