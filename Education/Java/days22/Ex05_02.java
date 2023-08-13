package Education.Java.days22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Ex05_02 {
	public static void main(String[] args) {
		
		// "박민석", "유희진", "고경림", "임경재", "이지현" , "김정주", "김호영"
		ArrayList<Person2> list = new ArrayList();
		list.add( new Person2(27, "박민석") );
		list.add( new Person2(27, "유희진") );
		list.add( new Person2(29, "고경림") );
		list.add( new Person2(23, "임경재") );
		list.add( new Person2(27, "이지현") );
		
		System.out.println( list );
		
		list.sort( (p1,p2) -> p1.getName().compareTo(p2.getName()) );
		
		// 반복자 출력
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Person2 p = (Person2) ir.next();
			System.out.println( p );
			
		} //while
		System.out.println( list );
		
	} //main
} //class

class Person2 {
	private int age;
	private String name;
	
	public Person2() {
		super();
	}

	public Person2(int age, String name) {
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
		return "Person2 [age=" + age + ", name=" + name + "]";
	}
	
} //class Person2