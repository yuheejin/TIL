package days24;

import java.util.ArrayList;

class Ex12 {
	public static void main(String[] args) {
		// [ 와일드 카드 ]
		
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
		
		Juice juice = Juicer.makeJuice(fruitBox);
		juice = Juicer.makeJuice(appleBox);
		juice = Juicer.makeJuice(grapeBox);
		
		
		// [ 제네릭 메서드 ]
		// - 정의 : 메서드의 선언부에 제네릭 타입이 선언된 메서드
		//			리턴타입 앞에 제네릭 타입이 선언된 메서드
		// - 형식 
		//		접근지정자 기타제어자 <T> 메서드명(매개변수) { }
		//		public static <T> Juice makeJuice(FruitBox<T> box) {
		//		}
		
		// makeJuice 메서드를 제네릭 메서드로 선언(수정)
		// 호출방법 다르다.
		Juice juice2 = Juicer.<Apple>makeJuice(appleBox);
		// <Apple> 생략이 가능하다.
		// Juice juice2 = Juicer.makeJuice(appleBox);
		
		
	} //main
	
}//class


class Fruit{
	public String toString() { return "Fruit"; }
}

class Apple extends Fruit {
	public String toString() { return "Apple"; }	
}

class Grape extends Fruit {
	public String toString() { return "Grape"; }
}


// 제네릭 클래스 선언
class Box05<T> {
	ArrayList<T> list = new ArrayList<T>(); // [1,2,3]
	
	void add(T item) { this.list.add(item); }
	int size() { return this.list.size(); }
	T get(int i) { return this.list.get(i); }
	
	public String toString() { return this.list.toString(); }
} //class Box04

class FruitBox<T extends Fruit> extends Box05<T> {
	// 구현
} //class FruitBox

// [ 클래스 선언 ]		 제네릭 X
// 매개변수를 과일박스호 주면
// 쥬스를 만들어서 반환하는 기능이 있는 쥬스 클래스
class Juice{}


class Juicer{
	// 아래 일반 메서드를 제네릭 메서드로 변경
	static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {  // 일반함수
		return new Juice();
	};
	
	/*
	// ? 를 와일드카드라고 부른다.
	// FruitBox<? extends Fruit> box : Fruit 물려받은 자식클래스만 가능
	// FruitBox<? super Fruit> box : Fruit 부모클래스만 가능
	// FruitBox<?> box : 제한 없다. 모든 타입 가능
	static Juice makeJuice(FruitBox<? extends Fruit> box) {  // 일반함수
		return new Juice();
	};
	*/
	
	// 메서드 오버로딩 조건
	// 제네릭 타입의 매개변수는 오버로딩이 성립되지 않는다.
	// 매개변수가 달라야 하는데, 제네릭 타입은 같은 것으로 인식된다.
	/*
	static Juice makeJuice(FruitBox<Fruit> box) {
		return new Juice();
	};
	static Juice makeJuice(FruitBox<Apple> box) {
		return new Juice();
	};
	static Juice makeJuice(FruitBox<Grape> box) {
		return new Juice();
	};
	*/
}