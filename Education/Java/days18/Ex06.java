package Education.Java.days18;

public class Ex06 {
	public static void main(String[] args) {
		// Object.clone() 복제
		Person p1 = new Person("111", "홍길동");
		// p1.clone();  왜 사용할 수 없는가?
		Person p1Clone;
		
		// [ clone() 오버라이딩 불편한 점 ]
		// 다운캐스팅 해야된다.
		p1Clone = p1.clone();
		System.out.println( p1Clone );
		
		/*
		try {
			// [ clone() 오버라이딩 불편한 점 ]
			// 다운캐스팅 해야된다.
			p1Clone = (Person) p1.clone();
			System.out.println( p1Clone );
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		*/
		
		/*
		[ 스레드 수업시 체크 ]
		p1.notify();
		p1.notifyAll();	
		p1.wait();
		p1.wait();
		p1.wait();
		// p1.finalize();  소멸자
		*/
		
	} //main
	
} //class