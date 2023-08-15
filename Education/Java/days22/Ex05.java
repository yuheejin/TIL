package Education.Java.days22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Ex05 {
	public static void main(String[] args) {
		
		// "박민석", "유희진", "고경림", "임경재", "이지현" , "김정주", "김호영"
		ArrayList list = new ArrayList();
		list.add( new Person(27, "박민석") );
		list.add( new Person(27, "유희진") );
		list.add( new Person(29, "고경림") );
		list.add( new Person(23, "임경재") );
		list.add( new Person(27, "이지현") );
		
		System.out.println( list );
		
		list.sort( new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Person p1 = (Person)o1;
				Person p2 = (Person)o2;
				return p1.getName().compareTo(p2.getName());
			}
		} );
		
		// 반복자 출력
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Person p = (Person) ir.next();
			System.out.println( p );
			
		} //while
		System.out.println( list );
		
	} //main
} //class

class Person {
	private int age;
	private String name;
	
	public Person() {
		super();
	}

	public Person(int age, String name) {
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
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
} //class Person