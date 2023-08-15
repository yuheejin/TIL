package Education.Java.days18;

public class Ex07 {
	public static void main(String[] args) {
		// [ 객체로부터 Class객체를 얻어오는 3가지 방법 ]
		// 1) 첫 번째 방법 : getClass() 메서드
		/*
		Card card1 = new Card("HEART", 3);
		Class cls = card1.getClass();
		System.out.println( cls.getName() );
		System.out.println( cls.getSimpleName() );
		*/
		
		// 2) 두 번째 방법 : 모든 클래스명.class 클래스변수가 제공된다.
		/*
		Class cls = Card.class;
		System.out.println( cls );		// class days18.Card
		
		// => Class cls 얻어와서 객체를 생성
		try {
			Card card2 = (Card)cls.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		*/
		
		// 3) 세 번째 방법 : Class 클래스의 static 메서드 - forName()
		String className = "days18.Card";
		try {
			Class cls = Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	} //main
} //class


final class Card {
	String kind;		// 카드 종류
	int num;		// 카드번호
	
	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", num=" + num + "]";
	}
	
} //class Card