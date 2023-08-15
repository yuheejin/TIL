package Education.Java.days14;
// Ex12
public class Car {
	// 필드
	String name;
	String gearType;	// 수동, 자동
	int door;
	// 엔진 필요   has-a 관계
	// [1] 명시적 초기화
	// 단점 : 결합력이 높다.
	// Engine engine = new Engine();	
	private Engine engine;

	{
		// [3] 인스턴스 초기화
		// this.engine = new Engine();
	}

	
	// 생성자
	Car() {
		// [2] 생성자 초기화
		// this.engine = new Engine();
	}
	
	Car(Engine engine) {
		this.engine = engine;
	}

	
	// 메서드
	public int getEngine() {
		return engine.speed;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}

	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}

	void stop() {
		this.engine.stop();
	}

} //class