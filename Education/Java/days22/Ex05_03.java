package Education.Java.days22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Ex05_03 {
	public static void main(String[] args) {
		
		// "박민석", "유희진", "고경림", "임경재", "이지현" , "김정주", "김호영"
		// ArrayList<Person3> list = new ArrayList();
		ArrayList list = new ArrayList();
		list.add( new Person3(27, "박민석") );
		list.add( new Person3(27, "유희진") );
		list.add( new Person3(29, "고경림") );
		list.add( new Person3(23, "임경재") );
		list.add( new Person3(27, "이지현") );
		
		System.out.println( list );
		
		list.sort( null );
		
		// 반복자 출력
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Person3 p = (Person3) ir.next();
			System.out.println( p );
			
		} //while
		System.out.println( list );
		
	} //main
} //class


// 비교기 기능이 있는 Person3 클래스 선언
// Comparator 비교기 없이 기능이 있는 클래스
class Person3 implements Comparable {
	private int age;
	private String name;
	
	public Person3() {
		super();
	}

	public Person3(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person3 [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		Person3 p = (Person3)o;
		return this.getName().compareTo(p.getName());
	}
	
} //class Person3