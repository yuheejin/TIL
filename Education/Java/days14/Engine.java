package Education.Java.days14;
// Ex12
public class Engine {
	// 필드
	int speed;
	
	// 생성자
	//메서드
	void moreFuel(int fuel) {
		this.speed += fuel*0.05;
	} //moreFuel

	void lessFuel(int fuel) {
		this.speed -= fuel*0.05;
	} //lessFuel

	void stop() {
		this.speed =0;
	} //stop
	
	
} //class