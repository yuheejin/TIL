package Education.Java.days14;

public class Ex12 {
	public static void main(String[] args) {
		// [ 클래스들간의 관계 ]
		// 1. has-a 관계
		//		2개의 클래스 선언
		//		Car	  클래스
		//		Engine 클래스 - 연료, 구동장치
		//		Car  has-a  Engine
		//
		// 2. is-a 관계 (상속)
		

		Engine engine = new Engine();
		// DI 2가지 방법
		// 1) 생성자 통해서 DI
		Car myCar = new Car(engine);	// 의존성 주입(Dependency Injection)
		// 2) setter 통해서 DI
		myCar.setEngine(engine);
		
		
		myCar.speedUp(100);
		System.out.println( myCar.getEngine() );
		
		myCar.speedDown(10);
		System.out.println( myCar.getEngine() );
		
		myCar.stop();
		System.out.println( myCar.getEngine() );
		
		System.out.println("  end  ");
	} //main
} //class