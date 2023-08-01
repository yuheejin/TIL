package Education.Java.days14;
// Ex07
// 저축 관련 클래스 - static 키워드
public class Save {
	// 필드
	private String name=null; // 예금주
	private int money=0; 	 // 예금액
	
	// 1. 인스턴스가 생성될 때마다 필드가 생성되지 않는다.
	// 2. 클래스가 선언될 때, Method 영역에 필드가 생성된다.
	//		( 객체를 생성하지 않아도 static 필드는 벌써 생성되어져있다. )
	// 3. 모든 인스턴스(객체)가 공유하는 필드가 된다.
	//	   공유변수(필드), shared 변수, static 변수, 정적변수, 클래스변수
	private static double rate=0.04;  // 이자율
	
	// 생성자
	public Save() { }

	public Save(String name, int money, double rate) {
		this.name = name;
		this.money = money;
		this.rate = rate;
	}

	// 인스턴스 메서드 - 객체가 생성되어야 접근 가능한 메서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// static 메서드, 정적 메서드 - 객체를 생성하지 않아도, Method 영역에 미리 올라가있기 때문에
	// 									클래스.메서드명  으로 접근 가능함
	public static double getRate() {
		return rate;
	}	
	public static void setRate(double rate) {
		// 지역변수는 사용 가능하다.
		int n=10;
		
		// 인스턴스변수 사용 할 수 없다.
		// Cannot make a static reference to the non-static field name
		// name = "홍길동";
		
		// Cannot use this in a static context
		// static으로 선언된 필드는 this 키워드 사용 못함
		// this.rate = rate;
		
		// static이 붙은 필드나 메소드는 클래스명.필드, 클래스명.메서드 로 씀
		Save.rate = rate;
	}
	
	public void dispSave() {
		System.out.printf("> 예금주: %s, 예금액: %d, 이자율: %.2f\n", this.name, this.money, this.rate);
	} //dispSave
	
} //class