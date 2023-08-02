package Education.Java.days13;

public class Tv {

	//	// 중첩클래스
	//	class Box {
	//		
	//	}

	// Illegal modifier for the class Tv; only public, abstract & final are permitted
	//private class Tv {
	// Tv 클래스 선언

	// 멤버
	// 멤버변수(필드 field)
	//		초기화 하지 않으면 각 자료형의 기본값으로 초기화되어져 있다. 	
	// 선언형식 : [접근지정자] [기타제어자] 자료형 필드명 [= 초기화];
	public String color;	// String과 다른 클래스의 초기값은 null임
	public boolean power;	//초기값 false
	public int channel;	// 초기값 0

	// 멤버함수(메소드 method)
	public void powerOnOff() {
		power = !power;
	} //power

	// ▲
	public void channelUp() {
		channel++;
	} //channelUp

	// ▼
	public void channelDown() {
		channel--;
	} //channelDown



} //class