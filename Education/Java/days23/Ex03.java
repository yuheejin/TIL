package days23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author kenik
 * @date 2023. 8. 14. - 오후 12:05:44
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// Set : LinkedHashSet 컬렉션 클래스
		//  ㄴ 중복 허용 X, 순서 유지 O
		// List<Person> list = new ArrayList<Person>();
		
		// 사람은 주민등록번호가 같으면 같은 객체(사람) 중복X
		Set<Person> s = new LinkedHashSet<Person>();
		s.add( new Person("111111-1111111", "김호영", 23) );
		s.add( new Person("222222-2222222", "박민석", 25) );
		s.add( new Person("333333-3333333", "박정호", 28) );

		System.out.println(s.size()); // 3
		
		s.add( new Person("222222-2222222", "박민석", 35) );
		
		Iterator<Person> ir = s.iterator();
		while (ir.hasNext()) {
			Person p = ir.next();
			System.out.println( p );
		} // while

	} // main

} // class

class Person{
	
	String rrn;
	String name;
	int age;
	
	public Person( ) {
		super(); 
	}
	public Person(String rrn, String name, int age) {
		super();
		this.rrn = rrn;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [rrn=" + rrn + ", name=" + name + ", age=" + age + "]";
	}
	
	
	// hashCode()  rrn  오버라이딩
	// equals()    rrn  오버라이딩 
	@Override
	public int hashCode() { 
		return this.rrn.hashCode();
	}
	@Override
	public boolean equals(Object obj) { 
		if (obj instanceof Person) {
			Person p = (Person)obj;
			return this.rrn.equals(  p.rrn );
		} // if
		return false;
	}
	
	
	
}








