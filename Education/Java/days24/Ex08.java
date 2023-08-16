package days24;

/**
 * @subject 제네릭 타입
 *			1) 제네릭 클래스
 *			2) 제네릭 메서드
 */
class Ex08 {
	public static void main(String[] args) {
		// [ 제네릭 클래스 ]
		// 
		// 
		// 
		// 
		// 
		// 
		// 
		// 
		
		/*
		Box box1 = new Box();
		// box1.setItem(100);
		// box1.setItem("홍길동");
		// box1.setItem(3.14);
		
		// Object로 선언시 다운캐스팅(형변환) 해야하는 단점이 있다.
		System.out.println( (int)box1.getItem() );
		System.out.println( (String)box1.getItem() );
		System.out.println( (double)box1.getItem() );
		*/
		
		//  String : 대입된 타입
		Box<String> box = new Box<>();
		
	} //main
	
} //class

// 다양한 타입을 사용하기 위해
// 컴파일 시에 타입을 결정하는 기능 : 제네릭
// [ 제네릭 클래스 선언 ]
// <Type>	T,K,V,E 등 아무거나 넣어도 됨
// 용어
// 	1) Box    - 원시타입(raw type)
// 	2) T 	  - 타입 변수 또는 타입 매개변수 
// 	3) Box<T> - 제네릭 클래스, 'T[의] Box'
class Box<T> {
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
} //class Box



/*
class Box {
	Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
} //class Box
*/

/*
class Box {
	double item;

	public double getItem() {
		return item;
	}

	public void setItem(double item) {
		this.item = item;
	}
} //class Box
*/

/*
class Box {
	String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
} //class Box
*/

/*
class Box {
	int item;

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
} //class Box
*/