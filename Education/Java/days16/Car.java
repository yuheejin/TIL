package Education.Java.days16;

public class Car {
	// 필드
	String name;
	String gearType;	// 수동, 자동
	int door;

	private Engine engine;

	// 생성자
	Car() {
	}
	
	Car(Engine engine) {
		this.engine = engine;
	}

	
	// 메서드
	public Engine getEngine() {
		return engine;
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