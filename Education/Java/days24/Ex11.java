/*package days24;

import java.util.ArrayList;

class Ex11 {
	public static void main(String[] args) {
		// [ 제한된 제네릭 클래스 ]
		// T 모든 타입이 아니라 과일 타입만 제한해서 제네릭 클래스 사용
		FruitBox<Fruit> box1 = new FruitBox<Fruit>();
		FruitBox<Apple> box2 = new FruitBox<Apple>();
		FruitBox<Grape> box3 = new FruitBox<Grape>();

		// FruitBox에는 과일만 담겠다.
		// Bound mismatch: The type Toy is not a valid substitute for the bounded parameter <T extends Fruit> of the type FruitBox<T>
		// FruitBox<Toy> box4 = new FruitBox<Toy>();
		
	} //main
	
}//class

interface Eatable {  }


class Fruit implements Eatable{
	public String toString() { return "Fruit"; }
}

class Apple extends Fruit {
	public String toString() { return "Apple"; }	
}

class Grape extends Fruit {
	public String toString() { return "Grape"; }
}

class Toy {
	public String toString() { return "Toy"; }
}


// 제네릭 클래스 선언
class Box04<T> {
	ArrayList<T> list = new ArrayList<T>(); // [1,2,3]
	
	void add(T item) { this.list.add(item); }
	int size() { return this.list.size(); }
	T get(int i) { return this.list.get(i); }
	
	public String toString() { return this.list.toString(); }
} //class Box04

// 과일만을 담을 수 있는 제네릭 클래스로 제한하여 선언
// T를 Fruit를 상속받은 클래스로 제한하겠다.
// class FruitBox<T extends Fruit> extends Box04<T> {

// T를 Fruit를 상속받고, Eatable을 구현한 클래스로 제한하겠다. (& 기호로 연결)
class FruitBox<T extends Fruit & Eatable> extends Box04<T> {
	// 필드 추가 선언
	// 재정의함수
} //class FruitBox
*/